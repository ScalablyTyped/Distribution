package typings.meteor.Accounts

import typings.meteor.Anon_EmailString
import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: Anon_EmailString): Unit = js.native
  def apply(
    options: Anon_EmailString,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

