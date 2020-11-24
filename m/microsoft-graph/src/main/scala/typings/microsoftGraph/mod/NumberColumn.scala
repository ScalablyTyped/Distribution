package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberColumn extends js.Object {
  
  // How many decimal places to display. See below for information about the possible values.
  var decimalPlaces: js.UndefOr[NullableOption[String]] = js.native
  
  // How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
  var displayAs: js.UndefOr[NullableOption[String]] = js.native
  
  // The maximum permitted value.
  var maximum: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum permitted value.
  var minimum: js.UndefOr[NullableOption[Double]] = js.native
}
object NumberColumn {
  
  @scala.inline
  def apply(): NumberColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberColumn]
  }
  
  @scala.inline
  implicit class NumberColumnOps[Self <: NumberColumn] (val x: Self) extends AnyVal {
    
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
    def setDecimalPlaces(value: NullableOption[String]): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    
    @scala.inline
    def setDecimalPlacesNull: Self = this.set("decimalPlaces", null)
    
    @scala.inline
    def setDisplayAs(value: NullableOption[String]): Self = this.set("displayAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAs: Self = this.set("displayAs", js.undefined)
    
    @scala.inline
    def setDisplayAsNull: Self = this.set("displayAs", null)
    
    @scala.inline
    def setMaximum(value: NullableOption[Double]): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMaximumNull: Self = this.set("maximum", null)
    
    @scala.inline
    def setMinimum(value: NullableOption[Double]): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMinimumNull: Self = this.set("minimum", null)
  }
}
