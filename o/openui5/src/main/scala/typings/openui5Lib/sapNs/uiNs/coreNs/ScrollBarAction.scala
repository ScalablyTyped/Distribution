package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollBarAction extends js.Object

/**
  * Actions are: Click on track, button, drag of thumb, or mouse wheel click
  */
@JSGlobal("sap.ui.core.ScrollBarAction")
@js.native
object ScrollBarAction extends js.Object {
  @js.native
  sealed trait Drag
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait MouseWheel
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait Page
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait Step
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  /* 0 */ val Drag: Drag with scala.Double = js.native
  /* 1 */ val MouseWheel: MouseWheel with scala.Double = js.native
  /* 2 */ val Page: Page with scala.Double = js.native
  /* 3 */ val Step: Step with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction with scala.Double] = js.native
}

