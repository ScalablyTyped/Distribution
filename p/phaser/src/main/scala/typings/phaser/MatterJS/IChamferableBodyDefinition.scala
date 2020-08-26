package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChamferableBodyDefinition extends IBodyDefinition {
  var chamfer: js.UndefOr[IChamfer] = js.native
}

object IChamferableBodyDefinition {
  @scala.inline
  def apply(): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
  @scala.inline
  implicit class IChamferableBodyDefinitionOps[Self <: IChamferableBodyDefinition] (val x: Self) extends AnyVal {
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
    def setChamfer(value: IChamfer): Self = this.set("chamfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChamfer: Self = this.set("chamfer", js.undefined)
  }
  
}

