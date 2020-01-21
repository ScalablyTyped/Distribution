package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var conv: String
  var cost: String
  var method: String
  var pack: String
  var path: String
  var prot: String
  var proxy: String
  var query: String
  var read: String
  var remote: String
  var requestID: String
  var retry: String
  var service: String
  var talk: String
  var unpack: String
  var write: String
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
}

