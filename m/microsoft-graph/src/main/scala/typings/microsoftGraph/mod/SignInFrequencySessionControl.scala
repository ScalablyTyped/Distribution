package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignInFrequencySessionControl extends ConditionalAccessSessionControl {
  
  // Possible values are: days, hours.
  var `type`: js.UndefOr[NullableOption[SigninFrequencyType]] = js.native
  
  // The number of days or hours.
  var value: js.UndefOr[NullableOption[Double]] = js.native
}
object SignInFrequencySessionControl {
  
  @scala.inline
  def apply(): SignInFrequencySessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInFrequencySessionControl]
  }
  
  @scala.inline
  implicit class SignInFrequencySessionControlOps[Self <: SignInFrequencySessionControl] (val x: Self) extends AnyVal {
    
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
    def setType(value: NullableOption[SigninFrequencyType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setValue(value: NullableOption[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
