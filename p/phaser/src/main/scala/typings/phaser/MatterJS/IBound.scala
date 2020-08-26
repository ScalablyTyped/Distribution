package typings.phaser.MatterJS

import typings.phaser.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBound extends js.Object {
  var max: X = js.native
  var min: X = js.native
}

object IBound {
  @scala.inline
  def apply(max: X, min: X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBound]
  }
  @scala.inline
  implicit class IBoundOps[Self <: IBound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMax(value: X): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: X): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

