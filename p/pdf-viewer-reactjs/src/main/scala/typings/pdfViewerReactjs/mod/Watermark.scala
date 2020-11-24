package typings.pdfViewerReactjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watermark extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var diagonal: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object Watermark {
  
  @scala.inline
  def apply(): Watermark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Watermark]
  }
  
  @scala.inline
  implicit class WatermarkOps[Self <: Watermark] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDiagonal(value: Boolean): Self = this.set("diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonal: Self = this.set("diagonal", js.undefined)
    
    @scala.inline
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
