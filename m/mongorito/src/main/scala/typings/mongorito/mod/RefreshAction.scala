package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REFRESH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshAction extends Action {
  
  var `type`: REFRESH = js.native
}
object RefreshAction {
  
  @scala.inline
  def apply(`type`: REFRESH): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAction]
  }
  
  @scala.inline
  implicit class RefreshActionMutableBuilder[Self <: RefreshAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: REFRESH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
