package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Int64 extends js.Object {
  var `64bit_high`: scala.Double
  var `64bit_low`: scala.Double
}

object Int64 {
  @scala.inline
  def apply(`64bit_high`: scala.Double, `64bit_low`: scala.Double): Int64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("64bit_high")(`64bit_high`)
    __obj.updateDynamic("64bit_low")(`64bit_low`)
    __obj.asInstanceOf[Int64]
  }
}

