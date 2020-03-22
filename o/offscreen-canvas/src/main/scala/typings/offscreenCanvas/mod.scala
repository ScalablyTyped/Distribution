package typings.offscreenCanvas

import typings.offscreenCanvas.createWorkerMod.WorkerInterface
import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("offscreen-canvas", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object createWorker extends js.Object {
    def apply(canvas: HTMLCanvasElement, workerUrl: String, listener: js.Function1[/* ev */ MessageEvent, _]): WorkerInterface = js.native
  }
  
  @js.native
  object insideWorker extends js.Object {
    def apply(listener: js.Function1[/* ev */ MessageEvent, _]): typings.offscreenCanvas.insideWorkerMod.WorkerInterface = js.native
  }
  
}

