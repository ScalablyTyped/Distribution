package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: CustomFunctions 1.1]
  * @beta
  */
trait CustomFunctionEventArgs extends js.Object {
  var higherTicks: scala.Double
  var lowerTicks: scala.Double
}

object CustomFunctionEventArgs {
  @scala.inline
  def apply(higherTicks: scala.Double, lowerTicks: scala.Double): CustomFunctionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("higherTicks")(higherTicks)
    __obj.updateDynamic("lowerTicks")(lowerTicks)
    __obj.asInstanceOf[CustomFunctionEventArgs]
  }
}

