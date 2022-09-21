package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryError extends StObject
/**
  * An enum that specifies the query load error message.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.QueryError")
@js.native
object QueryError extends StObject {
  
  /**
    * Download failed.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait failedDownload
    extends StObject
       with QueryError
  
  /**
    * Load to the data model failed.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait failedLoadToDataModel
    extends StObject
       with QueryError
  
  /**
    * Load to the worksheet failed.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait failedLoadToWorksheet
    extends StObject
       with QueryError
  
  /**
    * Download did not complete.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait failedToCompleteDownload
    extends StObject
       with QueryError
  
  /**
    * No error.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait none
    extends StObject
       with QueryError
  
  /**
    * Unknown error.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with QueryError
}
