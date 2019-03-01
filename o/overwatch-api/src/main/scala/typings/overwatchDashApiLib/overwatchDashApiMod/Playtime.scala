package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playtime extends js.Object {
  var competitive: java.lang.String
  var quickplay: java.lang.String
}

object Playtime {
  @scala.inline
  def apply(competitive: java.lang.String, quickplay: java.lang.String): Playtime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("competitive")(competitive)
    __obj.updateDynamic("quickplay")(quickplay)
    __obj.asInstanceOf[Playtime]
  }
}

