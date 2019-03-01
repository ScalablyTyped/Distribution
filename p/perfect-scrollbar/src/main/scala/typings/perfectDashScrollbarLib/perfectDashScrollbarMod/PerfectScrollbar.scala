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
  def apply(
    destroy: js.Function0[scala.Unit],
    reach: perfectDashScrollbarLib.Anon_End,
    update: js.Function0[scala.Unit]
  ): PerfectScrollbar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("reach")(reach)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PerfectScrollbar]
  }
}

