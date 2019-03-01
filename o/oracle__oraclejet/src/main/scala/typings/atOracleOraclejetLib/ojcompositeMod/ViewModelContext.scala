package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelContext extends js.Object {
  var element: stdLib.Element
  var properties: js.Object
  var slotCounts: js.Object
  var unique: java.lang.String
  var uniqueId: java.lang.String
}

object ViewModelContext {
  @scala.inline
  def apply(
    element: stdLib.Element,
    properties: js.Object,
    slotCounts: js.Object,
    unique: java.lang.String,
    uniqueId: java.lang.String
  ): ViewModelContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("slotCounts")(slotCounts)
    __obj.updateDynamic("unique")(unique)
    __obj.updateDynamic("uniqueId")(uniqueId)
    __obj.asInstanceOf[ViewModelContext]
  }
}

