package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  def create(params: AnonEmail): js.Promise[Response] = js.native
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  def list(): js.Promise[ResponsedataArrayanymetaa] = js.native
  def update(id: String, params: AnonFirstname): js.Promise[Response] = js.native
  def update(id: Double, params: AnonFirstname): js.Promise[Response] = js.native
}

