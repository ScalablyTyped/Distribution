package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentStyleSuggestionState extends js.Object {
  
  /** A mask that indicates which of the fields in background have been changed in this suggestion. */
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to default_footer_id. */
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to default_header_id. */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to even_page_footer_id. */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to even_page_header_id. */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to first_page_footer_id. */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to first_page_header_id. */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_bottom. */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_footer. */
  var marginFooterSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_header. */
  var marginHeaderSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_left. */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_right. */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_top. */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to page_number_start. */
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in size have been changed in this suggestion. */
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to use_custom_header_footer_margins. */
  var useCustomHeaderFooterMarginsSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to use_even_page_header_footer. */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to use_first_page_header_footer. */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
}
object DocumentStyleSuggestionState {
  
  @scala.inline
  def apply(): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
  
  @scala.inline
  implicit class DocumentStyleSuggestionStateOps[Self <: DocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setBackgroundSuggestionState(value: BackgroundSuggestionState): Self = this.set("backgroundSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSuggestionState: Self = this.set("backgroundSuggestionState", js.undefined)
    
    @scala.inline
    def setDefaultFooterIdSuggested(value: Boolean): Self = this.set("defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFooterIdSuggested: Self = this.set("defaultFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setDefaultHeaderIdSuggested(value: Boolean): Self = this.set("defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeaderIdSuggested: Self = this.set("defaultHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageFooterIdSuggested(value: Boolean): Self = this.set("evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageFooterIdSuggested: Self = this.set("evenPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderIdSuggested(value: Boolean): Self = this.set("evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageHeaderIdSuggested: Self = this.set("evenPageHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageFooterIdSuggested(value: Boolean): Self = this.set("firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageFooterIdSuggested: Self = this.set("firstPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderIdSuggested(value: Boolean): Self = this.set("firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageHeaderIdSuggested: Self = this.set("firstPageHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = this.set("marginBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottomSuggested: Self = this.set("marginBottomSuggested", js.undefined)
    
    @scala.inline
    def setMarginFooterSuggested(value: Boolean): Self = this.set("marginFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginFooterSuggested: Self = this.set("marginFooterSuggested", js.undefined)
    
    @scala.inline
    def setMarginHeaderSuggested(value: Boolean): Self = this.set("marginHeaderSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginHeaderSuggested: Self = this.set("marginHeaderSuggested", js.undefined)
    
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = this.set("marginLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeftSuggested: Self = this.set("marginLeftSuggested", js.undefined)
    
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = this.set("marginRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRightSuggested: Self = this.set("marginRightSuggested", js.undefined)
    
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = this.set("marginTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTopSuggested: Self = this.set("marginTopSuggested", js.undefined)
    
    @scala.inline
    def setPageNumberStartSuggested(value: Boolean): Self = this.set("pageNumberStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumberStartSuggested: Self = this.set("pageNumberStartSuggested", js.undefined)
    
    @scala.inline
    def setPageSizeSuggestionState(value: SizeSuggestionState): Self = this.set("pageSizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeSuggestionState: Self = this.set("pageSizeSuggestionState", js.undefined)
    
    @scala.inline
    def setUseCustomHeaderFooterMarginsSuggested(value: Boolean): Self = this.set("useCustomHeaderFooterMarginsSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomHeaderFooterMarginsSuggested: Self = this.set("useCustomHeaderFooterMarginsSuggested", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = this.set("useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEvenPageHeaderFooterSuggested: Self = this.set("useEvenPageHeaderFooterSuggested", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = this.set("useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFirstPageHeaderFooterSuggested: Self = this.set("useFirstPageHeaderFooterSuggested", js.undefined)
  }
}
