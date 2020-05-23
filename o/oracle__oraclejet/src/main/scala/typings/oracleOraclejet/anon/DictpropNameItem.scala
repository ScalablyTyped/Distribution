package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameItem[K]
  extends /* key */ StringDictionary[js.Any] {
  var item: typings.std.Element
  var key: K
}

object DictpropNameItem {
  @scala.inline
  def apply[K](item: typings.std.Element, key: K, StringDictionary: /* name */ StringDictionary[js.Any] = null): DictpropNameItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameItem[K]]
  }
}

