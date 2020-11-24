package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenPlayer extends js.Object {
  
  /** Output only. The time this player was hidden. */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  
  /** Output only. Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#hiddenPlayer`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Output only. The player information. */
  var player: js.UndefOr[Player] = js.native
}
object HiddenPlayer {
  
  @scala.inline
  def apply(): HiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenPlayer]
  }
  
  @scala.inline
  implicit class HiddenPlayerOps[Self <: HiddenPlayer] (val x: Self) extends AnyVal {
    
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
    def setHiddenTimeMillis(value: String): Self = this.set("hiddenTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenTimeMillis: Self = this.set("hiddenTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlayer(value: Player): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
  }
}
