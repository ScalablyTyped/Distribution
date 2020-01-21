package typings.nodeMailjet.mod.Email

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResource extends js.Object {
  def action(action: String): GetResource = js.native
  def id(value: String): GetResource = js.native
  def request(): js.Promise[GetResponse] = js.native
  def request(params: js.Object): js.Promise[GetResponse] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ Error, /* res */ GetResponse, Unit]): js.Promise[GetResponse] = js.native
}

