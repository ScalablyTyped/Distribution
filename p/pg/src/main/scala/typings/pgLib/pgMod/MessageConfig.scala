package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageConfig extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object MessageConfig {
  @scala.inline
  def apply(`type`: java.lang.String, name: java.lang.String = null): MessageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MessageConfig]
  }
}

