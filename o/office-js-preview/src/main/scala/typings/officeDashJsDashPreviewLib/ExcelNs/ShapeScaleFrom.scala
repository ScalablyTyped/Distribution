package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeScaleFrom extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends js.Object {
  @js.native
  sealed trait scaleFromBottomRight
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromMiddle
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromTopLeft
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeScaleFrom
  
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: scaleFromBottomRight with java.lang.String = js.native
  /* "ScaleFromMiddle" */ val scaleFromMiddle: scaleFromMiddle with java.lang.String = js.native
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: scaleFromTopLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeScaleFrom with java.lang.String] = js.native
}

