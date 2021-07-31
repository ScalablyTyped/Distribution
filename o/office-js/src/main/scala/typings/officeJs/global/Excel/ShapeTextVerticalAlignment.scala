package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextVerticalAlignment & String] = js.native
  
  /* "Bottom" */ val bottom: typings.officeJs.Excel.ShapeTextVerticalAlignment.bottom & String = js.native
  
  /* "Distributed" */ val distributed: typings.officeJs.Excel.ShapeTextVerticalAlignment.distributed & String = js.native
  
  /* "Justified" */ val justified: typings.officeJs.Excel.ShapeTextVerticalAlignment.justified & String = js.native
  
  /* "Middle" */ val middle: typings.officeJs.Excel.ShapeTextVerticalAlignment.middle & String = js.native
  
  /* "Top" */ val top: typings.officeJs.Excel.ShapeTextVerticalAlignment.top & String = js.native
}
