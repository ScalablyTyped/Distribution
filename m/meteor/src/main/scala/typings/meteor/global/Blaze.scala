package typings.meteor.global

import typings.jquery.JQuery
import typings.jquery.JQueryStatic
import typings.meteor.Blaze.EventsMap
import typings.meteor.Blaze.HelpersMap
import typings.meteor.Blaze.TemplateStatic
import typings.meteor.Blaze.View
import typings.meteor.Blaze.ViewStatic
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Blaze {
  
  @JSGlobal("Blaze")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Each(argFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def If(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def Let(bindings: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Let")(bindings.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  
  @JSGlobal("Blaze.Template")
  @js.native
  def Template: TemplateStatic[Any, typings.meteor.Blaze.TemplateInstance[Any]] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Blaze.Template")
  @js.native
  open class TemplateCls ()
    extends StObject
       with typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]] {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    def this(viewName: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: JQueryStatic = js.native
    
    /* CompleteClass */
    override def constructView(): View = js.native
    
    /* CompleteClass */
    var created: js.Function = js.native
    
    /* CompleteClass */
    var destroyed: js.Function = js.native
    
    /* CompleteClass */
    override def events(eventsMap: EventsMap[Any, typings.meteor.Blaze.TemplateInstance[Any]]): Unit = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var head: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]] = js.native
    
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    
    /**
      * Register a function to be called when an instance of this template is created.
      * @param callback A function to be added as a callback.
      */
    /* CompleteClass */
    override def onCreated(callback: js.ThisFunction0[typings.meteor.Blaze.TemplateInstance[Any], Any]): Unit = js.native
    
    /**
      * Register a function to be called when an instance of this template is removed from the DOM and destroyed.
      * @param callback A function to be added as a callback.
      */
    /* CompleteClass */
    override def onDestroyed(callback: js.ThisFunction0[typings.meteor.Blaze.TemplateInstance[Any], Any]): Unit = js.native
    
    /**
      * Register a function to be called when an instance of this template is inserted into the DOM.
      * @param callback A function to be added as a callback.
      */
    /* CompleteClass */
    override def onRendered(callback: js.ThisFunction0[typings.meteor.Blaze.TemplateInstance[Any], Any]): Unit = js.native
    
    /* CompleteClass */
    var renderFunction: js.Function = js.native
    
    /* CompleteClass */
    var rendered: js.Function = js.native
    
    /* CompleteClass */
    var viewName: String = js.native
  }
  
  @JSGlobal("Blaze.TemplateInstance")
  @js.native
  open class TemplateInstance[D] protected ()
    extends StObject
       with typings.meteor.Blaze.TemplateInstance[D] {
    def this(view: View) = this()
    
    /* CompleteClass */
    @JSName("$")
    override def $[TElement /* <: HTMLElement */](selector: String): JQuery[TElement] = js.native
    
    /* CompleteClass */
    override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    
    /* CompleteClass */
    var data: D = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var firstNode: js.Object = js.native
    
    /* CompleteClass */
    var lastNode: js.Object = js.native
    
    /* CompleteClass */
    override def subscribe(name: String, args: Any*): SubscriptionHandle = js.native
    
    /* CompleteClass */
    override def subscriptionsReady(): Boolean = js.native
    
    /* CompleteClass */
    var view: js.Object = js.native
  }
  
  inline def Template_=(x: TemplateStatic[Any, typings.meteor.Blaze.TemplateInstance[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  inline def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  
  @JSGlobal("Blaze.View")
  @js.native
  def View: ViewStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Blaze.View")
  @js.native
  open class ViewCls ()
    extends StObject
       with View {
    def this(name: String) = this()
    def this(name: String, renderFunction: js.Function) = this()
    def this(name: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    
    /* CompleteClass */
    override def firstNode(): Node = js.native
    
    /* CompleteClass */
    var isCreated: Boolean = js.native
    
    /* CompleteClass */
    var isDestroyed: Boolean = js.native
    
    /* CompleteClass */
    var isRendered: Boolean = js.native
    
    /* CompleteClass */
    override def lastNode(): Node = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def onViewCreated(func: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onViewDestroyed(func: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onViewReady(func: js.Function): Unit = js.native
    
    /* CompleteClass */
    var parentView: View = js.native
    
    /* CompleteClass */
    var renderCount: Double = js.native
    
    /* CompleteClass */
    var template: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]] = js.native
    
    /* CompleteClass */
    override def templateInstance(): typings.meteor.Blaze.TemplateInstance[Any] = js.native
  }
  
  inline def View_=(x: ViewStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
  
  inline def With(data: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def With(data: js.Object, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
  
  @JSGlobal("Blaze.currentView")
  @js.native
  def currentView: View = js.native
  inline def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
  
  inline def getData(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Object]
  inline def getData(elementOrView: View): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getData(elementOrView: HTMLElement): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getView(): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")().asInstanceOf[View]
  inline def getView(element: HTMLElement): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")(element.asInstanceOf[js.Any]).asInstanceOf[View]
  
  inline def isTemplate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def remove(renderedView: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(renderedView.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def render(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    parentNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    parentNode: Node,
    nextNode: Unit,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    parentNode: Node,
    nextNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(templateOrView: View, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(templateOrView: View, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(templateOrView: View, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Function,
    parentNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Function,
    parentNode: Node,
    nextNode: Unit,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Function,
    parentNode: Node,
    nextNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Function,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Object,
    parentNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Object,
    parentNode: Node,
    nextNode: Unit,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Object,
    parentNode: Node,
    nextNode: Node
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Object,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def toHTML(templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHTML(templateOrView: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHTMLWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Function
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHTMLWithData(
    templateOrView: typings.meteor.Blaze.Template[Any, typings.meteor.Blaze.TemplateInstance[Any]],
    data: js.Object
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHTMLWithData(templateOrView: View, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHTMLWithData(templateOrView: View, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
