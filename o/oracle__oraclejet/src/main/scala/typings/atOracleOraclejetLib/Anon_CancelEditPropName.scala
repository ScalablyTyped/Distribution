package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelEditPropName
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cancelEdit: js.Object
  var rowContext: js.Object
}

object Anon_CancelEditPropName {
  @scala.inline
  def apply(
    cancelEdit: js.Object,
    rowContext: js.Object,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CancelEditPropName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelEdit")(cancelEdit)
    __obj.updateDynamic("rowContext")(rowContext)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CancelEditPropName]
  }
}

