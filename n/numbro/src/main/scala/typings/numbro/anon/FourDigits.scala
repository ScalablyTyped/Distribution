package typings.numbro.anon

import typings.numbro.mod.numbro.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourDigits extends js.Object {
  
  var fourDigits: Format = js.native
  
  var fullWithNoDecimals: Format = js.native
  
  var fullWithTwoDecimals: Format = js.native
  
  var fullWithTwoDecimalsNoCurrency: Format = js.native
}
object FourDigits {
  
  @scala.inline
  def apply(
    fourDigits: Format,
    fullWithNoDecimals: Format,
    fullWithTwoDecimals: Format,
    fullWithTwoDecimalsNoCurrency: Format
  ): FourDigits = {
    val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourDigits]
  }
  
  @scala.inline
  implicit class FourDigitsOps[Self <: FourDigits] (val x: Self) extends AnyVal {
    
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
    def setFourDigits(value: Format): Self = this.set("fourDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWithNoDecimals(value: Format): Self = this.set("fullWithNoDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWithTwoDecimals(value: Format): Self = this.set("fullWithTwoDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWithTwoDecimalsNoCurrency(value: Format): Self = this.set("fullWithTwoDecimalsNoCurrency", value.asInstanceOf[js.Any])
  }
}
