package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbConfig extends js.Object {
  var name: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var storage: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object DbConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    password: java.lang.String = null,
    storage: java.lang.String = null,
    `type`: java.lang.String = null,
    username: java.lang.String = null
  ): DbConfig = {
    val __obj = js.Dynamic.literal(name = name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[DbConfig]
  }
}

