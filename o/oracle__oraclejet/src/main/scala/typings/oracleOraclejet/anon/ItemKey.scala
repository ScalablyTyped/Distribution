package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemKey
  extends /* key */ StringDictionary[js.Any] {
  var item: typings.std.Element
  var key: js.Any
}

object ItemKey {
  @scala.inline
  def apply(
    item: typings.std.Element,
    key: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ItemKey]
  }
}

