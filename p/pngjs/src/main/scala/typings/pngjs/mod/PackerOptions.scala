package typings.pngjs.mod

import typings.pngjs.anon.Blue
import typings.pngjs.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackerOptions extends js.Object {
  
  var bgColor: js.UndefOr[Blue] = js.native
  
  var bitDepth: js.UndefOr[BitDepth] = js.native
  
  var colorType: js.UndefOr[ColorType] = js.native
  
  var deflateChunkSize: js.UndefOr[Double] = js.native
  
  var deflateFactory: js.UndefOr[FnCall] = js.native
  
  var deflateLevel: js.UndefOr[Double] = js.native
  
  var deflateStrategy: js.UndefOr[Double] = js.native
  
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var inputColorType: js.UndefOr[ColorType] = js.native
  
  var inputHasAlpha: js.UndefOr[Boolean] = js.native
}
object PackerOptions {
  
  @scala.inline
  def apply(): PackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackerOptions]
  }
  
  @scala.inline
  implicit class PackerOptionsOps[Self <: PackerOptions] (val x: Self) extends AnyVal {
    
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
    def setBgColor(value: Blue): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setBitDepth(value: BitDepth): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitDepth: Self = this.set("bitDepth", js.undefined)
    
    @scala.inline
    def setColorType(value: ColorType): Self = this.set("colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    
    @scala.inline
    def setDeflateChunkSize(value: Double): Self = this.set("deflateChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflateChunkSize: Self = this.set("deflateChunkSize", js.undefined)
    
    @scala.inline
    def setDeflateFactory(value: FnCall): Self = this.set("deflateFactory", value.asInstanceOf[js.Any])
    
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
    def setInputColorType(value: ColorType): Self = this.set("inputColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputColorType: Self = this.set("inputColorType", js.undefined)
    
    @scala.inline
    def setInputHasAlpha(value: Boolean): Self = this.set("inputHasAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputHasAlpha: Self = this.set("inputHasAlpha", js.undefined)
  }
}
