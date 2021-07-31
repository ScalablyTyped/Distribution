package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the save behavior for Workbook.save API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.SaveBehavior & String] = js.native
  
  /* "Prompt" */ val prompt: typings.officeJsPreview.Excel.SaveBehavior.prompt & String = js.native
  
  /* "Save" */ val save: typings.officeJsPreview.Excel.SaveBehavior.save & String = js.native
}
