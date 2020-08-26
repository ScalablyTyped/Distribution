package typings.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
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

@JSImport("meteor/blaze", "Blaze.TemplateInstance")
@js.native
object TemplateInstance extends TopLevel[TemplateInstanceStatic]

