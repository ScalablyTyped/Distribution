package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOptions extends StObject {
  
  /**
    * This is used to change your password and is not visible (for obvious reasons) through the get() API.
    * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
    */
  var password: js.UndefOr[PasswordUpdate] = js.undefined
  
  var tfa: js.UndefOr[TFAStatusUpdate] = js.undefined
}
object UpdateOptions {
  
  inline def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  extension [Self <: UpdateOptions](x: Self) {
    
    inline def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
    
    inline def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
  }
}
