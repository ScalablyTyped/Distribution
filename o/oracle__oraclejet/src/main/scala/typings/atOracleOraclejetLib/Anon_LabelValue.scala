package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelValue extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.Any
}

object Anon_LabelValue {
  @scala.inline
  def apply(value: js.Any, label: java.lang.String = null): Anon_LabelValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_LabelValue]
  }
}

