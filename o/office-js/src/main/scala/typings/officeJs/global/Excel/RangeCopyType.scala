package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeCopyType")
@js.native
object RangeCopyType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.RangeCopyType with String] = js.native
  
  /* "All" */ val all: typings.officeJs.Excel.RangeCopyType.all with String = js.native
  
  /* "Formats" */ val formats: typings.officeJs.Excel.RangeCopyType.formats with String = js.native
  
  /* "Formulas" */ val formulas: typings.officeJs.Excel.RangeCopyType.formulas with String = js.native
  
  /* "Values" */ val values: typings.officeJs.Excel.RangeCopyType.values with String = js.native
}
