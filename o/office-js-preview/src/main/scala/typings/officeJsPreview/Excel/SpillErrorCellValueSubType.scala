package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpillErrorCellValueSubType extends StObject
/**
  * Represents types of #SPILL! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.SpillErrorCellValueSubType")
@js.native
object SpillErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by a dynamic array attempting to spill data into a cell that isn't empty. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait collision
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An error caused by a dynamic array formula that can't be evaluated in a single calculation. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait indeterminateSize
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An error caused by a merged cell blocking a dynamic array. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait mergedCell
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An error caused by insufficient memory when attempting to calculate a dynamic array formula. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait outOfMemoryWhileCalc
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An error caused by entering a dynamic array formula in a table. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait table
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with SpillErrorCellValueSubType
  
  /**
    * An error caused by a dynamic array attempting to spill over the edge of the worksheet. Displays as error type #SPILL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait worksheetEdge
    extends StObject
       with SpillErrorCellValueSubType
}
