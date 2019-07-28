package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.automatic with String = js.native
  /* "Circle" */ val circle: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.circle with String = js.native
  /* "Dash" */ val dash: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.dash with String = js.native
  /* "Diamond" */ val diamond: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.diamond with String = js.native
  /* "Dot" */ val dot: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.dot with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.invalid with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.none with String = js.native
  /* "Picture" */ val picture: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.picture with String = js.native
  /* "Plus" */ val plus: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.plus with String = js.native
  /* "Square" */ val square: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.square with String = js.native
  /* "Star" */ val star: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.star with String = js.native
  /* "Triangle" */ val triangle: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.triangle with String = js.native
  /* "X" */ val x: typings.officeDashJsDashPreview.ExcelNs.ChartMarkerStyle.x with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMarkerStyle with String] = js.native
}

