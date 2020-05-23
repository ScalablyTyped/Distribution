package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromItem
  extends /* key */ StringDictionary[js.Any] {
  var fromItem: typings.std.Element
  var fromKey: js.Any
  var toItem: typings.std.Element
  var toKey: js.Any
}

object FromItem {
  @scala.inline
  def apply(
    fromItem: typings.std.Element,
    fromKey: js.Any,
    toItem: typings.std.Element,
    toKey: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FromItem]
  }
}

