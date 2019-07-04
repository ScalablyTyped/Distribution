package typings
package nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def request(
    httpMethod: java.lang.String,
    fields: js.Any,
    config: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def upload(
    file: nodeLib.fsMod.PathLike,
    fileOptions: nodeDashZendeskLib.Anon_Filename,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): scala.Unit
}

object Methods {
  @scala.inline
  def apply(
    request: (java.lang.String, js.Any, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    upload: (nodeLib.fsMod.PathLike, nodeDashZendeskLib.Anon_Filename, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => scala.Unit
  ): Methods = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction4(request), upload = js.Any.fromFunction3(upload))
  
    __obj.asInstanceOf[Methods]
  }
}

