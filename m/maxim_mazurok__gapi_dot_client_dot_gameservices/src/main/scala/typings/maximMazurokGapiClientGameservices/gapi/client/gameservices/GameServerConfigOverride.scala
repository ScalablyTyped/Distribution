package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerConfigOverride extends StObject {
  
  /** The game server config for this override. */
  var configVersion: js.UndefOr[String] = js.undefined
  
  /** Selector for choosing applicable realms. */
  var realmsSelector: js.UndefOr[RealmSelector] = js.undefined
}
object GameServerConfigOverride {
  
  @scala.inline
  def apply(): GameServerConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerConfigOverride]
  }
  
  @scala.inline
  implicit class GameServerConfigOverrideMutableBuilder[Self <: GameServerConfigOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigVersion(value: String): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVersionUndefined: Self = StObject.set(x, "configVersion", js.undefined)
    
    @scala.inline
    def setRealmsSelector(value: RealmSelector): Self = StObject.set(x, "realmsSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmsSelectorUndefined: Self = StObject.set(x, "realmsSelector", js.undefined)
  }
}
