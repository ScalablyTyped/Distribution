package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loop extends js.Object {
  var loop: Boolean
  var pitch: Double
  var volume: Double
}

object Anon_Loop {
  @scala.inline
  def apply(loop: Boolean, pitch: Double, volume: Double): Anon_Loop = {
    val __obj = js.Dynamic.literal(loop = loop, pitch = pitch, volume = volume)
  
    __obj.asInstanceOf[Anon_Loop]
  }
}

