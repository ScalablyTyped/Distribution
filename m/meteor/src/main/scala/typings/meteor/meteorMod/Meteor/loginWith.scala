package typings.meteor.meteorMod.Meteor

import typings.meteor.anon.LoginStyle
import typings.meteor.meteorMod.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[globalError | Error | TypedError], Unit]
  ): Unit = js.native
  def apply[ExternalService](options: LoginStyle): Unit = js.native
  def apply[ExternalService](
    options: LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[globalError | Error | TypedError], Unit]
  ): Unit = js.native
}

