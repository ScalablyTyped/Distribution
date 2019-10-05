package typings.openui5.sap.m

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
  sealed trait Downwards extends ListGrowingDirection
  
  @js.native
  sealed trait Upwards extends ListGrowingDirection
  
  /* 0 */ val Downwards: typings.openui5.sap.m.ListGrowingDirection.Downwards with Double = js.native
  /* 1 */ val Upwards: typings.openui5.sap.m.ListGrowingDirection.Upwards with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListGrowingDirection with Double] = js.native
}

