package typings.meteor.Blaze

import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateInstance extends js.Object {
  var data: Record[String, _] = js.native
  var firstNode: js.Object = js.native
  var lastNode: js.Object = js.native
  var view: js.Object = js.native
  @JSName("$")
  def $(selector: String): js.Any = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
  def subscriptionsReady(): Boolean = js.native
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
  @scala.inline
  implicit class TemplateInstanceOps[Self <: TemplateInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$(value: String => js.Any): Self = this.set("$", js.Any.fromFunction1(value))
    @scala.inline
    def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = this.set("autorun", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: String => HTMLElement): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFindAll(value: String => js.Array[HTMLElement]): Self = this.set("findAll", js.Any.fromFunction1(value))
    @scala.inline
    def setFirstNode(value: js.Object): Self = this.set("firstNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastNode(value: js.Object): Self = this.set("lastNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = this.set("subscribe", js.Any.fromFunction2(value))
    @scala.inline
    def setSubscriptionsReady(value: () => Boolean): Self = this.set("subscriptionsReady", js.Any.fromFunction0(value))
    @scala.inline
    def setView(value: js.Object): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

