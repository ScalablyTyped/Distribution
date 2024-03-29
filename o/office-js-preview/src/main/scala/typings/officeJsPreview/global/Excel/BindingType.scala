package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingType")
@js.native
object BindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.BindingType & String] = js.native
  
  /* "Range" */ val range: typings.officeJsPreview.Excel.BindingType.range & String = js.native
  
  /* "Table" */ val table: typings.officeJsPreview.Excel.BindingType.table & String = js.native
  
  /* "Text" */ val text: typings.officeJsPreview.Excel.BindingType.text & String = js.native
}
