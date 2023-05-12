package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MilestonenumberOwner extends StObject {
  
  var milestone_number: Double
  
  var owner: String
  
  var repo: String
}
object MilestonenumberOwner {
  
  inline def apply(milestone_number: Double, owner: String, repo: String): MilestonenumberOwner = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MilestonenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MilestonenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setMilestone_number(value: Double): Self = StObject.set(x, "milestone_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
