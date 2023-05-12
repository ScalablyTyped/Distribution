package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellValueType extends StObject
/**
  * Represents the types of the `CellValue` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.CellValueType")
@js.native
object CellValueType extends StObject {
  
  /**
    * Represents an `ArrayCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait array
    extends StObject
       with CellValueType
  
  /**
    * Represents a `BooleanCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait boolean
    extends StObject
       with CellValueType
  
  /**
    * Represents a `DoubleCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait double
    extends StObject
       with CellValueType
  
  /**
    * Represents an `EmptyCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait empty
    extends StObject
       with CellValueType
  
  /**
    * Represents an `EntityCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait entity
    extends StObject
       with CellValueType
  
  /**
    * Represents an `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait error
    extends StObject
       with CellValueType
  
  /**
    * Represents a `FormattedNumberCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait formattedNumber
    extends StObject
       with CellValueType
  
  /**
    * Represents a `LinkedEntityCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait linkedEntity
    extends StObject
       with CellValueType
  
  /**
    * Represents a `LocalImageCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait localImage
    extends StObject
       with CellValueType
  
  /**
    * Represents a `ValueTypeNotAvailableCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait notAvailable
    extends StObject
       with CellValueType
  
  /**
    * Represents a `ReferenceCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait reference
    extends StObject
       with CellValueType
  
  /**
    * Represents a `StringCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait string
    extends StObject
       with CellValueType
  
  /**
    * Represents a `WebImageCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait webImage
    extends StObject
       with CellValueType
}
