package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoopVolume extends js.Object {
  var loop: scala.Boolean
  var volume: scala.Double
}

object Anon_LoopVolume {
  @scala.inline
  def apply(loop: scala.Boolean, volume: scala.Double): Anon_LoopVolume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("volume")(volume)
    __obj.asInstanceOf[Anon_LoopVolume]
  }
}

