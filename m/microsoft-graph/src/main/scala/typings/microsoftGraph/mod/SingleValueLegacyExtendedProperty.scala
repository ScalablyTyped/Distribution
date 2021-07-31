package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleValueLegacyExtendedProperty
  extends StObject
     with Entity {
  
  // A property value.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object SingleValueLegacyExtendedProperty {
  
  @scala.inline
  def apply(): SingleValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleValueLegacyExtendedProperty]
  }
  
  @scala.inline
  implicit class SingleValueLegacyExtendedPropertyMutableBuilder[Self <: SingleValueLegacyExtendedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
