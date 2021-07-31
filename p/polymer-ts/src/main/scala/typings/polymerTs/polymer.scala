package typings.polymerTs

import org.scalablytyped.runtime.StringDictionary
import typings.polymerTs.anon.AddedCount
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polymer {
  
  @js.native
  trait Base
    extends StObject
       with PolymerBase
       with Element {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var is: String = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait Element extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var attributeChanged: js.UndefOr[
        js.Function3[/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any, Unit]
      ] = js.undefined
    
    var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var listeners: js.UndefOr[js.Object] = js.undefined
    
    var observers: js.UndefOr[js.Array[String]] = js.undefined
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Element {
    
    @scala.inline
    def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setAttributeChanged(value: (/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any) => Unit): Self = StObject.set(x, "attributeChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAttributeChangedUndefined: Self = StObject.set(x, "attributeChanged", js.undefined)
      
      @scala.inline
      def setBehaviors(value: js.Array[js.Object]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
      
      @scala.inline
      def setBehaviorsVarargs(value: js.Object*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setFactoryImpl(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "factoryImpl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFactoryImplUndefined: Self = StObject.set(x, "factoryImpl", js.undefined)
      
      @scala.inline
      def setListeners(value: js.Object): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setObservers(value: js.Array[String]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      @scala.inline
      def setObserversVarargs(value: String*): Self = StObject.set(x, "observers", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  trait FireOptions extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[HTMLElement | Base] = js.undefined
  }
  object FireOptions {
    
    @scala.inline
    def apply(): FireOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FireOptions]
    }
    
    @scala.inline
    implicit class FireOptionsMutableBuilder[Self <: FireOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setNode(value: HTMLElement | Base): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  @js.native
  trait PolymerBase
    extends StObject
       with HTMLElement {
    
    @JSName("$")
    var $: js.Any = js.native
    
    @JSName("$$")
    var DollarDollar: js.Any = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def arrayDelete(path: String, item: String): js.Any = js.native
    def arrayDelete(path: String, item: js.Any): js.Any = js.native
    
    def async(callback: js.Function): js.Any = js.native
    def async(callback: js.Function, waitTime: Double): js.Any = js.native
    
    def attachedCallback(): Unit = js.native
    
    def attributeFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
    
    def cancelAsync(handle: Double): Unit = js.native
    
    def cancelDebouncer(jobName: String): Unit = js.native
    
    def classFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
    
    def create(tag: String): HTMLElement = js.native
    def create(tag: String, props: js.Object): HTMLElement = js.native
    
    var customStyle: StringDictionary[String] = js.native
    
    def debounce(jobName: String, callback: js.Function): Unit = js.native
    def debounce(jobName: String, callback: js.Function, wait: Double): Unit = js.native
    
    def deserialize(value: String, `type`: js.Any): js.Any = js.native
    
    def distributeContent(): Unit = js.native
    
    def domHost(): Unit = js.native
    
    def elementMatches(selector: String, node: Element): js.Any = js.native
    
    def fire(`type`: String): js.Any = js.native
    def fire(`type`: String, detail: js.Object): js.Any = js.native
    def fire(`type`: String, detail: js.Object, options: FireOptions): js.Any = js.native
    def fire(`type`: String, detail: Unit, options: FireOptions): js.Any = js.native
    
    def flushDebouncer(jobName: String): Unit = js.native
    
    def get(path: String): js.Any = js.native
    def get(path: js.Array[String | Double]): js.Any = js.native
    
    def getContentChildNodes(slctr: String): js.Any = js.native
    
    def getContentChildren(slctr: String): js.Any = js.native
    
    def getNativePrototype(tag: String): js.Any = js.native
    
    def getPropertyInfo(property: String): js.Any = js.native
    
    def importHref(href: String): js.Any = js.native
    def importHref(href: String, onload: js.Function): js.Any = js.native
    def importHref(href: String, onload: js.Function, onerror: js.Function): js.Any = js.native
    def importHref(href: String, onload: js.Function, onerror: js.Function, optAsync: Boolean): js.Any = js.native
    def importHref(href: String, onload: js.Function, onerror: Unit, optAsync: Boolean): js.Any = js.native
    def importHref(href: String, onload: Unit, onerror: js.Function): js.Any = js.native
    def importHref(href: String, onload: Unit, onerror: js.Function, optAsync: Boolean): js.Any = js.native
    def importHref(href: String, onload: Unit, onerror: Unit, optAsync: Boolean): js.Any = js.native
    
    def instanceTemplate(template: js.Any): js.Any = js.native
    
    def isDebouncerActive(jobName: String): js.Any = js.native
    
    def linkPaths(to: String, from: String): Unit = js.native
    
    def listen(node: Element, eventName: String, methodName: String): Unit = js.native
    
    def mixin(target: js.Object, source: js.Object): Unit = js.native
    
    def notifyPath(path: String, value: js.Any): Unit = js.native
    def notifyPath(path: String, value: js.Any, fromAbove: js.Any): Unit = js.native
    
    def notifySplices(path: String, splices: AddedCount): Unit = js.native
    
    def pop(path: String): js.Any = js.native
    
    def push(path: String, value: js.Any): js.Any = js.native
    
    def reflectPropertyToAttribute(name: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def resolveUrl(url: String): js.Any = js.native
    
    var root: HTMLElement = js.native
    
    def scopeSubtree(container: Element, shouldObserve: Boolean): Unit = js.native
    
    def serialize(value: String): js.Any = js.native
    
    def serializeValueToAttribute(value: js.Any, attribute: String, node: Element): Unit = js.native
    
    def set(path: String, value: js.Any): js.Any = js.native
    def set(path: String, value: js.Any, root: js.Object): js.Any = js.native
    def set(path: js.Array[String | Double], value: js.Any): js.Any = js.native
    def set(path: js.Array[String | Double], value: js.Any, root: js.Object): js.Any = js.native
    
    def setScrollDirection(direction: String, node: HTMLElement): Unit = js.native
    
    var shadyRoot: HTMLElement = js.native
    
    def shift(path: String, value: js.Any): js.Any = js.native
    
    def splice(path: String, start: Double, deleteCount: Double, items: js.Any*): js.Any = js.native
    
    def toggleAttribute(name: String, force: Boolean, node: HTMLElement): Boolean = js.native
    def toggleAttribute(name: String, force: Unit, node: HTMLElement): Boolean = js.native
    
    def toggleClass(name: String, bool: Boolean): Unit = js.native
    def toggleClass(name: String, bool: Boolean, node: HTMLElement): Unit = js.native
    
    def transform(transform: String): Unit = js.native
    def transform(transform: String, node: HTMLElement): Unit = js.native
    
    def translate3d(x: js.Any, y: js.Any, z: js.Any): Unit = js.native
    def translate3d(x: js.Any, y: js.Any, z: js.Any, node: HTMLElement): Unit = js.native
    
    def unlinkPaths(path: String): Unit = js.native
    
    def unshift(path: String, value: js.Any): js.Any = js.native
    
    def updateStyles(): Unit = js.native
  }
  
  trait PolymerTSElement extends StObject {
    
    @JSName("$custom_cons")
    var $custom_cons: js.UndefOr[FunctionConstructor] = js.undefined
    
    @JSName("$custom_cons_args")
    var $custom_cons_args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object PolymerTSElement {
    
    @scala.inline
    def apply(): PolymerTSElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolymerTSElement]
    }
    
    @scala.inline
    implicit class PolymerTSElementMutableBuilder[Self <: PolymerTSElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$custom_cons(value: FunctionConstructor): Self = StObject.set(x, "$custom_cons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$custom_consUndefined: Self = StObject.set(x, "$custom_cons", js.undefined)
      
      @scala.inline
      def set$custom_cons_args(value: js.Array[js.Any]): Self = StObject.set(x, "$custom_cons_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$custom_cons_argsUndefined: Self = StObject.set(x, "$custom_cons_args", js.undefined)
      
      @scala.inline
      def set$custom_cons_argsVarargs(value: js.Any*): Self = StObject.set(x, "$custom_cons_args", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait Property extends StObject {
    
    var computed: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("notify")
    var notify_FProperty: js.UndefOr[Boolean] = js.undefined
    
    var observer: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var reflectToAttribute: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[js.Any] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Property {
    
    @scala.inline
    def apply(): Property = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputed(value: String): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      @scala.inline
      def setObserver(value: String): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setReflectToAttribute(value: Boolean): Self = StObject.set(x, "reflectToAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectToAttributeUndefined: Self = StObject.set(x, "reflectToAttribute", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait dom extends StObject {
    
    def apply(node: Base): HTMLElement = js.native
    def apply(node: HTMLElement): HTMLElement = js.native
    
    def flush(): js.Any = js.native
  }
}
