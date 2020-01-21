package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelEditPropName
  extends /* propName */ StringDictionary[js.Any] {
  var cancelEdit: js.Object
  var rowContext: js.Object
}

object AnonCancelEditPropName {
  @scala.inline
  def apply(
    cancelEdit: js.Object,
    rowContext: js.Object,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonCancelEditPropName = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCancelEditPropName]
  }
}

