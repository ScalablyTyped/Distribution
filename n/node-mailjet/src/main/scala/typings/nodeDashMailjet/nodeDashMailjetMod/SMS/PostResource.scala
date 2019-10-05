package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostResource extends js.Object {
  def action(action: String): PostResource = js.native
  def request(): js.Promise[ExportResponse] = js.native
  def request(params: ExportParams): js.Promise[ExportResponse] = js.native
  def request(params: SendParams): js.Promise[SendResponse] = js.native
}

