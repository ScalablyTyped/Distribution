package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.workersMod.OnfleetWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workers extends StObject {
  
  var workers: js.Array[OnfleetWorker]
}
object Workers {
  
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): Workers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workers]
  }
  
  @scala.inline
  implicit class WorkersMutableBuilder[Self <: Workers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkers(value: js.Array[OnfleetWorker]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkersVarargs(value: OnfleetWorker*): Self = StObject.set(x, "workers", js.Array(value :_*))
  }
}
