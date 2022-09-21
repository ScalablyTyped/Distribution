package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a refresh mode.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.LinkedDataTypeRefreshMode")
@js.native
object LinkedDataTypeRefreshMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode & String] = js.native
  
  /* "Manual" */ val manual: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.manual & String = js.native
  
  /* "OnLoad" */ val onLoad: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.onLoad & String = js.native
  
  /* "Periodic" */ val periodic: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.periodic & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.unknown & String = js.native
}
