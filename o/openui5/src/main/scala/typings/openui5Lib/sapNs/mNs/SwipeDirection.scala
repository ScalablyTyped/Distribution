package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Both
    extends openui5Lib.sapNs.mNs.SwipeDirection
  
  @js.native
  sealed trait LeftToRight
    extends openui5Lib.sapNs.mNs.SwipeDirection
  
  @js.native
  sealed trait RightToLeft
    extends openui5Lib.sapNs.mNs.SwipeDirection
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 1 */ val LeftToRight: LeftToRight with scala.Double = js.native
  /* 2 */ val RightToLeft: RightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.SwipeDirection with scala.Double] = js.native
}

