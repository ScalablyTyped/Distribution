package typings.minecraftDashScriptingDashTypesDashShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Int64 extends js.Object {
  var `64bit_high`: Double
  var `64bit_low`: Double
}

object Int64 {
  @scala.inline
  def apply(`64bit_high`: Double, `64bit_low`: Double): Int64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("64bit_high")(`64bit_high`.asInstanceOf[js.Any])
    __obj.updateDynamic("64bit_low")(`64bit_low`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
}

