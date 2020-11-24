package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastOutputOptionsRtmp extends js.Object {
  
  var id: String = js.native
  
  var serverUrl: String = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var streamName: String = js.native
}
object BroadcastOutputOptionsRtmp {
  
  @scala.inline
  def apply(id: String, serverUrl: String, streamName: String): BroadcastOutputOptionsRtmp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOutputOptionsRtmp]
  }
  
  @scala.inline
  implicit class BroadcastOutputOptionsRtmpOps[Self <: BroadcastOutputOptionsRtmp] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: String): Self = this.set("streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
