package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarColor extends js.Object

/**
  * Configuration options for the colors of a progress bar
  */
@JSGlobal("sap.ui.core.BarColor")
@js.native
object BarColor extends js.Object {
  @js.native
  sealed trait CRITICAL
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait NEGATIVE
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait NEUTRAL
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait POSITIVE
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  /* 0 */ val CRITICAL: CRITICAL with scala.Double = js.native
  /* 1 */ val NEGATIVE: NEGATIVE with scala.Double = js.native
  /* 2 */ val NEUTRAL: NEUTRAL with scala.Double = js.native
  /* 3 */ val POSITIVE: POSITIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.BarColor with scala.Double] = js.native
}

