package typings.pngAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageOptions extends js.Object {
  
  var checkCRC: js.UndefOr[Boolean] = js.native
  
  var deflateChunkSize: js.UndefOr[Double] = js.native
  
  var deflateLevel: js.UndefOr[Double] = js.native
  
  var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.native
  
  var fill: js.UndefOr[Boolean] = js.native
  
  var filterType: js.UndefOr[EFilterType] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object IImageOptions {
  
  @scala.inline
  def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  
  @scala.inline
  implicit class IImageOptionsOps[Self <: IImageOptions] (val x: Self) extends AnyVal {
    
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
    def setDeflateChunkSize(value: Double): Self = this.set("deflateChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflateChunkSize: Self = this.set("deflateChunkSize", js.undefined)
    
    @scala.inline
    def setDeflateLevel(value: Double): Self = this.set("deflateLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflateLevel: Self = this.set("deflateLevel", js.undefined)
    
    @scala.inline
    def setDeflateStrategy(value: EDeflateStrategy): Self = this.set("deflateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflateStrategy: Self = this.set("deflateStrategy", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFilterType(value: EFilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
