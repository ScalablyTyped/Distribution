package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFittingMode with String] = js.native
  /* "Fill" */ @js.native
  object fill extends TopLevel[fill with String]
  
  /* "Fit" */ @js.native
  object fit extends TopLevel[fit with String]
  
  /* "FitAndCenter" */ @js.native
  object fitAndCenter extends TopLevel[fitAndCenter with String]
  
}

