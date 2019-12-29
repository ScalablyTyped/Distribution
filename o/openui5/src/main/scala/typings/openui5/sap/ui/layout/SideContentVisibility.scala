package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentVisibility with Double] = js.native
  /* 0 */ @js.native
  object AlwaysShow extends TopLevel[AlwaysShow with Double]
  
  /* 1 */ @js.native
  object NeverShow extends TopLevel[NeverShow with Double]
  
  /* 2 */ @js.native
  object ShowAboveL extends TopLevel[ShowAboveL with Double]
  
  /* 3 */ @js.native
  object ShowAboveM extends TopLevel[ShowAboveM with Double]
  
  /* 4 */ @js.native
  object ShowAboveS extends TopLevel[ShowAboveS with Double]
  
}

