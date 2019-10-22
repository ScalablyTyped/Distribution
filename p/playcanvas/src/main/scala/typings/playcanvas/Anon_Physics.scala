package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Physics extends js.Object {
  var physics: Anon_Gravity
  var render: Anon_Exposure
}

object Anon_Physics {
  @scala.inline
  def apply(physics: Anon_Gravity, render: Anon_Exposure): Anon_Physics = {
    val __obj = js.Dynamic.literal(physics = physics, render = render)
  
    __obj.asInstanceOf[Anon_Physics]
  }
}

