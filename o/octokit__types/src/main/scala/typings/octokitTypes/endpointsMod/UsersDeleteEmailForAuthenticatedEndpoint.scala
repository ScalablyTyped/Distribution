package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersDeleteEmailForAuthenticatedEndpoint extends js.Object {
  /**
    * Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
    */
  var emails: js.Array[String] = js.native
}

object UsersDeleteEmailForAuthenticatedEndpoint {
  @scala.inline
  def apply(emails: js.Array[String]): UsersDeleteEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteEmailForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class UsersDeleteEmailForAuthenticatedEndpointOps[Self <: UsersDeleteEmailForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
  }
  
}

