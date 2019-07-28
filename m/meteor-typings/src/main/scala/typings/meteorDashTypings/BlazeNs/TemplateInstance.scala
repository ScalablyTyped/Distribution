package typings.meteorDashTypings.BlazeNs

import typings.meteorDashTypings.MeteorNs.SubscriptionHandle
import typings.meteorDashTypings.TrackerNs.Computation
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInstance extends js.Object {
  var data: js.Object
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

@JSGlobal("Blaze.TemplateInstance")
@js.native
class TemplateInstanceCls protected () extends TemplateInstance {
  def this(view: View) = this()
  /* CompleteClass */
  override var data: js.Object = js.native
  /* CompleteClass */
  override var firstNode: js.Object = js.native
  /* CompleteClass */
  override var lastNode: js.Object = js.native
  /* CompleteClass */
  override var view: js.Object = js.native
  /* CompleteClass */
  @JSName("$")
  override def $(selector: String): js.Any = js.native
  /* CompleteClass */
  override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  /* CompleteClass */
  override def find(selector: String): HTMLElement = js.native
  /* CompleteClass */
  override def findAll(selector: String): js.Array[HTMLElement] = js.native
  /* CompleteClass */
  override def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
  /* CompleteClass */
  override def subscriptionsReady(): Boolean = js.native
}

object TemplateInstance {
  @scala.inline
  def apply(
    $: String => js.Any,
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    data: js.Object,
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle,
    subscriptionsReady: () => Boolean,
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data, find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode, lastNode = lastNode, subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view)
  
    __obj.asInstanceOf[TemplateInstance]
  }
}

