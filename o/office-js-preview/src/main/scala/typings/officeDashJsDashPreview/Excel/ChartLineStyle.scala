package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.automatic
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.continuous
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.dash
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.dashDot
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.dashDotDot
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.dot
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey25
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey50
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey75
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.none
import typings.officeDashJsDashPreview.Excel.ChartLineStyle.roundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartLineStyle")
@js.native
object ChartLineStyle extends js.Object {
  @js.native
  sealed trait automatic extends ChartLineStyle
  
  @js.native
  sealed trait continuous extends ChartLineStyle
  
  @js.native
  sealed trait dash extends ChartLineStyle
  
  @js.native
  sealed trait dashDot extends ChartLineStyle
  
  @js.native
  sealed trait dashDotDot extends ChartLineStyle
  
  @js.native
  sealed trait dot extends ChartLineStyle
  
  @js.native
  sealed trait grey25 extends ChartLineStyle
  
  @js.native
  sealed trait grey50 extends ChartLineStyle
  
  @js.native
  sealed trait grey75 extends ChartLineStyle
  
  @js.native
  sealed trait none extends ChartLineStyle
  
  @js.native
  sealed trait roundDot extends ChartLineStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartLineStyle with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
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
  
  /* "Grey25" */ @js.native
  object grey25 extends TopLevel[grey25 with String]
  
  /* "Grey50" */ @js.native
  object grey50 extends TopLevel[grey50 with String]
  
  /* "Grey75" */ @js.native
  object grey75 extends TopLevel[grey75 with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "RoundDot" */ @js.native
  object roundDot extends TopLevel[roundDot with String]
  
}

