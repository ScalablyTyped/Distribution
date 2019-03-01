package typings
package nodeDashWavesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[Anon_X] = js.undefined
  @JSName("wait")
  var wait_FAnon_Position: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(position: Anon_X = null, wait: scala.Int | scala.Double = null): Anon_Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Position]
  }
}

