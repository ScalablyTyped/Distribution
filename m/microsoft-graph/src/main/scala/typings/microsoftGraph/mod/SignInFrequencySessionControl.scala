package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SignInFrequencySessionControlMutableBuilder[Self <: SignInFrequencySessionControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableOption[SigninFrequencyType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
