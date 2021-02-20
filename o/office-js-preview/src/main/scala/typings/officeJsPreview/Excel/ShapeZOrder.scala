package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeZOrder extends StObject
/**
  *
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends StObject {
  
  @js.native
  sealed trait bringForward extends ShapeZOrder
  
  @js.native
  sealed trait bringToFront extends ShapeZOrder
  
  @js.native
  sealed trait sendBackward extends ShapeZOrder
  
  @js.native
  sealed trait sendToBack extends ShapeZOrder
}
