package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Tracker.Computation
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blazeMod {
  
  object Blaze {
    
    @JSImport("meteor/blaze", "Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/blaze", "Blaze.Each")
    @js.native
    def Each(argFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSImport("meteor/blaze", "Blaze.Each")
    @js.native
    def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.If")
    @js.native
    def If(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSImport("meteor/blaze", "Blaze.If")
    @js.native
    def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.Let")
    @js.native
    def Let(bindings: js.Function, contentFunc: js.Function): View = js.native
    
    @js.native
    trait Template extends StObject {
      
      @JSName("$")
      var $: js.Any = js.native
      
      def constructView(): View = js.native
      
      var created: js.Function = js.native
      
      var destroyed: js.Function = js.native
      
      def events(eventsMap: EventsMap): Unit = js.native
      
      def find(selector: String): HTMLElement = js.native
      
      def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      var head: Template = js.native
      
      def helpers(helpersMap: HelpersMap): Unit = js.native
      
      def onCreated(cb: js.Function): Unit = js.native
      
      def onDestroyed(cb: js.Function): Unit = js.native
      
      def onRendered(cb: js.Function): Unit = js.native
      
      var renderFunction: js.Function = js.native
      
      var rendered: js.Function = js.native
      
      var viewName: String = js.native
    }
    object Template {
      
      @JSImport("meteor/blaze", "Blaze.Template")
      @js.native
      val ^ : typings.meteor.blazeMod.Blaze.TemplateStatic = js.native
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$(value: js.Any): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConstructView(value: () => View): Self = StObject.set(x, "constructView", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreated(value: js.Function): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroyed(value: js.Function): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvents(value: EventsMap => Unit): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHead(value: Template): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHelpers(value: HelpersMap => Unit): Self = StObject.set(x, "helpers", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCreated(value: js.Function => Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDestroyed(value: js.Function => Unit): Self = StObject.set(x, "onDestroyed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRendered(value: js.Function => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRenderFunction(value: js.Function): Self = StObject.set(x, "renderFunction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendered(value: js.Function): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.Template")
    @js.native
    class TemplateCls () extends Template {
      def this(viewName: String) = this()
      def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
      def this(viewName: String, renderFunction: js.Function) = this()
    }
    
    @js.native
    trait TemplateInstance extends StObject {
      
      @JSName("$")
      def $(selector: String): js.Any = js.native
      
      def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      var data: Record[String, _] = js.native
      
      def find(selector: String): HTMLElement = js.native
      
      def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      var firstNode: js.Object = js.native
      
      var lastNode: js.Object = js.native
      
      def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
      
      def subscriptionsReady(): Boolean = js.native
      
      var view: js.Object = js.native
    }
    object TemplateInstance {
      
      @JSImport("meteor/blaze", "Blaze.TemplateInstance")
      @js.native
      val ^ : TemplateInstanceStatic = js.native
      
      @scala.inline
      implicit class TemplateInstanceMutableBuilder[Self <: TemplateInstance] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$(value: String => js.Any): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
        
        @scala.inline
        def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFirstNode(value: js.Object): Self = StObject.set(x, "firstNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastNode(value: js.Object): Self = StObject.set(x, "lastNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSubscriptionsReady(value: () => Boolean): Self = StObject.set(x, "subscriptionsReady", js.Any.fromFunction0(value))
        
        @scala.inline
        def setView(value: js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.TemplateInstance")
    @js.native
    class TemplateInstanceCls protected () extends TemplateInstance {
      def this(view: View) = this()
    }
    
    @JSImport("meteor/blaze", "Blaze.Unless")
    @js.native
    def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSImport("meteor/blaze", "Blaze.Unless")
    @js.native
    def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @js.native
    trait View extends StObject {
      
      def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      def firstNode(): Node = js.native
      
      var isCreated: Boolean = js.native
      
      var isDestroyed: Boolean = js.native
      
      var isRendered: Boolean = js.native
      
      def lastNode(): Node = js.native
      
      var name: String = js.native
      
      def onViewCreated(func: js.Function): Unit = js.native
      
      def onViewDestroyed(func: js.Function): Unit = js.native
      
      def onViewReady(func: js.Function): Unit = js.native
      
      var parentView: View = js.native
      
      var renderCount: Double = js.native
      
      var template: Template = js.native
      
      def templateInstance(): TemplateInstance = js.native
    }
    object View {
      
      @JSImport("meteor/blaze", "Blaze.View")
      @js.native
      val ^ : ViewStatic = js.native
      
      @scala.inline
      implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFirstNode(value: () => Node): Self = StObject.set(x, "firstNode", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsCreated(value: Boolean): Self = StObject.set(x, "isCreated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastNode(value: () => Node): Self = StObject.set(x, "lastNode", js.Any.fromFunction0(value))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnViewCreated(value: js.Function => Unit): Self = StObject.set(x, "onViewCreated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnViewDestroyed(value: js.Function => Unit): Self = StObject.set(x, "onViewDestroyed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnViewReady(value: js.Function => Unit): Self = StObject.set(x, "onViewReady", js.Any.fromFunction1(value))
        
        @scala.inline
        def setParentView(value: View): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderCount(value: Double): Self = StObject.set(x, "renderCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateInstance(value: () => TemplateInstance): Self = StObject.set(x, "templateInstance", js.Any.fromFunction0(value))
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.View")
    @js.native
    class ViewCls () extends View {
      def this(name: String) = this()
      def this(name: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
      def this(name: String, renderFunction: js.Function) = this()
    }
    
    @JSImport("meteor/blaze", "Blaze.With")
    @js.native
    def With(data: js.Function, contentFunc: js.Function): View = js.native
    @JSImport("meteor/blaze", "Blaze.With")
    @js.native
    def With(data: js.Object, contentFunc: js.Function): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.currentView")
    @js.native
    def currentView: View = js.native
    @scala.inline
    def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/blaze", "Blaze.getData")
    @js.native
    def getData(): js.Object = js.native
    @JSImport("meteor/blaze", "Blaze.getData")
    @js.native
    def getData(elementOrView: View): js.Object = js.native
    @JSImport("meteor/blaze", "Blaze.getData")
    @js.native
    def getData(elementOrView: HTMLElement): js.Object = js.native
    
    @JSImport("meteor/blaze", "Blaze.getView")
    @js.native
    def getView(): View = js.native
    @JSImport("meteor/blaze", "Blaze.getView")
    @js.native
    def getView(element: HTMLElement): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.isTemplate")
    @js.native
    def isTemplate(value: js.Any): Boolean = js.native
    
    @JSImport("meteor/blaze", "Blaze.remove")
    @js.native
    def remove(renderedView: View): Unit = js.native
    
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: Template, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: Template, parentNode: Node, nextNode: js.UndefOr[scala.Nothing], parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: Template, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: Template, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: js.UndefOr[scala.Nothing], parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: Template,
      data: js.Function,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: Template,
      data: js.Object,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: View,
      data: js.Function,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: View,
      data: js.Object,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
    @JSImport("meteor/blaze", "Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    
    @JSImport("meteor/blaze", "Blaze.toHTML")
    @js.native
    def toHTML(templateOrView: Template): String = js.native
    @JSImport("meteor/blaze", "Blaze.toHTML")
    @js.native
    def toHTML(templateOrView: View): String = js.native
    
    @JSImport("meteor/blaze", "Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: Template, data: js.Function): String = js.native
    @JSImport("meteor/blaze", "Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: Template, data: js.Object): String = js.native
    @JSImport("meteor/blaze", "Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: View, data: js.Function): String = js.native
    @JSImport("meteor/blaze", "Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: View, data: js.Object): String = js.native
    
    type EventsMap = StringDictionary[js.Function]
    
    type HelpersMap = StringDictionary[js.Function]
    
    @js.native
    trait TemplateInstanceStatic extends Instantiable1[/* view */ View, TemplateInstance]
    
    @js.native
    trait TemplateStatic
      extends Instantiable0[Template]
         with Instantiable1[/* viewName */ String, Template]
         with Instantiable2[js.UndefOr[/* viewName */ String], /* renderFunction */ js.Function, Template] {
      
      def currentData(): js.Any = js.native
      
      def instance(): TemplateInstance = js.native
      
      def parentData(numLevels: Double): js.Any = js.native
      
      def registerHelper(name: String, func: js.Function): Unit = js.native
    }
    
    @js.native
    trait ViewStatic
      extends Instantiable0[View]
         with Instantiable1[/* name */ String, View]
         with Instantiable2[js.UndefOr[/* name */ String], /* renderFunction */ js.Function, View]
  }
}
