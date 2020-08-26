package typings.officeUiFabricReact.stackHorizontalWrapAdvancedExampleMod

import typings.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExampleOptions extends js.Object {
  var containerHeight: Double = js.native
  var horizontalAlignment: js.UndefOr[Alignment] = js.native
  var overflow: Overflow = js.native
  var stackWidth: Double = js.native
  var verticalAlignment: js.UndefOr[Alignment] = js.native
}

object IExampleOptions {
  @scala.inline
  def apply(containerHeight: Double, overflow: Overflow, stackWidth: Double): IExampleOptions = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], stackWidth = stackWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
  @scala.inline
  implicit class IExampleOptionsOps[Self <: IExampleOptions] (val x: Self) extends AnyVal {
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
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: Overflow): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackWidth(value: Double): Self = this.set("stackWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalAlignment(value: Alignment): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Alignment): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

