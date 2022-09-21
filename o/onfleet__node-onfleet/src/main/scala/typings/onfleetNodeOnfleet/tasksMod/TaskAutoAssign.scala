package typings.onfleetNodeOnfleet.tasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAutoAssign extends StObject {
  
  var considerDependencies: js.UndefOr[Boolean] = js.undefined
  
  var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxAssignedTaskCount: js.UndefOr[Double] = js.undefined
  
  var mode: String
  
  var team: js.UndefOr[String] = js.undefined
}
object TaskAutoAssign {
  
  inline def apply(mode: String): TaskAutoAssign = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAutoAssign]
  }
  
  extension [Self <: TaskAutoAssign](x: Self) {
    
    inline def setConsiderDependencies(value: Boolean): Self = StObject.set(x, "considerDependencies", value.asInstanceOf[js.Any])
    
    inline def setConsiderDependenciesUndefined: Self = StObject.set(x, "considerDependencies", js.undefined)
    
    inline def setExcludeWorkerIds(value: js.Array[String]): Self = StObject.set(x, "excludeWorkerIds", value.asInstanceOf[js.Any])
    
    inline def setExcludeWorkerIdsUndefined: Self = StObject.set(x, "excludeWorkerIds", js.undefined)
    
    inline def setExcludeWorkerIdsVarargs(value: String*): Self = StObject.set(x, "excludeWorkerIds", js.Array(value*))
    
    inline def setMaxAssignedTaskCount(value: Double): Self = StObject.set(x, "maxAssignedTaskCount", value.asInstanceOf[js.Any])
    
    inline def setMaxAssignedTaskCountUndefined: Self = StObject.set(x, "maxAssignedTaskCount", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
  }
}
