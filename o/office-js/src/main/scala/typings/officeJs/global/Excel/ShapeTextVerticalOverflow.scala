package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the vertical overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalOverflow")
@js.native
object ShapeTextVerticalOverflow extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextVerticalOverflow with String] = js.native
  
  /* "Clip" */ val clip: typings.officeJs.Excel.ShapeTextVerticalOverflow.clip with String = js.native
  
  /* "Ellipsis" */ val ellipsis: typings.officeJs.Excel.ShapeTextVerticalOverflow.ellipsis with String = js.native
  
  /* "Overflow" */ val overflow: typings.officeJs.Excel.ShapeTextVerticalOverflow.overflow with String = js.native
}
