package typings.polymerTs

import org.scalablytyped.runtime.Instantiable1
import typings.polymerTs.polymer.Base
import typings.polymerTs.polymer.Element
import typings.polymerTs.polymer.Property
import typings.polymerTs.polymer.dom
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Polymer_ {
    
    @scala.inline
    def apply(prototype: Element): FunctionConstructor = ^.asInstanceOf[js.Dynamic].apply(prototype.asInstanceOf[js.Any]).asInstanceOf[FunctionConstructor]
    
    @JSGlobal("Polymer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Polymer.Base")
    @js.native
    def Base: js.Any = js.native
    @scala.inline
    def Base_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Base")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Class(prototype: Element): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(prototype.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    @scala.inline
    def appendChild(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    @JSGlobal("Polymer.dom")
    @js.native
    def dom: typings.polymerTs.polymer.dom = js.native
    @scala.inline
    def dom(node: Base): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("dom")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    @scala.inline
    def dom(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("dom")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    @scala.inline
    def dom_=(x: dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dom")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(node.asInstanceOf[js.Any], beforeNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    @scala.inline
    def removeChild(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    @scala.inline
    def updateStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateStyles")().asInstanceOf[Unit]
  }
  
  @scala.inline
  def behavior(behaviorObject: js.Any): js.Any = js.Dynamic.global.applyDynamic("behavior")(behaviorObject.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def component(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("component")(tagname.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  @scala.inline
  def component(tagname: String, extendsTag: String): js.Function1[/* target */ js.Function, Unit] = (js.Dynamic.global.applyDynamic("component")(tagname.asInstanceOf[js.Any], extendsTag.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  @scala.inline
  def computed(): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("computed")().asInstanceOf[js.Function2[/* target */ Element, /* computedFuncName */ String, Unit]]
  @scala.inline
  def computed(ob: Property): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("computed")(ob.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* computedFuncName */ String, Unit]]
  
  @scala.inline
  def extend(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("extend")(tagname.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  @scala.inline
  def hostAttributes(attributes: js.Object): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("hostAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  @scala.inline
  def listen(eventName: String): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("listen")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def observe(observedProps: String): js.Function2[/* target */ Element, /* observerFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("observe")(observedProps.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* observerFuncName */ String, Unit]]
  
  object polymer {
    
    @JSGlobal("polymer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("polymer.Base")
    @js.native
    class Base ()
      extends StObject
         with typings.polymerTs.polymer.Base {
      
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
      
      /* CompleteClass */
      override val assignedSlot: HTMLSlotElement | Null = js.native
      
      /* CompleteClass */
      var contentEditable: String = js.native
      
      /* CompleteClass */
      var enterKeyHint: String = js.native
      
      /* CompleteClass */
      var innerHTML: String = js.native
      
      /* CompleteClass */
      var inputMode: String = js.native
      
      /* CompleteClass */
      override val isContentEditable: Boolean = js.native
      
      /**
        * Returns the first following sibling that is an element, and null otherwise.
        */
      /* CompleteClass */
      override val nextElementSibling: typings.std.Element | Null = js.native
      
      /**
        * Returns the first preceding sibling that is an element, and null otherwise.
        */
      /* CompleteClass */
      override val previousElementSibling: typings.std.Element | Null = js.native
      
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
      
      /* CompleteClass */
      override val style: CSSStyleDeclaration = js.native
    }
    object Base {
      
      @JSGlobal("polymer.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def create[T /* <: typings.polymerTs.polymer.Base */](args: js.Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[T]
      
      /* static member */
      @scala.inline
      def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    }
    
    @JSGlobal("polymer.PolymerBase")
    @js.native
    class PolymerBase ()
      extends StObject
         with typings.polymerTs.polymer.PolymerBase {
      
      /* CompleteClass */
      override val assignedSlot: HTMLSlotElement | Null = js.native
      
      /* CompleteClass */
      var contentEditable: String = js.native
      
      /* CompleteClass */
      var enterKeyHint: String = js.native
      
      /* CompleteClass */
      var innerHTML: String = js.native
      
      /* CompleteClass */
      var inputMode: String = js.native
      
      /* CompleteClass */
      override val isContentEditable: Boolean = js.native
      
      /**
        * Returns the first following sibling that is an element, and null otherwise.
        */
      /* CompleteClass */
      override val nextElementSibling: typings.std.Element | Null = js.native
      
      /**
        * Returns the first preceding sibling that is an element, and null otherwise.
        */
      /* CompleteClass */
      override val previousElementSibling: typings.std.Element | Null = js.native
      
      /* CompleteClass */
      override val style: CSSStyleDeclaration = js.native
    }
    
    @scala.inline
    def createClass[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(element.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ js.Any, T]]
    
    @scala.inline
    def createDomModule(definition: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomModule")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def createElement[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ js.Any, T]]
    
    @scala.inline
    def createEs6PolymerBase(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createEs6PolymerBase")().asInstanceOf[Unit]
    
    @scala.inline
    def isRegistered(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def prepareForRegistration(elementClass: js.Function): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareForRegistration")(elementClass.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  @scala.inline
  def property(): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("property")().asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  @scala.inline
  def property(ob: Property): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("property")(ob.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def style(styleString: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("style")(styleString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  @scala.inline
  def template(templateString: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("template")(templateString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
}
