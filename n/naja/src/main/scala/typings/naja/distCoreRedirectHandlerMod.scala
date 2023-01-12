package typings.naja

import typings.naja.anon.IsHardRedirect
import typings.naja.distNajaMod.Naja
import typings.naja.distNajaMod.Options
import typings.naja.distUtilsMod.TypedEventListener
import typings.naja.najaStrings.redirect
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventTarget
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRedirectHandlerMod {
  
  @JSImport("naja/dist/core/RedirectHandler", "RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var locationAdapter: LocationAdapter = js.native
    
    def makeRedirect(url: String, force: Boolean): Unit = js.native
    def makeRedirect(url: String, force: Boolean, options: Options): Unit = js.native
    def makeRedirect(url: URL, force: Boolean): Unit = js.native
    def makeRedirect(url: URL, force: Boolean, options: Options): Unit = js.native
    
    /* private */ val naja: Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  trait LocationAdapter extends StObject {
    
    def assign(url: String): Unit
  }
  object LocationAdapter {
    
    inline def apply(assign: String => Unit): LocationAdapter = {
      val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign))
      __obj.asInstanceOf[LocationAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationAdapter] (val x: Self) extends AnyVal {
      
      inline def setAssign(value: String => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
    }
  }
  
  type RedirectEvent = CustomEvent[IsHardRedirect]
  
  trait RedirectHandlerEventMap extends StObject {
    
    var redirect: RedirectEvent
  }
  object RedirectHandlerEventMap {
    
    inline def apply(redirect: RedirectEvent): RedirectHandlerEventMap = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectHandlerEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectHandlerEventMap] (val x: Self) extends AnyVal {
      
      inline def setRedirect(value: RedirectEvent): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var forceRedirect: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options] (val x: Self) extends AnyVal {
        
        inline def setForceRedirect(value: Boolean): Self = StObject.set(x, "forceRedirect", value.asInstanceOf[js.Any])
        
        inline def setForceRedirectUndefined: Self = StObject.set(x, "forceRedirect", js.undefined)
      }
    }
    
    trait Payload extends StObject {
      
      var redirect: js.UndefOr[String] = js.undefined
    }
    object Payload {
      
      inline def apply(): Payload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payload]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
        
        inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
        
        inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      }
    }
  }
}
