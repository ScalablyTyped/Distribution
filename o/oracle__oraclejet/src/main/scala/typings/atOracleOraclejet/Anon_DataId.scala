package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId
  extends /* propName */ StringDictionary[js.Any] {
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
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_DataId = {
    val __obj = js.Dynamic.literal(data = data, id = id, itemData = itemData)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_DataId]
  }
}

