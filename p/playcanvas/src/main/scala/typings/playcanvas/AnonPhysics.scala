package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhysics extends js.Object {
  var physics: AnonGravity
  var render: AnonExposure
}

object AnonPhysics {
  @scala.inline
  def apply(physics: AnonGravity, render: AnonExposure): AnonPhysics = {
    val __obj = js.Dynamic.literal(physics = physics.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPhysics]
  }
}

