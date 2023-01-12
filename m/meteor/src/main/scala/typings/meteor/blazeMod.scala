package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.jquery.JQueryStatic
import typings.meteor.Meteor.Event
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blazeMod {
  
  object Blaze {
    
    @JSImport("meteor/blaze", "Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Each(argFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def If(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def Let(bindings: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Let")(bindings.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    trait Template[D, T] extends StObject {
      
      @JSName("$")
      var $: JQueryStatic
      
      def constructView(): View
      
      var created: js.Function
      
      var destroyed: js.Function
      
      def events(eventsMap: EventsMap[D, T]): Unit
      
      def find(selector: String): HTMLElement
      
      def findAll(selector: String): js.Array[HTMLElement]
      
      var head: Template[Any, TemplateInstance[Any]]
      
      def helpers(helpersMap: HelpersMap): Unit
      
      /**
        * Register a function to be called when an instance of this template is created.
        * @param callback A function to be added as a callback.
        */
      def onCreated(callback: js.ThisFunction0[/* this */ T, Any]): Unit
      
      /**
        * Register a function to be called when an instance of this template is removed from the DOM and destroyed.
        * @param callback A function to be added as a callback.
        */
      def onDestroyed(callback: js.ThisFunction0[/* this */ T, Any]): Unit
      
      /**
        * Register a function to be called when an instance of this template is inserted into the DOM.
        * @param callback A function to be added as a callback.
        */
      def onRendered(callback: js.ThisFunction0[/* this */ T, Any]): Unit
      
      var renderFunction: js.Function
      
      var rendered: js.Function
      
      var viewName: String
    }
    object Template {
      
      @JSImport("meteor/blaze", "Blaze.Template")
      @js.native
      val ^ : typings.meteor.blazeMod.Blaze.TemplateStatic[Any, TemplateInstance[Any]] = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Template[?, ?], D, T] (val x: Self & (Template[D, T])) extends AnyVal {
        
        inline def set$(value: JQueryStatic): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
        
        inline def setConstructView(value: () => View): Self = StObject.set(x, "constructView", js.Any.fromFunction0(value))
        
        inline def setCreated(value: js.Function): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        inline def setDestroyed(value: js.Function): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
        
        inline def setEvents(value: EventsMap[D, T] => Unit): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
        
        inline def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
        
        inline def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
        
        inline def setHead(value: Template[Any, TemplateInstance[Any]]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setHelpers(value: HelpersMap => Unit): Self = StObject.set(x, "helpers", js.Any.fromFunction1(value))
        
        inline def setOnCreated(value: js.ThisFunction0[/* this */ T, Any] => Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
        
        inline def setOnDestroyed(value: js.ThisFunction0[/* this */ T, Any] => Unit): Self = StObject.set(x, "onDestroyed", js.Any.fromFunction1(value))
        
        inline def setOnRendered(value: js.ThisFunction0[/* this */ T, Any] => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
        
        inline def setRenderFunction(value: js.Function): Self = StObject.set(x, "renderFunction", value.asInstanceOf[js.Any])
        
        inline def setRendered(value: js.Function): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
        
        inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.Template")
    @js.native
    open class TemplateCls ()
      extends StObject
         with Template[Any, TemplateInstance[Any]] {
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
      override def events(eventsMap: EventsMap[Any, TemplateInstance[Any]]): Unit = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var head: Template[Any, TemplateInstance[Any]] = js.native
      
      /* CompleteClass */
      override def helpers(helpersMap: HelpersMap): Unit = js.native
      
      /**
        * Register a function to be called when an instance of this template is created.
        * @param callback A function to be added as a callback.
        */
      /* CompleteClass */
      override def onCreated(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
      
      /**
        * Register a function to be called when an instance of this template is removed from the DOM and destroyed.
        * @param callback A function to be added as a callback.
        */
      /* CompleteClass */
      override def onDestroyed(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
      
      /**
        * Register a function to be called when an instance of this template is inserted into the DOM.
        * @param callback A function to be added as a callback.
        */
      /* CompleteClass */
      override def onRendered(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
      
      /* CompleteClass */
      var renderFunction: js.Function = js.native
      
      /* CompleteClass */
      var rendered: js.Function = js.native
      
      /* CompleteClass */
      var viewName: String = js.native
    }
    
    @JSImport("meteor/blaze", "Blaze.TemplateInstance")
    @js.native
    open class TemplateInstance[D] protected () extends StObject {
      def this(view: View) = this()
      
      @JSName("$")
      def $[TElement /* <: HTMLElement */](selector: String): JQuery[TElement] = js.native
      
      def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      var data: D = js.native
      
      def find(selector: String): HTMLElement = js.native
      
      def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      var firstNode: js.Object = js.native
      
      var lastNode: js.Object = js.native
      
      def subscribe(name: String, args: Any*): SubscriptionHandle = js.native
      
      def subscriptionsReady(): Boolean = js.native
      
      var view: js.Object = js.native
    }
    
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    trait View extends StObject {
      
      def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
      
      def firstNode(): Node
      
      var isCreated: Boolean
      
      var isDestroyed: Boolean
      
      var isRendered: Boolean
      
      def lastNode(): Node
      
      var name: String
      
      def onViewCreated(func: js.Function): Unit
      
      def onViewDestroyed(func: js.Function): Unit
      
      def onViewReady(func: js.Function): Unit
      
      var parentView: View
      
      var renderCount: Double
      
      var template: Template[Any, TemplateInstance[Any]]
      
      def templateInstance(): TemplateInstance[Any]
    }
    object View {
      
      @JSImport("meteor/blaze", "Blaze.View")
      @js.native
      val ^ : ViewStatic = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
        
        inline def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
        
        inline def setFirstNode(value: () => Node): Self = StObject.set(x, "firstNode", js.Any.fromFunction0(value))
        
        inline def setIsCreated(value: Boolean): Self = StObject.set(x, "isCreated", value.asInstanceOf[js.Any])
        
        inline def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
        
        inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
        
        inline def setLastNode(value: () => Node): Self = StObject.set(x, "lastNode", js.Any.fromFunction0(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOnViewCreated(value: js.Function => Unit): Self = StObject.set(x, "onViewCreated", js.Any.fromFunction1(value))
        
        inline def setOnViewDestroyed(value: js.Function => Unit): Self = StObject.set(x, "onViewDestroyed", js.Any.fromFunction1(value))
        
        inline def setOnViewReady(value: js.Function => Unit): Self = StObject.set(x, "onViewReady", js.Any.fromFunction1(value))
        
        inline def setParentView(value: View): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
        
        inline def setRenderCount(value: Double): Self = StObject.set(x, "renderCount", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: Template[Any, TemplateInstance[Any]]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateInstance(value: () => TemplateInstance[Any]): Self = StObject.set(x, "templateInstance", js.Any.fromFunction0(value))
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.View")
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
      var template: Template[Any, TemplateInstance[Any]] = js.native
      
      /* CompleteClass */
      override def templateInstance(): TemplateInstance[Any] = js.native
    }
    
    inline def With(data: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def With(data: js.Object, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSImport("meteor/blaze", "Blaze.currentView")
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
    
    inline def render(templateOrView: Template[Any, TemplateInstance[Any]], parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(
      templateOrView: Template[Any, TemplateInstance[Any]],
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: Template[Any, TemplateInstance[Any]], parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(
      templateOrView: Template[Any, TemplateInstance[Any]],
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def renderWithData(templateOrView: Template[Any, TemplateInstance[Any]], data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
      data: js.Function,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
      data: js.Function,
      parentNode: Node,
      nextNode: Node
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
      data: js.Function,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template[Any, TemplateInstance[Any]], data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
      data: js.Object,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
      data: js.Object,
      parentNode: Node,
      nextNode: Node
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: Template[Any, TemplateInstance[Any]],
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
    
    inline def toHTML(templateOrView: Template[Any, TemplateInstance[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHTML(templateOrView: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHTMLWithData(templateOrView: Template[Any, TemplateInstance[Any]], data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: Template[Any, TemplateInstance[Any]], data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    
    type EventsMap[D, T] = StringDictionary[js.Function2[/* event */ Event, /* instance */ T, Any]]
    
    type HelpersMap = StringDictionary[js.Function]
    
    @js.native
    trait TemplateStatic[D, T]
      extends StObject
         with Instantiable0[Template[Any, TemplateInstance[Any]]]
         with Instantiable1[/* viewName */ String, Template[Any, TemplateInstance[Any]]]
         with Instantiable2[
              (/* viewName */ String) | (/* viewName */ Unit), 
              /* renderFunction */ js.Function, 
              Template[Any, TemplateInstance[Any]]
            ] {
      
      def currentData(): D = js.native
      
      def instance(): T = js.native
      
      def parentData(): Record[String, Any] = js.native
      def parentData(numLevels: Double): Record[String, Any] = js.native
      
      def registerHelper(name: String, func: js.Function): Unit = js.native
    }
    
    @js.native
    trait ViewStatic
      extends StObject
         with Instantiable0[View]
         with Instantiable1[/* name */ String, View]
         with Instantiable2[(/* name */ String) | (/* name */ Unit), /* renderFunction */ js.Function, View]
  }
}
