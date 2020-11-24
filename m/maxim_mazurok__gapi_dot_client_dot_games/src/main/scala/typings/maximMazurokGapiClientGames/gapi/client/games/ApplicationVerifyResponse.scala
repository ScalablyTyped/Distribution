package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVerifyResponse extends js.Object {
  
  /** An alternate ID that was once used for the player that was issued the auth token used in this request. (This field is not normally populated.) */
  var alternate_player_id: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#applicationVerifyResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The ID of the player that was issued the auth token used in this request. */
  var player_id: js.UndefOr[String] = js.native
}
object ApplicationVerifyResponse {
  
  @scala.inline
  def apply(): ApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVerifyResponse]
  }
  
  @scala.inline
  implicit class ApplicationVerifyResponseOps[Self <: ApplicationVerifyResponse] (val x: Self) extends AnyVal {
    
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
    def setAlternate_player_id(value: String): Self = this.set("alternate_player_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate_player_id: Self = this.set("alternate_player_id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlayer_id(value: String): Self = this.set("player_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer_id: Self = this.set("player_id", js.undefined)
  }
}
