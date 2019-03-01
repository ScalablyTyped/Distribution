package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions extends js.Object {
  var length: scala.Double
  var offset: scala.Double
}

object StatOptions {
  @scala.inline
  def apply(length: scala.Double, offset: scala.Double): StatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[StatOptions]
  }
}

