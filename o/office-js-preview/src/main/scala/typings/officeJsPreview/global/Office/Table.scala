package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of
  * {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.Table with Double] = js.native
  
  /* 0 */ val All: typings.officeJsPreview.Office.Table.All with Double = js.native
  
  /* 1 */ val Data: typings.officeJsPreview.Office.Table.Data with Double = js.native
  
  /* 2 */ val Headers: typings.officeJsPreview.Office.Table.Headers with Double = js.native
}
