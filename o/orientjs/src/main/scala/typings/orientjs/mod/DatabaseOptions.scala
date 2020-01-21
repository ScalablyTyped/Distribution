package typings.orientjs.mod

import typings.orientjs.orientjsStrings.document
import typings.orientjs.orientjsStrings.graph
import typings.orientjs.orientjsStrings.memory
import typings.orientjs.orientjsStrings.plocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseOptions extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[plocal | memory] = js.undefined
  var `type`: js.UndefOr[graph | document] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object DatabaseOptions {
  @scala.inline
  def apply(
    name: String,
    password: String = null,
    storage: plocal | memory = null,
    `type`: graph | document = null,
    username: String = null
  ): DatabaseOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
}

