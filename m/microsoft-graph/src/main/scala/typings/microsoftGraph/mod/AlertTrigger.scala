package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertTrigger extends StObject {
  
  // Name of the property serving as a detection trigger.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Type of the property in the key:value pair for interpretation. For example, String, Boolean, etc.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value of the property serving as a detection trigger.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object AlertTrigger {
  
  inline def apply(): AlertTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertTrigger]
  }
  
  extension [Self <: AlertTrigger](x: Self) {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
