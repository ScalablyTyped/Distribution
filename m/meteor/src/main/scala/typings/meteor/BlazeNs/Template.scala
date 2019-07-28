package typings.meteor.BlazeNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  @JSName("$")
  var $: js.Any
  var created: js.Function
  var destroyed: js.Function
  var head: typings.meteor.BlazeNs.Template
  var renderFunction: js.Function
  var rendered: js.Function
  var viewName: String
  def constructView(): View
  def events(eventsMap: EventsMap): Unit
  def find(selector: String): HTMLElement
  def findAll(selector: String): js.Array[HTMLElement]
  def helpers(helpersMap: HelpersMap): Unit
  def onCreated(cb: js.Function): Unit
  def onDestroyed(cb: js.Function): Unit
  def onRendered(cb: js.Function): Unit
}

@JSGlobal("Blaze.Template")
@js.native
class TemplateCls ()
  extends typings.meteor.BlazeNs.Template {
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
  override var head: typings.meteor.BlazeNs.Template = js.native
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

object Template {
  @scala.inline
  def apply(
    $: js.Any,
    constructView: () => View,
    created: js.Function,
    destroyed: js.Function,
    events: EventsMap => Unit,
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    head: typings.meteor.BlazeNs.Template,
    helpers: HelpersMap => Unit,
    onCreated: js.Function => Unit,
    onDestroyed: js.Function => Unit,
    onRendered: js.Function => Unit,
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $, constructView = js.Any.fromFunction0(constructView), created = created, destroyed = destroyed, events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head, helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction, rendered = rendered, viewName = viewName)
  
    __obj.asInstanceOf[Template]
  }
}

