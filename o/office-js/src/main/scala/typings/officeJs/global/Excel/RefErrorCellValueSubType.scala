package typings.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.RefErrorCellValueSubType & String] = js.native
  
  /* "ExternalLinksCalculatedRef" */ val externalLinksCalculatedRef: typings.officeJs.Excel.RefErrorCellValueSubType.externalLinksCalculatedRef & String = js.native
  
  /* "ExternalLinksStructuredRef" */ val externalLinksStructuredRef: typings.officeJs.Excel.RefErrorCellValueSubType.externalLinksStructuredRef & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.RefErrorCellValueSubType.unknown & String = js.native
}
