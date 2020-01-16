package typings.phaser.typesMatterMod

import typings.phaser.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: Anon_XY
  var min: Anon_XY
}

object IBound {
  @scala.inline
  def apply(max: Anon_XY, min: Anon_XY): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBound]
  }
}

