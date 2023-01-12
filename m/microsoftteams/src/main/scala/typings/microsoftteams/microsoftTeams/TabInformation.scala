package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about tabs for an app
  */
trait TabInformation extends StObject {
  
  var teamTabs: js.Array[TabInstance]
}
object TabInformation {
  
  inline def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
    val __obj = js.Dynamic.literal(teamTabs = teamTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabInformation] (val x: Self) extends AnyVal {
    
    inline def setTeamTabs(value: js.Array[TabInstance]): Self = StObject.set(x, "teamTabs", value.asInstanceOf[js.Any])
    
    inline def setTeamTabsVarargs(value: TabInstance*): Self = StObject.set(x, "teamTabs", js.Array(value*))
  }
}
