package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionStyle extends StObject {
  
  /**
    * The section's columns properties. If empty, the section contains one column with the default properties in the Docs editor. A section can be updated to have no more than three
    * columns. When updating this property, setting a concrete value is required. Unsetting this property will result in a 400 bad request error.
    */
  var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.undefined
  
  /**
    * The style of column separators. This style can be set even when there is one column in the section. When updating this property, setting a concrete value is required. Unsetting this
    * property results in a 400 bad request error.
    */
  var columnSeparatorStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT. When updating this property, setting a concrete value is required. Unsetting this property
    * results in a 400 bad request error.
    */
  var contentDirection: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the default footer. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the first SectionBreak, it inherits from
    * DocumentStyle's default_footer_id. This property is read-only.
    */
  var defaultFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the default header. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the first SectionBreak, it inherits from
    * DocumentStyle's default_header_id. This property is read-only.
    */
  var defaultHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the footer used only for even pages. If the value of DocumentStyle's use_even_page_header_footer is true, this value is used for the footers on even pages in the section.
    * If it is false, the footers on even pages uses the default_footer_id. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the first
    * SectionBreak, it inherits from DocumentStyle's even_page_footer_id. This property is read-only.
    */
  var evenPageFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the header used only for even pages. If the value of DocumentStyle's use_even_page_header_footer is true, this value is used for the headers on even pages in the section.
    * If it is false, the headers on even pages uses the default_header_id. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the first
    * SectionBreak, it inherits from DocumentStyle's even_page_header_id. This property is read-only.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the footer used only for the first page of the section. If use_first_page_header_footer is true, this value is used for the footer on the first page of the section. If it
    * is false, the footer on the first page of the section uses the default_footer_id. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset
    * in the first SectionBreak, it inherits from DocumentStyle's first_page_footer_id. This property is read-only.
    */
  var firstPageFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the header used only for the first page of the section. If use_first_page_header_footer is true, this value is used for the header on the first page of the section. If it
    * is false, the header on the first page of the section uses the default_header_id. If unset, the value inherits from the previous SectionBreak's SectionStyle. If the value is unset
    * in the first SectionBreak, it inherits from DocumentStyle's first_page_header_id. This property is read-only.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The bottom page margin of the section. If unset, uses margin_bottom from DocumentStyle. When updating this property, setting a concrete value is required. Unsetting this property
    * results in a 400 bad request error.
    */
  var marginBottom: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The footer margin of the section. If unset, uses margin_footer from DocumentStyle. If updated, use_custom_header_footer_margins is set to true on DocumentStyle. The value of
    * use_custom_header_footer_margins on DocumentStyle indicates if a footer margin is being respected for this section When updating this property, setting a concrete value is required.
    * Unsetting this property results in a 400 bad request error.
    */
  var marginFooter: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The header margin of the section. If unset, uses margin_header from DocumentStyle. If updated, use_custom_header_footer_margins is set to true on DocumentStyle. The value of
    * use_custom_header_footer_margins on DocumentStyle indicates if a header margin is being respected for this section. When updating this property, setting a concrete value is
    * required. Unsetting this property results in a 400 bad request error.
    */
  var marginHeader: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The left page margin of the section. If unset, uses margin_left from DocumentStyle. Updating left margin causes columns in this section to resize. Since the margin affects column
    * width, it is applied before column properties. When updating this property, setting a concrete value is required. Unsetting this property results in a 400 bad request error.
    */
  var marginLeft: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The right page margin of the section. If unset, uses margin_right from DocumentStyle. Updating right margin causes columns in this section to resize. Since the margin affects column
    * width, it is applied before column properties. When updating this property, setting a concrete value is required. Unsetting this property results in a 400 bad request error.
    */
  var marginRight: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The top page margin of the section. If unset, uses margin_top from DocumentStyle. When updating this property, setting a concrete value is required. Unsetting this property results
    * in a 400 bad request error.
    */
  var marginTop: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The page number from which to start counting the number of pages for this section. If unset, page numbering continues from the previous section. If the value is unset in the first
    * SectionBreak, refer to DocumentStyle's page_number_start. When updating this property, setting a concrete value is required. Unsetting this property results in a 400 bad request
    * error.
    */
  var pageNumberStart: js.UndefOr[Double] = js.undefined
  
  /** Output only. The type of section. */
  var sectionType: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to use the first page header / footer IDs for the first page of the section. If unset, it inherits from DocumentStyle's use_first_page_header_footer for the first
    * section. If the value is unset for subsequent sectors, it should be interpreted as false. When updating this property, setting a concrete value is required. Unsetting this property
    * results in a 400 bad request error.
    */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
}
object SectionStyle {
  
  @scala.inline
  def apply(): SectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionStyle]
  }
  
  @scala.inline
  implicit class SectionStyleMutableBuilder[Self <: SectionStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnProperties(value: js.Array[SectionColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: SectionColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setColumnSeparatorStyle(value: String): Self = StObject.set(x, "columnSeparatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSeparatorStyleUndefined: Self = StObject.set(x, "columnSeparatorStyle", js.undefined)
    
    @scala.inline
    def setContentDirection(value: String): Self = StObject.set(x, "contentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDirectionUndefined: Self = StObject.set(x, "contentDirection", js.undefined)
    
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
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFirstPageHeaderFooterUndefined: Self = StObject.set(x, "useFirstPageHeaderFooter", js.undefined)
  }
}
