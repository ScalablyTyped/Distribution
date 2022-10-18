package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwipeDirection extends StObject
@JSImport("sap/m/library", "SwipeDirection")
@js.native
object SwipeDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SwipeDirection & String] = js.native
  
  /**
    * @SINCE 1.72
    *
    * Swipe from the beginning to the end - left to right in LTR languages and right to left in RTL languages.
    */
  @js.native
  sealed trait BeginToEnd
    extends StObject
       with SwipeDirection
  /* "BeginToEnd" */ val BeginToEnd: typings.openui5.sapMLibraryMod.SwipeDirection.BeginToEnd & String = js.native
  
  /**
    * Both directions (left to right or right to left)
    */
  @js.native
  sealed trait Both
    extends StObject
       with SwipeDirection
  /* "Both" */ val Both: typings.openui5.sapMLibraryMod.SwipeDirection.Both & String = js.native
  
  /**
    * @SINCE 1.72
    *
    * Swipe from the end to the beginning - right to left in LTR languages and left to right in RTL languages.
    */
  @js.native
  sealed trait EndToBegin
    extends StObject
       with SwipeDirection
  /* "EndToBegin" */ val EndToBegin: typings.openui5.sapMLibraryMod.SwipeDirection.EndToBegin & String = js.native
  
  /**
    * @deprecated (since 1.72) - replaced by {@link BeginToEnd}
    *
    * Swipe from left to right
    */
  @js.native
  sealed trait LeftToRight
    extends StObject
       with SwipeDirection
  /* "LeftToRight" */ val LeftToRight: typings.openui5.sapMLibraryMod.SwipeDirection.LeftToRight & String = js.native
  
  /**
    * @deprecated (since 1.72) - replaced by {@link EndToBegin}
    *
    * Swipe from right to left.
    */
  @js.native
  sealed trait RightToLeft
    extends StObject
       with SwipeDirection
  /* "RightToLeft" */ val RightToLeft: typings.openui5.sapMLibraryMod.SwipeDirection.RightToLeft & String = js.native
}
