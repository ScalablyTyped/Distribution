package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemKeyPropName
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var item: stdLib.Element
  var key: js.Any
}

object Anon_ItemKeyPropName {
  @scala.inline
  def apply(
    item: stdLib.Element,
    key: js.Any,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ItemKeyPropName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("key")(key)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemKeyPropName]
  }
}

