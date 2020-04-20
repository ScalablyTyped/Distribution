package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeakInformation extends js.Object {
  /**
    * Amount of heap growth in bytes.
    */
  var growth: Double
  /**
    * Human-readable description.
    */
  var reason: String
}

object LeakInformation {
  @scala.inline
  def apply(growth: Double, reason: String): LeakInformation = {
    val __obj = js.Dynamic.literal(growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeakInformation]
  }
}

