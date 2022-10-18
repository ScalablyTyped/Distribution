package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #FIELD! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.FieldErrorCellValueSubType")
@js.native
object FieldErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.FieldErrorCellValueSubType & String] = js.native
  
  /* "DataProviderError" */ val dataProviderError: typings.officeJsPreview.Excel.FieldErrorCellValueSubType.dataProviderError & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.FieldErrorCellValueSubType.unknown & String = js.native
  
  /* "WebImageMissingFilePart" */ val webImageMissingFilePart: typings.officeJsPreview.Excel.FieldErrorCellValueSubType.webImageMissingFilePart & String = js.native
}
