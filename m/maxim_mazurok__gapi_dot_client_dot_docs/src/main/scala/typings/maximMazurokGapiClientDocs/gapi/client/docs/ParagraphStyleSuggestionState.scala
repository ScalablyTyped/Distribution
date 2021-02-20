package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphStyleSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to alignment. */
  var alignmentSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to avoid_widow_and_orphan. */
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to border_between. */
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to border_bottom. */
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to border_left. */
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to border_right. */
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to border_top. */
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to direction. */
  var directionSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to heading_id. */
  var headingIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to indent_end. */
  var indentEndSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to indent_first_line. */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to indent_start. */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to keep_lines_together. */
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to keep_with_next. */
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to line_spacing. */
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to named_style_type. */
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in shading have been changed in this suggestion. */
  var shadingSuggestionState: js.UndefOr[ShadingSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to space_above. */
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to space_below. */
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to spacing_mode. */
  var spacingModeSuggested: js.UndefOr[Boolean] = js.native
}
object ParagraphStyleSuggestionState {
  
  @scala.inline
  def apply(): ParagraphStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyleSuggestionState]
  }
  
  @scala.inline
  implicit class ParagraphStyleSuggestionStateMutableBuilder[Self <: ParagraphStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentSuggested(value: Boolean): Self = StObject.set(x, "alignmentSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentSuggestedUndefined: Self = StObject.set(x, "alignmentSuggested", js.undefined)
    
    @scala.inline
    def setAvoidWidowAndOrphanSuggested(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphanSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidWidowAndOrphanSuggestedUndefined: Self = StObject.set(x, "avoidWidowAndOrphanSuggested", js.undefined)
    
    @scala.inline
    def setBorderBetweenSuggested(value: Boolean): Self = StObject.set(x, "borderBetweenSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBetweenSuggestedUndefined: Self = StObject.set(x, "borderBetweenSuggested", js.undefined)
    
    @scala.inline
    def setBorderBottomSuggested(value: Boolean): Self = StObject.set(x, "borderBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomSuggestedUndefined: Self = StObject.set(x, "borderBottomSuggested", js.undefined)
    
    @scala.inline
    def setBorderLeftSuggested(value: Boolean): Self = StObject.set(x, "borderLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftSuggestedUndefined: Self = StObject.set(x, "borderLeftSuggested", js.undefined)
    
    @scala.inline
    def setBorderRightSuggested(value: Boolean): Self = StObject.set(x, "borderRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightSuggestedUndefined: Self = StObject.set(x, "borderRightSuggested", js.undefined)
    
    @scala.inline
    def setBorderTopSuggested(value: Boolean): Self = StObject.set(x, "borderTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopSuggestedUndefined: Self = StObject.set(x, "borderTopSuggested", js.undefined)
    
    @scala.inline
    def setDirectionSuggested(value: Boolean): Self = StObject.set(x, "directionSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionSuggestedUndefined: Self = StObject.set(x, "directionSuggested", js.undefined)
    
    @scala.inline
    def setHeadingIdSuggested(value: Boolean): Self = StObject.set(x, "headingIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingIdSuggestedUndefined: Self = StObject.set(x, "headingIdSuggested", js.undefined)
    
    @scala.inline
    def setIndentEndSuggested(value: Boolean): Self = StObject.set(x, "indentEndSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentEndSuggestedUndefined: Self = StObject.set(x, "indentEndSuggested", js.undefined)
    
    @scala.inline
    def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
    
    @scala.inline
    def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
    
    @scala.inline
    def setKeepLinesTogetherSuggested(value: Boolean): Self = StObject.set(x, "keepLinesTogetherSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLinesTogetherSuggestedUndefined: Self = StObject.set(x, "keepLinesTogetherSuggested", js.undefined)
    
    @scala.inline
    def setKeepWithNextSuggested(value: Boolean): Self = StObject.set(x, "keepWithNextSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithNextSuggestedUndefined: Self = StObject.set(x, "keepWithNextSuggested", js.undefined)
    
    @scala.inline
    def setLineSpacingSuggested(value: Boolean): Self = StObject.set(x, "lineSpacingSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingSuggestedUndefined: Self = StObject.set(x, "lineSpacingSuggested", js.undefined)
    
    @scala.inline
    def setNamedStyleTypeSuggested(value: Boolean): Self = StObject.set(x, "namedStyleTypeSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeSuggestedUndefined: Self = StObject.set(x, "namedStyleTypeSuggested", js.undefined)
    
    @scala.inline
    def setShadingSuggestionState(value: ShadingSuggestionState): Self = StObject.set(x, "shadingSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingSuggestionStateUndefined: Self = StObject.set(x, "shadingSuggestionState", js.undefined)
    
    @scala.inline
    def setSpaceAboveSuggested(value: Boolean): Self = StObject.set(x, "spaceAboveSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAboveSuggestedUndefined: Self = StObject.set(x, "spaceAboveSuggested", js.undefined)
    
    @scala.inline
    def setSpaceBelowSuggested(value: Boolean): Self = StObject.set(x, "spaceBelowSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBelowSuggestedUndefined: Self = StObject.set(x, "spaceBelowSuggested", js.undefined)
    
    @scala.inline
    def setSpacingModeSuggested(value: Boolean): Self = StObject.set(x, "spacingModeSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingModeSuggestedUndefined: Self = StObject.set(x, "spacingModeSuggested", js.undefined)
  }
}
