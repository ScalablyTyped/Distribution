package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SwipeDirection extends js.Object

/**
  * Directions for swipe event.
  */
@JSGlobal("sap.m.SwipeDirection")
@js.native
object SwipeDirection extends js.Object {
  @js.native
  sealed trait Both extends SwipeDirection
  
  @js.native
  sealed trait LeftToRight extends SwipeDirection
  
  @js.native
  sealed trait RightToLeft extends SwipeDirection
  
  /* 0 */ val Both: typings.openui5.sapNs.mNs.SwipeDirection.Both with Double = js.native
  /* 1 */ val LeftToRight: typings.openui5.sapNs.mNs.SwipeDirection.LeftToRight with Double = js.native
  /* 2 */ val RightToLeft: typings.openui5.sapNs.mNs.SwipeDirection.RightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SwipeDirection with Double] = js.native
}

