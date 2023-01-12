package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileSettings extends StObject {
  
  var friendsListVisibility: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#profileSettings`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether the player's profile is visible to the currently signed in player. */
  var profileVisible: js.UndefOr[Boolean] = js.undefined
}
object ProfileSettings {
  
  inline def apply(): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileSettings] (val x: Self) extends AnyVal {
    
    inline def setFriendsListVisibility(value: String): Self = StObject.set(x, "friendsListVisibility", value.asInstanceOf[js.Any])
    
    inline def setFriendsListVisibilityUndefined: Self = StObject.set(x, "friendsListVisibility", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    inline def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
