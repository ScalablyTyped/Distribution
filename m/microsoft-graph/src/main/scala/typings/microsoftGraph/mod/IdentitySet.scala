package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitySet extends StObject {
  
  // Optional. The application associated with this action.
  var application: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // Optional. The device associated with this action.
  var device: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // Optional. The user associated with this action.
  var user: js.UndefOr[NullableOption[Identity]] = js.undefined
}
object IdentitySet {
  
  inline def apply(): IdentitySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySet]
  }
  
  extension [Self <: IdentitySet](x: Self) {
    
    inline def setApplication(value: NullableOption[Identity]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setDevice(value: NullableOption[Identity]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceNull: Self = StObject.set(x, "device", null)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setUser(value: NullableOption[Identity]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
