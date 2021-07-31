package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
trait HeaderFooterLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[Boolean] = js.undefined
}
object HeaderFooterLoadOptions {
  
  @scala.inline
  def apply(): HeaderFooterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterLoadOptions]
  }
  
  @scala.inline
  implicit class HeaderFooterLoadOptionsMutableBuilder[Self <: HeaderFooterLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setCenterFooter(value: Boolean): Self = StObject.set(x, "centerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterFooterUndefined: Self = StObject.set(x, "centerFooter", js.undefined)
    
    @scala.inline
    def setCenterHeader(value: Boolean): Self = StObject.set(x, "centerHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterHeaderUndefined: Self = StObject.set(x, "centerHeader", js.undefined)
    
    @scala.inline
    def setLeftFooter(value: Boolean): Self = StObject.set(x, "leftFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFooterUndefined: Self = StObject.set(x, "leftFooter", js.undefined)
    
    @scala.inline
    def setLeftHeader(value: Boolean): Self = StObject.set(x, "leftHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftHeaderUndefined: Self = StObject.set(x, "leftHeader", js.undefined)
    
    @scala.inline
    def setRightFooter(value: Boolean): Self = StObject.set(x, "rightFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFooterUndefined: Self = StObject.set(x, "rightFooter", js.undefined)
    
    @scala.inline
    def setRightHeader(value: Boolean): Self = StObject.set(x, "rightHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightHeaderUndefined: Self = StObject.set(x, "rightHeader", js.undefined)
  }
}
