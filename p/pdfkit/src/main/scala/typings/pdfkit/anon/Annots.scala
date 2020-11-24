package typings.pdfkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annots extends js.Object {
  
  var Annots: js.Any = js.native
  
  var ExtGState: js.UndefOr[js.Any] = js.native
  
  var Font: js.UndefOr[js.Any] = js.native
  
  var Pattern: js.Any = js.native
  
  var XObject: js.UndefOr[js.Any] = js.native
}
object Annots {
  
  @scala.inline
  def apply(Annots: js.Any, Pattern: js.Any): Annots = {
    val __obj = js.Dynamic.literal(Annots = Annots.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annots]
  }
  
  @scala.inline
  implicit class AnnotsOps[Self <: Annots] (val x: Self) extends AnyVal {
    
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
    def setAnnots(value: js.Any): Self = this.set("Annots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: js.Any): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtGState(value: js.Any): Self = this.set("ExtGState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtGState: Self = this.set("ExtGState", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("Font", js.undefined)
    
    @scala.inline
    def setXObject(value: js.Any): Self = this.set("XObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXObject: Self = this.set("XObject", js.undefined)
  }
}
