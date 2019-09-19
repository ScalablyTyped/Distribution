package typings.orientjs.orientjsMod

import typings.orientjs.orientjsStrings.document
import typings.orientjs.orientjsStrings.graph
import typings.orientjs.orientjsStrings.memory
import typings.orientjs.orientjsStrings.plocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseOptions extends js.Object {
  var name: String
  var password: String
  var storage: js.UndefOr[plocal | memory] = js.undefined
  var `type`: js.UndefOr[graph | document] = js.undefined
  var username: String
}

object DatabaseOptions {
  @scala.inline
  def apply(
    name: String,
    password: String,
    username: String,
    storage: plocal | memory = null,
    `type`: graph | document = null
  ): DatabaseOptions = {
    val __obj = js.Dynamic.literal(name = name, password = password, username = username)
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
}

