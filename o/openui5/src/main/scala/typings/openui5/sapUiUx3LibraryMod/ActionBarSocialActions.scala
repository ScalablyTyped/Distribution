package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionBarSocialActions extends StObject
@JSImport("sap/ui/ux3/library", "ActionBarSocialActions")
@js.native
object ActionBarSocialActions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionBarSocialActions & String] = js.native
  
  /**
    * Standards action 'Mark as Favorite'
    */
  @js.native
  sealed trait Favorite
    extends StObject
       with ActionBarSocialActions
  /* "Favorite" */ val Favorite: typings.openui5.sapUiUx3LibraryMod.ActionBarSocialActions.Favorite & String = js.native
  
  /**
    * Standard action 'Mark for Follow up'
    */
  @js.native
  sealed trait Flag
    extends StObject
       with ActionBarSocialActions
  /* "Flag" */ val Flag: typings.openui5.sapUiUx3LibraryMod.ActionBarSocialActions.Flag & String = js.native
  
  /**
    * Standard action 'Follow/Unfollow'
    */
  @js.native
  sealed trait Follow
    extends StObject
       with ActionBarSocialActions
  /* "Follow" */ val Follow: typings.openui5.sapUiUx3LibraryMod.ActionBarSocialActions.Follow & String = js.native
  
  /**
    * Standard action 'Open Thing Inspector'
    */
  @js.native
  sealed trait Open
    extends StObject
       with ActionBarSocialActions
  /* "Open" */ val Open: typings.openui5.sapUiUx3LibraryMod.ActionBarSocialActions.Open & String = js.native
  
  /**
    * Standard action 'Create an update' (Feed)
    */
  @js.native
  sealed trait Update
    extends StObject
       with ActionBarSocialActions
  /* "Update" */ val Update: typings.openui5.sapUiUx3LibraryMod.ActionBarSocialActions.Update & String = js.native
}
