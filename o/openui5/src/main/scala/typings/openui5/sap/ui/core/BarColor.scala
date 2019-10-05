package typings.openui5.sap.ui.core

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
  sealed trait CRITICAL extends BarColor
  
  @js.native
  sealed trait NEGATIVE extends BarColor
  
  @js.native
  sealed trait NEUTRAL extends BarColor
  
  @js.native
  sealed trait POSITIVE extends BarColor
  
  /* 0 */ val CRITICAL: typings.openui5.sap.ui.core.BarColor.CRITICAL with Double = js.native
  /* 1 */ val NEGATIVE: typings.openui5.sap.ui.core.BarColor.NEGATIVE with Double = js.native
  /* 2 */ val NEUTRAL: typings.openui5.sap.ui.core.BarColor.NEUTRAL with Double = js.native
  /* 3 */ val POSITIVE: typings.openui5.sap.ui.core.BarColor.POSITIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarColor with Double] = js.native
}

