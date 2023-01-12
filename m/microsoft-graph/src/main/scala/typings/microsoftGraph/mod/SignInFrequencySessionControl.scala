package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInFrequencySessionControl
  extends StObject
     with ConditionalAccessSessionControl {
  
  // The possible values are primaryAndSecondaryAuthentication, secondaryAuthentication, unknownFutureValue.
  var authenticationType: js.UndefOr[NullableOption[SignInFrequencyAuthenticationType]] = js.undefined
  
  // The possible values are timeBased, everyTime, unknownFutureValue.
  var frequencyInterval: js.UndefOr[NullableOption[SignInFrequencyInterval]] = js.undefined
  
  // Possible values are: days, hours.
  var `type`: js.UndefOr[NullableOption[SigninFrequencyType]] = js.undefined
  
  // The number of days or hours.
  var value: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SignInFrequencySessionControl {
  
  inline def apply(): SignInFrequencySessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInFrequencySessionControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignInFrequencySessionControl] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: NullableOption[SignInFrequencyAuthenticationType]): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeNull: Self = StObject.set(x, "authenticationType", null)
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setFrequencyInterval(value: NullableOption[SignInFrequencyInterval]): Self = StObject.set(x, "frequencyInterval", value.asInstanceOf[js.Any])
    
    inline def setFrequencyIntervalNull: Self = StObject.set(x, "frequencyInterval", null)
    
    inline def setFrequencyIntervalUndefined: Self = StObject.set(x, "frequencyInterval", js.undefined)
    
    inline def setType(value: NullableOption[SigninFrequencyType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
