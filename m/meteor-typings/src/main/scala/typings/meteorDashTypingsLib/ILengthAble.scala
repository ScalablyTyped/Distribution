package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILengthAble extends js.Object {
  var length: scala.Double
}

object ILengthAble {
  @scala.inline
  def apply(length: scala.Double): ILengthAble = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[ILengthAble]
  }
}

