package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharge extends js.Object {
  def charge(params: AnonAuthorizationcode): js.Promise[Response] = js.native
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  def initialize(params: AnonName): js.Promise[Response] = js.native
  def list(): js.Promise[ResponsedataArrayanymetaa] = js.native
  def totals(): js.Promise[Response] = js.native
  def verify(transReference: String): js.Promise[Response] = js.native
}

