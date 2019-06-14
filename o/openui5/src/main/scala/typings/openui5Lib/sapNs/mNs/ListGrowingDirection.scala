package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListGrowingDirection extends js.Object

/**
  * Defines the growing direction of the <code>sap.m.List</code> or <code>sap.m.Table</code>.
  */
@JSGlobal("sap.m.ListGrowingDirection")
@js.native
object ListGrowingDirection extends js.Object {
  @js.native
  sealed trait Downwards
    extends openui5Lib.sapNs.mNs.ListGrowingDirection
  
  @js.native
  sealed trait Upwards
    extends openui5Lib.sapNs.mNs.ListGrowingDirection
  
  /* 0 */ val Downwards: Downwards with scala.Double = js.native
  /* 1 */ val Upwards: Upwards with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListGrowingDirection with scala.Double] = js.native
}

