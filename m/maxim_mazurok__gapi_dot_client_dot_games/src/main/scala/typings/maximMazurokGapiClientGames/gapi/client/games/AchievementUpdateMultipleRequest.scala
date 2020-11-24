package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementUpdateMultipleRequest extends js.Object {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The individual achievement update requests. */
  var updates: js.UndefOr[js.Array[AchievementUpdateRequest]] = js.native
}
object AchievementUpdateMultipleRequest {
  
  @scala.inline
  def apply(): AchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleRequest]
  }
  
  @scala.inline
  implicit class AchievementUpdateMultipleRequestOps[Self <: AchievementUpdateMultipleRequest] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: AchievementUpdateRequest*): Self = this.set("updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: js.Array[AchievementUpdateRequest]): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}
