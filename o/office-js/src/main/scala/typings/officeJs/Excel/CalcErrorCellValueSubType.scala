package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalcErrorCellValueSubType extends StObject
/**
  * Represents types of #CALC! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.CalcErrorCellValueSubType")
@js.native
object CalcErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by including an array in an array. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait arrayOfArrays
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by including a range in an array. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait arrayOfRanges
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by a data table referencing a pending formula. The pending formula is likely asynchronous. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait dataTableReferencedPendingFormula
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by an empty array. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait emptyArray
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by a cell's formula evaluating to a lambda value. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait lambdaInCell
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by a cell's formula returning a string that exceeds the maximum of 32767 characters. Displays as error type #CALC! in Excel.
    * Some characters, like emoji, may appear to be one character in the Excel UI but are actually processed as surrogate characters. A surrogate character counts as multiple characters toward the maximum character limit.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait textOverflow
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by a `CellValue` object that is too deeply nested within another `CellValue`. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait tooDeeplyNested
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by a function referencing too many cells. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait tooManyCells
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with CalcErrorCellValueSubType
  
  /**
    * An error caused by attempting to lift an unsupported formula (such as a Dynamic UDF) over an array. Displays as error type #CALC! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unsupportedLifting
    extends StObject
       with CalcErrorCellValueSubType
}
