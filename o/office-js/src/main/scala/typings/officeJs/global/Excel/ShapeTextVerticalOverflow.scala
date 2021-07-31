package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the vertical overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalOverflow")
@js.native
object ShapeTextVerticalOverflow extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextVerticalOverflow & String] = js.native
  
  /* "Clip" */ val clip: typings.officeJs.Excel.ShapeTextVerticalOverflow.clip & String = js.native
  
  /* "Ellipsis" */ val ellipsis: typings.officeJs.Excel.ShapeTextVerticalOverflow.ellipsis & String = js.native
  
  /* "Overflow" */ val overflow: typings.officeJs.Excel.ShapeTextVerticalOverflow.overflow & String = js.native
}
