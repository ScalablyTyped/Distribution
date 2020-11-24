package typings.naja

import typings.naja.najaMod.Options
import typings.naja.najaStrings.interaction
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.HTMLFormElement
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("naja/src/core/UIHandler", JSImport.Namespace)
@js.native
object uihandlerMod extends js.Object {
  
  @js.native
  class UIHandler () extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var allowedOrigins: js.Array[String] = js.native
    
    def bindUI(element: Element): Unit = js.native
    
    def clickElement(element: Element, options: Options): Unit = js.native
    def clickElement(element: Element, options: Options, event: Event): Unit = js.native
    
    def isUrlAllowed(url: String): Boolean = js.native
    def isUrlAllowed(url: URL): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InteractionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var selector: String = js.native
    
    def submitForm(form: HTMLFormElement, options: Options): Unit = js.native
    def submitForm(form: HTMLFormElement, options: Options, event: Event): Unit = js.native
  }
  
  type InteractionEvent = CustomEvent[typings.naja.anon.Element]
}
