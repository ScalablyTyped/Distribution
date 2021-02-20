package typings.naja

import typings.naja.anon.IsHardRedirect
import typings.naja.najaStrings.redirect
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectHandlerMod {
  
  @JSImport("naja/src/core/RedirectHandler", "RedirectHandler")
  @js.native
  class RedirectHandler () extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_redirect(`type`: redirect, listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var locationAdapter: LocationAdapter = js.native
    
    def makeRedirect(url: String, force: Boolean): Unit = js.native
    def makeRedirect(url: URL, force: Boolean): Unit = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(`type`: redirect, listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ RedirectEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  @js.native
  trait LocationAdapter extends StObject {
    
    def assign(url: String): Unit = js.native
  }
  object LocationAdapter {
    
    @scala.inline
    def apply(assign: String => Unit): LocationAdapter = {
      val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign))
      __obj.asInstanceOf[LocationAdapter]
    }
    
    @scala.inline
    implicit class LocationAdapterMutableBuilder[Self <: LocationAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssign(value: String => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
    }
  }
  
  type RedirectEvent = CustomEvent[IsHardRedirect]
}
