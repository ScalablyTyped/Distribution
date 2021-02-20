package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphStyle extends StObject {
  
  /** The text alignment for this paragraph. */
  var alignment: js.UndefOr[String] = js.native
  
  /** The text direction of this paragraph. If unset, the value defaults to LEFT_TO_RIGHT since text direction is not inherited. */
  var direction: js.UndefOr[String] = js.native
  
  /** The amount indentation for the paragraph on the side that corresponds to the end of the text, based on the current text direction. If unset, the value is inherited from the parent. */
  var indentEnd: js.UndefOr[Dimension] = js.native
  
  /** The amount of indentation for the start of the first line of the paragraph. If unset, the value is inherited from the parent. */
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  
  /**
    * The amount indentation for the paragraph on the side that corresponds to the start of the text, based on the current text direction. If unset, the value is inherited from the
    * parent.
    */
  var indentStart: js.UndefOr[Dimension] = js.native
  
  /** The amount of space between lines, as a percentage of normal, where normal is represented as 100.0. If unset, the value is inherited from the parent. */
  var lineSpacing: js.UndefOr[Double] = js.native
  
  /** The amount of extra space above the paragraph. If unset, the value is inherited from the parent. */
  var spaceAbove: js.UndefOr[Dimension] = js.native
  
  /** The amount of extra space below the paragraph. If unset, the value is inherited from the parent. */
  var spaceBelow: js.UndefOr[Dimension] = js.native
  
  /** The spacing mode for the paragraph. */
  var spacingMode: js.UndefOr[String] = js.native
}
object ParagraphStyle {
  
  @scala.inline
  def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  @scala.inline
  implicit class ParagraphStyleMutableBuilder[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    @scala.inline
    def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    @scala.inline
    def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
    
    @scala.inline
    def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
    
    @scala.inline
    def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
  }
}
