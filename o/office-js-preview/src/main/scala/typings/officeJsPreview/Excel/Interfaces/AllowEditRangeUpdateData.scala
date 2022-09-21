package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the AllowEditRange object, for use in `allowEditRange.set({ ... })`. */
trait AllowEditRangeUpdateData extends StObject {
  
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
object AllowEditRangeUpdateData {
  
  inline def apply(): AllowEditRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeUpdateData]
  }
  
  extension [Self <: AllowEditRangeUpdateData](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
