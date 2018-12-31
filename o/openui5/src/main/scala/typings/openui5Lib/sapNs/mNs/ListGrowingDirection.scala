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
  
  val Downwards: Downwards with java.lang.String = js.native
  val Upwards: Upwards with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ListGrowingDirection with java.lang.String] = js.native
}

