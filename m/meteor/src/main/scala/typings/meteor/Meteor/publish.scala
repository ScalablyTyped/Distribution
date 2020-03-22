package typings.meteor.Meteor

import typings.meteor.AnonIsauto
import typings.meteor.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.publish")
@js.native
object publish extends js.Object {
  /** Connection **/
  def apply(name: String, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = js.native
  def apply(
    name: String,
    func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
    options: AnonIsauto
  ): Unit = js.native
  def apply(name: Null, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = js.native
  def apply(
    name: Null,
    func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
    options: AnonIsauto
  ): Unit = js.native
}

