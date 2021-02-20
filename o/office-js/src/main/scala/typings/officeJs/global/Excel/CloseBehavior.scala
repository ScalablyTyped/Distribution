package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the close behavior for Workbook.close API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CloseBehavior with String] = js.native
  
  /* "Save" */ val save: typings.officeJs.Excel.CloseBehavior.save with String = js.native
  
  /* "SkipSave" */ val skipSave: typings.officeJs.Excel.CloseBehavior.skipSave with String = js.native
}
