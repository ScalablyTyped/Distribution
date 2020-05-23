package typings.meteor.global.Blaze

import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blaze.TemplateInstance")
@js.native
class TemplateInstanceCls protected ()
  extends typings.meteor.Blaze.TemplateInstance {
  def this(view: typings.meteor.Blaze.View) = this()
  /* CompleteClass */
  override var data: Record[String, _] = js.native
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

