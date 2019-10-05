package typings.nodeDashMailjet.nodeDashMailjetMod.Email

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// resources
@js.native
trait PostResource extends js.Object {
  def action(action: String): PostResource = js.native
  def id(value: String): PostResource = js.native
  def request(params: js.Object): js.Promise[Response] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ Error, /* res */ Response, Unit]): js.Promise[Response] = js.native
  def request(params: SendParams): js.Promise[PostResponse] = js.native
}

