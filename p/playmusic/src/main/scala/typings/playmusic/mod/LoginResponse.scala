package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginResponse extends StObject {
  
  var androidId: String
  
  var masterToken: String
}
object LoginResponse {
  
  @scala.inline
  def apply(androidId: String, masterToken: String): LoginResponse = {
    val __obj = js.Dynamic.literal(androidId = androidId.asInstanceOf[js.Any], masterToken = masterToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  
  @scala.inline
  implicit class LoginResponseMutableBuilder[Self <: LoginResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterToken(value: String): Self = StObject.set(x, "masterToken", value.asInstanceOf[js.Any])
  }
}
