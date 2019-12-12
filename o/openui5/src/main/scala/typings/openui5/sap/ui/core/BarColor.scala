package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.BarColor.CRITICAL
import typings.openui5.sap.ui.core.BarColor.NEGATIVE
import typings.openui5.sap.ui.core.BarColor.NEUTRAL
import typings.openui5.sap.ui.core.BarColor.POSITIVE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarColor with Double] = js.native
  /* 0 */ @js.native
  object CRITICAL extends TopLevel[CRITICAL with Double]
  
  /* 1 */ @js.native
  object NEGATIVE extends TopLevel[NEGATIVE with Double]
  
  /* 2 */ @js.native
  object NEUTRAL extends TopLevel[NEUTRAL with Double]
  
  /* 3 */ @js.native
  object POSITIVE extends TopLevel[POSITIVE with Double]
  
}

