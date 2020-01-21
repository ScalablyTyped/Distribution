package typings.mongodbUri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriObject extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var hosts: js.Array[Host]
  var options: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var scheme: String
  var username: js.UndefOr[String] = js.undefined
}

object UriObject {
  @scala.inline
  def apply(
    hosts: js.Array[Host],
    scheme: String,
    database: String = null,
    options: js.Any = null,
    password: String = null,
    username: String = null
  ): UriObject = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriObject]
  }
}

