package typings.offscreenCanvas

import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import typings.std.PostMessageOptions
import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("offscreen-canvas/create-worker", JSImport.Namespace)
@js.native
object createWorkerMod extends js.Object {
  
  def apply(canvas: HTMLCanvasElement, workerUrl: String, listener: js.Function1[/* ev */ MessageEvent[_], _]): WorkerInterface = js.native
  
  @js.native
  trait WorkerInterface extends js.Object {
    
    def post(message: js.Any): Unit = js.native
    def post(message: js.Any, options: PostMessageOptions): Unit = js.native
    def post(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  }
}
