package typings
package momentDashStrftime2Lib.momentDashStrftime2Mod.momentDashTimezoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def strftime(pattern: java.lang.String): java.lang.String
}

object Moment {
  @scala.inline
  def apply(strftime: js.Function1[java.lang.String, java.lang.String]): Moment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strftime")(strftime)
    __obj.asInstanceOf[Moment]
  }
}

