package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiValueLegacyExtendedProperty extends Entity {
  
  // A collection of property values.
  var value: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object MultiValueLegacyExtendedProperty {
  
  @scala.inline
  def apply(): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
  
  @scala.inline
  implicit class MultiValueLegacyExtendedPropertyMutableBuilder[Self <: MultiValueLegacyExtendedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
