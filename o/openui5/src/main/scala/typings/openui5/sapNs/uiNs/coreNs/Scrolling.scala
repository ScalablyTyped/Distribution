package typings.openui5.sapNs.uiNs.coreNs

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
  
  /* 0 */ val Auto: typings.openui5.sapNs.uiNs.coreNs.Scrolling.Auto with Double = js.native
  /* 1 */ val Hidden: typings.openui5.sapNs.uiNs.coreNs.Scrolling.Hidden with Double = js.native
  /* 2 */ val None: typings.openui5.sapNs.uiNs.coreNs.Scrolling.None with Double = js.native
  /* 3 */ val Scroll: typings.openui5.sapNs.uiNs.coreNs.Scrolling.Scroll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Scrolling with Double] = js.native
}

