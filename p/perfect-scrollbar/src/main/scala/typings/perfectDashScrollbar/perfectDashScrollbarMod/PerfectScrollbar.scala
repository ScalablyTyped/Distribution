package typings.perfectDashScrollbar.perfectDashScrollbarMod

import typings.perfectDashScrollbar.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfectScrollbar extends js.Object {
  var reach: Anon_End
  def destroy(): Unit
  def update(): Unit
}

object PerfectScrollbar {
  @scala.inline
  def apply(destroy: () => Unit, reach: Anon_End, update: () => Unit): PerfectScrollbar = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), reach = reach, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[PerfectScrollbar]
  }
}

