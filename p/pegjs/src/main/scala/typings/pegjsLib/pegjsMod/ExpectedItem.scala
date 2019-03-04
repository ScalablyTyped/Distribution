package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectedItem extends js.Object {
  var description: java.lang.String
  var `type`: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ExpectedItem {
  @scala.inline
  def apply(description: java.lang.String, `type`: java.lang.String, value: java.lang.String = null): ExpectedItem = {
    val __obj = js.Dynamic.literal(description = description)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExpectedItem]
  }
}

