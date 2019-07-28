package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemKeyPreviousItem[K]
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var key: K
  var previousItem: Element
  var previousKey: K
}

object Anon_ItemKeyPreviousItem {
  @scala.inline
  def apply[K](
    item: Element,
    key: K,
    previousItem: Element,
    previousKey: K,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ItemKeyPreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item, key = key.asInstanceOf[js.Any], previousItem = previousItem, previousKey = previousKey.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemKeyPreviousItem[K]]
  }
}

