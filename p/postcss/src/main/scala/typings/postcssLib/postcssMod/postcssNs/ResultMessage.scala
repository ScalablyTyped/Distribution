package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultMessage extends js.Object {
  var browsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var plugin: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object ResultMessage {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    browsers: js.Array[java.lang.String] = null,
    plugin: java.lang.String = null,
    text: java.lang.String = null
  ): ResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ResultMessage]
  }
}

