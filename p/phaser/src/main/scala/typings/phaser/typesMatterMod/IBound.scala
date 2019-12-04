package typings.phaser.typesMatterMod

import typings.phaser.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: Anon_X
  var min: Anon_X
}

object IBound {
  @scala.inline
  def apply(max: Anon_X, min: Anon_X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBound]
  }
}

