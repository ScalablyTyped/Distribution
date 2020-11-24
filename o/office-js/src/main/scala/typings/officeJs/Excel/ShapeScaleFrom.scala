package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeScaleFrom extends js.Object
/**
  *
  * Specifies which part of the shape retains its position when the shape is scaled.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends js.Object {
  
  @js.native
  sealed trait scaleFromBottomRight extends ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromMiddle extends ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromTopLeft extends ShapeScaleFrom
}
