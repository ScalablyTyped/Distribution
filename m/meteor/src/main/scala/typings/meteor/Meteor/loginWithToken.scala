package typings.meteor.Meteor

import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithToken")
@js.native
object loginWithToken extends js.Object {
  def apply(token: String): Unit = js.native
  def apply(
    token: String,
    callback: js.Function1[/* error */ js.UndefOr[globalError | Error | TypedError], Unit]
  ): Unit = js.native
}

