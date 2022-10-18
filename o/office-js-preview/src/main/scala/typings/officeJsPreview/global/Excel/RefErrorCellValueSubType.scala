package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #REF! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.RefErrorCellValueSubType")
@js.native
object RefErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.RefErrorCellValueSubType & String] = js.native
  
  /* "ExternalLinksCalculatedRef" */ val externalLinksCalculatedRef: typings.officeJsPreview.Excel.RefErrorCellValueSubType.externalLinksCalculatedRef & String = js.native
  
  /* "ExternalLinksStructuredRef" */ val externalLinksStructuredRef: typings.officeJsPreview.Excel.RefErrorCellValueSubType.externalLinksStructuredRef & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.RefErrorCellValueSubType.unknown & String = js.native
}
