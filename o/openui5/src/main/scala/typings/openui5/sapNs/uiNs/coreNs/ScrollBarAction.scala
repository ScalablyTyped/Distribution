package typings.openui5.sapNs.uiNs.coreNs

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
  sealed trait Drag extends ScrollBarAction
  
  @js.native
  sealed trait MouseWheel extends ScrollBarAction
  
  @js.native
  sealed trait Page extends ScrollBarAction
  
  @js.native
  sealed trait Step extends ScrollBarAction
  
  /* 0 */ val Drag: typings.openui5.sapNs.uiNs.coreNs.ScrollBarAction.Drag with Double = js.native
  /* 1 */ val MouseWheel: typings.openui5.sapNs.uiNs.coreNs.ScrollBarAction.MouseWheel with Double = js.native
  /* 2 */ val Page: typings.openui5.sapNs.uiNs.coreNs.ScrollBarAction.Page with Double = js.native
  /* 3 */ val Step: typings.openui5.sapNs.uiNs.coreNs.ScrollBarAction.Step with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollBarAction with Double] = js.native
}

