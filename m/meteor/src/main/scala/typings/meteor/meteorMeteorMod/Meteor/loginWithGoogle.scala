package typings.meteor.meteorMeteorMod.Meteor

import typings.meteor.meteorMeteorMod.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWithGoogle")
@js.native
object loginWithGoogle extends js.Object {
  def apply(): Unit = js.native
  def apply(options: LoginWithExternalServiceOptions): Unit = js.native
  def apply(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

