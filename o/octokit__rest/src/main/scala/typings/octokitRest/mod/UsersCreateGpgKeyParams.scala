package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyParams extends js.Object {
  /**
    * Your GPG key, generated in ASCII-armored format. See "[Generating a new GPG key](https://help.github.com/articles/generating-a-new-gpg-key/)" for help creating a GPG key.
    */
  var armored_public_key: js.UndefOr[String] = js.undefined
}

object UsersCreateGpgKeyParams {
  @scala.inline
  def apply(armored_public_key: String = null): UsersCreateGpgKeyParams = {
    val __obj = js.Dynamic.literal()
    if (armored_public_key != null) __obj.updateDynamic("armored_public_key")(armored_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCreateGpgKeyParams]
  }
}

