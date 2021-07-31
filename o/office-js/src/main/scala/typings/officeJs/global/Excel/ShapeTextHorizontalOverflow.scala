package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextHorizontalOverflow & String] = js.native
  
  /* "Clip" */ val clip: typings.officeJs.Excel.ShapeTextHorizontalOverflow.clip & String = js.native
  
  /* "Overflow" */ val overflow: typings.officeJs.Excel.ShapeTextHorizontalOverflow.overflow & String = js.native
}
