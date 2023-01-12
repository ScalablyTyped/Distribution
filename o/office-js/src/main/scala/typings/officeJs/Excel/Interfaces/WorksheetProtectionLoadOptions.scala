package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the protection of a worksheet object.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if protection can be paused for this worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var canPauseProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the sheet is password protected.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var isPasswordProtected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if worksheet protection is paused.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var isPaused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the protection options for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the worksheet is protected.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the protection options saved in the worksheet.
    This will return the same `WorksheetProtectionOptions` object regardless of the worksheet protection state.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var savedOptions: js.UndefOr[Boolean] = js.undefined
}
object WorksheetProtectionLoadOptions {
  
  inline def apply(): WorksheetProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetProtectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCanPauseProtection(value: Boolean): Self = StObject.set(x, "canPauseProtection", value.asInstanceOf[js.Any])
    
    inline def setCanPauseProtectionUndefined: Self = StObject.set(x, "canPauseProtection", js.undefined)
    
    inline def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordProtectedUndefined: Self = StObject.set(x, "isPasswordProtected", js.undefined)
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
    
    inline def setOptions(value: Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setSavedOptions(value: Boolean): Self = StObject.set(x, "savedOptions", value.asInstanceOf[js.Any])
    
    inline def setSavedOptionsUndefined: Self = StObject.set(x, "savedOptions", js.undefined)
  }
}
