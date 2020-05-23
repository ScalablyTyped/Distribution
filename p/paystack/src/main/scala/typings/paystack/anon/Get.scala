package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def create(params: Dictkey): js.Promise[Response] = js.native
  def get(id_or_slug: String): js.Promise[Response] = js.native
  def get(id_or_slug: Double): js.Promise[Response] = js.native
  def list(): js.Promise[Response] = js.native
  def slug(slug: String): js.Promise[Responsedataundefined] = js.native
  def update(id_or_slug: Double, params: Active): js.Promise[Response] = js.native
}

