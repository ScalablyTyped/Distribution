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
    
    inline def apply(prototype: Element): FunctionConstructor = ^.asInstanceOf[js.Dynamic].apply(prototype.asInstanceOf[js.Any]).asInstanceOf[FunctionConstructor]
    
    @JSGlobal("Polymer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Polymer.Base")
    @js.native
    def Base: Any = js.native
    inline def Base_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Base")(x.asInstanceOf[js.Any])
    
    inline def Class(prototype: Element): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(prototype.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    inline def appendChild(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    @JSGlobal("Polymer.dom")
    @js.native
    def dom: typings.polymerTs.polymer.dom = js.native
    inline def dom(node: Base): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("dom")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def dom(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("dom")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def dom_=(x: dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dom")(x.asInstanceOf[js.Any])
    
    inline def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(node.asInstanceOf[js.Any], beforeNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    inline def removeChild(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    inline def updateStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateStyles")().asInstanceOf[Unit]
  }
  
  inline def behavior(behaviorObject: Any): Any = js.Dynamic.global.applyDynamic("behavior")(behaviorObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def component(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("component")(tagname.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  inline def component(tagname: String, extendsTag: String): js.Function1[/* target */ js.Function, Unit] = (js.Dynamic.global.applyDynamic("component")(tagname.asInstanceOf[js.Any], extendsTag.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def computed(): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("computed")().asInstanceOf[js.Function2[/* target */ Element, /* computedFuncName */ String, Unit]]
  inline def computed(ob: Property): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("computed")(ob.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* computedFuncName */ String, Unit]]
  
  inline def extend(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("extend")(tagname.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def hostAttributes(attributes: js.Object): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("hostAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def listen(eventName: String): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("listen")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  
  inline def observe(observedProps: String): js.Function2[/* target */ Element, /* observerFuncName */ String, Unit] = js.Dynamic.global.applyDynamic("observe")(observedProps.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* observerFuncName */ String, Unit]]
  
  object polymer {
    
    @JSGlobal("polymer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("polymer.Base")
    @js.native
    open class Base ()
      extends StObject
         with typings.polymerTs.polymer.Base {
      
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaAtomic: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaAutoComplete: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaBusy: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaChecked: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColCount: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColIndex: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColIndexText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColSpan: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaCurrent: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaDisabled: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaExpanded: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaHasPopup: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaHidden: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaInvalid: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaKeyShortcuts: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLabel: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLevel: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLive: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaModal: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaMultiLine: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaMultiSelectable: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaOrientation: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPlaceholder: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPosInSet: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPressed: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaReadOnly: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRequired: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRoleDescription: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowCount: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowIndex: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowIndexText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowSpan: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSelected: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSetSize: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSort: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueMax: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueMin: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueNow: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val assignedSlot: HTMLSlotElement | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var contentEditable: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var enterKeyHint: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var innerHTML: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var inputMode: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val isContentEditable: Boolean = js.native
      
      /** Returns the first following sibling that is an element, and null otherwise. */
      /* standard dom */
      /* CompleteClass */
      override val nextElementSibling: typings.std.Element | Null = js.native
      
      /** Returns the first preceding sibling that is an element, and null otherwise. */
      /* standard dom */
      /* CompleteClass */
      override val previousElementSibling: typings.std.Element | Null = js.native
      
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
      
      /* standard dom */
      /* CompleteClass */
      var role: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val style: CSSStyleDeclaration = js.native
    }
    object Base {
      
      @JSGlobal("polymer.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create[T /* <: typings.polymerTs.polymer.Base */](args: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
      
      /* static member */
      inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    }
    
    @JSGlobal("polymer.PolymerBase")
    @js.native
    open class PolymerBase ()
      extends StObject
         with typings.polymerTs.polymer.PolymerBase {
      
      /* standard dom */
      /* CompleteClass */
      var ariaAtomic: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaAutoComplete: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaBusy: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaChecked: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColCount: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColIndex: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColIndexText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaColSpan: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaCurrent: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaDisabled: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaExpanded: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaHasPopup: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaHidden: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaInvalid: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaKeyShortcuts: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLabel: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLevel: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaLive: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaModal: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaMultiLine: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaMultiSelectable: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaOrientation: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPlaceholder: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPosInSet: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaPressed: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaReadOnly: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRequired: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRoleDescription: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowCount: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowIndex: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowIndexText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaRowSpan: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSelected: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSetSize: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaSort: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueMax: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueMin: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueNow: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var ariaValueText: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val assignedSlot: HTMLSlotElement | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var contentEditable: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var enterKeyHint: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var innerHTML: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      var inputMode: String = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val isContentEditable: Boolean = js.native
      
      /** Returns the first following sibling that is an element, and null otherwise. */
      /* standard dom */
      /* CompleteClass */
      override val nextElementSibling: typings.std.Element | Null = js.native
      
      /** Returns the first preceding sibling that is an element, and null otherwise. */
      /* standard dom */
      /* CompleteClass */
      override val previousElementSibling: typings.std.Element | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      var role: String | Null = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val style: CSSStyleDeclaration = js.native
    }
    
    inline def createClass[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ Any, T]): Instantiable1[/* args (repeated) */ Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(element.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ Any, T]]
    
    inline def createDomModule(definition: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomModule")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createElement[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ Any, T]): Instantiable1[/* args (repeated) */ Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ Any, T]]
    
    inline def createEs6PolymerBase(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createEs6PolymerBase")().asInstanceOf[Unit]
    
    inline def isRegistered(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def prepareForRegistration(elementClass: js.Function): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareForRegistration")(elementClass.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  inline def property(): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("property")().asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  inline def property(ob: Property): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.Dynamic.global.applyDynamic("property")(ob.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Element, /* propertyKey */ String, Unit]]
  
  inline def style(styleString: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("style")(styleString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def template(templateString: String): js.Function1[/* target */ js.Function, Unit] = js.Dynamic.global.applyDynamic("template")(templateString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
}
