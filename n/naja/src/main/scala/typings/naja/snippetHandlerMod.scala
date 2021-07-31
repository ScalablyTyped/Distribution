package typings.naja

import typings.naja.anon.Append
import typings.naja.anon.ChangeOperation
import typings.naja.anon.Content
import typings.naja.najaStrings.afterUpdate
import typings.naja.najaStrings.beforeUpdate
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.Element
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snippetHandlerMod {
  
  @JSImport("naja/src/core/SnippetHandler", "SnippetHandler")
  @js.native
  class SnippetHandler ()
    extends StObject
       with EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var op: Append = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AfterUpdateEvent, js.Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeUpdateEvent, js.Any],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  type AfterUpdateEvent = CustomEvent[Content]
  
  type BeforeUpdateEvent = CustomEvent[ChangeOperation]
  
  type SnippetUpdateOperation = js.Function2[/* snippet */ Element, /* content */ String, Unit]
}
