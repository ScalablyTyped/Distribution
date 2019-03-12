package typings
package meteorDashTypingsLib.BlazeNs

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
  var viewName: java.lang.String
  def constructView(): View
  def events(eventsMap: EventsMap): scala.Unit
  def find(selector: java.lang.String): stdLib.HTMLElement
  def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement]
  def helpers(helpersMap: HelpersMap): scala.Unit
  def onCreated(cb: js.Function): scala.Unit
  def onDestroyed(cb: js.Function): scala.Unit
  def onRendered(cb: js.Function): scala.Unit
}

object Template {
  @scala.inline
  def apply(
    $: js.Any,
    constructView: () => View,
    created: js.Function,
    destroyed: js.Function,
    events: EventsMap => scala.Unit,
    find: java.lang.String => stdLib.HTMLElement,
    findAll: java.lang.String => js.Array[stdLib.HTMLElement],
    head: Template,
    helpers: HelpersMap => scala.Unit,
    onCreated: js.Function => scala.Unit,
    onDestroyed: js.Function => scala.Unit,
    onRendered: js.Function => scala.Unit,
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: java.lang.String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $, constructView = js.Any.fromFunction0(constructView), created = created, destroyed = destroyed, events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head, helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction, rendered = rendered, viewName = viewName)
  
    __obj.asInstanceOf[Template]
  }
}

