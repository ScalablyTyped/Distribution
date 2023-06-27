package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  /**
    * Array of changed conditions with structure {@link sap.ui.mdc.condition.ConditionObject ConditionObject}
    */
  var conditions: js.Array[js.Object]
  
  /**
    * Type of the selection change (add, remove)
    */
  var `type`: /* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any
}
object Conditions {
  
  inline def apply(conditions: js.Array[js.Object], `type`: /* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any): Conditions = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conditions] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setType(value: /* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
