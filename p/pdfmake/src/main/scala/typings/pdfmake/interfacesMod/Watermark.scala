package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watermark extends js.Object {
  
  /** angle of text rotation (minimal version: 0.1.60) */
  var angle: js.UndefOr[Double] = js.native
  
  /** bold style of text */
  var bold: js.UndefOr[Boolean] = js.native
  
  /** color of text */
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  /** own font size of text (ideal size is calculated automatically) (minimal version: 0.1.60) */
  var fontSize: js.UndefOr[Double] = js.native
  
  /** italics style of text */
  var italics: js.UndefOr[Boolean] = js.native
  
  /** opacity of text */
  var opacity: js.UndefOr[Double] = js.native
  
  /** watermark text */
  var text: String = js.native
}
object Watermark {
  
  @scala.inline
  def apply(text: String): Watermark = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = this.set("italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalics: Self = this.set("italics", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
