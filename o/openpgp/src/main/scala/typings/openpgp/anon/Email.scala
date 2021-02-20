package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends StObject {
  
  var email: String = js.native
  
  var rawBytes: js.UndefOr[Boolean] = js.native
}
object Email {
  
  @scala.inline
  def apply(email: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawBytes(value: Boolean): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
  }
}
