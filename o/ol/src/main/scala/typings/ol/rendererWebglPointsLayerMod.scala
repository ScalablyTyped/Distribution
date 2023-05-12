package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.geomMod.Geometry
import typings.ol.mapMod.FrameState
import typings.ol.rendererWebglLayerMod.PostProcessesOptions
import typings.ol.webglHelperMod.AttributeDescription
import typings.ol.webglHelperMod.UniformValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglPointsLayerMod {
  
  /**
    * @typedef {Object} CustomAttribute A description of a custom attribute to be passed on to the GPU, with a value different
    * for each feature.
    * @property {string} name Attribute name.
    * @property {function(import("../../Feature").default, Object<string, *>):number} callback This callback computes the numerical value of the
    * attribute for a given feature (properties are available as 2nd arg for quicker access).
    */
  /**
    * @typedef {Object} FeatureCacheItem Object that holds a reference to a feature, its geometry and properties. Used to optimize
    * rebuildBuffers by accessing these objects quicker.
    * @property {import("../../Feature").default} feature Feature
    * @property {Object<string, *>} properties Feature properties
    * @property {import("../../geom").Geometry} geometry Feature geometry
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-layer'] A CSS class name to set to the canvas element.
    * @property {Array<CustomAttribute>} [attributes] These attributes will be read from the features in the source and then
    * passed to the GPU. The `name` property of each attribute will serve as its identifier:
    *  * In the vertex shader as an `attribute` by prefixing it with `a_`
    *  * In the fragment shader as a `varying` by prefixing it with `v_`
    * Please note that these can only be numerical values.
    * @property {string} vertexShader Vertex shader source, mandatory.
    * @property {string} fragmentShader Fragment shader source, mandatory.
    * @property {string} [hitVertexShader] Vertex shader source for hit detection rendering.
    * @property {string} [hitFragmentShader] Fragment shader source for hit detection rendering.
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process steps
    * Please note that `u_texture` is reserved for the main texture slot and `u_opacity` is reserved for the layer opacity.
    * @property {Array<import("./Layer").PostProcessesOptions>} [postProcesses] Post-processes definitions
    */
  /**
    * @classdesc
    * WebGL vector renderer optimized for points.
    * All features will be rendered as quads (two triangles forming a square). New data will be flushed to the GPU
    * every time the vector source changes.
    *
    * You need to provide vertex and fragment shaders for rendering. This can be done using
    * {@link module:ol/webgl/ShaderBuilder~ShaderBuilder} utilities. These shaders shall expect a `a_position` attribute
    * containing the screen-space projected center of the quad, as well as a `a_index` attribute
    * whose value (0, 1, 2 or 3) indicates which quad vertex is currently getting processed (see structure below).
    *
    * To include variable attributes in the shaders, you need to declare them using the `attributes` property of
    * the options object like so:
    * ```js
    * new WebGLPointsLayerRenderer(layer, {
    *   attributes: [
    *     {
    *       name: 'size',
    *       callback: function(feature) {
    *         // compute something with the feature
    *       }
    *     },
    *     {
    *       name: 'weight',
    *       callback: function(feature) {
    *         // compute something with the feature
    *       }
    *     },
    *   ],
    *   vertexShader:
    *     // shader using attribute a_weight and a_size
    *   fragmentShader:
    *     // shader using varying v_weight and v_size
    * ```
    *
    * To enable hit detection, you must as well provide dedicated shaders using the `hitVertexShader`
    * and `hitFragmentShader` properties. These shall expect the `a_hitColor` attribute to contain
    * the final color that will have to be output for hit detection to work.
    *
    * The following uniform is used for the main texture: `u_texture`.
    * The following uniform is used for the layer opacity: `u_opacity`.
    *
    * Please note that the main shader output should have premultiplied alpha, otherwise visual anomalies may occur.
    *
    * Points are rendered as quads with the following structure:
    *
    * ```
    *   (u0, v1)      (u1, v1)
    *  [3]----------[2]
    *   |`           |
    *   |  `         |
    *   |    `       |
    *   |      `     |
    *   |        `   |
    *   |          ` |
    *  [0]----------[1]
    *   (u0, v0)      (u1, v0)
    *  ```
    *
    * This uses {@link module:ol/webgl/Helper~WebGLHelper} internally.
    *
    * @api
    */
  @JSImport("ol/renderer/webgl/PointsLayer", JSImport.Default)
  @js.native
  open class default protected () extends WebGLPointsLayerRenderer {
    /**
      * @param {import("../../layer/Layer.js").default} layer Layer.
      * @param {Options} options Options.
      */
    def this(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any],
      options: Options
    ) = this()
  }
  
  trait CustomAttribute extends StObject {
    
    /**
      * This callback computes the numerical value of the
      * attribute for a given feature (properties are available as 2nd arg for quicker access).
      */
    def callback(arg0: typings.ol.renderFeatureMod.default, arg1: StringDictionary[Any]): Double
    
    /**
      * Attribute name.
      */
    var name: String
  }
  object CustomAttribute {
    
    inline def apply(callback: (typings.ol.renderFeatureMod.default, StringDictionary[Any]) => Double, name: String): CustomAttribute = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttribute] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (typings.ol.renderFeatureMod.default, StringDictionary[Any]) => Double): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCacheItem extends StObject {
    
    /**
      * Feature
      */
    var feature: typings.ol.renderFeatureMod.default
    
    /**
      * Feature geometry
      */
    var geometry: Geometry
    
    /**
      * Feature properties
      */
    var properties: StringDictionary[Any]
  }
  object FeatureCacheItem {
    
    inline def apply(
      feature: typings.ol.renderFeatureMod.default,
      geometry: Geometry,
      properties: StringDictionary[Any]
    ): FeatureCacheItem = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCacheItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureCacheItem] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * These attributes will be read from the features in the source and then
      * passed to the GPU. The `name` property of each attribute will serve as its identifier:
      * * In the vertex shader as an `attribute` by prefixing it with `a_`
      * * In the fragment shader as a `varying` by prefixing it with `v_`
      * Please note that these can only be numerical values.
      */
    var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
    
    /**
      * A CSS class name to set to the canvas element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Fragment shader source, mandatory.
      */
    var fragmentShader: String
    
    /**
      * Fragment shader source for hit detection rendering.
      */
    var hitFragmentShader: js.UndefOr[String] = js.undefined
    
    /**
      * Vertex shader source for hit detection rendering.
      */
    var hitVertexShader: js.UndefOr[String] = js.undefined
    
    /**
      * Post-processes definitions
      */
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    /**
      * Uniform definitions for the post process steps
      * Please note that `u_texture` is reserved for the main texture slot and `u_opacity` is reserved for the layer opacity.
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    /**
      * Vertex shader source, mandatory.
      */
    var vertexShader: String
  }
  object Options {
    
    inline def apply(fragmentShader: String, vertexShader: String): Options = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setHitFragmentShader(value: String): Self = StObject.set(x, "hitFragmentShader", value.asInstanceOf[js.Any])
      
      inline def setHitFragmentShaderUndefined: Self = StObject.set(x, "hitFragmentShader", js.undefined)
      
      inline def setHitVertexShader(value: String): Self = StObject.set(x, "hitVertexShader", value.asInstanceOf[js.Any])
      
      inline def setHitVertexShaderUndefined: Self = StObject.set(x, "hitVertexShader", js.undefined)
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {Object} CustomAttribute A description of a custom attribute to be passed on to the GPU, with a value different
    * for each feature.
    * @property {string} name Attribute name.
    * @property {function(import("../../Feature").default, Object<string, *>):number} callback This callback computes the numerical value of the
    * attribute for a given feature (properties are available as 2nd arg for quicker access).
    */
  /**
    * @typedef {Object} FeatureCacheItem Object that holds a reference to a feature, its geometry and properties. Used to optimize
    * rebuildBuffers by accessing these objects quicker.
    * @property {import("../../Feature").default} feature Feature
    * @property {Object<string, *>} properties Feature properties
    * @property {import("../../geom").Geometry} geometry Feature geometry
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-layer'] A CSS class name to set to the canvas element.
    * @property {Array<CustomAttribute>} [attributes] These attributes will be read from the features in the source and then
    * passed to the GPU. The `name` property of each attribute will serve as its identifier:
    *  * In the vertex shader as an `attribute` by prefixing it with `a_`
    *  * In the fragment shader as a `varying` by prefixing it with `v_`
    * Please note that these can only be numerical values.
    * @property {string} vertexShader Vertex shader source, mandatory.
    * @property {string} fragmentShader Fragment shader source, mandatory.
    * @property {string} [hitVertexShader] Vertex shader source for hit detection rendering.
    * @property {string} [hitFragmentShader] Fragment shader source for hit detection rendering.
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process steps
    * Please note that `u_texture` is reserved for the main texture slot and `u_opacity` is reserved for the layer opacity.
    * @property {Array<import("./Layer").PostProcessesOptions>} [postProcesses] Post-processes definitions
    */
  /**
    * @classdesc
    * WebGL vector renderer optimized for points.
    * All features will be rendered as quads (two triangles forming a square). New data will be flushed to the GPU
    * every time the vector source changes.
    *
    * You need to provide vertex and fragment shaders for rendering. This can be done using
    * {@link module:ol/webgl/ShaderBuilder~ShaderBuilder} utilities. These shaders shall expect a `a_position` attribute
    * containing the screen-space projected center of the quad, as well as a `a_index` attribute
    * whose value (0, 1, 2 or 3) indicates which quad vertex is currently getting processed (see structure below).
    *
    * To include variable attributes in the shaders, you need to declare them using the `attributes` property of
    * the options object like so:
    * ```js
    * new WebGLPointsLayerRenderer(layer, {
    *   attributes: [
    *     {
    *       name: 'size',
    *       callback: function(feature) {
    *         // compute something with the feature
    *       }
    *     },
    *     {
    *       name: 'weight',
    *       callback: function(feature) {
    *         // compute something with the feature
    *       }
    *     },
    *   ],
    *   vertexShader:
    *     // shader using attribute a_weight and a_size
    *   fragmentShader:
    *     // shader using varying v_weight and v_size
    * ```
    *
    * To enable hit detection, you must as well provide dedicated shaders using the `hitVertexShader`
    * and `hitFragmentShader` properties. These shall expect the `a_hitColor` attribute to contain
    * the final color that will have to be output for hit detection to work.
    *
    * The following uniform is used for the main texture: `u_texture`.
    * The following uniform is used for the layer opacity: `u_opacity`.
    *
    * Please note that the main shader output should have premultiplied alpha, otherwise visual anomalies may occur.
    *
    * Points are rendered as quads with the following structure:
    *
    * ```
    *   (u0, v1)      (u1, v1)
    *  [3]----------[2]
    *   |`           |
    *   |  `         |
    *   |    `       |
    *   |      `     |
    *   |        `   |
    *   |          ` |
    *  [0]----------[1]
    *   (u0, v0)      (u1, v0)
    *  ```
    *
    * This uses {@link module:ol/webgl/Helper~WebGLHelper} internally.
    *
    * @api
    */
  @js.native
  trait WebGLPointsLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default[Any] {
    
    /**
      * A list of attributes used by the renderer. By default only the position and
      * index of the vertex (0 to 3) are required.
      * @type {Array<import('../../webgl/Helper.js').AttributeDescription>}
      */
    var attributes: js.Array[AttributeDescription] = js.native
    
    /**
      * This transform is updated on every frame and is the composition of:
      * - invert of the world->screen transform that was used when rebuilding buffers (see `this.renderTransform_`)
      * - current world->screen transform
      * @type {import("../../transform.js").Transform}
      * @private
      */
    /* private */ var currentTransform_ : Any = js.native
    
    var customAttributes: js.Array[CustomAttribute] = js.native
    
    /**
      * This object will be updated when the source changes. Key is uid.
      * @type {Object<string, FeatureCacheItem>}
      * @private
      */
    /* private */ var featureCache_ : Any = js.native
    
    /**
      * Amount of features in the cache.
      * @type {number}
      * @private
      */
    /* private */ var featureCount_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var fragmentShader_ : Any = js.native
    
    /**
      * Keep track of latest message sent to worker
      * @type {number}
      * @private
      */
    /* private */ var generateBuffersRun_ : Any = js.native
    
    /**
      * @param {import("../../source/Vector.js").VectorSourceEvent} event Event.
      * @private
      */
    /* private */ var handleSourceFeatureAdded_ : Any = js.native
    
    /**
      * @param {import("../../source/Vector.js").VectorSourceEvent} event Event.
      * @private
      */
    /* private */ var handleSourceFeatureChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleSourceFeatureClear_ : Any = js.native
    
    /**
      * @param {import("../../source/Vector.js").VectorSourceEvent} event Event.
      * @private
      */
    /* private */ var handleSourceFeatureDelete_ : Any = js.native
    
    /**
      * A list of attributes used for hit detection.
      * @type {Array<import('../../webgl/Helper.js').AttributeDescription>}
      */
    var hitDetectionAttributes: js.Array[AttributeDescription] = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var hitDetectionEnabled_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var hitFragmentShader_ : Any = js.native
    
    /**
      * @type {WebGLProgram}
      * @private
      */
    /* private */ var hitProgram_ : Any = js.native
    
    /**
      * These instructions are used for hit detection
      * @type {Float32Array}
      * @private
      */
    /* private */ var hitRenderInstructions_ : Any = js.native
    
    /**
      * @type {WebGLRenderTarget}
      * @private
      */
    /* private */ var hitRenderTarget_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var hitVertexShader_ : Any = js.native
    
    var hitVerticesBuffer_ : typings.ol.webglBufferMod.default = js.native
    
    var indicesBuffer_ : typings.ol.webglBufferMod.default = js.native
    
    /**
      * @type {import("../../transform.js").Transform}
      * @private
      */
    /* private */ var invertRenderTransform_ : Any = js.native
    
    var previousExtent_ : Extent = js.native
    
    /**
      * @type {WebGLProgram}
      * @private
      */
    /* private */ var program_ : Any = js.native
    
    /**
      * Rebuild internal webgl buffers based on current view extent; costly, should not be called too much
      * @param {import("../../Map").FrameState} frameState Frame state.
      * @private
      */
    /* private */ var rebuildBuffers_ : Any = js.native
    
    /**
      * Render the layer.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @return {HTMLElement} The rendered element.
      */
    def renderFrame(frameState: FrameState): HTMLElement = js.native
    
    /**
      * Render the hit detection data to the corresponding render target
      * @param {import("../../Map.js").FrameState} frameState current frame state
      * @param {number} startWorld the world to render in the first iteration
      * @param {number} endWorld the last world to render
      * @param {number} worldWidth the width of the worlds being rendered
      */
    def renderHitDetection(frameState: FrameState, startWorld: Double, endWorld: Double, worldWidth: Double): Unit = js.native
    
    /**
      * @type {Float32Array}
      * @private
      */
    /* private */ var renderInstructions_ : Any = js.native
    
    /**
      * This transform is updated when buffers are rebuilt and converts world space coordinates to screen space
      * @type {import("../../transform.js").Transform}
      * @private
      */
    /* private */ var renderTransform_ : Any = js.native
    
    var sourceListenKeys_ : js.Array[EventsKey] = js.native
    
    var sourceRevision_ : Double = js.native
    
    /**
      * @private
      */
    /* private */ var vertexShader_ : Any = js.native
    
    var verticesBuffer_ : typings.ol.webglBufferMod.default = js.native
    
    /**
      * @private
      */
    /* private */ var worker_ : Any = js.native
  }
}
