package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultMessage
  extends /* others */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var plugin: java.lang.String
  var `type`: java.lang.String
}

object ResultMessage {
  @scala.inline
  def apply(
    plugin: java.lang.String,
    `type`: java.lang.String,
    StringDictionary: /* others */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ResultMessage = {
    val __obj = js.Dynamic.literal(plugin = plugin)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResultMessage]
  }
}

