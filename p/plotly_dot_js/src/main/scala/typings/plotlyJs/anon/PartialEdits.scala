package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Edits> */
@js.native
trait PartialEdits extends js.Object {
  
  var annotationPosition: js.UndefOr[Boolean] = js.native
  
  var annotationTail: js.UndefOr[Boolean] = js.native
  
  var annotationText: js.UndefOr[Boolean] = js.native
  
  var axisTitleText: js.UndefOr[Boolean] = js.native
  
  var colorbarPosition: js.UndefOr[Boolean] = js.native
  
  var colorbarTitleText: js.UndefOr[Boolean] = js.native
  
  var legendPosition: js.UndefOr[Boolean] = js.native
  
  var legendText: js.UndefOr[Boolean] = js.native
  
  var shapePosition: js.UndefOr[Boolean] = js.native
  
  var titleText: js.UndefOr[Boolean] = js.native
}
object PartialEdits {
  
  @scala.inline
  def apply(): PartialEdits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEdits]
  }
  
  @scala.inline
  implicit class PartialEditsOps[Self <: PartialEdits] (val x: Self) extends AnyVal {
    
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
    def setAnnotationPosition(value: Boolean): Self = this.set("annotationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationPosition: Self = this.set("annotationPosition", js.undefined)
    
    @scala.inline
    def setAnnotationTail(value: Boolean): Self = this.set("annotationTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationTail: Self = this.set("annotationTail", js.undefined)
    
    @scala.inline
    def setAnnotationText(value: Boolean): Self = this.set("annotationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationText: Self = this.set("annotationText", js.undefined)
    
    @scala.inline
    def setAxisTitleText(value: Boolean): Self = this.set("axisTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTitleText: Self = this.set("axisTitleText", js.undefined)
    
    @scala.inline
    def setColorbarPosition(value: Boolean): Self = this.set("colorbarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorbarPosition: Self = this.set("colorbarPosition", js.undefined)
    
    @scala.inline
    def setColorbarTitleText(value: Boolean): Self = this.set("colorbarTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorbarTitleText: Self = this.set("colorbarTitleText", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: Boolean): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setLegendText(value: Boolean): Self = this.set("legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendText: Self = this.set("legendText", js.undefined)
    
    @scala.inline
    def setShapePosition(value: Boolean): Self = this.set("shapePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapePosition: Self = this.set("shapePosition", js.undefined)
    
    @scala.inline
    def setTitleText(value: Boolean): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
  }
}
