package typings
package openui5Lib.sapNs.uiNs.layoutNs

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
  sealed trait AlwaysShow
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility
  
  @js.native
  sealed trait NeverShow
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility
  
  @js.native
  sealed trait ShowAboveL
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility
  
  @js.native
  sealed trait ShowAboveM
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility
  
  @js.native
  sealed trait ShowAboveS
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility
  
  /* 0 */ val AlwaysShow: AlwaysShow with scala.Double = js.native
  /* 1 */ val NeverShow: NeverShow with scala.Double = js.native
  /* 2 */ val ShowAboveL: ShowAboveL with scala.Double = js.native
  /* 3 */ val ShowAboveM: ShowAboveM with scala.Double = js.native
  /* 4 */ val ShowAboveS: ShowAboveS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility with scala.Double] = js.native
}

