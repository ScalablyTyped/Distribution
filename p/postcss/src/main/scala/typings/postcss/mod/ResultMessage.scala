package typings.postcss.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultMessage
  extends /* others */ StringDictionary[js.Any] {
  var plugin: String
  var `type`: String
}

object ResultMessage {
  @scala.inline
  def apply(plugin: String, `type`: String, StringDictionary: /* others */ StringDictionary[js.Any] = null): ResultMessage = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResultMessage]
  }
}

