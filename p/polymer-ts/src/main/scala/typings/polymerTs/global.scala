package typings.polymerTs

import org.scalablytyped.runtime.Instantiable1
import typings.polymerTs.polymer.Base
import typings.polymerTs.polymer.Element
import typings.polymerTs.polymer.Property
import typings.polymerTs.polymer.dom
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Polymer_ {
    
    @JSGlobal("Polymer")
    @js.native
    def apply(prototype: Element): FunctionConstructor = js.native
    @JSGlobal("Polymer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Polymer.Base")
    @js.native
    def Base: js.Any = js.native
    @scala.inline
    def Base_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Base")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Polymer.Class")
    @js.native
    def Class(prototype: Element): js.Function = js.native
    
    @JSGlobal("Polymer.appendChild")
    @js.native
    def appendChild(node: HTMLElement): HTMLElement = js.native
    
    @JSGlobal("Polymer.dom")
    @js.native
    def dom: typings.polymerTs.polymer.dom = js.native
    @JSGlobal("Polymer.dom")
    @js.native
    def dom(node: Base): HTMLElement = js.native
    @JSGlobal("Polymer.dom")
    @js.native
    def dom(node: HTMLElement): HTMLElement = js.native
    @scala.inline
    def dom_=(x: dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dom")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Polymer.insertBefore")
    @js.native
    def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = js.native
    
    @JSGlobal("Polymer.removeChild")
    @js.native
    def removeChild(node: HTMLElement): HTMLElement = js.native
    
    @JSGlobal("Polymer.updateStyles")
    @js.native
    def updateStyles(): Unit = js.native
  }
  
  @JSGlobal("behavior")
  @js.native
  def behavior(behaviorObject: js.Any): js.Any = js.native
  
  @JSGlobal("component")
  @js.native
  def component(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.native
  @JSGlobal("component")
  @js.native
  def component(tagname: String, extendsTag: String): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSGlobal("computed")
  @js.native
  def computed(): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.native
  @JSGlobal("computed")
  @js.native
  def computed(ob: Property): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.native
  
  @JSGlobal("extend")
  @js.native
  def extend(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSGlobal("hostAttributes")
  @js.native
  def hostAttributes(attributes: js.Object): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSGlobal("listen")
  @js.native
  def listen(eventName: String): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  
  @JSGlobal("observe")
  @js.native
  def observe(observedProps: String): js.Function2[/* target */ Element, /* observerFuncName */ String, Unit] = js.native
  
  object polymer {
    
    @JSGlobal("polymer.Base")
    @js.native
    class Base ()
      extends typings.polymerTs.polymer.Base
    object Base {
      
      /* static member */
      @JSGlobal("polymer.Base.create")
      @js.native
      def create[T /* <: typings.polymerTs.polymer.Base */](args: js.Any*): T = js.native
      
      /* static member */
      @JSGlobal("polymer.Base.register")
      @js.native
      def register(): Unit = js.native
    }
    
    @JSGlobal("polymer.PolymerBase")
    @js.native
    class PolymerBase ()
      extends typings.polymerTs.polymer.PolymerBase
    
    @JSGlobal("polymer.createClass")
    @js.native
    def createClass[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
    
    @JSGlobal("polymer.createDomModule")
    @js.native
    def createDomModule(definition: Element): Unit = js.native
    
    @JSGlobal("polymer.createElement")
    @js.native
    def createElement[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
    
    @JSGlobal("polymer.createEs6PolymerBase")
    @js.native
    def createEs6PolymerBase(): Unit = js.native
    
    @JSGlobal("polymer.isRegistered")
    @js.native
    def isRegistered(element: Element): Boolean = js.native
    
    @JSGlobal("polymer.prepareForRegistration")
    @js.native
    def prepareForRegistration(elementClass: js.Function): Element = js.native
  }
  
  @JSGlobal("property")
  @js.native
  def property(): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  @JSGlobal("property")
  @js.native
  def property(ob: Property): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  
  @JSGlobal("style")
  @js.native
  def style(styleString: String): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSGlobal("template")
  @js.native
  def template(templateString: String): js.Function1[/* target */ js.Function, Unit] = js.native
}
