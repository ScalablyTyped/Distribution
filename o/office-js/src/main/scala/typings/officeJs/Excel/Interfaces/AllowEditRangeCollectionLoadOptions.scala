package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the set of `AllowEditRange` objects found in a worksheet. `AllowEditRange` objects work with worksheet protection properties.
  When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait AllowEditRangeCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the range associated with the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the range.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the object is password protected.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var isPasswordProtected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the title of the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the title.
    If there is already an existing `AllowEditRange` with the same string, or if the string is `null` or empty (""), then this method throws an `InvalidArgument` error and fails to set the title.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
}
object AllowEditRangeCollectionLoadOptions {
  
  inline def apply(): AllowEditRangeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeCollectionLoadOptions]
  }
  
  extension [Self <: AllowEditRangeCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordProtectedUndefined: Self = StObject.set(x, "isPasswordProtected", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
