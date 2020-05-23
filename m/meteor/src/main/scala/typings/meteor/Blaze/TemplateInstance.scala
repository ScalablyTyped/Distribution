package typings.meteor.Blaze

import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInstance extends js.Object {
  var data: Record[String, _]
  var firstNode: js.Object
  var lastNode: js.Object
  var view: js.Object
  @JSName("$")
  def $(selector: String): js.Any
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
  def find(selector: String): HTMLElement
  def findAll(selector: String): js.Array[HTMLElement]
  def subscribe(name: String, args: js.Any*): SubscriptionHandle
  def subscriptionsReady(): Boolean
}

object TemplateInstance {
  @scala.inline
  def apply(
    $: String => js.Any,
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    data: Record[String, _],
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle,
    subscriptionsReady: () => Boolean,
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInstance]
  }
}

