package typings.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
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

@JSImport("meteor/blaze", "Blaze.Template")
@js.native
object Template extends TopLevel[TemplateStatic]

