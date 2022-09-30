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

object Blaze {
  
  type EventsMap[D, T] = StringDictionary[js.Function2[/* event */ Event, /* instance */ T, Any]]
  
  type HelpersMap = StringDictionary[js.Function]
  
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
    
    inline def apply[D, T](
      $: JQueryStatic,
      constructView: () => View,
      created: js.Function,
      destroyed: js.Function,
      events: EventsMap[D, T] => Unit,
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      head: Template[Any, TemplateInstance[Any]],
      helpers: HelpersMap => Unit,
      onCreated: js.ThisFunction0[/* this */ T, Any] => Unit,
      onDestroyed: js.ThisFunction0[/* this */ T, Any] => Unit,
      onRendered: js.ThisFunction0[/* this */ T, Any] => Unit,
      renderFunction: js.Function,
      rendered: js.Function,
      viewName: String
    ): Template[D, T] = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = js.Any.fromFunction0(constructView), created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template[D, T]]
    }
    
    extension [Self <: Template[?, ?], D, T](x: Self & (Template[D, T])) {
      
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
  
  trait TemplateInstance[D] extends StObject {
    
    @JSName("$")
    def $[TElement /* <: HTMLElement */](selector: String): JQuery[TElement]
    
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
    
    var data: D
    
    def find(selector: String): HTMLElement
    
    def findAll(selector: String): js.Array[HTMLElement]
    
    var firstNode: js.Object
    
    var lastNode: js.Object
    
    def subscribe(name: String, args: Any*): SubscriptionHandle
    
    def subscriptionsReady(): Boolean
    
    var view: js.Object
  }
  object TemplateInstance {
    
    inline def apply[D](
      $: String => JQuery[Any],
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      data: D,
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      firstNode: js.Object,
      lastNode: js.Object,
      subscribe: (String, /* repeated */ Any) => SubscriptionHandle,
      subscriptionsReady: () => Boolean,
      view: js.Object
    ): TemplateInstance[D] = {
      val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateInstance[D]]
    }
    
    extension [Self <: TemplateInstance[?], D](x: Self & TemplateInstance[D]) {
      
      inline def set$(value: String => JQuery[Any]): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
      
      inline def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      inline def setFirstNode(value: js.Object): Self = StObject.set(x, "firstNode", value.asInstanceOf[js.Any])
      
      inline def setLastNode(value: js.Object): Self = StObject.set(x, "lastNode", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: (String, /* repeated */ Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setSubscriptionsReady(value: () => Boolean): Self = StObject.set(x, "subscriptionsReady", js.Any.fromFunction0(value))
      
      inline def setView(value: js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    inline def apply(
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      firstNode: () => Node,
      isCreated: Boolean,
      isDestroyed: Boolean,
      isRendered: Boolean,
      lastNode: () => Node,
      name: String,
      onViewCreated: js.Function => Unit,
      onViewDestroyed: js.Function => Unit,
      onViewReady: js.Function => Unit,
      parentView: View,
      renderCount: Double,
      template: Template[Any, TemplateInstance[Any]],
      templateInstance: () => TemplateInstance[Any]
    ): View = {
      val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = js.Any.fromFunction0(lastNode), name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = js.Any.fromFunction0(templateInstance))
      __obj.asInstanceOf[View]
    }
    
    extension [Self <: View](x: Self) {
      
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
  
  @js.native
  trait ViewStatic
    extends StObject
       with Instantiable0[View]
       with Instantiable1[/* name */ String, View]
       with Instantiable2[(/* name */ String) | (/* name */ Unit), /* renderFunction */ js.Function, View]
}
