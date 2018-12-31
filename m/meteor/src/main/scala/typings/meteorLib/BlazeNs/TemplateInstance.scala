package typings
package meteorLib.BlazeNs

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
  def autorun(runFunc: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit]): meteorLib.TrackerNs.Computation
  def find(selector: java.lang.String): reactLib.HTMLElement
  def findAll(selector: java.lang.String): js.Array[reactLib.HTMLElement]
  def subscribe(name: java.lang.String, args: js.Any*): meteorLib.MeteorNs.SubscriptionHandle
  def subscriptionsReady(): scala.Boolean
}

