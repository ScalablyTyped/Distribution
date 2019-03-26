package typings
package meteorDashTypingsLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInstance extends js.Object {
  var data: js.Object
  var firstNode: js.Object
  var lastNode: js.Object
  var view: js.Object
  @JSName("$")
  def $(selector: java.lang.String): js.Any
  def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation
  def find(selector: java.lang.String): stdLib.HTMLElement
  def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement]
  def subscribe(name: java.lang.String, args: js.Any*): meteorDashTypingsLib.MeteorNs.SubscriptionHandle
  def subscriptionsReady(): scala.Boolean
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
  override def $(selector: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation = js.native
  /* CompleteClass */
  override def find(selector: java.lang.String): stdLib.HTMLElement = js.native
  /* CompleteClass */
  override def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  /* CompleteClass */
  override def subscribe(name: java.lang.String, args: js.Any*): meteorDashTypingsLib.MeteorNs.SubscriptionHandle = js.native
  /* CompleteClass */
  override def subscriptionsReady(): scala.Boolean = js.native
}

object TemplateInstance {
  @scala.inline
  def apply(
    $: java.lang.String => js.Any,
    autorun: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit] => meteorDashTypingsLib.TrackerNs.Computation,
    data: js.Object,
    find: java.lang.String => stdLib.HTMLElement,
    findAll: java.lang.String => js.Array[stdLib.HTMLElement],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: (java.lang.String, /* repeated */ js.Any) => meteorDashTypingsLib.MeteorNs.SubscriptionHandle,
    subscriptionsReady: () => scala.Boolean,
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data, find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode, lastNode = lastNode, subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view)
  
    __obj.asInstanceOf[TemplateInstance]
  }
}

