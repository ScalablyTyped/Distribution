package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromItem
  extends /* propName */ StringDictionary[js.Any] {
  var fromItem: Element
  var fromKey: js.Any
  var toItem: Element
  var toKey: js.Any
}

object AnonFromItem {
  @scala.inline
  def apply(
    fromItem: Element,
    fromKey: js.Any,
    toItem: Element,
    toKey: js.Any,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonFromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFromItem]
  }
}

