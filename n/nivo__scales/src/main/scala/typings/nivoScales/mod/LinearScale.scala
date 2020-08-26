package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearScale extends Scale {
  var max: js.UndefOr[auto | Double] = js.native
  var min: js.UndefOr[auto | Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var stacked: js.UndefOr[Boolean] = js.native
  var `type`: linear = js.native
}

object LinearScale {
  @scala.inline
  def apply(`type`: linear): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScale]
  }
  @scala.inline
  implicit class LinearScaleOps[Self <: LinearScale] (val x: Self) extends AnyVal {
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
    def setType(value: linear): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: auto | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: auto | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
  }
  
}

