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

object TemplateInstance {
  @scala.inline
  def apply(
    $: js.Function1[java.lang.String, js.Any],
    autorun: js.Function1[
      js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit], 
      meteorDashTypingsLib.TrackerNs.Computation
    ],
    data: js.Object,
    find: js.Function1[java.lang.String, stdLib.HTMLElement],
    findAll: js.Function1[java.lang.String, js.Array[stdLib.HTMLElement]],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: js.Function2[
      java.lang.String, 
      /* repeated */ js.Any, 
      meteorDashTypingsLib.MeteorNs.SubscriptionHandle
    ],
    subscriptionsReady: js.Function0[scala.Boolean],
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$")($)
    __obj.updateDynamic("autorun")(autorun)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findAll")(findAll)
    __obj.updateDynamic("firstNode")(firstNode)
    __obj.updateDynamic("lastNode")(lastNode)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.updateDynamic("subscriptionsReady")(subscriptionsReady)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[TemplateInstance]
  }
}

