package typings.nodeSlack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  var channel_id: js.UndefOr[String] = js.native
  
  var channel_name: js.UndefOr[String] = js.native
  
  var team_id: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var user_id: js.UndefOr[String] = js.native
  
  var user_name: js.UndefOr[String] = js.native
}
object Query {
  
  @scala.inline
  def apply(text: String): Query = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel_id(value: String): Self = this.set("channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel_id: Self = this.set("channel_id", js.undefined)
    
    @scala.inline
    def setChannel_name(value: String): Self = this.set("channel_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel_name: Self = this.set("channel_name", js.undefined)
    
    @scala.inline
    def setTeam_id(value: String): Self = this.set("team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam_id: Self = this.set("team_id", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    
    @scala.inline
    def setUser_name(value: String): Self = this.set("user_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_name: Self = this.set("user_name", js.undefined)
  }
}
