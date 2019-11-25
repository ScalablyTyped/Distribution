package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDatabaseOptions extends js.Object {
  var options: js.UndefOr[DatabaseOptions] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object DropDatabaseOptions {
  @scala.inline
  def apply(options: DatabaseOptions = null, password: String = null, username: String = null): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDatabaseOptions]
  }
}

