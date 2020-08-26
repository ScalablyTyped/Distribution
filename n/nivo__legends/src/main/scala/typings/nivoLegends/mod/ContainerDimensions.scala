package typings.nivoLegends.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDimensions extends js.Object {
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
}

object ContainerDimensions {
  @scala.inline
  def apply(containerHeight: Double, containerWidth: Double): ContainerDimensions = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDimensions]
  }
  @scala.inline
  implicit class ContainerDimensionsOps[Self <: ContainerDimensions] (val x: Self) extends AnyVal {
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
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
  }
  
}

