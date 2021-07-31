package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentBase
  extends StObject
     with Style {
  
  var absolutePosition: js.UndefOr[X] = js.undefined
  
  var headlineLevel: js.UndefOr[Double] = js.undefined
  
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  var relativePosition: js.UndefOr[X] = js.undefined
  
  var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
}
object ContentBase {
  
  @scala.inline
  def apply(): ContentBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentBase]
  }
  
  @scala.inline
  implicit class ContentBaseMutableBuilder[Self <: ContentBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
    
    @scala.inline
    def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
    
    @scala.inline
    def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    @scala.inline
    def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
    
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
  }
}
