package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.WorksheetProtectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetProtection.toJSON()`. */
trait WorksheetProtectionData extends StObject {
  
  /**
    * Specifies the `AllowEditRangeCollection` object found in this worksheet. This is a collection of `AllowEditRange` objects, which work with worksheet protection properties.
    When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var allowEditRanges: js.UndefOr[js.Array[AllowEditRangeData]] = js.undefined
  
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
  var options: js.UndefOr[WorksheetProtectionOptions] = js.undefined
  
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
  var savedOptions: js.UndefOr[WorksheetProtectionOptions] = js.undefined
}
object WorksheetProtectionData {
  
  inline def apply(): WorksheetProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionData]
  }
  
  extension [Self <: WorksheetProtectionData](x: Self) {
    
    inline def setAllowEditRanges(value: js.Array[AllowEditRangeData]): Self = StObject.set(x, "allowEditRanges", value.asInstanceOf[js.Any])
    
    inline def setAllowEditRangesUndefined: Self = StObject.set(x, "allowEditRanges", js.undefined)
    
    inline def setAllowEditRangesVarargs(value: AllowEditRangeData*): Self = StObject.set(x, "allowEditRanges", js.Array(value*))
    
    inline def setCanPauseProtection(value: Boolean): Self = StObject.set(x, "canPauseProtection", value.asInstanceOf[js.Any])
    
    inline def setCanPauseProtectionUndefined: Self = StObject.set(x, "canPauseProtection", js.undefined)
    
    inline def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordProtectedUndefined: Self = StObject.set(x, "isPasswordProtected", js.undefined)
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
    
    inline def setOptions(value: WorksheetProtectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setSavedOptions(value: WorksheetProtectionOptions): Self = StObject.set(x, "savedOptions", value.asInstanceOf[js.Any])
    
    inline def setSavedOptionsUndefined: Self = StObject.set(x, "savedOptions", js.undefined)
  }
}
