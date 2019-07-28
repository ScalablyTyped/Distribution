package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val AlwaysOverflow: typings.openui5.sapNs.mNs.OverflowToolbarPriority.AlwaysOverflow with Double = js.native
  /* 1 */ val Disappear: typings.openui5.sapNs.mNs.OverflowToolbarPriority.Disappear with Double = js.native
  /* 2 */ val High: typings.openui5.sapNs.mNs.OverflowToolbarPriority.High with Double = js.native
  /* 3 */ val Low: typings.openui5.sapNs.mNs.OverflowToolbarPriority.Low with Double = js.native
  /* 4 */ val NeverOverflow: typings.openui5.sapNs.mNs.OverflowToolbarPriority.NeverOverflow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowToolbarPriority with Double] = js.native
}

