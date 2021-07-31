package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideContentVisibility extends StObject
/**
  * Types of the DynamicSideContent Visibility options
  */
@JSGlobal("sap.ui.layout.SideContentVisibility")
@js.native
object SideContentVisibility extends StObject {
  
  @js.native
  sealed trait AlwaysShow
    extends StObject
       with SideContentVisibility
  
  @js.native
  sealed trait NeverShow
    extends StObject
       with SideContentVisibility
  
  @js.native
  sealed trait ShowAboveL
    extends StObject
       with SideContentVisibility
  
  @js.native
  sealed trait ShowAboveM
    extends StObject
       with SideContentVisibility
  
  @js.native
  sealed trait ShowAboveS
    extends StObject
       with SideContentVisibility
}
