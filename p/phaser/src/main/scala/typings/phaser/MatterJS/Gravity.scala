package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gravity extends Vector {
  var scale: Double
}

object Gravity {
  @scala.inline
  def apply(scale: Double, x: Double, y: Double): Gravity = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
}

