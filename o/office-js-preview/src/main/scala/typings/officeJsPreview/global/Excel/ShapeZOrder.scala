package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ShapeZOrder with String] = js.native
  
  /* "BringForward" */ val bringForward: typings.officeJsPreview.Excel.ShapeZOrder.bringForward with String = js.native
  
  /* "BringToFront" */ val bringToFront: typings.officeJsPreview.Excel.ShapeZOrder.bringToFront with String = js.native
  
  /* "SendBackward" */ val sendBackward: typings.officeJsPreview.Excel.ShapeZOrder.sendBackward with String = js.native
  
  /* "SendToBack" */ val sendToBack: typings.officeJsPreview.Excel.ShapeZOrder.sendToBack with String = js.native
}
