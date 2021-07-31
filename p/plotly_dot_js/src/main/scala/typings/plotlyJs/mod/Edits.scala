package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edits extends StObject {
  
  var annotationPosition: Boolean
  
  var annotationTail: Boolean
  
  var annotationText: Boolean
  
  var axisTitleText: Boolean
  
  var colorbarPosition: Boolean
  
  var colorbarTitleText: Boolean
  
  var legendPosition: Boolean
  
  var legendText: Boolean
  
  var shapePosition: Boolean
  
  var titleText: Boolean
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
  implicit class EditsMutableBuilder[Self <: Edits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationPosition(value: Boolean): Self = StObject.set(x, "annotationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTail(value: Boolean): Self = StObject.set(x, "annotationTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationText(value: Boolean): Self = StObject.set(x, "annotationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisTitleText(value: Boolean): Self = StObject.set(x, "axisTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorbarPosition(value: Boolean): Self = StObject.set(x, "colorbarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorbarTitleText(value: Boolean): Self = StObject.set(x, "colorbarTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPosition(value: Boolean): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendText(value: Boolean): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePosition(value: Boolean): Self = StObject.set(x, "shapePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleText(value: Boolean): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
  }
}
