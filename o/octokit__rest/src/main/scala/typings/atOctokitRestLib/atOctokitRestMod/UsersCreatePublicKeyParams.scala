package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKeyParams extends js.Object {
  /**
    * The public SSH key to add to your GitHub account. See "[Generating a new SSH key](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)" for guidance on how to create a public SSH key.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A descriptive name for the new key. Use a name that will help you recognize this key in your GitHub account. For example, if you're using a personal Mac, you might call this key "Personal MacBook Air".
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UsersCreatePublicKeyParams {
  @scala.inline
  def apply(key: java.lang.String = null, title: java.lang.String = null): UsersCreatePublicKeyParams = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UsersCreatePublicKeyParams]
  }
}

