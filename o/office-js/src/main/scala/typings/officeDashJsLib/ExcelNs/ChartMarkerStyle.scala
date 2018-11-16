package typings
package officeDashJsLib.ExcelNs

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
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait circle
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait dash
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait diamond
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait dot
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait picture
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait plus
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait square
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait star
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait triangle
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  @js.native
  sealed trait x
    extends officeDashJsLib.ExcelNs.ChartMarkerStyle
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Circle" */ val circle: circle with java.lang.String = js.native
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "Diamond" */ val diamond: diamond with java.lang.String = js.native
  /* "Dot" */ val dot: dot with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Picture" */ val picture: picture with java.lang.String = js.native
  /* "Plus" */ val plus: plus with java.lang.String = js.native
  /* "Square" */ val square: square with java.lang.String = js.native
  /* "Star" */ val star: star with java.lang.String = js.native
  /* "Triangle" */ val triangle: triangle with java.lang.String = js.native
  /* "X" */ val x: x with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartMarkerStyle with java.lang.String] = js.native
}

