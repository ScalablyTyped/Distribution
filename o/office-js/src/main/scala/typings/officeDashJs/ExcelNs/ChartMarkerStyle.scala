package typings.officeDashJs.ExcelNs

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
  
  /* "Automatic" */ val automatic: typings.officeDashJs.ExcelNs.ChartMarkerStyle.automatic with String = js.native
  /* "Circle" */ val circle: typings.officeDashJs.ExcelNs.ChartMarkerStyle.circle with String = js.native
  /* "Dash" */ val dash: typings.officeDashJs.ExcelNs.ChartMarkerStyle.dash with String = js.native
  /* "Diamond" */ val diamond: typings.officeDashJs.ExcelNs.ChartMarkerStyle.diamond with String = js.native
  /* "Dot" */ val dot: typings.officeDashJs.ExcelNs.ChartMarkerStyle.dot with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.ExcelNs.ChartMarkerStyle.invalid with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.ChartMarkerStyle.none with String = js.native
  /* "Picture" */ val picture: typings.officeDashJs.ExcelNs.ChartMarkerStyle.picture with String = js.native
  /* "Plus" */ val plus: typings.officeDashJs.ExcelNs.ChartMarkerStyle.plus with String = js.native
  /* "Square" */ val square: typings.officeDashJs.ExcelNs.ChartMarkerStyle.square with String = js.native
  /* "Star" */ val star: typings.officeDashJs.ExcelNs.ChartMarkerStyle.star with String = js.native
  /* "Triangle" */ val triangle: typings.officeDashJs.ExcelNs.ChartMarkerStyle.triangle with String = js.native
  /* "X" */ val x: typings.officeDashJs.ExcelNs.ChartMarkerStyle.x with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMarkerStyle with String] = js.native
}

