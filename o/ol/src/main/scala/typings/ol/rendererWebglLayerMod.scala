package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pluggableMapMod.FrameState
import typings.ol.webglHelperMod.UniformValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglLayerMod {
  
  @JSImport("ol/renderer/webgl/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/renderer/webgl/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */] protected () extends WebGLLayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
    def this(layer: LayerType, opt_options: Options) = this()
  }
  
  @js.native
  sealed trait WebGLWorkerMessageType extends StObject
  @JSImport("ol/renderer/webgl/Layer", "WebGLWorkerMessageType")
  @js.native
  object WebGLWorkerMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebGLWorkerMessageType & String] = js.native
    
    @js.native
    sealed trait GENERATE_BUFFERS
      extends StObject
         with WebGLWorkerMessageType
    /* "GENERATE_BUFFERS" */ val GENERATE_BUFFERS: typings.ol.rendererWebglLayerMod.WebGLWorkerMessageType.GENERATE_BUFFERS & String = js.native
  }
  
  inline def colorDecodeId(color: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDecodeId")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def colorEncodeId(id: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def colorEncodeId(id: Double, opt_array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any], opt_array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  trait BufferPositions extends StObject {
    
    var indexPosition: Double
    
    var vertexPosition: Double
  }
  object BufferPositions {
    
    inline def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
      val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferPositions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferPositions] (val x: Self) extends AnyVal {
      
      inline def setIndexPosition(value: Double): Self = StObject.set(x, "indexPosition", value.asInstanceOf[js.Any])
      
      inline def setVertexPosition(value: Double): Self = StObject.set(x, "vertexPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
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
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait PostProcessesOptions extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
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
  
  @js.native
  trait WebGLLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
    extends typings.ol.rendererLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
    /**
      * Will return the last shader compilation errors. If no error happened, will return null;
      */
    def getShaderCompileErrors(): String | Null = js.native
    
    /* protected */ var helper: typings.ol.webglHelperMod.default = js.native
    
    /* protected */ def postRender(frameState: FrameState): Unit = js.native
    
    /* protected */ def preRender(frameState: FrameState): Unit = js.native
  }
  
  trait WebGLWorkerGenerateBuffersMessage extends StObject {
    
    var customAttributesCount: js.UndefOr[Double] = js.undefined
    
    var indexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    var renderInstructions: js.typedarray.ArrayBuffer
    
    var `type`: WebGLWorkerMessageType
    
    var vertexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object WebGLWorkerGenerateBuffersMessage {
    
    inline def apply(renderInstructions: js.typedarray.ArrayBuffer, `type`: WebGLWorkerMessageType): WebGLWorkerGenerateBuffersMessage = {
      val __obj = js.Dynamic.literal(renderInstructions = renderInstructions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
      
      inline def setCustomAttributesCount(value: Double): Self = StObject.set(x, "customAttributesCount", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesCountUndefined: Self = StObject.set(x, "customAttributesCount", js.undefined)
      
      inline def setIndexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
      
      inline def setIndexBufferUndefined: Self = StObject.set(x, "indexBuffer", js.undefined)
      
      inline def setRenderInstructions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      inline def setType(value: WebGLWorkerMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVertexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
      
      inline def setVertexBufferUndefined: Self = StObject.set(x, "vertexBuffer", js.undefined)
    }
  }
}
