package typings.meteor.Meteor

import typings.meteor.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithToken")
@js.native
object loginWithToken extends js.Object {
  def apply(token: String): Unit = js.native
  def apply(
    token: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

