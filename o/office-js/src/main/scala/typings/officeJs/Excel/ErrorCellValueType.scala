package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCellValueType extends StObject
/**
  * Represents the types of the `ErrorCellValue` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.ErrorCellValueType")
@js.native
object ErrorCellValueType extends StObject {
  
  /**
    * Represents a `BlockedErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait blocked
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `BusyErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait busy
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `CalcErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait calc
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `ConnectErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait connect
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `Div0ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait div0
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents an `ExternalErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait external
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `FieldErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait field
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `GettingDataErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait gettingData
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `NameErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait name
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `NotAvailableErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait notAvailable
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `NullErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait `null`
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `NumErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait num
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `PlaceholderErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait placeholder
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `RefErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait ref
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `SpillErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait spill
    extends StObject
       with ErrorCellValueType
  
  /**
    * Represents a `ValueErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait value
    extends StObject
       with ErrorCellValueType
}
