package typings.openui5.sap.m

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
  
}

