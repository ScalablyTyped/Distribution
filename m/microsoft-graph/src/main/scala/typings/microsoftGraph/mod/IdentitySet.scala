package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitySet extends StObject {
  
  // Optional. The application associated with this action.
  var application: js.UndefOr[NullableOption[Identity]] = js.native
  
  // Optional. The device associated with this action.
  var device: js.UndefOr[NullableOption[Identity]] = js.native
  
  // Optional. The user associated with this action.
  var user: js.UndefOr[NullableOption[Identity]] = js.native
}
object IdentitySet {
  
  @scala.inline
  def apply(): IdentitySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySet]
  }
  
  @scala.inline
  implicit class IdentitySetMutableBuilder[Self <: IdentitySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: NullableOption[Identity]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNull: Self = StObject.set(x, "application", null)
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setDevice(value: NullableOption[Identity]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNull: Self = StObject.set(x, "device", null)
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setUser(value: NullableOption[Identity]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
