package typings.phaser.MatterJS

import typings.phaser.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: X
  var min: X
}

object IBound {
  @scala.inline
  def apply(max: X, min: X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBound]
  }
}

