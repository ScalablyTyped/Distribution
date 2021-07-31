package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverflowToolbarPriority extends StObject
/**
  * Defines the priorities of the controls within sap.m.OverflowToolbar
  */
@JSGlobal("sap.m.OverflowToolbarPriority")
@js.native
object OverflowToolbarPriority extends StObject {
  
  @js.native
  sealed trait AlwaysOverflow
    extends StObject
       with OverflowToolbarPriority
  
  @js.native
  sealed trait Disappear
    extends StObject
       with OverflowToolbarPriority
  
  @js.native
  sealed trait High
    extends StObject
       with OverflowToolbarPriority
  
  @js.native
  sealed trait Low
    extends StObject
       with OverflowToolbarPriority
  
  @js.native
  sealed trait NeverOverflow
    extends StObject
       with OverflowToolbarPriority
}
