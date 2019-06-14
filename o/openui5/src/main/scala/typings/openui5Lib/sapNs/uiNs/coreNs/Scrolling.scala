package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Auto
    extends openui5Lib.sapNs.uiNs.coreNs.Scrolling
  
  @js.native
  sealed trait Hidden
    extends openui5Lib.sapNs.uiNs.coreNs.Scrolling
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.Scrolling
  
  @js.native
  sealed trait Scroll
    extends openui5Lib.sapNs.uiNs.coreNs.Scrolling
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Hidden: Hidden with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 3 */ val Scroll: Scroll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Scrolling with scala.Double] = js.native
}

