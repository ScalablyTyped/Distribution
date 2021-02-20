package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends StObject {
  
  /**
    * this will be unique each time
    */
  var token: String = js.native
  
  /**
    * "remote-connection-uuid"
    */
  var uuid: String = js.native
}
object Token {
  
  @scala.inline
  def apply(token: String, uuid: String): Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
