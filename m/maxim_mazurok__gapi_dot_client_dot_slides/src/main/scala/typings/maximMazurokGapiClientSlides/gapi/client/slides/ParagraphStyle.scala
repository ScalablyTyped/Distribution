package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphStyle extends StObject {
  
  /** The text alignment for this paragraph. */
  var alignment: js.UndefOr[String] = js.undefined
  
  /** The text direction of this paragraph. If unset, the value defaults to LEFT_TO_RIGHT since text direction is not inherited. */
  var direction: js.UndefOr[String] = js.undefined
  
  /** The amount indentation for the paragraph on the side that corresponds to the end of the text, based on the current text direction. If unset, the value is inherited from the parent. */
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  
  /** The amount of indentation for the start of the first line of the paragraph. If unset, the value is inherited from the parent. */
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The amount indentation for the paragraph on the side that corresponds to the start of the text, based on the current text direction. If unset, the value is inherited from the
    * parent.
    */
  var indentStart: js.UndefOr[Dimension] = js.undefined
  
  /** The amount of space between lines, as a percentage of normal, where normal is represented as 100.0. If unset, the value is inherited from the parent. */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  
  /** The amount of extra space above the paragraph. If unset, the value is inherited from the parent. */
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  
  /** The amount of extra space below the paragraph. If unset, the value is inherited from the parent. */
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  
  /** The spacing mode for the paragraph. */
  var spacingMode: js.UndefOr[String] = js.undefined
}
object ParagraphStyle {
  
  inline def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
    
    inline def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
    
    inline def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    inline def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
    
    inline def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
    
    inline def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
    
    inline def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
    
    inline def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    inline def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
  }
}
