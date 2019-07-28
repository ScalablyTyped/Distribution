package typings.meteorDashTypings.meteorTemplatingMod

import typings.meteorDashTypings.BlazeNs.EventsMap
import typings.meteorDashTypings.BlazeNs.HelpersMap
import typings.meteorDashTypings.BlazeNs.View
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/templating", "Template")
@js.native
class Template ()
  extends typings.meteorDashTypings.BlazeNs.Template {
  def this(viewName: String) = this()
  def this(viewName: String, renderFunction: js.Function) = this()
  /* CompleteClass */
  @JSName("$")
  override var $: js.Any = js.native
  /* CompleteClass */
  override var created: js.Function = js.native
  /* CompleteClass */
  override var destroyed: js.Function = js.native
  /* CompleteClass */
  override var head: typings.meteorDashTypings.BlazeNs.Template = js.native
  /* CompleteClass */
  override var renderFunction: js.Function = js.native
  /* CompleteClass */
  override var rendered: js.Function = js.native
  /* CompleteClass */
  override var viewName: String = js.native
  /* CompleteClass */
  override def constructView(): View = js.native
  /* CompleteClass */
  override def events(eventsMap: EventsMap): Unit = js.native
  /* CompleteClass */
  override def find(selector: String): HTMLElement = js.native
  /* CompleteClass */
  override def findAll(selector: String): js.Array[HTMLElement] = js.native
  /* CompleteClass */
  override def helpers(helpersMap: HelpersMap): Unit = js.native
  /* CompleteClass */
  override def onCreated(cb: js.Function): Unit = js.native
  /* CompleteClass */
  override def onDestroyed(cb: js.Function): Unit = js.native
  /* CompleteClass */
  override def onRendered(cb: js.Function): Unit = js.native
}

