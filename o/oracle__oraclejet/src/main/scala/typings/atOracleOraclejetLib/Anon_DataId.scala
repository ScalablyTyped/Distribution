package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.Object
  var id: js.Any
  var itemData: js.Object
}

object Anon_DataId {
  @scala.inline
  def apply(
    data: js.Object,
    id: js.Any,
    itemData: js.Object,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_DataId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("itemData")(itemData)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_DataId]
  }
}

