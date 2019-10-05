package typings.officeDashJs.Excel

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
  
  /* "Automatic" */ val automatic: typings.officeDashJs.Excel.ChartMarkerStyle.automatic with String = js.native
  /* "Circle" */ val circle: typings.officeDashJs.Excel.ChartMarkerStyle.circle with String = js.native
  /* "Dash" */ val dash: typings.officeDashJs.Excel.ChartMarkerStyle.dash with String = js.native
  /* "Diamond" */ val diamond: typings.officeDashJs.Excel.ChartMarkerStyle.diamond with String = js.native
  /* "Dot" */ val dot: typings.officeDashJs.Excel.ChartMarkerStyle.dot with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ChartMarkerStyle.invalid with String = js.native
  /* "None" */ val none: typings.officeDashJs.Excel.ChartMarkerStyle.none with String = js.native
  /* "Picture" */ val picture: typings.officeDashJs.Excel.ChartMarkerStyle.picture with String = js.native
  /* "Plus" */ val plus: typings.officeDashJs.Excel.ChartMarkerStyle.plus with String = js.native
  /* "Square" */ val square: typings.officeDashJs.Excel.ChartMarkerStyle.square with String = js.native
  /* "Star" */ val star: typings.officeDashJs.Excel.ChartMarkerStyle.star with String = js.native
  /* "Triangle" */ val triangle: typings.officeDashJs.Excel.ChartMarkerStyle.triangle with String = js.native
  /* "X" */ val x: typings.officeDashJs.Excel.ChartMarkerStyle.x with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMarkerStyle with String] = js.native
}

