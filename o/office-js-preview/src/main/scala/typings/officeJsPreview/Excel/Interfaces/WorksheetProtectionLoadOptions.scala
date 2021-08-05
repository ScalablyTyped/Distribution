package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object WorksheetProtectionLoadOptions {
  
  inline def apply(): WorksheetProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionLoadOptions]
  }
  
  extension [Self <: WorksheetProtectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setOptions(value: Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
