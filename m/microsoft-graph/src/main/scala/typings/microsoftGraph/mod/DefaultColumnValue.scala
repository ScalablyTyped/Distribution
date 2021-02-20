package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultColumnValue extends StObject {
  
  // The formula used to compute the default value for this column.
  var formula: js.UndefOr[NullableOption[String]] = js.native
  
  // The direct value to use as the default value for this column.
  var value: js.UndefOr[NullableOption[String]] = js.native
}
object DefaultColumnValue {
  
  @scala.inline
  def apply(): DefaultColumnValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultColumnValue]
  }
  
  @scala.inline
  implicit class DefaultColumnValueMutableBuilder[Self <: DefaultColumnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: NullableOption[String]): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
