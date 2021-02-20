package typings.offscreenCanvas

import typings.offscreenCanvas.createWorkerMod.WorkerInterface
import typings.std.HTMLCanvasElement
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object createWorker {
    
    @JSImport("offscreen-canvas", "createWorker")
    @js.native
    def apply(canvas: HTMLCanvasElement, workerUrl: String, listener: js.Function1[/* ev */ MessageEvent[_], _]): WorkerInterface = js.native
  }
  
  object insideWorker {
    
    @JSImport("offscreen-canvas", "insideWorker")
    @js.native
    def apply(listener: js.Function1[/* ev */ MessageEvent[_], _]): typings.offscreenCanvas.insideWorkerMod.WorkerInterface = js.native
  }
}
