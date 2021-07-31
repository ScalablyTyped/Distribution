package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpVerifyOptionsInterface extends StObject {
  
  var secret: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object TotpVerifyOptionsInterface {
  
  @scala.inline
  def apply(): TotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpVerifyOptionsInterface]
  }
  
  @scala.inline
  implicit class TotpVerifyOptionsInterfaceMutableBuilder[Self <: TotpVerifyOptionsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
