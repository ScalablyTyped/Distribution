package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.SwipeDirection.Both
import typings.openui5.sap.m.SwipeDirection.LeftToRight
import typings.openui5.sap.m.SwipeDirection.RightToLeft
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SwipeDirection with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  /* 2 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
  
}

