package typings.phaser.MatterJS

import typings.phaser.AnonXY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: AnonXY
  var min: AnonXY
}

object IBound {
  @scala.inline
  def apply(max: AnonXY, min: AnonXY): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBound]
  }
}

