package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leaderboard extends js.Object {
  
  /** The icon for the leaderboard. */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** The leaderboard ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isIconUrlDefault: js.UndefOr[Boolean] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboard`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the leaderboard. */
  var name: js.UndefOr[String] = js.native
  
  /** How scores are ordered. */
  var order: js.UndefOr[String] = js.native
}
object Leaderboard {
  
  @scala.inline
  def apply(): Leaderboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Leaderboard]
  }
  
  @scala.inline
  implicit class LeaderboardOps[Self <: Leaderboard] (val x: Self) extends AnyVal {
    
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsIconUrlDefault(value: Boolean): Self = this.set("isIconUrlDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIconUrlDefault: Self = this.set("isIconUrlDefault", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
