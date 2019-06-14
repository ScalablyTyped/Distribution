package typings
package openui5Lib.sapNs.mNs

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
  sealed trait AlwaysOverflow
    extends openui5Lib.sapNs.mNs.OverflowToolbarPriority
  
  @js.native
  sealed trait Disappear
    extends openui5Lib.sapNs.mNs.OverflowToolbarPriority
  
  @js.native
  sealed trait High
    extends openui5Lib.sapNs.mNs.OverflowToolbarPriority
  
  @js.native
  sealed trait Low
    extends openui5Lib.sapNs.mNs.OverflowToolbarPriority
  
  @js.native
  sealed trait NeverOverflow
    extends openui5Lib.sapNs.mNs.OverflowToolbarPriority
  
  /* 0 */ val AlwaysOverflow: AlwaysOverflow with scala.Double = js.native
  /* 1 */ val Disappear: Disappear with scala.Double = js.native
  /* 2 */ val High: High with scala.Double = js.native
  /* 3 */ val Low: Low with scala.Double = js.native
  /* 4 */ val NeverOverflow: NeverOverflow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.OverflowToolbarPriority with scala.Double] = js.native
}

