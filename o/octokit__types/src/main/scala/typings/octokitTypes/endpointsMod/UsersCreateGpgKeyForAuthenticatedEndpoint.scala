package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCreateGpgKeyForAuthenticatedEndpoint extends js.Object {
  /**
    * Your GPG key, generated in ASCII-armored format. See "[Generating a new GPG key](https://docs.github.com/articles/generating-a-new-gpg-key/)" for help creating a GPG key.
    */
  var armored_public_key: js.UndefOr[String] = js.native
}

object UsersCreateGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(): UsersCreateGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersCreateGpgKeyForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class UsersCreateGpgKeyForAuthenticatedEndpointOps[Self <: UsersCreateGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setArmored_public_key(value: String): Self = this.set("armored_public_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArmored_public_key: Self = this.set("armored_public_key", js.undefined)
  }
  
}

