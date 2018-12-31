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
  
  val Both: Both with java.lang.String = js.native
  val LeftToRight: LeftToRight with java.lang.String = js.native
  val RightToLeft: RightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.SwipeDirection with java.lang.String] = js.native
}

