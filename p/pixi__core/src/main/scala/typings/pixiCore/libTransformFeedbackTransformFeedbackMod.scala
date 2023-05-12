package typings.pixiCore

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiCore.libGeometryBufferMod.Buffer
import typings.pixiRunner.mod.Runner
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformFeedbackTransformFeedbackMod {
  
  @JSImport("@pixi/core/lib/transformFeedback/TransformFeedback", "TransformFeedback")
  @js.native
  open class TransformFeedback () extends StObject {
    
    var _glTransformFeedbacks: NumberDictionary[WebGLTransformFeedback] = js.native
    
    /**
      * Bind buffer to TransformFeedback
      * @param index - index to bind
      * @param buffer - buffer to bind
      */
    def bindBuffer(index: Double, buffer: Buffer): Unit = js.native
    
    var buffers: js.Array[Buffer] = js.native
    
    /** Destroy WebGL resources that are connected to this TransformFeedback. */
    def destroy(): Unit = js.native
    
    var disposeRunner: Runner = js.native
  }
}
