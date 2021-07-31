package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REFRESHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshedAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: REFRESHED
}
object RefreshedAction {
  
  @scala.inline
  def apply(fields: js.Object, `type`: REFRESHED): RefreshedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshedAction]
  }
  
  @scala.inline
  implicit class RefreshedActionMutableBuilder[Self <: RefreshedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: REFRESHED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
