package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerConfigOverride extends js.Object {
  
  /** The game server config for this override. */
  var configVersion: js.UndefOr[String] = js.native
  
  /** Selector for choosing applicable realms. */
  var realmsSelector: js.UndefOr[RealmSelector] = js.native
}
object GameServerConfigOverride {
  
  @scala.inline
  def apply(): GameServerConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerConfigOverride]
  }
  
  @scala.inline
  implicit class GameServerConfigOverrideOps[Self <: GameServerConfigOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigVersion(value: String): Self = this.set("configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigVersion: Self = this.set("configVersion", js.undefined)
    
    @scala.inline
    def setRealmsSelector(value: RealmSelector): Self = this.set("realmsSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealmsSelector: Self = this.set("realmsSelector", js.undefined)
  }
}
