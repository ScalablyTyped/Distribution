package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompactCardHeight extends js.Object {
  var compactCardHeight: Double = js.native
  var directionalHintFixed: Boolean = js.native
  var expandedCardHeight: Double = js.native
}

object CompactCardHeight {
  @scala.inline
  def apply(compactCardHeight: Double, directionalHintFixed: Boolean, expandedCardHeight: Double): CompactCardHeight = {
    val __obj = js.Dynamic.literal(compactCardHeight = compactCardHeight.asInstanceOf[js.Any], directionalHintFixed = directionalHintFixed.asInstanceOf[js.Any], expandedCardHeight = expandedCardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactCardHeight]
  }
  @scala.inline
  implicit class CompactCardHeightOps[Self <: CompactCardHeight] (val x: Self) extends AnyVal {
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
    def setCompactCardHeight(value: Double): Self = this.set("compactCardHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedCardHeight(value: Double): Self = this.set("expandedCardHeight", value.asInstanceOf[js.Any])
  }
  
}

