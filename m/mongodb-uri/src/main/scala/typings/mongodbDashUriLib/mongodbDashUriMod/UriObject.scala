package typings
package mongodbDashUriLib.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriObject extends js.Object {
  var database: js.UndefOr[java.lang.String] = js.undefined
  var hosts: js.Array[Host]
  var options: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var scheme: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object UriObject {
  @scala.inline
  def apply(
    hosts: js.Array[Host],
    scheme: java.lang.String,
    database: java.lang.String = null,
    options: js.Any = null,
    password: java.lang.String = null,
    username: java.lang.String = null
  ): UriObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hosts")(hosts)
    __obj.updateDynamic("scheme")(scheme)
    if (database != null) __obj.updateDynamic("database")(database)
    if (options != null) __obj.updateDynamic("options")(options)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UriObject]
  }
}

