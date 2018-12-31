package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageFittingMode extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.ImageFittingMode")
@js.native
object ImageFittingMode extends js.Object {
  @js.native
  sealed trait fill
    extends officeDashJsLib.ExcelNs.ImageFittingMode
  
  @js.native
  sealed trait fit
    extends officeDashJsLib.ExcelNs.ImageFittingMode
  
  @js.native
  sealed trait fitAndCenter
    extends officeDashJsLib.ExcelNs.ImageFittingMode
  
  /* "Fill" */ val fill: fill with java.lang.String = js.native
  /* "Fit" */ val fit: fit with java.lang.String = js.native
  /* "FitAndCenter" */ val fitAndCenter: fitAndCenter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ImageFittingMode with java.lang.String] = js.native
}

