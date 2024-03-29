package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of
  * {@link https://learn.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.Table & Double] = js.native
  
  /* 0 */ val All: typings.officeJs.Office.Table.All & Double = js.native
  
  /* 1 */ val Data: typings.officeJs.Office.Table.Data & Double = js.native
  
  /* 2 */ val Headers: typings.officeJs.Office.Table.Headers & Double = js.native
}
