package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousKey
  extends /* key */ StringDictionary[js.Any] {
  var item: typings.std.Element
  var key: js.Any
  var previousItem: typings.std.Element
  var previousKey: js.Any
}

object PreviousKey {
  @scala.inline
  def apply(
    item: typings.std.Element,
    key: js.Any,
    previousItem: typings.std.Element,
    previousKey: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PreviousKey]
  }
}

