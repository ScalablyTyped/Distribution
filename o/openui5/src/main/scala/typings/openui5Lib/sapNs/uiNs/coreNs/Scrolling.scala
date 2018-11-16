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
  
  val Auto: Auto with java.lang.String = js.native
  val Hidden: Hidden with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Scroll: Scroll with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Scrolling with java.lang.String] = js.native
}

