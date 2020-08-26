package typings.nodeZendesk.mod.Attachments

import typings.node.fsMod.PathLike
import typings.nodeZendesk.anon.Filename
import typings.nodeZendesk.mod.ZendeskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def request(httpMethod: String, fields: js.Any, config: js.Any): js.Promise[_] = js.native
  def request(httpMethod: String, fields: js.Any, config: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  def upload(file: PathLike, fileOptions: Filename): js.Promise[Unit] = js.native
  def upload(file: PathLike, fileOptions: Filename, cb: ZendeskCallback[_, _]): Unit = js.native
}

