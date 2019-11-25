package typings.perfectDashScrollbar.perfectDashScrollbarMod

import typings.perfectDashScrollbar.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("PerfectScrollbar")
trait PerfectScrollbar_ extends js.Object {
  var reach: Anon_End
  def destroy(): Unit
  def update(): Unit
}

object PerfectScrollbar_ {
  @scala.inline
  def apply(destroy: () => Unit, reach: Anon_End, update: () => Unit): PerfectScrollbar_ = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), reach = reach.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[PerfectScrollbar_]
  }
}

