package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglConstantsMod {
  
  object WebGLWorkerMessageType {
    
    @JSImport("ol/render/webgl/constants", "WebGLWorkerMessageType.GENERATE_LINE_STRING_BUFFERS")
    @js.native
    val GENERATE_LINE_STRING_BUFFERS: String = js.native
    
    @JSImport("ol/render/webgl/constants", "WebGLWorkerMessageType.GENERATE_POINT_BUFFERS")
    @js.native
    val GENERATE_POINT_BUFFERS: String = js.native
    
    @JSImport("ol/render/webgl/constants", "WebGLWorkerMessageType.GENERATE_POLYGON_BUFFERS")
    @js.native
    val GENERATE_POLYGON_BUFFERS: String = js.native
  }
  type WebGLWorkerMessageType = String
  
  trait WebGLWorkerGenerateBuffersMessage extends StObject {
    
    /**
      * Amount of custom attributes count in the polygon render instructions.
      */
    var customAttributesCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Message id; will be used both in request and response as a means of identification
      */
    var id: Double
    
    /**
      * Indices array raw binary buffer (sent by the worker).
      */
    var indexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    /**
      * Polygon render instructions raw binary buffer.
      */
    var renderInstructions: js.typedarray.ArrayBuffer
    
    /**
      * Transformation matrix used to project the instructions coordinates
      */
    var renderInstructionsTransform: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Message type
      */
    var `type`: WebGLWorkerMessageType
    
    /**
      * Vertices array raw binary buffer (sent by the worker).
      */
    var vertexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object WebGLWorkerGenerateBuffersMessage {
    
    inline def apply(id: Double, renderInstructions: js.typedarray.ArrayBuffer, `type`: WebGLWorkerMessageType): WebGLWorkerGenerateBuffersMessage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
      
      inline def setCustomAttributesCount(value: Double): Self = StObject.set(x, "customAttributesCount", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesCountUndefined: Self = StObject.set(x, "customAttributesCount", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
      
      inline def setIndexBufferUndefined: Self = StObject.set(x, "indexBuffer", js.undefined)
      
      inline def setRenderInstructions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransform(value: js.Array[Double]): Self = StObject.set(x, "renderInstructionsTransform", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransformUndefined: Self = StObject.set(x, "renderInstructionsTransform", js.undefined)
      
      inline def setRenderInstructionsTransformVarargs(value: Double*): Self = StObject.set(x, "renderInstructionsTransform", js.Array(value*))
      
      inline def setType(value: WebGLWorkerMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVertexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
      
      inline def setVertexBufferUndefined: Self = StObject.set(x, "vertexBuffer", js.undefined)
    }
  }
}
