package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeFontUnderlineStyle extends js.Object

/**
  *
  * The type of underline applied to a font.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFontUnderlineStyle")
@js.native
object ShapeFontUnderlineStyle extends js.Object {
  @js.native
  sealed trait dash
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashLong
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashLongHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDash
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDashHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDotDash
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDotDashHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotted
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dottedHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait double
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait heavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait single
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavyDouble
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavyHeavy
    extends officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle
  
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "DashHeavy" */ val dashHeavy: dashHeavy with java.lang.String = js.native
  /* "DashLong" */ val dashLong: dashLong with java.lang.String = js.native
  /* "DashLongHeavy" */ val dashLongHeavy: dashLongHeavy with java.lang.String = js.native
  /* "DotDash" */ val dotDash: dotDash with java.lang.String = js.native
  /* "DotDashHeavy" */ val dotDashHeavy: dotDashHeavy with java.lang.String = js.native
  /* "DotDotDash" */ val dotDotDash: dotDotDash with java.lang.String = js.native
  /* "DotDotDashHeavy" */ val dotDotDashHeavy: dotDotDashHeavy with java.lang.String = js.native
  /* "Dotted" */ val dotted: dotted with java.lang.String = js.native
  /* "DottedHeavy" */ val dottedHeavy: dottedHeavy with java.lang.String = js.native
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "Heavy" */ val heavy: heavy with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  /* "Wavy" */ val wavy: wavy with java.lang.String = js.native
  /* "WavyDouble" */ val wavyDouble: wavyDouble with java.lang.String = js.native
  /* "WavyHeavy" */ val wavyHeavy: wavyHeavy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle with java.lang.String] = js.native
}

