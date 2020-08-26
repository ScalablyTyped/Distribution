package typings.ol.interactionExtentMod

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var boxStyle: js.UndefOr[StyleLike] = js.native
  var extent: js.UndefOr[typings.ol.extentMod.Extent] = js.native
  var pixelTolerance: js.UndefOr[Double] = js.native
  var pointerStyle: js.UndefOr[StyleLike] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBoxStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style] | Unit): Self = this.set("boxStyle", js.Any.fromFunction2(value))
    @scala.inline
    def setBoxStyleVarargs(value: Style*): Self = this.set("boxStyle", js.Array(value :_*))
    @scala.inline
    def setBoxStyle(value: StyleLike): Self = this.set("boxStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxStyle: Self = this.set("boxStyle", js.undefined)
    @scala.inline
    def setExtent(value: typings.ol.extentMod.Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setPixelTolerance(value: Double): Self = this.set("pixelTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelTolerance: Self = this.set("pixelTolerance", js.undefined)
    @scala.inline
    def setPointerStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style] | Unit): Self = this.set("pointerStyle", js.Any.fromFunction2(value))
    @scala.inline
    def setPointerStyleVarargs(value: Style*): Self = this.set("pointerStyle", js.Array(value :_*))
    @scala.inline
    def setPointerStyle(value: StyleLike): Self = this.set("pointerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerStyle: Self = this.set("pointerStyle", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

