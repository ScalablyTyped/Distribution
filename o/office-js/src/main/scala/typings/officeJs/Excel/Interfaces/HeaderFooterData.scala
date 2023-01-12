package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `headerFooter.toJSON()`. */
trait HeaderFooterData extends StObject {
  
  /**
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[String] = js.undefined
  
  /**
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[String] = js.undefined
  
  /**
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[String] = js.undefined
  
  /**
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[String] = js.undefined
}
object HeaderFooterData {
  
  inline def apply(): HeaderFooterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderFooterData] (val x: Self) extends AnyVal {
    
    inline def setCenterFooter(value: String): Self = StObject.set(x, "centerFooter", value.asInstanceOf[js.Any])
    
    inline def setCenterFooterUndefined: Self = StObject.set(x, "centerFooter", js.undefined)
    
    inline def setCenterHeader(value: String): Self = StObject.set(x, "centerHeader", value.asInstanceOf[js.Any])
    
    inline def setCenterHeaderUndefined: Self = StObject.set(x, "centerHeader", js.undefined)
    
    inline def setLeftFooter(value: String): Self = StObject.set(x, "leftFooter", value.asInstanceOf[js.Any])
    
    inline def setLeftFooterUndefined: Self = StObject.set(x, "leftFooter", js.undefined)
    
    inline def setLeftHeader(value: String): Self = StObject.set(x, "leftHeader", value.asInstanceOf[js.Any])
    
    inline def setLeftHeaderUndefined: Self = StObject.set(x, "leftHeader", js.undefined)
    
    inline def setRightFooter(value: String): Self = StObject.set(x, "rightFooter", value.asInstanceOf[js.Any])
    
    inline def setRightFooterUndefined: Self = StObject.set(x, "rightFooter", js.undefined)
    
    inline def setRightHeader(value: String): Self = StObject.set(x, "rightHeader", value.asInstanceOf[js.Any])
    
    inline def setRightHeaderUndefined: Self = StObject.set(x, "rightHeader", js.undefined)
  }
}
