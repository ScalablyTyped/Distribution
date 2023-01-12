package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `allowEditRange.toJSON()`. */
trait AllowEditRangeData extends StObject {
  
  /**
    * Specifies the range associated with the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the range.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the object is password protected.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var isPasswordProtected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the title of the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the title.
    If there is already an existing `AllowEditRange` with the same string, or if the string is `null` or empty (""), then this method throws an `InvalidArgument` error and fails to set the title.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
}
object AllowEditRangeData {
  
  inline def apply(): AllowEditRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowEditRangeData] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordProtectedUndefined: Self = StObject.set(x, "isPasswordProtected", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
