package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDatabaseOptions extends js.Object {
  var options: js.UndefOr[DatabaseOptions] = js.undefined
  var password: String
  var username: String
}

object DropDatabaseOptions {
  @scala.inline
  def apply(password: String, username: String, options: DatabaseOptions = null): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DropDatabaseOptions]
  }
}

