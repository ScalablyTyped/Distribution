package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInFrequencySessionControl
  extends StObject
     with ConditionalAccessSessionControl {
  
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
  
  extension [Self <: SignInFrequencySessionControl](x: Self) {
    
    inline def setType(value: NullableOption[SigninFrequencyType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
