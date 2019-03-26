package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Template")
@js.native
class Template ()
  extends meteorDashTypingsLib.BlazeNs.Template {
  def this(viewName: java.lang.String) = this()
  def this(viewName: java.lang.String, renderFunction: js.Function) = this()
  /* CompleteClass */
  @JSName("$")
  override var $: js.Any = js.native
  /* CompleteClass */
  override var created: js.Function = js.native
  /* CompleteClass */
  override var destroyed: js.Function = js.native
  /* CompleteClass */
  override var head: meteorDashTypingsLib.BlazeNs.Template = js.native
  /* CompleteClass */
  override var renderFunction: js.Function = js.native
  /* CompleteClass */
  override var rendered: js.Function = js.native
  /* CompleteClass */
  override var viewName: java.lang.String = js.native
  /* CompleteClass */
  override def constructView(): meteorDashTypingsLib.BlazeNs.View = js.native
  /* CompleteClass */
  override def events(eventsMap: meteorDashTypingsLib.BlazeNs.EventsMap): scala.Unit = js.native
  /* CompleteClass */
  override def find(selector: java.lang.String): stdLib.HTMLElement = js.native
  /* CompleteClass */
  override def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  /* CompleteClass */
  override def helpers(helpersMap: meteorDashTypingsLib.BlazeNs.HelpersMap): scala.Unit = js.native
  /* CompleteClass */
  override def onCreated(cb: js.Function): scala.Unit = js.native
  /* CompleteClass */
  override def onDestroyed(cb: js.Function): scala.Unit = js.native
  /* CompleteClass */
  override def onRendered(cb: js.Function): scala.Unit = js.native
}

