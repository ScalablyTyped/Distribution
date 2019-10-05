package typings.officeDashJsDashPreview.Excel

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
  sealed trait scaleFromBottomRight extends ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromMiddle extends ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromTopLeft extends ShapeScaleFrom
  
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: typings.officeDashJsDashPreview.Excel.ShapeScaleFrom.scaleFromBottomRight with String = js.native
  /* "ScaleFromMiddle" */ val scaleFromMiddle: typings.officeDashJsDashPreview.Excel.ShapeScaleFrom.scaleFromMiddle with String = js.native
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: typings.officeDashJsDashPreview.Excel.ShapeScaleFrom.scaleFromTopLeft with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeScaleFrom with String] = js.native
}

