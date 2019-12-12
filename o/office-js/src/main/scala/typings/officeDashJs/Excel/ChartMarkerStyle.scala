package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ChartMarkerStyle.automatic
import typings.officeDashJs.Excel.ChartMarkerStyle.circle
import typings.officeDashJs.Excel.ChartMarkerStyle.dash
import typings.officeDashJs.Excel.ChartMarkerStyle.diamond
import typings.officeDashJs.Excel.ChartMarkerStyle.dot
import typings.officeDashJs.Excel.ChartMarkerStyle.invalid
import typings.officeDashJs.Excel.ChartMarkerStyle.none
import typings.officeDashJs.Excel.ChartMarkerStyle.picture
import typings.officeDashJs.Excel.ChartMarkerStyle.plus
import typings.officeDashJs.Excel.ChartMarkerStyle.square
import typings.officeDashJs.Excel.ChartMarkerStyle.star
import typings.officeDashJs.Excel.ChartMarkerStyle.triangle
import typings.officeDashJs.Excel.ChartMarkerStyle.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMarkerStyle extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartMarkerStyle")
@js.native
object ChartMarkerStyle extends js.Object {
  @js.native
  sealed trait automatic extends ChartMarkerStyle
  
  @js.native
  sealed trait circle extends ChartMarkerStyle
  
  @js.native
  sealed trait dash extends ChartMarkerStyle
  
  @js.native
  sealed trait diamond extends ChartMarkerStyle
  
  @js.native
  sealed trait dot extends ChartMarkerStyle
  
  @js.native
  sealed trait invalid extends ChartMarkerStyle
  
  @js.native
  sealed trait none extends ChartMarkerStyle
  
  @js.native
  sealed trait picture extends ChartMarkerStyle
  
  @js.native
  sealed trait plus extends ChartMarkerStyle
  
  @js.native
  sealed trait square extends ChartMarkerStyle
  
  @js.native
  sealed trait star extends ChartMarkerStyle
  
  @js.native
  sealed trait triangle extends ChartMarkerStyle
  
  @js.native
  sealed trait x extends ChartMarkerStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMarkerStyle with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Circle" */ @js.native
  object circle extends TopLevel[circle with String]
  
  /* "Dash" */ @js.native
  object dash extends TopLevel[dash with String]
  
  /* "Diamond" */ @js.native
  object diamond extends TopLevel[diamond with String]
  
  /* "Dot" */ @js.native
  object dot extends TopLevel[dot with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Picture" */ @js.native
  object picture extends TopLevel[picture with String]
  
  /* "Plus" */ @js.native
  object plus extends TopLevel[plus with String]
  
  /* "Square" */ @js.native
  object square extends TopLevel[square with String]
  
  /* "Star" */ @js.native
  object star extends TopLevel[star with String]
  
  /* "Triangle" */ @js.native
  object triangle extends TopLevel[triangle with String]
  
  /* "X" */ @js.native
  object x extends TopLevel[x with String]
  
}

