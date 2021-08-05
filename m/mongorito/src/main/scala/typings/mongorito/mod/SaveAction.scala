package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.SAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: SAVE
}
object SaveAction {
  
  inline def apply(fields: js.Object, `type`: SAVE): SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAction]
  }
  
  extension [Self <: SaveAction](x: Self) {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setType(value: SAVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
