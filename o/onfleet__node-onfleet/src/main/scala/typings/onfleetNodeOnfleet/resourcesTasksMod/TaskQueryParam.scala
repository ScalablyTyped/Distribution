package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskQueryParam extends StObject {
  
  var completeAfterAfter: js.UndefOr[Double] = js.undefined
  
  var completeBeforeBefore: js.UndefOr[Double] = js.undefined
  
  var dependencies: js.UndefOr[String] = js.undefined
  
  var from: Double
  
  var lastId: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[Double | String] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
  
  var worker: js.UndefOr[String] = js.undefined
}
object TaskQueryParam {
  
  inline def apply(from: Double): TaskQueryParam = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskQueryParam]
  }
  
  extension [Self <: TaskQueryParam](x: Self) {
    
    inline def setCompleteAfterAfter(value: Double): Self = StObject.set(x, "completeAfterAfter", value.asInstanceOf[js.Any])
    
    inline def setCompleteAfterAfterUndefined: Self = StObject.set(x, "completeAfterAfter", js.undefined)
    
    inline def setCompleteBeforeBefore(value: Double): Self = StObject.set(x, "completeBeforeBefore", value.asInstanceOf[js.Any])
    
    inline def setCompleteBeforeBeforeUndefined: Self = StObject.set(x, "completeBeforeBefore", js.undefined)
    
    inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLastId(value: String): Self = StObject.set(x, "lastId", value.asInstanceOf[js.Any])
    
    inline def setLastIdUndefined: Self = StObject.set(x, "lastId", js.undefined)
    
    inline def setState(value: Double | String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
