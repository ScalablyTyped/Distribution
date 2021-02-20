package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentStyle extends StObject {
  
  /** The background of the document. Documents cannot have a transparent background color. */
  var background: js.UndefOr[Background] = js.native
  
  /** The ID of the default footer. If not set, there is no default footer. This property is read-only. */
  var defaultFooterId: js.UndefOr[String] = js.native
  
  /** The ID of the default header. If not set, there is no default header. This property is read-only. */
  var defaultHeaderId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the footer used only for even pages. The value of use_even_page_header_footer determines whether to use the default_footer_id or this value for the footer on even pages.
    * If not set, there is no even page footer. This property is read-only.
    */
  var evenPageFooterId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the header used only for even pages. The value of use_even_page_header_footer determines whether to use the default_header_id or this value for the header on even pages.
    * If not set, there is no even page header. This property is read-only.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the footer used only for the first page. If not set then a unique footer for the first page does not exist. The value of use_first_page_header_footer determines whether to
    * use the default_footer_id or this value for the footer on the first page. If not set, there is no first page footer. This property is read-only.
    */
  var firstPageFooterId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the header used only for the first page. If not set then a unique header for the first page does not exist. The value of use_first_page_header_footer determines whether to
    * use the default_header_id or this value for the header on the first page. If not set, there is no first page header. This property is read-only.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.native
  
  /** The bottom page margin. Updating the bottom page margin on the document style clears the bottom page margin on all section styles. */
  var marginBottom: js.UndefOr[Dimension] = js.native
  
  /** The amount of space between the bottom of the page and the contents of the footer. */
  var marginFooter: js.UndefOr[Dimension] = js.native
  
  /** The amount of space between the top of the page and the contents of the header. */
  var marginHeader: js.UndefOr[Dimension] = js.native
  
  /** The left page margin. Updating the left page margin on the document style clears the left page margin on all section styles. It may also cause columns to resize in all sections. */
  var marginLeft: js.UndefOr[Dimension] = js.native
  
  /** The right page margin. Updating the right page margin on the document style clears the right page margin on all section styles. It may also cause columns to resize in all sections. */
  var marginRight: js.UndefOr[Dimension] = js.native
  
  /** The top page margin. Updating the top page margin on the document style clears the top page margin on all section styles. */
  var marginTop: js.UndefOr[Dimension] = js.native
  
  /** The page number from which to start counting the number of pages. */
  var pageNumberStart: js.UndefOr[Double] = js.native
  
  /** The size of a page in the document. */
  var pageSize: js.UndefOr[Size] = js.native
  
  /**
    * Indicates whether DocumentStyle margin_header, SectionStyle margin_header and DocumentStyle margin_footer, SectionStyle margin_footer are respected. When false, the default values
    * in the Docs editor for header and footer margin are used. This property is read-only.
    */
  var useCustomHeaderFooterMargins: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether to use the even page header / footer IDs for the even pages. */
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether to use the first page header / footer IDs for the first page. */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}
object DocumentStyle {
  
  @scala.inline
  def apply(): DocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyle]
  }
  
  @scala.inline
  implicit class DocumentStyleMutableBuilder[Self <: DocumentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setDefaultFooterId(value: String): Self = StObject.set(x, "defaultFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFooterIdUndefined: Self = StObject.set(x, "defaultFooterId", js.undefined)
    
    @scala.inline
    def setDefaultHeaderId(value: String): Self = StObject.set(x, "defaultHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeaderIdUndefined: Self = StObject.set(x, "defaultHeaderId", js.undefined)
    
    @scala.inline
    def setEvenPageFooterId(value: String): Self = StObject.set(x, "evenPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageFooterIdUndefined: Self = StObject.set(x, "evenPageFooterId", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderId(value: String): Self = StObject.set(x, "evenPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageHeaderIdUndefined: Self = StObject.set(x, "evenPageHeaderId", js.undefined)
    
    @scala.inline
    def setFirstPageFooterId(value: String): Self = StObject.set(x, "firstPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageFooterIdUndefined: Self = StObject.set(x, "firstPageFooterId", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderId(value: String): Self = StObject.set(x, "firstPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageHeaderIdUndefined: Self = StObject.set(x, "firstPageHeaderId", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Dimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginFooter(value: Dimension): Self = StObject.set(x, "marginFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginFooterUndefined: Self = StObject.set(x, "marginFooter", js.undefined)
    
    @scala.inline
    def setMarginHeader(value: Dimension): Self = StObject.set(x, "marginHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginHeaderUndefined: Self = StObject.set(x, "marginHeader", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Dimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Dimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Dimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setPageNumberStart(value: Double): Self = StObject.set(x, "pageNumberStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberStartUndefined: Self = StObject.set(x, "pageNumberStart", js.undefined)
    
    @scala.inline
    def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setUseCustomHeaderFooterMargins(value: Boolean): Self = StObject.set(x, "useCustomHeaderFooterMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomHeaderFooterMarginsUndefined: Self = StObject.set(x, "useCustomHeaderFooterMargins", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEvenPageHeaderFooterUndefined: Self = StObject.set(x, "useEvenPageHeaderFooter", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFirstPageHeaderFooterUndefined: Self = StObject.set(x, "useFirstPageHeaderFooter", js.undefined)
  }
}
