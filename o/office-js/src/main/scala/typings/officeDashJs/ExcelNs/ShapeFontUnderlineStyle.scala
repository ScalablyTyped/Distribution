package typings.officeDashJs.ExcelNs

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
  sealed trait dash extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashHeavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashLong extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dashLongHeavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDash extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDashHeavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDotDash extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotDotDashHeavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dotted extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait dottedHeavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait double extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait heavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait none extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait single extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavy extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavyDouble extends ShapeFontUnderlineStyle
  
  @js.native
  sealed trait wavyHeavy extends ShapeFontUnderlineStyle
  
  /* "Dash" */ val dash: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dash with String = js.native
  /* "DashHeavy" */ val dashHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dashHeavy with String = js.native
  /* "DashLong" */ val dashLong: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dashLong with String = js.native
  /* "DashLongHeavy" */ val dashLongHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dashLongHeavy with String = js.native
  /* "DotDash" */ val dotDash: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dotDash with String = js.native
  /* "DotDashHeavy" */ val dotDashHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dotDashHeavy with String = js.native
  /* "DotDotDash" */ val dotDotDash: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dotDotDash with String = js.native
  /* "DotDotDashHeavy" */ val dotDotDashHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dotDotDashHeavy with String = js.native
  /* "Dotted" */ val dotted: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dotted with String = js.native
  /* "DottedHeavy" */ val dottedHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.dottedHeavy with String = js.native
  /* "Double" */ val double: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.double with String = js.native
  /* "Heavy" */ val heavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.heavy with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.none with String = js.native
  /* "Single" */ val single: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.single with String = js.native
  /* "Wavy" */ val wavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.wavy with String = js.native
  /* "WavyDouble" */ val wavyDouble: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.wavyDouble with String = js.native
  /* "WavyHeavy" */ val wavyHeavy: typings.officeDashJs.ExcelNs.ShapeFontUnderlineStyle.wavyHeavy with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeFontUnderlineStyle with String] = js.native
}

