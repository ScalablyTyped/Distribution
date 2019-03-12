package typings
package perfectDashScrollbarLib.perfectDashScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfectScrollbar extends js.Object {
  var reach: perfectDashScrollbarLib.Anon_End
  def destroy(): scala.Unit
  def update(): scala.Unit
}

object PerfectScrollbar {
  @scala.inline
  def apply(destroy: () => scala.Unit, reach: perfectDashScrollbarLib.Anon_End, update: () => scala.Unit): PerfectScrollbar = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), reach = reach, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[PerfectScrollbar]
  }
}

