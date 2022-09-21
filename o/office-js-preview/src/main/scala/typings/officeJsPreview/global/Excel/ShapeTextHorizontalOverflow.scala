package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ShapeTextHorizontalOverflow & String] = js.native
  
  /* "Clip" */ val clip: typings.officeJsPreview.Excel.ShapeTextHorizontalOverflow.clip & String = js.native
  
  /* "Overflow" */ val overflow: typings.officeJsPreview.Excel.ShapeTextHorizontalOverflow.overflow & String = js.native
}
