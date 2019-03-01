package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemKey[K]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var item: stdLib.Element
  var key: K
}

object Anon_ItemKey {
  @scala.inline
  def apply[K](
    item: stdLib.Element,
    key: K,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ItemKey[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemKey[K]]
  }
}

