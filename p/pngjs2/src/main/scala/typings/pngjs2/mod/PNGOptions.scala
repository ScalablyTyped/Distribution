package typings.pngjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGOptions extends js.Object {
  var checkCRC: js.UndefOr[Boolean] = js.native
  var colorType: js.UndefOr[Double] = js.native
  var deflateChunkSize: js.UndefOr[Double] = js.native
  var deflateFactory: js.UndefOr[js.Any] = js.native
  var deflateLevel: js.UndefOr[Double] = js.native
  var deflateStrategy: js.UndefOr[Double] = js.native
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
  var height: js.UndefOr[Double] = js.native
  var inputHasAlpha: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PNGOptions {
  @scala.inline
  def apply(): PNGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNGOptions]
  }
  @scala.inline
  implicit class PNGOptionsOps[Self <: PNGOptions] (val x: Self) extends AnyVal {
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
    def setCheckCRC(value: Boolean): Self = this.set("checkCRC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckCRC: Self = this.set("checkCRC", js.undefined)
    @scala.inline
    def setColorType(value: Double): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    @scala.inline
    def setDeflateChunkSize(value: Double): Self = this.set("deflateChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflateChunkSize: Self = this.set("deflateChunkSize", js.undefined)
    @scala.inline
    def setDeflateFactory(value: js.Any): Self = this.set("deflateFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflateFactory: Self = this.set("deflateFactory", js.undefined)
    @scala.inline
    def setDeflateLevel(value: Double): Self = this.set("deflateLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflateLevel: Self = this.set("deflateLevel", js.undefined)
    @scala.inline
    def setDeflateStrategy(value: Double): Self = this.set("deflateStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflateStrategy: Self = this.set("deflateStrategy", js.undefined)
    @scala.inline
    def setFilterTypeVarargs(value: Double*): Self = this.set("filterType", js.Array(value :_*))
    @scala.inline
    def setFilterType(value: Double | js.Array[Double]): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInputHasAlpha(value: Boolean): Self = this.set("inputHasAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputHasAlpha: Self = this.set("inputHasAlpha", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

