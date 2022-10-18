package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowActionState extends StObject
@JSImport("sap/ui/ux3/library", "FollowActionState")
@js.native
object FollowActionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FollowActionState & String] = js.native
  
  /**
    * default state
    */
  @js.native
  sealed trait Default
    extends StObject
       with FollowActionState
  /* "Default" */ val Default: typings.openui5.sapUiUx3LibraryMod.FollowActionState.Default & String = js.native
  
  /**
    * follow state
    */
  @js.native
  sealed trait Follow
    extends StObject
       with FollowActionState
  /* "Follow" */ val Follow: typings.openui5.sapUiUx3LibraryMod.FollowActionState.Follow & String = js.native
  
  /**
    * hold state
    */
  @js.native
  sealed trait Hold
    extends StObject
       with FollowActionState
  /* "Hold" */ val Hold: typings.openui5.sapUiUx3LibraryMod.FollowActionState.Hold & String = js.native
}
