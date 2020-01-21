package typings.officeUiFabricReact.inputMaskMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaskValue extends js.Object {
  /**
    * This index refers to the index in the displayMask rather than the inputMask.
    * This means that any escaped characters do not count toward this index.
    */
  var displayIndex: Double
  var format: RegExp
  var value: js.UndefOr[String] = js.undefined
}

object IMaskValue {
  @scala.inline
  def apply(displayIndex: Double, format: RegExp, value: String = null): IMaskValue = {
    val __obj = js.Dynamic.literal(displayIndex = displayIndex.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskValue]
  }
}

