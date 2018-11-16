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
  
  val AlwaysShow: AlwaysShow with java.lang.String = js.native
  val NeverShow: NeverShow with java.lang.String = js.native
  val ShowAboveL: ShowAboveL with java.lang.String = js.native
  val ShowAboveM: ShowAboveM with java.lang.String = js.native
  val ShowAboveS: ShowAboveS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.SideContentVisibility with java.lang.String] = js.native
}

