package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PFXParsedValue extends StObject {
  
  var authenticatedSafe: js.UndefOr[AuthenticatedSafe] = js.undefined
  
  var integrityMode: js.UndefOr[Double] = js.undefined
}
object PFXParsedValue {
  
  inline def apply(): PFXParsedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PFXParsedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PFXParsedValue] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatedSafe(value: AuthenticatedSafe): Self = StObject.set(x, "authenticatedSafe", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatedSafeUndefined: Self = StObject.set(x, "authenticatedSafe", js.undefined)
    
    inline def setIntegrityMode(value: Double): Self = StObject.set(x, "integrityMode", value.asInstanceOf[js.Any])
    
    inline def setIntegrityModeUndefined: Self = StObject.set(x, "integrityMode", js.undefined)
  }
}
