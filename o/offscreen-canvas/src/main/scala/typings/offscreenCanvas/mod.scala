package typings.offscreenCanvas

import typings.offscreenCanvas.createWorkerMod.WorkerInterface
import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object createWorker {
    
    @scala.inline
    def apply(
      canvas: HTMLCanvasElement,
      workerUrl: String,
      listener: js.Function1[/* ev */ MessageEvent[js.Any], js.Any]
    ): WorkerInterface = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], workerUrl.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[WorkerInterface]
    
    @JSImport("offscreen-canvas", "createWorker")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object insideWorker {
    
    @scala.inline
    def apply(listener: js.Function1[/* ev */ MessageEvent[js.Any], js.Any]): typings.offscreenCanvas.insideWorkerMod.WorkerInterface = ^.asInstanceOf[js.Dynamic].apply(listener.asInstanceOf[js.Any]).asInstanceOf[typings.offscreenCanvas.insideWorkerMod.WorkerInterface]
    
    @JSImport("offscreen-canvas", "insideWorker")
    @js.native
    val ^ : js.Any = js.native
  }
}
