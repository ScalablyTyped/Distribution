package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverflowToolbarPriority extends js.Object
/**
  * Defines the priorities of the controls within sap.m.OverflowToolbar
  */
@JSGlobal("sap.m.OverflowToolbarPriority")
@js.native
object OverflowToolbarPriority extends js.Object {
  
  @js.native
  sealed trait AlwaysOverflow extends OverflowToolbarPriority
  
  @js.native
  sealed trait Disappear extends OverflowToolbarPriority
  
  @js.native
  sealed trait High extends OverflowToolbarPriority
  
  @js.native
  sealed trait Low extends OverflowToolbarPriority
  
  @js.native
  sealed trait NeverOverflow extends OverflowToolbarPriority
}
