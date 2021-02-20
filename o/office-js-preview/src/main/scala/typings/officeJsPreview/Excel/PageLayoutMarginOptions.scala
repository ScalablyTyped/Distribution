package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the options in page layout margins.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutMarginOptions extends StObject {
  
  /**
    *
    * Specifies the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footer: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var header: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.native
}
object PageLayoutMarginOptions {
  
  @scala.inline
  def apply(): PageLayoutMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutMarginOptions]
  }
  
  @scala.inline
  implicit class PageLayoutMarginOptionsMutableBuilder[Self <: PageLayoutMarginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setFooter(value: Double): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
