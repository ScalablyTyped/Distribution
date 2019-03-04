package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemKeyPreviousItem[K]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var item: stdLib.Element
  var key: K
  var previousItem: stdLib.Element
  var previousKey: K
}

object Anon_ItemKeyPreviousItem {
  @scala.inline
  def apply[K](
    item: stdLib.Element,
    key: K,
    previousItem: stdLib.Element,
    previousKey: K,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ItemKeyPreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item, key = key.asInstanceOf[js.Any], previousItem = previousItem, previousKey = previousKey.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemKeyPreviousItem[K]]
  }
}

