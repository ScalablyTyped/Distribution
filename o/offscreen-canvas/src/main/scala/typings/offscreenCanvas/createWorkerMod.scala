package typings.offscreenCanvas

import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWorkerMod {
  
  inline def apply(
    canvas: HTMLCanvasElement,
    workerUrl: String,
    listener: js.Function1[/* ev */ MessageEvent[Any], Any]
  ): WorkerInterface = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], workerUrl.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[WorkerInterface]
  
  @JSImport("offscreen-canvas/create-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable-next-line:no-empty-interface
  type PostMessageOptions = WindowPostMessageOptions
  
  trait WindowPostMessageOptions extends StObject
  
  @js.native
  trait WorkerInterface extends StObject {
    
    def post(message: Any): Unit = js.native
    def post(message: Any, options: PostMessageOptions): Unit = js.native
    def post(message: Any, transfer: js.Array[Transferable]): Unit = js.native
  }
}
