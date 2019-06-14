package typings
package openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoundingMode extends js.Object

/**
  * Specifies a rounding behavior for numerical operations capable of discarding precision. Each
  * rounding mode in this object indicates how the leastsignificant returned digits of rounded result is
  * to be calculated.
  */
@JSGlobal("sap.ui.core.format.NumberFormat.RoundingMode")
@js.native
object RoundingMode extends js.Object {
  @js.native
  sealed trait AWAY_FROM_ZERO
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait CEILING
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait FLOOR
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait HALF_AWAY_FROM_ZERO
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait HALF_CEILING
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait HALF_FLOOR
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait HALF_TOWARDS_ZERO
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  @js.native
  sealed trait TOWARDS_ZERO
    extends openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode
  
  /* 0 */ val AWAY_FROM_ZERO: AWAY_FROM_ZERO with scala.Double = js.native
  /* 1 */ val CEILING: CEILING with scala.Double = js.native
  /* 2 */ val FLOOR: FLOOR with scala.Double = js.native
  /* 3 */ val HALF_AWAY_FROM_ZERO: HALF_AWAY_FROM_ZERO with scala.Double = js.native
  /* 4 */ val HALF_CEILING: HALF_CEILING with scala.Double = js.native
  /* 5 */ val HALF_FLOOR: HALF_FLOOR with scala.Double = js.native
  /* 6 */ val HALF_TOWARDS_ZERO: HALF_TOWARDS_ZERO with scala.Double = js.native
  /* 7 */ val TOWARDS_ZERO: TOWARDS_ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    openui5Lib.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode with scala.Double
  ] = js.native
}

