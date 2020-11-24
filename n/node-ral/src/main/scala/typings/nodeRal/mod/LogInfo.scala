package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogInfo extends js.Object {
  
  var conv: String = js.native
  
  var cost: String = js.native
  
  var method: String = js.native
  
  var pack: String = js.native
  
  var path: String = js.native
  
  var prot: String = js.native
  
  var proxy: String = js.native
  
  var query: String = js.native
  
  var read: String = js.native
  
  var remote: String = js.native
  
  var requestID: String = js.native
  
  var retry: String = js.native
  
  var service: String = js.native
  
  var talk: String = js.native
  
  var unpack: String = js.native
  
  var write: String = js.native
}
object LogInfo {
  
  @scala.inline
  def apply(
    conv: String,
    cost: String,
    method: String,
    pack: String,
    path: String,
    prot: String,
    proxy: String,
    query: String,
    read: String,
    remote: String,
    requestID: String,
    retry: String,
    service: String,
    talk: String,
    unpack: String,
    write: String
  ): LogInfo = {
    val __obj = js.Dynamic.literal(conv = conv.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prot = prot.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], talk = talk.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
  
  @scala.inline
  implicit class LogInfoOps[Self <: LogInfo] (val x: Self) extends AnyVal {
    
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
    def setConv(value: String): Self = this.set("conv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCost(value: String): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPack(value: String): Self = this.set("pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProt(value: String): Self = this.set("prot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestID(value: String): Self = this.set("requestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: String): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTalk(value: String): Self = this.set("talk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpack(value: String): Self = this.set("unpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}
