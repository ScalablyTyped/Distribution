package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultColumnValue extends js.Object {
  
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
  implicit class DefaultColumnValueOps[Self <: DefaultColumnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormula(value: NullableOption[String]): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFormulaNull: Self = this.set("formula", null)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
