package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglLayerMod {
  
  @JSImport("ol/renderer/webgl/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/renderer/webgl/Layer", JSImport.Default)
  @js.native
  class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */] protected () extends WebGLLayerRenderer[LayerType] {
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
    /* "GENERATE_BUFFERS" */ val GENERATE_BUFFERS: typings.ol.webglLayerMod.WebGLWorkerMessageType.GENERATE_BUFFERS & String = js.native
  }
  
  @scala.inline
  def colorDecodeId(color: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDecodeId")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def colorEncodeId(id: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def colorEncodeId(id: Double, opt_array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any], opt_array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  trait BufferPositions extends StObject {
    
    var indexPosition: Double
    
    var vertexPosition: Double
  }
  object BufferPositions {
    
    @scala.inline
    def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
      val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferPositions]
    }
    
    @scala.inline
    implicit class BufferPositionsMutableBuilder[Self <: BufferPositions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexPosition(value: Double): Self = StObject.set(x, "indexPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPosition(value: Double): Self = StObject.set(x, "vertexPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      @scala.inline
      def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value :_*))
      
      @scala.inline
      def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait PostProcessesOptions extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    var vertexShader: js.UndefOr[String] = js.undefined
  }
  object PostProcessesOptions {
    
    @scala.inline
    def apply(): PostProcessesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostProcessesOptions]
    }
    
    @scala.inline
    implicit class PostProcessesOptionsMutableBuilder[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      @scala.inline
      def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
      
      @scala.inline
      def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      @scala.inline
      def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  @js.native
  trait WebGLLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
    extends typings.ol.rendererLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
    /**
      * Will return the last shader compilation errors. If no error happened, will return null;
      */
    def getShaderCompileErrors(): String | Null = js.native
    
    var helper: typings.ol.helperMod.default = js.native
  }
  
  trait WebGLWorkerGenerateBuffersMessage extends StObject {
    
    var customAttributesCount: js.UndefOr[Double] = js.undefined
    
    var indexBuffer: js.UndefOr[ArrayBuffer] = js.undefined
    
    var renderInstructions: ArrayBuffer
    
    var `type`: WebGLWorkerMessageType
    
    var vertexBuffer: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object WebGLWorkerGenerateBuffersMessage {
    
    @scala.inline
    def apply(renderInstructions: ArrayBuffer, `type`: WebGLWorkerMessageType): WebGLWorkerGenerateBuffersMessage = {
      val __obj = js.Dynamic.literal(renderInstructions = renderInstructions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
    }
    
    @scala.inline
    implicit class WebGLWorkerGenerateBuffersMessageMutableBuilder[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomAttributesCount(value: Double): Self = StObject.set(x, "customAttributesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesCountUndefined: Self = StObject.set(x, "customAttributesCount", js.undefined)
      
      @scala.inline
      def setIndexBuffer(value: ArrayBuffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexBufferUndefined: Self = StObject.set(x, "indexBuffer", js.undefined)
      
      @scala.inline
      def setRenderInstructions(value: ArrayBuffer): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: WebGLWorkerMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexBuffer(value: ArrayBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexBufferUndefined: Self = StObject.set(x, "vertexBuffer", js.undefined)
    }
  }
}
