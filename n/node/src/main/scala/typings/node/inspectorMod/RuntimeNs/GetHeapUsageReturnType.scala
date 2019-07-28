package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeapUsageReturnType extends js.Object {
  /**
    * Allocated heap size in bytes.
    */
  var totalSize: Double
  /**
    * Used heap size in bytes.
    */
  var usedSize: Double
}

object GetHeapUsageReturnType {
  @scala.inline
  def apply(totalSize: Double, usedSize: Double): GetHeapUsageReturnType = {
    val __obj = js.Dynamic.literal(totalSize = totalSize, usedSize = usedSize)
  
    __obj.asInstanceOf[GetHeapUsageReturnType]
  }
}

