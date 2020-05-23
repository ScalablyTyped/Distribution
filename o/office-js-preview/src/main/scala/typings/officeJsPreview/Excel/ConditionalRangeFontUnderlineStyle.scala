package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeFontUnderlineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeFontUnderlineStyle")
@js.native
object ConditionalRangeFontUnderlineStyle extends js.Object {
  @js.native
  sealed trait double extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait none extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait single extends ConditionalRangeFontUnderlineStyle
  
}

