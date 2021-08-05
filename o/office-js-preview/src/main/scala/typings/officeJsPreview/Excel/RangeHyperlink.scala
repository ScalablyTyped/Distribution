package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the necessary strings to get/set a hyperlink (XHL) object.
  *
  * [Api set: ExcelApi 1.7]
  */
trait RangeHyperlink extends StObject {
  
  /**
    *
    * Represents the url target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the document reference target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var documentReference: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the string displayed when hovering over the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var screenTip: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the string that is displayed in the top left most cell in the range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textToDisplay: js.UndefOr[String] = js.undefined
}
object RangeHyperlink {
  
  inline def apply(): RangeHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeHyperlink]
  }
  
  extension [Self <: RangeHyperlink](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDocumentReference(value: String): Self = StObject.set(x, "documentReference", value.asInstanceOf[js.Any])
    
    inline def setDocumentReferenceUndefined: Self = StObject.set(x, "documentReference", js.undefined)
    
    inline def setScreenTip(value: String): Self = StObject.set(x, "screenTip", value.asInstanceOf[js.Any])
    
    inline def setScreenTipUndefined: Self = StObject.set(x, "screenTip", js.undefined)
    
    inline def setTextToDisplay(value: String): Self = StObject.set(x, "textToDisplay", value.asInstanceOf[js.Any])
    
    inline def setTextToDisplayUndefined: Self = StObject.set(x, "textToDisplay", js.undefined)
  }
}
