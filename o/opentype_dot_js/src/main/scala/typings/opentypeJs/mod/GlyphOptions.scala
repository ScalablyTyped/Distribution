package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlyphOptions extends js.Object {
  var advanceWidth: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
  var index: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[Path] = js.native
  var unicode: js.UndefOr[Double] = js.native
  var unicodes: js.UndefOr[js.Array[Double]] = js.native
  var xMax: js.UndefOr[Double] = js.native
  var xMin: js.UndefOr[Double] = js.native
  var yMax: js.UndefOr[Double] = js.native
  var yMin: js.UndefOr[Double] = js.native
}

object GlyphOptions {
  @scala.inline
  def apply(): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlyphOptions]
  }
  @scala.inline
  implicit class GlyphOptionsOps[Self <: GlyphOptions] (val x: Self) extends AnyVal {
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
    def setAdvanceWidth(value: Double): Self = this.set("advanceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanceWidth: Self = this.set("advanceWidth", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUnicode(value: Double): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    @scala.inline
    def setUnicodesVarargs(value: Double*): Self = this.set("unicodes", js.Array(value :_*))
    @scala.inline
    def setUnicodes(value: js.Array[Double]): Self = this.set("unicodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodes: Self = this.set("unicodes", js.undefined)
    @scala.inline
    def setXMax(value: Double): Self = this.set("xMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMax: Self = this.set("xMax", js.undefined)
    @scala.inline
    def setXMin(value: Double): Self = this.set("xMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMin: Self = this.set("xMin", js.undefined)
    @scala.inline
    def setYMax(value: Double): Self = this.set("yMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMax: Self = this.set("yMax", js.undefined)
    @scala.inline
    def setYMin(value: Double): Self = this.set("yMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMin: Self = this.set("yMin", js.undefined)
  }
  
}

