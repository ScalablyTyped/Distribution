package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwipeDirection extends StObject
/**
  * Directions for swipe event.
  */
@JSGlobal("sap.m.SwipeDirection")
@js.native
object SwipeDirection extends StObject {
  
  @js.native
  sealed trait Both extends SwipeDirection
  
  @js.native
  sealed trait LeftToRight extends SwipeDirection
  
  @js.native
  sealed trait RightToLeft extends SwipeDirection
}
