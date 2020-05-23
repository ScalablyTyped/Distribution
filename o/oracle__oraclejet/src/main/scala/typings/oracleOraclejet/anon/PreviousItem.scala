package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousItem[K]
  extends /* key */ StringDictionary[js.Any] {
  var item: typings.std.Element
  var key: K
  var previousItem: typings.std.Element
  var previousKey: K
}

object PreviousItem {
  @scala.inline
  def apply[K](
    item: typings.std.Element,
    key: K,
    previousItem: typings.std.Element,
    previousKey: K,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): PreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PreviousItem[K]]
  }
}

