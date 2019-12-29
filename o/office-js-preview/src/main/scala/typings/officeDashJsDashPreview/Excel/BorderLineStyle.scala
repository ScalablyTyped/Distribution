package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderLineStyle")
@js.native
object BorderLineStyle extends js.Object {
  @js.native
  sealed trait continuous extends BorderLineStyle
  
  @js.native
  sealed trait dash extends BorderLineStyle
  
  @js.native
  sealed trait dashDot extends BorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends BorderLineStyle
  
  @js.native
  sealed trait dot extends BorderLineStyle
  
  @js.native
  sealed trait double extends BorderLineStyle
  
  @js.native
  sealed trait none extends BorderLineStyle
  
  @js.native
  sealed trait slantDashDot extends BorderLineStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLineStyle with String] = js.native
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
  
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "SlantDashDot" */ @js.native
  object slantDashDot extends TopLevel[slantDashDot with String]
  
}

