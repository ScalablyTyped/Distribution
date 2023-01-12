package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Down
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the direction that existing or remaining cells in a worksheet will shift when cells are inserted into or deleted from a worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
trait ChangeDirectionState extends StObject {
  
  /**
    * Represents the direction (such as up or to the left) that the remaining cells will shift when a cell or cells are deleted.
    Note：`insertShiftDirection` and `deleteShiftDirection` are exclusive and both enums can't have a value at the same time. If one has a value, then the other will return `undefined`.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var deleteShiftDirection: DeleteShiftDirection | Up | Left
  
  /**
    * Represents the direction (such as down or to the right) that the existing cells will shift when a new cell or cells are inserted.
    Note：`insertShiftDirection` and `deleteShiftDirection` are exclusive and both enums can't have a value at the same time. If one has a value, then the other will return `undefined`.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var insertShiftDirection: InsertShiftDirection | Down | Right
}
object ChangeDirectionState {
  
  inline def apply(
    deleteShiftDirection: DeleteShiftDirection | Up | Left,
    insertShiftDirection: InsertShiftDirection | Down | Right
  ): ChangeDirectionState = {
    val __obj = js.Dynamic.literal(deleteShiftDirection = deleteShiftDirection.asInstanceOf[js.Any], insertShiftDirection = insertShiftDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDirectionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeDirectionState] (val x: Self) extends AnyVal {
    
    inline def setDeleteShiftDirection(value: DeleteShiftDirection | Up | Left): Self = StObject.set(x, "deleteShiftDirection", value.asInstanceOf[js.Any])
    
    inline def setInsertShiftDirection(value: InsertShiftDirection | Down | Right): Self = StObject.set(x, "insertShiftDirection", value.asInstanceOf[js.Any])
  }
}
