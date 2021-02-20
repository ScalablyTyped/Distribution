package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingType")
@js.native
object BindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.BindingType with String] = js.native
  
  /* "Range" */ val range: typings.officeJs.Excel.BindingType.range with String = js.native
  
  /* "Table" */ val table: typings.officeJs.Excel.BindingType.table with String = js.native
  
  /* "Text" */ val text: typings.officeJs.Excel.BindingType.text with String = js.native
}
