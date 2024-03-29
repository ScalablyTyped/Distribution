package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscussionnumberNumber extends StObject {
  
  var discussion_number: Double
  
  var team_id: Double
}
object DiscussionnumberNumber {
  
  inline def apply(discussion_number: Double, team_id: Double): DiscussionnumberNumber = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscussionnumberNumber] (val x: Self) extends AnyVal {
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
