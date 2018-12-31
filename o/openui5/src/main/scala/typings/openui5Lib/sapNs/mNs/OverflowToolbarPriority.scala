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
  
  val AlwaysOverflow: AlwaysOverflow with java.lang.String = js.native
  val Disappear: Disappear with java.lang.String = js.native
  val High: High with java.lang.String = js.native
  val Low: Low with java.lang.String = js.native
  val NeverOverflow: NeverOverflow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.OverflowToolbarPriority with java.lang.String] = js.native
}

