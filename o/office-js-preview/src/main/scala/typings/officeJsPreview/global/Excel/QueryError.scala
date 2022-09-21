package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum that specifies the query load error message.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.QueryError")
@js.native
object QueryError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.QueryError & String] = js.native
  
  /* "FailedDownload" */ val failedDownload: typings.officeJsPreview.Excel.QueryError.failedDownload & String = js.native
  
  /* "FailedLoadToDataModel" */ val failedLoadToDataModel: typings.officeJsPreview.Excel.QueryError.failedLoadToDataModel & String = js.native
  
  /* "FailedLoadToWorksheet" */ val failedLoadToWorksheet: typings.officeJsPreview.Excel.QueryError.failedLoadToWorksheet & String = js.native
  
  /* "FailedToCompleteDownload" */ val failedToCompleteDownload: typings.officeJsPreview.Excel.QueryError.failedToCompleteDownload & String = js.native
  
  /* "None" */ val none: typings.officeJsPreview.Excel.QueryError.none & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.QueryError.unknown & String = js.native
}
