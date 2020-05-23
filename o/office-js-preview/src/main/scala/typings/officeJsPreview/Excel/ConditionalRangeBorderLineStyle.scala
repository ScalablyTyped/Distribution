package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeBorderLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorderLineStyle")
@js.native
object ConditionalRangeBorderLineStyle extends js.Object {
  @js.native
  sealed trait continuous extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dash extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait none extends ConditionalRangeBorderLineStyle
  
}

