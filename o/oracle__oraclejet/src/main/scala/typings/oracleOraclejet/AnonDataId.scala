package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataId
  extends /* propName */ StringDictionary[js.Any] {
  var data: js.Object
  var id: js.Any
  var itemData: js.Object
}

object AnonDataId {
  @scala.inline
  def apply(
    data: js.Object,
    id: js.Any,
    itemData: js.Object,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDataId]
  }
}

