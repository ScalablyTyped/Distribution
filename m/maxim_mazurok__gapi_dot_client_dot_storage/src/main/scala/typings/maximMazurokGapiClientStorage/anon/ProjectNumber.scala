package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectNumber extends StObject {
  
  /** The project number. */
  var projectNumber: js.UndefOr[String] = js.undefined
  
  /** The team. */
  var team: js.UndefOr[String] = js.undefined
}
object ProjectNumber {
  
  @scala.inline
  def apply(): ProjectNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectNumber]
  }
  
  @scala.inline
  implicit class ProjectNumberMutableBuilder[Self <: ProjectNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    @scala.inline
    def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
  }
}
