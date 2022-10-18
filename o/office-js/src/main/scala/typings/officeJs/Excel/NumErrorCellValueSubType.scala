package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumErrorCellValueSubType extends StObject
/**
  * Represents types of #NUM! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.NumErrorCellValueSubType")
@js.native
object NumErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by a cell's formula having an array parameter with too many rows or columns. The maximum number of rows and columns in an array parameter is 1048576. Displays as error type #NUM! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait arrayTooLarge
    extends StObject
       with NumErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #NUM! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with NumErrorCellValueSubType
}
