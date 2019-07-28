package typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs

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
  sealed trait AWAY_FROM_ZERO extends RoundingMode
  
  @js.native
  sealed trait CEILING extends RoundingMode
  
  @js.native
  sealed trait FLOOR extends RoundingMode
  
  @js.native
  sealed trait HALF_AWAY_FROM_ZERO extends RoundingMode
  
  @js.native
  sealed trait HALF_CEILING extends RoundingMode
  
  @js.native
  sealed trait HALF_FLOOR extends RoundingMode
  
  @js.native
  sealed trait HALF_TOWARDS_ZERO extends RoundingMode
  
  @js.native
  sealed trait TOWARDS_ZERO extends RoundingMode
  
  /* 0 */ val AWAY_FROM_ZERO: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.AWAY_FROM_ZERO with Double = js.native
  /* 1 */ val CEILING: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.CEILING with Double = js.native
  /* 2 */ val FLOOR: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.FLOOR with Double = js.native
  /* 3 */ val HALF_AWAY_FROM_ZERO: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.HALF_AWAY_FROM_ZERO with Double = js.native
  /* 4 */ val HALF_CEILING: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.HALF_CEILING with Double = js.native
  /* 5 */ val HALF_FLOOR: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.HALF_FLOOR with Double = js.native
  /* 6 */ val HALF_TOWARDS_ZERO: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.HALF_TOWARDS_ZERO with Double = js.native
  /* 7 */ val TOWARDS_ZERO: typings.openui5.sapNs.uiNs.coreNs.formatNs.NumberFormatNs.RoundingMode.TOWARDS_ZERO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoundingMode with Double] = js.native
}

