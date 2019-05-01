package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  sealed trait scaleFromBottomRight
    extends officeDashJsLib.ExcelNs.ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromMiddle
    extends officeDashJsLib.ExcelNs.ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromTopLeft
    extends officeDashJsLib.ExcelNs.ShapeScaleFrom
  
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: scaleFromBottomRight with java.lang.String = js.native
  /* "ScaleFromMiddle" */ val scaleFromMiddle: scaleFromMiddle with java.lang.String = js.native
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: scaleFromTopLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeScaleFrom with java.lang.String] = js.native
}

