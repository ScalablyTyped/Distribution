package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeapUsageReturnType extends js.Object {
  /**
    * Allocated heap size in bytes.
    */
  var totalSize: scala.Double
  /**
    * Used heap size in bytes.
    */
  var usedSize: scala.Double
}

object GetHeapUsageReturnType {
  @scala.inline
  def apply(totalSize: scala.Double, usedSize: scala.Double): GetHeapUsageReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("totalSize")(totalSize)
    __obj.updateDynamic("usedSize")(usedSize)
    __obj.asInstanceOf[GetHeapUsageReturnType]
  }
}

