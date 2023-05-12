package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.ol.renderWebglBatchRendererMod.CustomAttribute
import typings.ol.rendererWebglLayerMod.PostProcessesOptions
import typings.ol.webglHelperMod.UniformValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglVectorLayerMod {
  
  /**
    * @classdesc
    * Experimental WebGL vector renderer. Supports polygons, lines and points:
    *  * Polygons are broken down into triangles
    *  * Lines are rendered as strips of quads
    *  * Points are rendered as quads
    *
    * You need to provide vertex and fragment shaders as well as custom attributes for each type of geometry. All shaders
    * can access the uniforms in the {@link module:ol/webgl/Helper~DefaultUniform} enum.
    * The vertex shaders can access the following attributes depending on the geometry type:
    *  * For polygons: {@link module:ol/render/webgl/PolygonBatchRenderer~Attributes}
    *  * For line strings: {@link module:ol/render/webgl/LineStringBatchRenderer~Attributes}
    *  * For points: {@link module:ol/render/webgl/PointBatchRenderer~Attributes}
    *
    * Please note that the fragment shaders output should have premultiplied alpha, otherwise visual anomalies may occur.
    *
    * Note: this uses {@link module:ol/webgl/Helper~WebGLHelper} internally.
    */
  @JSImport("ol/renderer/webgl/VectorLayer", JSImport.Default)
  @js.native
  open class default protected () extends WebGLVectorLayerRenderer {
    /**
      * @param {import("../../layer/Layer.js").default} layer Layer.
      * @param {Options} options Options.
      */
    def this(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any],
      options: Options
    ) = this()
  }
  
  type CustomAttributeCallback = js.Function2[
    /* arg0 */ typings.ol.renderFeatureMod.default, 
    /* arg1 */ StringDictionary[Any], 
    Double
  ]
  
  trait Options extends StObject {
    
    /**
      * A CSS class name to set to the canvas element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Attributes and shaders for filling polygons.
      */
    var fill: js.UndefOr[ShaderProgram] = js.undefined
    
    /**
      * Attributes and shaders for points.
      */
    var point: js.UndefOr[ShaderProgram] = js.undefined
    
    /**
      * Post-processes definitions
      */
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    /**
      * Attributes and shaders for line strings and polygon strokes.
      */
    var stroke: js.UndefOr[ShaderProgram] = js.undefined
    
    /**
      * Uniform definitions.
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFill(value: ShaderProgram): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPoint(value: ShaderProgram): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setStroke(value: ShaderProgram): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait ShaderProgram extends StObject {
    
    /**
      * Custom attributes made available in the vertex shader.
      * Keys are the names of the attributes which are then accessible in the vertex shader using the `a_` prefix, e.g.: `a_opacity`.
      * Default shaders rely on the attributes in {@link module :ol/render/webgl/shaders~DefaultAttributes}.
      */
    var attributes: Any
    
    /**
      * Fragment shader source (using the default one if unspecified).
      */
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    /**
      * Vertex shader source (using the default one if unspecified).
      */
    var vertexShader: js.UndefOr[String] = js.undefined
  }
  object ShaderProgram {
    
    inline def apply(attributes: Any): ShaderProgram = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShaderProgram]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShaderProgram] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  /**
    * @classdesc
    * Experimental WebGL vector renderer. Supports polygons, lines and points:
    *  * Polygons are broken down into triangles
    *  * Lines are rendered as strips of quads
    *  * Points are rendered as quads
    *
    * You need to provide vertex and fragment shaders as well as custom attributes for each type of geometry. All shaders
    * can access the uniforms in the {@link module:ol/webgl/Helper~DefaultUniform} enum.
    * The vertex shaders can access the following attributes depending on the geometry type:
    *  * For polygons: {@link module:ol/render/webgl/PolygonBatchRenderer~Attributes}
    *  * For line strings: {@link module:ol/render/webgl/LineStringBatchRenderer~Attributes}
    *  * For points: {@link module:ol/render/webgl/PointBatchRenderer~Attributes}
    *
    * Please note that the fragment shaders output should have premultiplied alpha, otherwise visual anomalies may occur.
    *
    * Note: this uses {@link module:ol/webgl/Helper~WebGLHelper} internally.
    */
  @js.native
  trait WebGLVectorLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default[Any] {
    
    /**
      * @private
      */
    /* private */ var batch_ : Any = js.native
    
    /**
      * This transform is updated on every frame and is the composition of:
      * - invert of the world->screen transform that was used when rebuilding buffers (see `this.renderTransform_`)
      * - current world->screen transform
      * @type {import("../../transform.js").Transform}
      * @private
      */
    /* private */ var currentTransform_ : Any = js.native
    
    var fillAttributes_ : js.Array[CustomAttribute] = js.native
    
    var fillFragmentShader_ : String = js.native
    
    var fillVertexShader_ : String = js.native
    
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
    
    var lineStringRenderer_ : js.UndefOr[typings.ol.renderWebglLineStringBatchRendererMod.default] = js.native
    
    var pointAttributes_ : js.Array[CustomAttribute] = js.native
    
    var pointFragmentShader_ : String = js.native
    
    var pointRenderer_ : js.UndefOr[typings.ol.renderWebglPointBatchRendererMod.default] = js.native
    
    var pointVertexShader_ : String = js.native
    
    var polygonRenderer_ : js.UndefOr[typings.ol.renderWebglPolygonBatchRendererMod.default] = js.native
    
    var previousExtent_ : Extent = js.native
    
    /**
      * Render the layer.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @return {HTMLElement} The rendered element.
      */
    def renderFrame(frameState: FrameState): HTMLElement = js.native
    
    var sourceListenKeys_ : js.Array[EventsKey] = js.native
    
    var sourceRevision_ : Double = js.native
    
    var strokeAttributes_ : js.Array[CustomAttribute] = js.native
    
    var strokeFragmentShader_ : String = js.native
    
    var strokeVertexShader_ : String = js.native
    
    /**
      * @private
      */
    /* private */ var worker_ : Any = js.native
  }
}
