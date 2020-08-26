package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSizingHeight extends js.Object {
  var boxSizing: String = js.native
  var height: Double = js.native
  var overflow: String = js.native
}

object BoxSizingHeight {
  @scala.inline
  def apply(boxSizing: String, height: Double, overflow: String): BoxSizingHeight = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizingHeight]
  }
  @scala.inline
  implicit class BoxSizingHeightOps[Self <: BoxSizingHeight] (val x: Self) extends AnyVal {
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
    def setBoxSizing(value: String): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
  }
  
}

