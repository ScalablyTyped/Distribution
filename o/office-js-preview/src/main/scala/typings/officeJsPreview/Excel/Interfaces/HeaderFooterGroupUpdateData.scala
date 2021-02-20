package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.HeaderFooterState
import typings.officeJsPreview.officeJsPreviewStrings.Default
import typings.officeJsPreview.officeJsPreviewStrings.FirstAndDefault
import typings.officeJsPreview.officeJsPreviewStrings.FirstOddAndEven
import typings.officeJsPreview.officeJsPreviewStrings.OddAndEven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the HeaderFooterGroup object, for use in `headerFooterGroup.set({ ... })`. */
@js.native
trait HeaderFooterGroupUpdateData extends StObject {
  
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterUpdateData] = js.native
  
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var evenPages: js.UndefOr[HeaderFooterUpdateData] = js.native
  
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPage: js.UndefOr[HeaderFooterUpdateData] = js.native
  
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var oddPages: js.UndefOr[HeaderFooterUpdateData] = js.native
  
  /**
    *
    * The state by which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var state: js.UndefOr[HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven] = js.native
  
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: js.UndefOr[Boolean] = js.native
}
object HeaderFooterGroupUpdateData {
  
  @scala.inline
  def apply(): HeaderFooterGroupUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterGroupUpdateData]
  }
  
  @scala.inline
  implicit class HeaderFooterGroupUpdateDataMutableBuilder[Self <: HeaderFooterGroupUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultForAllPages(value: HeaderFooterUpdateData): Self = StObject.set(x, "defaultForAllPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForAllPagesUndefined: Self = StObject.set(x, "defaultForAllPages", js.undefined)
    
    @scala.inline
    def setEvenPages(value: HeaderFooterUpdateData): Self = StObject.set(x, "evenPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPagesUndefined: Self = StObject.set(x, "evenPages", js.undefined)
    
    @scala.inline
    def setFirstPage(value: HeaderFooterUpdateData): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
    
    @scala.inline
    def setOddPages(value: HeaderFooterUpdateData): Self = StObject.set(x, "oddPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddPagesUndefined: Self = StObject.set(x, "oddPages", js.undefined)
    
    @scala.inline
    def setState(value: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUseSheetMargins(value: Boolean): Self = StObject.set(x, "useSheetMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSheetMarginsUndefined: Self = StObject.set(x, "useSheetMargins", js.undefined)
    
    @scala.inline
    def setUseSheetScale(value: Boolean): Self = StObject.set(x, "useSheetScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSheetScaleUndefined: Self = StObject.set(x, "useSheetScale", js.undefined)
  }
}
