package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var conv: java.lang.String
  var cost: java.lang.String
  var method: java.lang.String
  var pack: java.lang.String
  var path: java.lang.String
  var prot: java.lang.String
  var proxy: java.lang.String
  var query: java.lang.String
  var read: java.lang.String
  var remote: java.lang.String
  var requestID: java.lang.String
  var retry: java.lang.String
  var service: java.lang.String
  var talk: java.lang.String
  var unpack: java.lang.String
  var write: java.lang.String
}

object LogInfo {
  @scala.inline
  def apply(
    conv: java.lang.String,
    cost: java.lang.String,
    method: java.lang.String,
    pack: java.lang.String,
    path: java.lang.String,
    prot: java.lang.String,
    proxy: java.lang.String,
    query: java.lang.String,
    read: java.lang.String,
    remote: java.lang.String,
    requestID: java.lang.String,
    retry: java.lang.String,
    service: java.lang.String,
    talk: java.lang.String,
    unpack: java.lang.String,
    write: java.lang.String
  ): LogInfo = {
    val __obj = js.Dynamic.literal(conv = conv, cost = cost, method = method, pack = pack, path = path, prot = prot, proxy = proxy, query = query, read = read, remote = remote, requestID = requestID, retry = retry, service = service, talk = talk, unpack = unpack, write = write)
  
    __obj.asInstanceOf[LogInfo]
  }
}

