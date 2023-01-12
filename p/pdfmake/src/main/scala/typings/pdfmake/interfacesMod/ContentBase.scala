package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentBase
  extends StObject
     with Style {
  
  /**
    * Absolute position of the element from the top-left corner of the current page.
    *
    * If set, the element does not occupy any space in the normal content layout.
    *
    * In this case, the element is rendered above elements defined earlier in the
    * document content, but below elements defined later.
    */
  var absolutePosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Sets the headline level for the current element.
    *
    * This value is not currently used by pdfmake itself.
    * It is, however, passed to the {@link TDocumentDefinitions.pageBreakBefore} callback, where you
    * can use it to automatically insert page breaks before elements with certain headline levels.
    */
  var headlineLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether to insert a page break before or after the element.
    *
    * For more complex page break logic, use {@link TDocumentDefinitions.pageBreakBefore}.
    */
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  /**
    * Sets the page orientation.
    *
    * Only relevant when used in combination with {@link pageBreak}.
    */
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  /**
    * Relative position of the element from the position it would normally be rendered in.
    *
    * If set, the element does not occupy any space in the normal content layout.
    *
    * In this case, the element is rendered above elements defined earlier in the
    * document content, but below elements defined later.
    */
  var relativePosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Style or style reference to apply.
    */
  var style: js.UndefOr[StyleReference] = js.undefined
  
  /**
    * Controls whether the element should be kept together on the same page.
    *
    * Defaults to `false`.
    */
  var unbreakable: js.UndefOr[Boolean] = js.undefined
}
object ContentBase {
  
  inline def apply(): ContentBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentBase] (val x: Self) extends AnyVal {
    
    inline def setAbsolutePosition(value: Position): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
    
    inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
    
    inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setRelativePosition(value: Position): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
    
    inline def setStyle(value: StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: (String | Style)*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
    
    inline def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
  }
}
