package typings.meteor.Meteor

import typings.meteor.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithWeibo")
@js.native
object loginWithWeibo extends js.Object {
  def apply(): Unit = js.native
  def apply(options: LoginWithExternalServiceOptions): Unit = js.native
  def apply(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

