package typings.nano.mod

import typings.nano.nanoStrings.continuous
import typings.nano.nanoStrings.eventsource
import typings.nano.nanoStrings.longpoll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
@js.native
trait UpdatesParams extends js.Object {
  
  var feed: longpoll | continuous | eventsource = js.native
  
  var heartbeat: Boolean = js.native
  
  var since: String = js.native
  
  var timeout: Double = js.native
}
object UpdatesParams {
  
  @scala.inline
  def apply(feed: longpoll | continuous | eventsource, heartbeat: Boolean, since: String, timeout: Double): UpdatesParams = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatesParams]
  }
  
  @scala.inline
  implicit class UpdatesParamsOps[Self <: UpdatesParams] (val x: Self) extends AnyVal {
    
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
    def setFeed(value: longpoll | continuous | eventsource): Self = this.set("feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeat(value: Boolean): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
