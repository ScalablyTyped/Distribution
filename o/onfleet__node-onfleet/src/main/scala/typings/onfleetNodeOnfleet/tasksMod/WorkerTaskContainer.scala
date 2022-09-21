package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.WORKER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerTaskContainer
  extends StObject
     with TaskContainer {
  
  var `type`: WORKER
  
  var worker: String
}
object WorkerTaskContainer {
  
  inline def apply(worker: String): WorkerTaskContainer = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WORKER")
    __obj.asInstanceOf[WorkerTaskContainer]
  }
  
  extension [Self <: WorkerTaskContainer](x: Self) {
    
    inline def setType(value: WORKER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
  }
}
