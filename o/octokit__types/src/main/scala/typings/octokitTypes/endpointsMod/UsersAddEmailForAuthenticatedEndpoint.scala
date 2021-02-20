package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersAddEmailForAuthenticatedEndpoint extends StObject {
  
  /**
    * Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
    */
  var emails: js.Array[String] = js.native
}
object UsersAddEmailForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(emails: js.Array[String]): UsersAddEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersAddEmailForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersAddEmailForAuthenticatedEndpointMutableBuilder[Self <: UsersAddEmailForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
