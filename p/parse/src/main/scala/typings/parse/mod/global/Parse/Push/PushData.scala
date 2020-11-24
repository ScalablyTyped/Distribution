package typings.parse.mod.global.Parse.Push

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Installation
import typings.parse.mod.global.Parse.Query
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushData extends js.Object {
  
  var alert: js.UndefOr[String] = js.native
  
  var badge: js.UndefOr[String] = js.native
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var content_available: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var expiration_interval: js.UndefOr[Double] = js.native
  
  var expiration_time: js.UndefOr[Date] = js.native
  
  var notification: js.UndefOr[js.Any] = js.native
  
  var push_time: js.UndefOr[Date] = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var where: js.UndefOr[Query[Installation[Attributes]]] = js.native
}
object PushData {
  
  @scala.inline
  def apply(): PushData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushData]
  }
  
  @scala.inline
  implicit class PushDataOps[Self <: PushData] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: String): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setContent_available(value: js.Any): Self = this.set("content_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_available: Self = this.set("content_available", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExpiration_interval(value: Double): Self = this.set("expiration_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration_interval: Self = this.set("expiration_interval", js.undefined)
    
    @scala.inline
    def setExpiration_time(value: Date): Self = this.set("expiration_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration_time: Self = this.set("expiration_time", js.undefined)
    
    @scala.inline
    def setNotification(value: js.Any): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setPush_time(value: Date): Self = this.set("push_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush_time: Self = this.set("push_time", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWhere(value: Query[Installation[Attributes]]): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
