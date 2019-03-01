package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default[P] extends js.Object {
  var default: reactLib.reactMod.ReactNs.ComponentType[P]
}

object Anon_Default {
  @scala.inline
  def apply[P](default: reactLib.reactMod.ReactNs.ComponentType[P]): Anon_Default[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default[P]]
  }
}

