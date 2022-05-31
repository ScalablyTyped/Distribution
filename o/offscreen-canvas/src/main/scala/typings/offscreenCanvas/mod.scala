package typings.offscreenCanvas

import typings.offscreenCanvas.createWorkerMod.WorkerInterface
import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("offscreen-canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWorker(
    canvas: HTMLCanvasElement,
    workerUrl: String,
    listener: js.Function1[/* ev */ MessageEvent[js.Any], js.Any]
  ): WorkerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")(canvas.asInstanceOf[js.Any], workerUrl.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[WorkerInterface]
  
  inline def insideWorker(listener: js.Function1[/* ev */ MessageEvent[js.Any], js.Any]): typings.offscreenCanvas.insideWorkerMod.WorkerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("insideWorker")(listener.asInstanceOf[js.Any]).asInstanceOf[typings.offscreenCanvas.insideWorkerMod.WorkerInterface]
}
