package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loop extends js.Object {
  var loop: scala.Boolean
  var pitch: scala.Double
  var volume: scala.Double
}

object Anon_Loop {
  @scala.inline
  def apply(loop: scala.Boolean, pitch: scala.Double, volume: scala.Double): Anon_Loop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("volume")(volume)
    __obj.asInstanceOf[Anon_Loop]
  }
}

