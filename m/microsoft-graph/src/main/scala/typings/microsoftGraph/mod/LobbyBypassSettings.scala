package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LobbyBypassSettings extends js.Object {
  
  // Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
  var isDialInBypassEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Possible values
    * are listed in the following table. Optional.
    */
  var scope: js.UndefOr[NullableOption[LobbyBypassScope]] = js.native
}
object LobbyBypassSettings {
  
  @scala.inline
  def apply(): LobbyBypassSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LobbyBypassSettings]
  }
  
  @scala.inline
  implicit class LobbyBypassSettingsOps[Self <: LobbyBypassSettings] (val x: Self) extends AnyVal {
    
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
    def setIsDialInBypassEnabled(value: NullableOption[Boolean]): Self = this.set("isDialInBypassEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDialInBypassEnabled: Self = this.set("isDialInBypassEnabled", js.undefined)
    
    @scala.inline
    def setIsDialInBypassEnabledNull: Self = this.set("isDialInBypassEnabled", null)
    
    @scala.inline
    def setScope(value: NullableOption[LobbyBypassScope]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
  }
}
