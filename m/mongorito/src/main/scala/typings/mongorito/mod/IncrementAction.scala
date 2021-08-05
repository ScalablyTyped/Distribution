package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.INCREMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: INCREMENT
}
object IncrementAction {
  
  inline def apply(fields: js.Object, `type`: INCREMENT): IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementAction]
  }
  
  extension [Self <: IncrementAction](x: Self) {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setType(value: INCREMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
