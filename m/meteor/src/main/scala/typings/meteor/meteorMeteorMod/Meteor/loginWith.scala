package typings.meteor.meteorMeteorMod.Meteor

import typings.meteor.Anon_LoginStyle
import typings.meteor.meteorMeteorMod.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](options: Anon_LoginStyle): Unit = js.native
  def apply[ExternalService](
    options: Anon_LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

