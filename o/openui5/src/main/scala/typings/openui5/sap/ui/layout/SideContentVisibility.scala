package typings.openui5.sap.ui.layout

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
  
}

