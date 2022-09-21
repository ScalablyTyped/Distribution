package typings.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.QueryError & String] = js.native
  
  /* "FailedDownload" */ val failedDownload: typings.officeJs.Excel.QueryError.failedDownload & String = js.native
  
  /* "FailedLoadToDataModel" */ val failedLoadToDataModel: typings.officeJs.Excel.QueryError.failedLoadToDataModel & String = js.native
  
  /* "FailedLoadToWorksheet" */ val failedLoadToWorksheet: typings.officeJs.Excel.QueryError.failedLoadToWorksheet & String = js.native
  
  /* "FailedToCompleteDownload" */ val failedToCompleteDownload: typings.officeJs.Excel.QueryError.failedToCompleteDownload & String = js.native
  
  /* "None" */ val none: typings.officeJs.Excel.QueryError.none & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.QueryError.unknown & String = js.native
}
