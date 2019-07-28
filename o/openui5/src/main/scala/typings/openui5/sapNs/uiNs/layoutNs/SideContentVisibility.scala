package typings.openui5.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideContentVisibility extends js.Object

/**
  * Types of the DynamicSideContent Visibility options
  */
@JSGlobal("sap.ui.layout.SideContentVisibility")
@js.native
object SideContentVisibility extends js.Object {
  @js.native
  sealed trait AlwaysShow extends SideContentVisibility
  
  @js.native
  sealed trait NeverShow extends SideContentVisibility
  
  @js.native
  sealed trait ShowAboveL extends SideContentVisibility
  
  @js.native
  sealed trait ShowAboveM extends SideContentVisibility
  
  @js.native
  sealed trait ShowAboveS extends SideContentVisibility
  
  /* 0 */ val AlwaysShow: typings.openui5.sapNs.uiNs.layoutNs.SideContentVisibility.AlwaysShow with Double = js.native
  /* 1 */ val NeverShow: typings.openui5.sapNs.uiNs.layoutNs.SideContentVisibility.NeverShow with Double = js.native
  /* 2 */ val ShowAboveL: typings.openui5.sapNs.uiNs.layoutNs.SideContentVisibility.ShowAboveL with Double = js.native
  /* 3 */ val ShowAboveM: typings.openui5.sapNs.uiNs.layoutNs.SideContentVisibility.ShowAboveM with Double = js.native
  /* 4 */ val ShowAboveS: typings.openui5.sapNs.uiNs.layoutNs.SideContentVisibility.ShowAboveS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentVisibility with Double] = js.native
}

