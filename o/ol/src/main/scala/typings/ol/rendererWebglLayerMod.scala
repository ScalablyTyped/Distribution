package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.mapMod.FrameState
import typings.ol.webglHelperMod.UniformValue
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglLayerMod {
  
  /**
    * @typedef {Object} PostProcessesOptions
    * @property {number} [scaleRatio] Scale ratio; if < 1, the post process will render to a texture smaller than
    * the main canvas that will then be sampled up (useful for saving resource on blur steps).
    * @property {string} [vertexShader] Vertex shader source
    * @property {string} [fragmentShader] Fragment shader source
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process step
    */
  /**
    * @typedef {Object} Options
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process steps
    * @property {Array<PostProcessesOptions>} [postProcesses] Post-processes definitions
    */
  /**
    * @classdesc
    * Base WebGL renderer class.
    * Holds all logic related to data manipulation & some common rendering logic
    * @template {import("../../layer/Layer.js").default} LayerType
    * @extends {LayerRenderer<LayerType>}
    */
  @JSImport("ol/renderer/webgl/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, typings.ol.rendererLayerMod.default[Any]] */] protected () extends WebGLLayerRenderer[LayerType] {
    /**
      * @param {LayerType} layer Layer.
      * @param {Options} [options] Options.
      */
    def this(layer: LayerType) = this()
    def this(layer: LayerType, options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Post-processes definitions
      */
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    /**
      * Uniform definitions for the post process steps
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
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait PostProcessesOptions extends StObject {
    
    /**
      * Fragment shader source
      */
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    /**
      * Scale ratio; if < 1, the post process will render to a texture smaller than
      * the main canvas that will then be sampled up (useful for saving resource on blur steps).
      */
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Uniform definitions for the post process step
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    /**
      * Vertex shader source
      */
    var vertexShader: js.UndefOr[String] = js.undefined
  }
  object PostProcessesOptions {
    
    inline def apply(): PostProcessesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostProcessesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      inline def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} PostProcessesOptions
    * @property {number} [scaleRatio] Scale ratio; if < 1, the post process will render to a texture smaller than
    * the main canvas that will then be sampled up (useful for saving resource on blur steps).
    * @property {string} [vertexShader] Vertex shader source
    * @property {string} [fragmentShader] Fragment shader source
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process step
    */
  /**
    * @typedef {Object} Options
    * @property {Object<string,import("../../webgl/Helper").UniformValue>} [uniforms] Uniform definitions for the post process steps
    * @property {Array<PostProcessesOptions>} [postProcesses] Post-processes definitions
    */
  /**
    * @classdesc
    * Base WebGL renderer class.
    * Holds all logic related to data manipulation & some common rendering logic
    * @template {import("../../layer/Layer.js").default} LayerType
    * @extends {LayerRenderer<LayerType>}
    */
  @js.native
  trait WebGLLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, typings.ol.rendererLayerMod.default[Any]] */]
    extends typings.ol.rendererLayerMod.default[LayerType] {
    
    /**
      * @protected
      */
    /* protected */ def afterHelperCreated(): Unit = js.native
    
    /**
      * @param {WebGLRenderingContext} context The WebGL rendering context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def dispatchPostComposeEvent(context: WebGLRenderingContext, frameState: FrameState): Unit = js.native
    
    /**
      * @param {WebGLRenderingContext} context The WebGL rendering context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def dispatchPreComposeEvent(context: WebGLRenderingContext, frameState: FrameState): Unit = js.native
    
    /**
      * @param {import("../../render/EventType.js").default} type Event type.
      * @param {WebGLRenderingContext} context The rendering context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @private
      */
    /* private */ var dispatchRenderEvent_ : Any = js.native
    
    /**
      * @type {WebGLHelper}
      * @protected
      */
    /* protected */ var helper: typings.ol.webglHelperMod.default = js.native
    
    /**
      * The transform for viewport CSS pixels to rendered pixels.  This transform is only
      * set before dispatching rendering events.
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var inversePixelTransform_ : Any = js.native
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var pixelContext_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var postProcesses_ : Any = js.native
    
    /**
      * @param {WebGLRenderingContext} context The rendering context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def postRender(context: WebGLRenderingContext, frameState: FrameState): Unit = js.native
    
    /**
      * @param {WebGLRenderingContext} context The rendering context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def preRender(context: WebGLRenderingContext, frameState: FrameState): Unit = js.native
    
    /**
      * Determine whether renderFrame should be called.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @return {boolean} Layer is ready to be rendered.
      * @protected
      */
    /* protected */ def prepareFrameInternal(frameState: FrameState): Boolean = js.native
    
    /**
      * @protected
      */
    /* protected */ def removeHelper(): Unit = js.native
    
    /**
      * Reset options (only handles uniforms).
      * @param {Options} options Options.
      */
    def reset(options: Options): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var uniforms_ : Any = js.native
  }
}
