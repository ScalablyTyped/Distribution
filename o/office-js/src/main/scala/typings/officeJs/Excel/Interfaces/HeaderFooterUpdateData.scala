package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the HeaderFooter object, for use in `headerFooter.set({ ... })`. */
trait HeaderFooterUpdateData extends StObject {
  
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[String] = js.undefined
}
object HeaderFooterUpdateData {
  
  @scala.inline
  def apply(): HeaderFooterUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterUpdateData]
  }
  
  @scala.inline
  implicit class HeaderFooterUpdateDataMutableBuilder[Self <: HeaderFooterUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterFooter(value: String): Self = StObject.set(x, "centerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterFooterUndefined: Self = StObject.set(x, "centerFooter", js.undefined)
    
    @scala.inline
    def setCenterHeader(value: String): Self = StObject.set(x, "centerHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterHeaderUndefined: Self = StObject.set(x, "centerHeader", js.undefined)
    
    @scala.inline
    def setLeftFooter(value: String): Self = StObject.set(x, "leftFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFooterUndefined: Self = StObject.set(x, "leftFooter", js.undefined)
    
    @scala.inline
    def setLeftHeader(value: String): Self = StObject.set(x, "leftHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftHeaderUndefined: Self = StObject.set(x, "leftHeader", js.undefined)
    
    @scala.inline
    def setRightFooter(value: String): Self = StObject.set(x, "rightFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFooterUndefined: Self = StObject.set(x, "rightFooter", js.undefined)
    
    @scala.inline
    def setRightHeader(value: String): Self = StObject.set(x, "rightHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightHeaderUndefined: Self = StObject.set(x, "rightHeader", js.undefined)
  }
}
