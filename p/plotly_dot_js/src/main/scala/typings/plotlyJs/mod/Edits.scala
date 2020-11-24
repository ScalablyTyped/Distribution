package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edits extends js.Object {
  
  var annotationPosition: Boolean = js.native
  
  var annotationTail: Boolean = js.native
  
  var annotationText: Boolean = js.native
  
  var axisTitleText: Boolean = js.native
  
  var colorbarPosition: Boolean = js.native
  
  var colorbarTitleText: Boolean = js.native
  
  var legendPosition: Boolean = js.native
  
  var legendText: Boolean = js.native
  
  var shapePosition: Boolean = js.native
  
  var titleText: Boolean = js.native
}
object Edits {
  
  @scala.inline
  def apply(
    annotationPosition: Boolean,
    annotationTail: Boolean,
    annotationText: Boolean,
    axisTitleText: Boolean,
    colorbarPosition: Boolean,
    colorbarTitleText: Boolean,
    legendPosition: Boolean,
    legendText: Boolean,
    shapePosition: Boolean,
    titleText: Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(annotationPosition = annotationPosition.asInstanceOf[js.Any], annotationTail = annotationTail.asInstanceOf[js.Any], annotationText = annotationText.asInstanceOf[js.Any], axisTitleText = axisTitleText.asInstanceOf[js.Any], colorbarPosition = colorbarPosition.asInstanceOf[js.Any], colorbarTitleText = colorbarTitleText.asInstanceOf[js.Any], legendPosition = legendPosition.asInstanceOf[js.Any], legendText = legendText.asInstanceOf[js.Any], shapePosition = shapePosition.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edits]
  }
  
  @scala.inline
  implicit class EditsOps[Self <: Edits] (val x: Self) extends AnyVal {
    
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
    def setAnnotationTail(value: Boolean): Self = this.set("annotationTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationText(value: Boolean): Self = this.set("annotationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisTitleText(value: Boolean): Self = this.set("axisTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorbarPosition(value: Boolean): Self = this.set("colorbarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorbarTitleText(value: Boolean): Self = this.set("colorbarTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPosition(value: Boolean): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendText(value: Boolean): Self = this.set("legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePosition(value: Boolean): Self = this.set("shapePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleText(value: Boolean): Self = this.set("titleText", value.asInstanceOf[js.Any])
  }
}
