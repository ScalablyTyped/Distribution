package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeScaleType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeScaleType")
@js.native
object ShapeScaleType extends js.Object {
  @js.native
  sealed trait currentSize
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeScaleType
  
  @js.native
  sealed trait originalSize
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeScaleType
  
  /* "CurrentSize" */ val currentSize: currentSize with java.lang.String = js.native
  /* "OriginalSize" */ val originalSize: originalSize with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeScaleType with java.lang.String] = js.native
}

