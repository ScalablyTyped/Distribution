package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAutoAssignOptions extends StObject {
  
  var considerDependencies: js.UndefOr[Boolean] = js.undefined
  
  var excludedWorkerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxAssignedTaskCount: js.UndefOr[Double] = js.undefined
  
  var mode: String
  
  var restrictAutoAssignmentToTeam: js.UndefOr[Boolean] = js.undefined
  
  var team: js.UndefOr[String] = js.undefined
  
  var teams: js.UndefOr[js.Array[String]] = js.undefined
}
object TaskAutoAssignOptions {
  
  inline def apply(mode: String): TaskAutoAssignOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAutoAssignOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAutoAssignOptions] (val x: Self) extends AnyVal {
    
    inline def setConsiderDependencies(value: Boolean): Self = StObject.set(x, "considerDependencies", value.asInstanceOf[js.Any])
    
    inline def setConsiderDependenciesUndefined: Self = StObject.set(x, "considerDependencies", js.undefined)
    
    inline def setExcludedWorkerIds(value: js.Array[String]): Self = StObject.set(x, "excludedWorkerIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedWorkerIdsUndefined: Self = StObject.set(x, "excludedWorkerIds", js.undefined)
    
    inline def setExcludedWorkerIdsVarargs(value: String*): Self = StObject.set(x, "excludedWorkerIds", js.Array(value*))
    
    inline def setMaxAssignedTaskCount(value: Double): Self = StObject.set(x, "maxAssignedTaskCount", value.asInstanceOf[js.Any])
    
    inline def setMaxAssignedTaskCountUndefined: Self = StObject.set(x, "maxAssignedTaskCount", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRestrictAutoAssignmentToTeam(value: Boolean): Self = StObject.set(x, "restrictAutoAssignmentToTeam", value.asInstanceOf[js.Any])
    
    inline def setRestrictAutoAssignmentToTeamUndefined: Self = StObject.set(x, "restrictAutoAssignmentToTeam", js.undefined)
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
  }
}
