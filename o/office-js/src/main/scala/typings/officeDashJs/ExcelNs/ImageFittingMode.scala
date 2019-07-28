package typings.officeDashJs.ExcelNs

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
  sealed trait fill extends ImageFittingMode
  
  @js.native
  sealed trait fit extends ImageFittingMode
  
  @js.native
  sealed trait fitAndCenter extends ImageFittingMode
  
  /* "Fill" */ val fill: typings.officeDashJs.ExcelNs.ImageFittingMode.fill with String = js.native
  /* "Fit" */ val fit: typings.officeDashJs.ExcelNs.ImageFittingMode.fit with String = js.native
  /* "FitAndCenter" */ val fitAndCenter: typings.officeDashJs.ExcelNs.ImageFittingMode.fitAndCenter with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFittingMode with String] = js.native
}

