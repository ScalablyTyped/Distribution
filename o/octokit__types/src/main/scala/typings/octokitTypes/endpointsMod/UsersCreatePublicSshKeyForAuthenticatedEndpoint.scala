package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCreatePublicSshKeyForAuthenticatedEndpoint extends js.Object {
  /**
    * The public SSH key to add to your GitHub account. See "[Generating a new SSH key](https://docs.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)" for guidance on how to create a public SSH key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A descriptive name for the new key. Use a name that will help you recognize this key in your GitHub account. For example, if you're using a personal Mac, you might call this key "Personal MacBook Air".
    */
  var title: js.UndefOr[String] = js.native
}

object UsersCreatePublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(): UsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class UsersCreatePublicSshKeyForAuthenticatedEndpointOps[Self <: UsersCreatePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

