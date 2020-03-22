package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonList extends js.Object {
  def create(params: AnonAmount): js.Promise[Response] = js.native
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  def list(): js.Promise[Response] = js.native
  def update(id: String, params: js.Any): js.Promise[Response] = js.native
  def update(id: Double, params: js.Any): js.Promise[Response] = js.native
}

