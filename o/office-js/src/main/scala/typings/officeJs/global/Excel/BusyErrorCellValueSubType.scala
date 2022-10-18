package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #BUSY! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.BusyErrorCellValueSubType")
@js.native
object BusyErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.BusyErrorCellValueSubType & String] = js.native
  
  /* "ExternalLinksGeneric" */ val externalLinksGeneric: typings.officeJs.Excel.BusyErrorCellValueSubType.externalLinksGeneric & String = js.native
  
  /* "LoadingImage" */ val loadingImage: typings.officeJs.Excel.BusyErrorCellValueSubType.loadingImage & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.BusyErrorCellValueSubType.unknown & String = js.native
}
