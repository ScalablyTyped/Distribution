package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the refresh mode of the workbook links.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@JSGlobal("Excel.WorkbookLinksRefreshMode")
@js.native
object WorkbookLinksRefreshMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.WorkbookLinksRefreshMode & String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.WorkbookLinksRefreshMode.automatic & String = js.native
  
  /* "Manual" */ val manual: typings.officeJsPreview.Excel.WorkbookLinksRefreshMode.manual & String = js.native
}
