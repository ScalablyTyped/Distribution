package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  /**
    * The width of the borders between the layout items in pixel. Please note: The actual draggable area is wider
    * than the visible one, making it safe to set this to small values without affecting usability.
    * Default: 5
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * The height of the element that appears when an item is dragged (in pixel).
    * Default: 200
    */
  var dragProxyHeight: js.UndefOr[Double] = js.native
  /**
    * The width of the element that appears when an item is dragged (in pixel).
    * Default: 300
    */
  var dragProxyWidth: js.UndefOr[Double] = js.native
  /**
    * The height of the header elements in pixel. This can be changed, but your theme's header css needs to be
    * adjusted accordingly.
    * Default: 20
    */
  var headerHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum height an item can be resized to (in pixel).
    * Default: 10
    */
  var minItemHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum width an item can be resized to (in pixel).
    * Default: 10
    */
  var minItemWidth: js.UndefOr[Double] = js.native
}

object Dimensions {
  @scala.inline
  def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  @scala.inline
  implicit class DimensionsOps[Self <: Dimensions] (val x: Self) extends AnyVal {
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setDragProxyHeight(value: Double): Self = this.set("dragProxyHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragProxyHeight: Self = this.set("dragProxyHeight", js.undefined)
    @scala.inline
    def setDragProxyWidth(value: Double): Self = this.set("dragProxyWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragProxyWidth: Self = this.set("dragProxyWidth", js.undefined)
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    @scala.inline
    def setMinItemHeight(value: Double): Self = this.set("minItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItemHeight: Self = this.set("minItemHeight", js.undefined)
    @scala.inline
    def setMinItemWidth(value: Double): Self = this.set("minItemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItemWidth: Self = this.set("minItemWidth", js.undefined)
  }
  
}

