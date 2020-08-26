package typings.openfin.windowWindowMod

import typings.openfin.openfinStrings.custom
import typings.openfin.openfinStrings.none
import typings.openfin.openfinStrings.printableArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margins extends js.Object {
  var bottom: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var marginType: js.UndefOr[typings.openfin.openfinStrings.default | none | printableArea | custom] = js.native
  var right: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Double] = js.native
}

object Margins {
  @scala.inline
  def apply(): Margins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margins]
  }
  @scala.inline
  implicit class MarginsOps[Self <: Margins] (val x: Self) extends AnyVal {
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
    def setMarginType(value: typings.openfin.openfinStrings.default | none | printableArea | custom): Self = this.set("marginType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginType: Self = this.set("marginType", js.undefined)
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

