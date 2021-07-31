package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to background_color. */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to baseline_offset. */
  var baselineOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to bold. */
  var boldSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to font_size. */
  var fontSizeSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to foreground_color. */
  var foregroundColorSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to italic. */
  var italicSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to link. */
  var linkSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to small_caps. */
  var smallCapsSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to strikethrough. */
  var strikethroughSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to underline. */
  var underlineSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to weighted_font_family. */
  var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.undefined
}
object TextStyleSuggestionState {
  
  @scala.inline
  def apply(): TextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleSuggestionState]
  }
  
  @scala.inline
  implicit class TextStyleSuggestionStateMutableBuilder[Self <: TextStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
    
    @scala.inline
    def setBaselineOffsetSuggested(value: Boolean): Self = StObject.set(x, "baselineOffsetSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineOffsetSuggestedUndefined: Self = StObject.set(x, "baselineOffsetSuggested", js.undefined)
    
    @scala.inline
    def setBoldSuggested(value: Boolean): Self = StObject.set(x, "boldSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldSuggestedUndefined: Self = StObject.set(x, "boldSuggested", js.undefined)
    
    @scala.inline
    def setFontSizeSuggested(value: Boolean): Self = StObject.set(x, "fontSizeSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSuggestedUndefined: Self = StObject.set(x, "fontSizeSuggested", js.undefined)
    
    @scala.inline
    def setForegroundColorSuggested(value: Boolean): Self = StObject.set(x, "foregroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorSuggestedUndefined: Self = StObject.set(x, "foregroundColorSuggested", js.undefined)
    
    @scala.inline
    def setItalicSuggested(value: Boolean): Self = StObject.set(x, "italicSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicSuggestedUndefined: Self = StObject.set(x, "italicSuggested", js.undefined)
    
    @scala.inline
    def setLinkSuggested(value: Boolean): Self = StObject.set(x, "linkSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkSuggestedUndefined: Self = StObject.set(x, "linkSuggested", js.undefined)
    
    @scala.inline
    def setSmallCapsSuggested(value: Boolean): Self = StObject.set(x, "smallCapsSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallCapsSuggestedUndefined: Self = StObject.set(x, "smallCapsSuggested", js.undefined)
    
    @scala.inline
    def setStrikethroughSuggested(value: Boolean): Self = StObject.set(x, "strikethroughSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughSuggestedUndefined: Self = StObject.set(x, "strikethroughSuggested", js.undefined)
    
    @scala.inline
    def setUnderlineSuggested(value: Boolean): Self = StObject.set(x, "underlineSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineSuggestedUndefined: Self = StObject.set(x, "underlineSuggested", js.undefined)
    
    @scala.inline
    def setWeightedFontFamilySuggested(value: Boolean): Self = StObject.set(x, "weightedFontFamilySuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedFontFamilySuggestedUndefined: Self = StObject.set(x, "weightedFontFamilySuggested", js.undefined)
  }
}
