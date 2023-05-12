package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleSessionSignOut extends StObject {
  
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var signOutAfterInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var warnAfterInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
}
object IdleSessionSignOut {
  
  inline def apply(): IdleSessionSignOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdleSessionSignOut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdleSessionSignOut] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setSignOutAfterInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "signOutAfterInSeconds", value.asInstanceOf[js.Any])
    
    inline def setSignOutAfterInSecondsNull: Self = StObject.set(x, "signOutAfterInSeconds", null)
    
    inline def setSignOutAfterInSecondsUndefined: Self = StObject.set(x, "signOutAfterInSeconds", js.undefined)
    
    inline def setWarnAfterInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "warnAfterInSeconds", value.asInstanceOf[js.Any])
    
    inline def setWarnAfterInSecondsNull: Self = StObject.set(x, "warnAfterInSeconds", null)
    
    inline def setWarnAfterInSecondsUndefined: Self = StObject.set(x, "warnAfterInSeconds", js.undefined)
  }
}
