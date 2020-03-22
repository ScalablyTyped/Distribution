package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousKey
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var key: js.Any
  var previousItem: Element
  var previousKey: js.Any
}

object AnonPreviousKey {
  @scala.inline
  def apply(
    item: Element,
    key: js.Any,
    previousItem: Element,
    previousKey: js.Any,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonPreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPreviousKey]
  }
}

