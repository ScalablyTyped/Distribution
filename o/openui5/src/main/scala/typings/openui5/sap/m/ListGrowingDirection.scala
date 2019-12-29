package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListGrowingDirection with Double] = js.native
  /* 0 */ @js.native
  object Downwards extends TopLevel[Downwards with Double]
  
  /* 1 */ @js.native
  object Upwards extends TopLevel[Upwards with Double]
  
}

