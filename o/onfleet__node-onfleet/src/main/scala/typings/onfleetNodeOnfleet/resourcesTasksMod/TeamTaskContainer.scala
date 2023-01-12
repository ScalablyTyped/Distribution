package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TEAM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamTaskContainer
  extends StObject
     with TaskContainer {
  
  var team: String
  
  var `type`: TEAM
}
object TeamTaskContainer {
  
  inline def apply(team: String): TeamTaskContainer = {
    val __obj = js.Dynamic.literal(team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TEAM")
    __obj.asInstanceOf[TeamTaskContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamTaskContainer] (val x: Self) extends AnyVal {
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setType(value: TEAM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
