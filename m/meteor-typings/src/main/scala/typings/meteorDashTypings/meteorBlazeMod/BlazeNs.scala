package typings.meteorDashTypings.meteorBlazeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteorDashTypings.MeteorNs.SubscriptionHandle
import typings.meteorDashTypings.TrackerNs.Computation
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.EventsMap
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.HelpersMap
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.TemplateInstance
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.TemplateInstanceStatic
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.View
import typings.meteorDashTypings.meteorBlazeMod.BlazeNs.ViewStatic
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/blaze", "Blaze")
@js.native
object BlazeNs extends js.Object {
  trait Template extends js.Object {
    @JSName("$")
    var $: js.Any
    var created: js.Function
    var destroyed: js.Function
    var head: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template
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
  
  @js.native
  class TemplateCls ()
    extends typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template {
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
    override var head: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template = js.native
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
  
  trait TemplateInstance extends js.Object {
    var data: js.Object
    var firstNode: js.Object
    var lastNode: js.Object
    var view: js.Object
    @JSName("$")
    def $(selector: String): js.Any
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
    def find(selector: String): HTMLElement
    def findAll(selector: String): js.Array[HTMLElement]
    def subscribe(name: String, args: js.Any*): SubscriptionHandle
    def subscriptionsReady(): Boolean
  }
  
  @js.native
  class TemplateInstanceCls protected () extends TemplateInstance {
    def this(view: View) = this()
    /* CompleteClass */
    override var data: js.Object = js.native
    /* CompleteClass */
    override var firstNode: js.Object = js.native
    /* CompleteClass */
    override var lastNode: js.Object = js.native
    /* CompleteClass */
    override var view: js.Object = js.native
    /* CompleteClass */
    @JSName("$")
    override def $(selector: String): js.Any = js.native
    /* CompleteClass */
    override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    /* CompleteClass */
    override def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
    /* CompleteClass */
    override def subscriptionsReady(): Boolean = js.native
  }
  
  @js.native
  trait TemplateInstanceStatic extends Instantiable1[/* view */ View, TemplateInstance]
  
  @js.native
  trait TemplateStatic
    extends Instantiable0[typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template]
       with Instantiable1[/* viewName */ String, typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template]
       with Instantiable2[
          /* viewName */ String, 
          /* renderFunction */ js.Function, 
          typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template
        ] {
    def currentData(): js.Any = js.native
    def instance(): TemplateInstance = js.native
    def parentData(numLevels: Double): js.Any = js.native
    def registerHelper(name: String, func: js.Function): Unit = js.native
  }
  
  trait View extends js.Object {
    var isCreated: Boolean
    var isDestroyed: Boolean
    var isRendered: Boolean
    var name: String
    var parentView: View
    var renderCount: Double
    var template: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
    def firstNode(): Node
    def lastNode(): Node
    def onViewCreated(func: js.Function): Unit
    def onViewDestroyed(func: js.Function): Unit
    def onViewReady(func: js.Function): Unit
    def templateInstance(): TemplateInstance
  }
  
  @js.native
  class ViewCls () extends View {
    def this(name: String) = this()
    def this(name: String, renderFunction: js.Function) = this()
    /* CompleteClass */
    override var isCreated: Boolean = js.native
    /* CompleteClass */
    override var isDestroyed: Boolean = js.native
    /* CompleteClass */
    override var isRendered: Boolean = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var parentView: View = js.native
    /* CompleteClass */
    override var renderCount: Double = js.native
    /* CompleteClass */
    override var template: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template = js.native
    /* CompleteClass */
    override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    /* CompleteClass */
    override def firstNode(): Node = js.native
    /* CompleteClass */
    override def lastNode(): Node = js.native
    /* CompleteClass */
    override def onViewCreated(func: js.Function): Unit = js.native
    /* CompleteClass */
    override def onViewDestroyed(func: js.Function): Unit = js.native
    /* CompleteClass */
    override def onViewReady(func: js.Function): Unit = js.native
    /* CompleteClass */
    override def templateInstance(): TemplateInstance = js.native
  }
  
  @js.native
  trait ViewStatic
    extends Instantiable0[View]
       with Instantiable1[/* name */ String, View]
       with Instantiable2[/* name */ String, /* renderFunction */ js.Function, View]
  
  var Template: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.TemplateStatic = js.native
  var TemplateInstance: TemplateInstanceStatic = js.native
  var View: ViewStatic = js.native
  var currentView: View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function): View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def Let(bindings: js.Function, contentFunc: js.Function): View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def With(data: js.Function, contentFunc: js.Function): View = js.native
  def With(data: js.Object, contentFunc: js.Function): View = js.native
  def getData(): js.Object = js.native
  def getData(elementOrView: View): js.Object = js.native
  def getData(elementOrView: HTMLElement): js.Object = js.native
  def getView(): View = js.native
  def getView(element: HTMLElement): View = js.native
  def isTemplate(value: js.Any): Boolean = js.native
  def remove(renderedView: View): Unit = js.native
  def render(templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template, parentNode: Node): View = js.native
  def render(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def render(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def render(templateOrView: View, parentNode: Node): View = js.native
  def render(templateOrView: View, parentNode: Node, nextNode: Node): View = js.native
  def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Function,
    parentNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Function,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Function,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Object,
    parentNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Object,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template,
    data: js.Object,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def toHTML(templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template): String = js.native
  def toHTML(templateOrView: View): String = js.native
  def toHTMLWithData(templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template, data: js.Function): String = js.native
  def toHTMLWithData(templateOrView: typings.meteorDashTypings.meteorBlazeMod.BlazeNs.Template, data: js.Object): String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Function): String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Object): String = js.native
  type EventsMap = StringDictionary[js.Function]
  type HelpersMap = StringDictionary[js.Function]
}

