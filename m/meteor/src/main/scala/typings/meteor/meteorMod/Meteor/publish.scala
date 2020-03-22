package typings.meteor.meteorMod.Meteor

import typings.meteor.meteorMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.publish")
@js.native
object publish extends js.Object {
  /** Connection **/
  def apply(name: String, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = js.native
}

