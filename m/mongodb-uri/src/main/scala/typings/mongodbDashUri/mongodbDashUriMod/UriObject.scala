package typings.mongodbDashUri.mongodbDashUriMod

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
    val __obj = js.Dynamic.literal(hosts = hosts, scheme = scheme)
    if (database != null) __obj.updateDynamic("database")(database)
    if (options != null) __obj.updateDynamic("options")(options)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UriObject]
  }
}

