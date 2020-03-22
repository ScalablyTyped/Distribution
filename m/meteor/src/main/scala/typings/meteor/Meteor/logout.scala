package typings.meteor.Meteor

import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.logout")
@js.native
object logout extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* error */ js.UndefOr[globalError | Error | TypedError], Unit]): Unit = js.native
}

