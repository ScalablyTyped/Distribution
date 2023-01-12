package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentStyleSuggestionState extends StObject {
  
  /** A mask that indicates which of the fields in background have been changed in this suggestion. */
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.undefined
  
  /** Indicates if there was a suggested change to default_footer_id. */
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to default_header_id. */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to even_page_footer_id. */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to even_page_header_id. */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to first_page_footer_id. */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to first_page_header_id. */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_bottom. */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_footer. */
  var marginFooterSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_header. */
  var marginHeaderSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_left. */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_right. */
  var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_top. */
  var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to page_number_start. */
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** A mask that indicates which of the fields in size have been changed in this suggestion. */
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
  
  /** Indicates if there was a suggested change to use_custom_header_footer_margins. */
  var useCustomHeaderFooterMarginsSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to use_even_page_header_footer. */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to use_first_page_header_footer. */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
}
object DocumentStyleSuggestionState {
  
  inline def apply(): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setBackgroundSuggestionState(value: BackgroundSuggestionState): Self = StObject.set(x, "backgroundSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSuggestionStateUndefined: Self = StObject.set(x, "backgroundSuggestionState", js.undefined)
    
    inline def setDefaultFooterIdSuggested(value: Boolean): Self = StObject.set(x, "defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setDefaultFooterIdSuggestedUndefined: Self = StObject.set(x, "defaultFooterIdSuggested", js.undefined)
    
    inline def setDefaultHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeaderIdSuggestedUndefined: Self = StObject.set(x, "defaultHeaderIdSuggested", js.undefined)
    
    inline def setEvenPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setEvenPageFooterIdSuggestedUndefined: Self = StObject.set(x, "evenPageFooterIdSuggested", js.undefined)
    
    inline def setEvenPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setEvenPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "evenPageHeaderIdSuggested", js.undefined)
    
    inline def setFirstPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setFirstPageFooterIdSuggestedUndefined: Self = StObject.set(x, "firstPageFooterIdSuggested", js.undefined)
    
    inline def setFirstPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setFirstPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "firstPageHeaderIdSuggested", js.undefined)
    
    inline def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
    
    inline def setMarginFooterSuggested(value: Boolean): Self = StObject.set(x, "marginFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginFooterSuggestedUndefined: Self = StObject.set(x, "marginFooterSuggested", js.undefined)
    
    inline def setMarginHeaderSuggested(value: Boolean): Self = StObject.set(x, "marginHeaderSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginHeaderSuggestedUndefined: Self = StObject.set(x, "marginHeaderSuggested", js.undefined)
    
    inline def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
    
    inline def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
    
    inline def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
    
    inline def setPageNumberStartSuggested(value: Boolean): Self = StObject.set(x, "pageNumberStartSuggested", value.asInstanceOf[js.Any])
    
    inline def setPageNumberStartSuggestedUndefined: Self = StObject.set(x, "pageNumberStartSuggested", js.undefined)
    
    inline def setPageSizeSuggestionState(value: SizeSuggestionState): Self = StObject.set(x, "pageSizeSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setPageSizeSuggestionStateUndefined: Self = StObject.set(x, "pageSizeSuggestionState", js.undefined)
    
    inline def setUseCustomHeaderFooterMarginsSuggested(value: Boolean): Self = StObject.set(x, "useCustomHeaderFooterMarginsSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseCustomHeaderFooterMarginsSuggestedUndefined: Self = StObject.set(x, "useCustomHeaderFooterMarginsSuggested", js.undefined)
    
    inline def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseEvenPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", js.undefined)
    
    inline def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseFirstPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", js.undefined)
  }
}
