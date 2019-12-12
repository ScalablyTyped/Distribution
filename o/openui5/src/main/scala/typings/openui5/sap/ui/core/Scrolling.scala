package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Scrolling.Auto
import typings.openui5.sap.ui.core.Scrolling.Hidden
import typings.openui5.sap.ui.core.Scrolling.None
import typings.openui5.sap.ui.core.Scrolling.Scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Scrolling extends js.Object

/**
  * Defines the possible values for horizontal and vertical scrolling behavior.
  */
@JSGlobal("sap.ui.core.Scrolling")
@js.native
object Scrolling extends js.Object {
  @js.native
  sealed trait Auto extends Scrolling
  
  @js.native
  sealed trait Hidden extends Scrolling
  
  @js.native
  sealed trait None extends Scrolling
  
  @js.native
  sealed trait Scroll extends Scrolling
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Scrolling with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Scroll extends TopLevel[Scroll with Double]
  
}

