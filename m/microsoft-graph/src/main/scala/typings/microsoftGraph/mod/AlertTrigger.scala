package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertTrigger extends StObject {
  
  // Name of the property serving as a detection trigger.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Type of the property in the key:value pair for interpretation. For example, String, Boolean, etc.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
  
  // Value of the property serving as a detection trigger.
  var value: js.UndefOr[NullableOption[String]] = js.native
}
object AlertTrigger {
  
  @scala.inline
  def apply(): AlertTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertTrigger]
  }
  
  @scala.inline
  implicit class AlertTriggerMutableBuilder[Self <: AlertTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
