package typings.openfin.systemWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowDetail extends js.Object {
  var bottom: Double = js.native
  var height: Double = js.native
  var isShowing: Boolean = js.native
  var left: Double = js.native
  var name: String = js.native
  var right: Double = js.native
  var state: String = js.native
  var top: Double = js.native
  var width: Double = js.native
}

object WindowDetail {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    isShowing: Boolean,
    left: Double,
    name: String,
    right: Double,
    state: String,
    top: Double,
    width: Double
  ): WindowDetail = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isShowing = isShowing.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowDetail]
  }
  @scala.inline
  implicit class WindowDetailOps[Self <: WindowDetail] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsShowing(value: Boolean): Self = this.set("isShowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

