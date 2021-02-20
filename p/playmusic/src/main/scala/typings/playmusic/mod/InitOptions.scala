package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends StObject {
  
  var androidId: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var masterToken: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setMasterToken(value: String): Self = StObject.set(x, "masterToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTokenUndefined: Self = StObject.set(x, "masterToken", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
