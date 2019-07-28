package typings.nodeDashRal.nodeDashRalMod

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
    val __obj = js.Dynamic.literal(conv = conv, cost = cost, method = method, pack = pack, path = path, prot = prot, proxy = proxy, query = query, read = read, remote = remote, requestID = requestID, retry = retry, service = service, talk = talk, unpack = unpack, write = write)
  
    __obj.asInstanceOf[LogInfo]
  }
}

