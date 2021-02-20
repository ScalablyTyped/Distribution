package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Representation of a refresh mode.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.LinkedDataTypeRefreshMode")
@js.native
object LinkedDataTypeRefreshMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode with String] = js.native
  
  /* "Manual" */ val manual: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.manual with String = js.native
  
  /* "OnLoad" */ val onLoad: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.onLoad with String = js.native
  
  /* "Periodic" */ val periodic: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.periodic with String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode.unknown with String = js.native
}
