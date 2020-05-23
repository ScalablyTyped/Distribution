package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Physics extends js.Object {
  var physics: Gravity
  var render: Exposure
}

object Physics {
  @scala.inline
  def apply(physics: Gravity, render: Exposure): Physics = {
    val __obj = js.Dynamic.literal(physics = physics.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Physics]
  }
}

