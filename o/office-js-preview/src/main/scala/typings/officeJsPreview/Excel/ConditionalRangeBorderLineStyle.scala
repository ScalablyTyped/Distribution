package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeBorderLineStyle with String] = js.native
  /* "Continuous" */ @js.native
  object continuous extends TopLevel[continuous with String]
  
  /* "Dash" */ @js.native
  object dash extends TopLevel[dash with String]
  
  /* "DashDot" */ @js.native
  object dashDot extends TopLevel[dashDot with String]
  
  /* "DashDotDot" */ @js.native
  object dashDotDot extends TopLevel[dashDotDot with String]
  
  /* "Dot" */ @js.native
  object dot extends TopLevel[dot with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
}

