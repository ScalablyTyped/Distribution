package typings.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  @JSName("$")
  var $: js.Any = js.native
  var created: js.Function = js.native
  var destroyed: js.Function = js.native
  var head: typings.meteor.blazeMod.Blaze.Template = js.native
  var renderFunction: js.Function = js.native
  var rendered: js.Function = js.native
  var viewName: String = js.native
  def constructView(): View = js.native
  def events(eventsMap: EventsMap): Unit = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def helpers(helpersMap: HelpersMap): Unit = js.native
  def onCreated(cb: js.Function): Unit = js.native
  def onDestroyed(cb: js.Function): Unit = js.native
  def onRendered(cb: js.Function): Unit = js.native
}

@JSImport("meteor/blaze", "Blaze.Template")
@js.native
object Template
  extends TopLevel[typings.meteor.blazeMod.Blaze.TemplateStatic]

