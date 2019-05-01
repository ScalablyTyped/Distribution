package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeScaleType extends js.Object

/**
  *
  * Specifies whether the shape is scaled relative to its original or current size.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleType")
@js.native
object ShapeScaleType extends js.Object {
  @js.native
  sealed trait currentSize
    extends officeDashJsLib.ExcelNs.ShapeScaleType
  
  @js.native
  sealed trait originalSize
    extends officeDashJsLib.ExcelNs.ShapeScaleType
  
  /* "CurrentSize" */ val currentSize: currentSize with java.lang.String = js.native
  /* "OriginalSize" */ val originalSize: originalSize with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeScaleType with java.lang.String] = js.native
}

