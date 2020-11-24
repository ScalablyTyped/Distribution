package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the way that an object is attached to its underlying cells.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.Placement with String] = js.native
  
  /* "Absolute" */ val absolute: typings.officeJs.Excel.Placement.absolute with String = js.native
  
  /* "OneCell" */ val oneCell: typings.officeJs.Excel.Placement.oneCell with String = js.native
  
  /* "TwoCell" */ val twoCell: typings.officeJs.Excel.Placement.twoCell with String = js.native
}
