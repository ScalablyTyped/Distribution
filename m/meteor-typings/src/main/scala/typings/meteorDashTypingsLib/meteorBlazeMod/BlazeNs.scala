package typings
package meteorDashTypingsLib.meteorBlazeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/blaze", "Blaze")
@js.native
object BlazeNs extends js.Object {
  trait EventsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function]
  
  trait HelpersMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function]
  
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
  
  trait TemplateInstance extends js.Object {
    var data: js.Object
    var firstNode: js.Object
    var lastNode: js.Object
    var view: js.Object
    @JSName("$")
    def $(selector: java.lang.String): js.Any
    def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation
    def find(selector: java.lang.String): stdLib.HTMLElement
    def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement]
    def subscribe(name: java.lang.String, args: js.Any*): meteorDashTypingsLib.MeteorNs.SubscriptionHandle
    def subscriptionsReady(): scala.Boolean
  }
  
  @js.native
  trait TemplateInstanceStatic
    extends org.scalablytyped.runtime.Instantiable1[/* view */ View, TemplateInstance]
  
  @js.native
  trait TemplateStatic
    extends org.scalablytyped.runtime.Instantiable0[Template]
       with org.scalablytyped.runtime.Instantiable1[/* viewName */ java.lang.String, Template]
       with org.scalablytyped.runtime.Instantiable2[/* viewName */ java.lang.String, /* renderFunction */ js.Function, Template] {
    def currentData(): js.Any = js.native
    def instance(): TemplateInstance = js.native
    def parentData(numLevels: scala.Double): js.Any = js.native
    def registerHelper(name: java.lang.String, func: js.Function): scala.Unit = js.native
  }
  
  trait View extends js.Object {
    var isCreated: scala.Boolean
    var isDestroyed: scala.Boolean
    var isRendered: scala.Boolean
    var name: java.lang.String
    var parentView: View
    var renderCount: scala.Double
    var template: Template
    def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation
    def firstNode(): stdLib.Node
    def lastNode(): stdLib.Node
    def onViewCreated(func: js.Function): scala.Unit
    def onViewDestroyed(func: js.Function): scala.Unit
    def onViewReady(func: js.Function): scala.Unit
    def templateInstance(): TemplateInstance
  }
  
  @js.native
  trait ViewStatic
    extends org.scalablytyped.runtime.Instantiable0[View]
       with org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, View]
       with org.scalablytyped.runtime.Instantiable2[/* name */ java.lang.String, /* renderFunction */ js.Function, View]
  
  var Template: TemplateStatic = js.native
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
  def getData(elementOrView: stdLib.HTMLElement): js.Object = js.native
  def getView(): View = js.native
  def getView(element: stdLib.HTMLElement): View = js.native
  def isTemplate(value: js.Any): scala.Boolean = js.native
  def remove(renderedView: View): scala.Unit = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node): View = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node, nextNode: stdLib.Node, parentView: View): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node, nextNode: stdLib.Node, parentView: View): View = js.native
  def renderWithData(templateOrView: Template, data: js.Function, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: Template, data: js.Function, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: Template, data: js.Object, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: Template, data: js.Object, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def toHTML(templateOrView: Template): java.lang.String = js.native
  def toHTML(templateOrView: View): java.lang.String = js.native
  def toHTMLWithData(templateOrView: Template, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: Template, data: js.Object): java.lang.String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Object): java.lang.String = js.native
}

