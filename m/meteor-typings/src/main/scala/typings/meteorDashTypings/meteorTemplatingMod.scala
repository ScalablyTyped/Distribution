package typings.meteorDashTypings

import org.scalablytyped.runtime.StringDictionary
import typings.meteorDashTypings.Blaze.EventsMap
import typings.meteorDashTypings.Blaze.HelpersMap
import typings.meteorDashTypings.Blaze.View
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/templating", JSImport.Namespace)
@js.native
object meteorTemplatingMod extends js.Object {
  @js.native
  class Template ()
    extends typings.meteorDashTypings.Blaze.Template {
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
    override var head: typings.meteorDashTypings.Blaze.Template = js.native
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
  
  @js.native
  trait TemplateStatic
    extends typings.meteorDashTypings.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typings.meteorDashTypings.Blaze.Template] {
    var body: typings.meteorDashTypings.Blaze.Template = js.native
  }
  
  var Template: typings.meteorDashTypings.meteorTemplatingMod.TemplateStatic = js.native
}

