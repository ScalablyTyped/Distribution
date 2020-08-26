package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Single extends js.Object {
  def check(email: String): js.Promise[Response] = js.native
  def check(
    email: String,
    addressInfo: js.UndefOr[scala.Nothing],
    creditsInfo: js.UndefOr[scala.Nothing],
    timeout: js.Any
  ): js.Promise[Response] = js.native
  def check(email: String, addressInfo: js.UndefOr[scala.Nothing], creditsInfo: Boolean): js.Promise[Response] = js.native
  def check(email: String, addressInfo: js.UndefOr[scala.Nothing], creditsInfo: Boolean, timeout: js.Any): js.Promise[Response] = js.native
  def check(email: String, addressInfo: Boolean): js.Promise[Response] = js.native
  def check(email: String, addressInfo: Boolean, creditsInfo: js.UndefOr[scala.Nothing], timeout: js.Any): js.Promise[Response] = js.native
  def check(email: String, addressInfo: Boolean, creditsInfo: Boolean): js.Promise[Response] = js.native
  def check(email: String, addressInfo: Boolean, creditsInfo: Boolean, timeout: js.Any): js.Promise[Response] = js.native
}

