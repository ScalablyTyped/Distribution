package typings.nodePgMigrate.operatorsTypesMod

import typings.nodePgMigrate.generalTypesMod.CascadeOption
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropOperatorOptions
  extends IfExistsOption
     with CascadeOption {
  var left: js.UndefOr[Name] = js.native
  var right: js.UndefOr[Name] = js.native
}

object DropOperatorOptions {
  @scala.inline
  def apply(): DropOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOperatorOptions]
  }
  @scala.inline
  implicit class DropOperatorOptionsOps[Self <: DropOperatorOptions] (val x: Self) extends AnyVal {
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
    def setLeft(value: Name): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Name): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

