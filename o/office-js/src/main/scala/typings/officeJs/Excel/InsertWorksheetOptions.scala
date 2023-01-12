package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Beginning
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options that define which worksheets to insert and where in the workbook the new worksheets will be inserted.
  *
  * @remarks
  * [Api set: ExcelApi 1.13]
  */
trait InsertWorksheetOptions extends StObject {
  
  /**
    * The insert position, in the current workbook, of the new worksheets. See `Excel.WorksheetPositionType` for details. The default position is "End".
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var positionType: js.UndefOr[WorksheetPositionType | None | Before | After | Beginning | End] = js.undefined
  
  /**
    * The worksheet in the current workbook that is referenced for the `WorksheetPositionType` parameter. The default is `null`. If the `relativeTo` parameter is not set, worksheets will be inserted based on `positionType`, at the start or end of the current workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var relativeTo: js.UndefOr[Worksheet | String] = js.undefined
  
  /**
    * The names of individual worksheets to insert. By default, all the worksheets from the source workbook are inserted.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var sheetNamesToInsert: js.UndefOr[js.Array[String]] = js.undefined
}
object InsertWorksheetOptions {
  
  inline def apply(): InsertWorksheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertWorksheetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertWorksheetOptions] (val x: Self) extends AnyVal {
    
    inline def setPositionType(value: WorksheetPositionType | None | Before | After | Beginning | End): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
    
    inline def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
    
    inline def setRelativeTo(value: Worksheet | String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setSheetNamesToInsert(value: js.Array[String]): Self = StObject.set(x, "sheetNamesToInsert", value.asInstanceOf[js.Any])
    
    inline def setSheetNamesToInsertUndefined: Self = StObject.set(x, "sheetNamesToInsert", js.undefined)
    
    inline def setSheetNamesToInsertVarargs(value: String*): Self = StObject.set(x, "sheetNamesToInsert", js.Array(value*))
  }
}
