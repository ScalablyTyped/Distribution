package typings.offscreenCanvas

import typings.std.MessageEvent
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insideWorkerMod {
  
  inline def apply(listener: js.Function1[/* ev */ MessageEvent[Any], Any]): WorkerInterface = ^.asInstanceOf[js.Dynamic].apply(listener.asInstanceOf[js.Any]).asInstanceOf[WorkerInterface]
  
  @JSImport("offscreen-canvas/inside-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable-next-line:no-empty-interface
  type PostMessageOptions = WindowPostMessageOptions
  
  trait WindowPostMessageOptions extends StObject
  
  @js.native
  trait WorkerInterface extends StObject {
    
    var isWorker: Boolean = js.native
    
    def post(message: Any): Unit = js.native
    def post(message: Any, options: PostMessageOptions): Unit = js.native
    def post(message: Any, transfer: js.Array[Transferable]): Unit = js.native
  }
}
