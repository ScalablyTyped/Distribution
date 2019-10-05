package typings.meteor.Meteor

import typings.meteor.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithPassword")
@js.native
object loginWithPassword extends js.Object {
  def apply(user: String, password: String): Unit = js.native
  def apply(
    user: String,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def apply(user: js.Object, password: String): Unit = js.native
  def apply(
    user: js.Object,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

