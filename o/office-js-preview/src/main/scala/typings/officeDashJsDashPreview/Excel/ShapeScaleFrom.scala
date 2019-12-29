package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeScaleFrom with String] = js.native
  /* "ScaleFromBottomRight" */ @js.native
  object scaleFromBottomRight extends TopLevel[scaleFromBottomRight with String]
  
  /* "ScaleFromMiddle" */ @js.native
  object scaleFromMiddle extends TopLevel[scaleFromMiddle with String]
  
  /* "ScaleFromTopLeft" */ @js.native
  object scaleFromTopLeft extends TopLevel[scaleFromTopLeft with String]
  
}

