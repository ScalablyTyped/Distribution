package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiValueLegacyExtendedProperty
  extends StObject
     with Entity {
  
  // A collection of property values.
  var value: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object MultiValueLegacyExtendedProperty {
  
  inline def apply(): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
  
  extension [Self <: MultiValueLegacyExtendedProperty](x: Self) {
    
    inline def setValue(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
