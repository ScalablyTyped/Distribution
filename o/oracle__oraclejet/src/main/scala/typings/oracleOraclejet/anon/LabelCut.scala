package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCut extends js.Object {
  
  var labelCut: js.UndefOr[String] = js.native
  
  var labelPasteAfter: js.UndefOr[String] = js.native
  
  var labelPasteBefore: js.UndefOr[String] = js.native
}
object LabelCut {
  
  @scala.inline
  def apply(): LabelCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCut]
  }
  
  @scala.inline
  implicit class LabelCutOps[Self <: LabelCut] (val x: Self) extends AnyVal {
    
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
    def setLabelCut(value: String): Self = this.set("labelCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCut: Self = this.set("labelCut", js.undefined)
    
    @scala.inline
    def setLabelPasteAfter(value: String): Self = this.set("labelPasteAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteAfter: Self = this.set("labelPasteAfter", js.undefined)
    
    @scala.inline
    def setLabelPasteBefore(value: String): Self = this.set("labelPasteBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteBefore: Self = this.set("labelPasteBefore", js.undefined)
  }
}
