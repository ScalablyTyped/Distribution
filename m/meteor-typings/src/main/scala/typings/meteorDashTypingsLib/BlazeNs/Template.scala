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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$")($)
    __obj.updateDynamic("constructView")(constructView)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findAll")(findAll)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("helpers")(helpers)
    __obj.updateDynamic("onCreated")(onCreated)
    __obj.updateDynamic("onDestroyed")(onDestroyed)
    __obj.updateDynamic("onRendered")(onRendered)
    __obj.updateDynamic("renderFunction")(renderFunction)
    __obj.updateDynamic("rendered")(rendered)
    __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[Template]
  }
}

