package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemKey[K]
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var key: K
}

object Anon_ItemKey {
  @scala.inline
  def apply[K](item: Element, key: K, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_ItemKey[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemKey[K]]
  }
}

