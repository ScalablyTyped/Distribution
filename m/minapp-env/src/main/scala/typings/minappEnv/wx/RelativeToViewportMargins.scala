package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用来扩展（或收缩）参照节点布局区域的边界 */
@js.native
trait RelativeToViewportMargins extends js.Object {
  /** 节点布局区域的下边界 */
  var bottom: js.UndefOr[Double] = js.native
  /** 节点布局区域的左边界 */
  var left: js.UndefOr[Double] = js.native
  /** 节点布局区域的右边界 */
  var right: js.UndefOr[Double] = js.native
  /** 节点布局区域的上边界 */
  var top: js.UndefOr[Double] = js.native
}

object RelativeToViewportMargins {
  @scala.inline
  def apply(): RelativeToViewportMargins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeToViewportMargins]
  }
  @scala.inline
  implicit class RelativeToViewportMarginsOps[Self <: RelativeToViewportMargins] (val x: Self) extends AnyVal {
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
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

