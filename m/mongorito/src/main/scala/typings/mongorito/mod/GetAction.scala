package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.GET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAction extends Action {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: GET = js.native
}
object GetAction {
  
  @scala.inline
  def apply(`type`: GET): GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAction]
  }
  
  @scala.inline
  implicit class GetActionMutableBuilder[Self <: GetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: GET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
