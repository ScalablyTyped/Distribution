package typings.officeJsPreview.Excel

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
  
}

