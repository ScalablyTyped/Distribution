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

