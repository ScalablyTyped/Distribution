package typings.nodeDashZendesk.nodeDashZendeskMod.AttachmentsNs

import typings.node.fsMod.PathLike
import typings.nodeDashZendesk.Anon_Filename
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def request(httpMethod: String, fields: js.Any, config: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def upload(file: PathLike, fileOptions: Anon_Filename, cb: ZendeskCallback[_, _]): Unit
}

object Methods {
  @scala.inline
  def apply(
    request: (String, js.Any, js.Any, ZendeskCallback[_, _]) => js.Any,
    upload: (PathLike, Anon_Filename, ZendeskCallback[_, _]) => Unit
  ): Methods = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction4(request), upload = js.Any.fromFunction3(upload))
  
    __obj.asInstanceOf[Methods]
  }
}

