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
    constructView: js.Function0[View],
    created: js.Function,
    destroyed: js.Function,
    events: js.Function1[EventsMap, scala.Unit],
    find: js.Function1[java.lang.String, stdLib.HTMLElement],
    findAll: js.Function1[java.lang.String, js.Array[stdLib.HTMLElement]],
    head: Template,
    helpers: js.Function1[HelpersMap, scala.Unit],
    onCreated: js.Function1[js.Function, scala.Unit],
    onDestroyed: js.Function1[js.Function, scala.Unit],
    onRendered: js.Function1[js.Function, scala.Unit],
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: java.lang.String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $, constructView = constructView, created = created, destroyed = destroyed, events = events, find = find, findAll = findAll, head = head, helpers = helpers, onCreated = onCreated, onDestroyed = onDestroyed, onRendered = onRendered, renderFunction = renderFunction, rendered = rendered, viewName = viewName)
  
    __obj.asInstanceOf[Template]
  }
}

