package typings.meteor.Blaze

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  @JSName("$")
  var $: js.Any
  var created: js.Function
  var destroyed: js.Function
  var head: Template
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
    head: Template,
    helpers: HelpersMap => Unit,
    onCreated: js.Function => Unit,
    onDestroyed: js.Function => Unit,
    onRendered: js.Function => Unit,
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = js.Any.fromFunction0(constructView), created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

