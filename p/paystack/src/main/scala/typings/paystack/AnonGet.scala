package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def create(params: AnonDictkey): js.Promise[Response] = js.native
  def get(id_or_slug: String): js.Promise[Response] = js.native
  def get(id_or_slug: Double): js.Promise[Response] = js.native
  def list(): js.Promise[Response] = js.native
  def slug(slug: String): js.Promise[Responsedataundefined] = js.native
  def update(id_or_slug: Double, params: AnonActive): js.Promise[Response] = js.native
}

