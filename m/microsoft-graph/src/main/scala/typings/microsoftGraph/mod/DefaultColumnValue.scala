package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultColumnValue extends StObject {
  
  // The formula used to compute the default value for this column.
  var formula: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The direct value to use as the default value for this column.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object DefaultColumnValue {
  
  inline def apply(): DefaultColumnValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultColumnValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultColumnValue] (val x: Self) extends AnyVal {
    
    inline def setFormula(value: NullableOption[String]): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
