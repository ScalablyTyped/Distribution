package typings.next

import typings.next.distServerNextMod.NextServer
import typings.next.distServerNextMod.NextServerOptions
import typings.react.mod.HTMLAttributes
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: NextServerOptions): NextServer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[NextServer]
  
  // Extend the React types with missing properties
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("next", "react")
    @js.native
    val ^ : js.Any = js.native
    
    // TODO-APP: check if this is the right type.
    inline def experimentalUse[T](promise: js.Promise[T]): Awaited[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_use")(promise.asInstanceOf[js.Any]).asInstanceOf[Awaited[T]]
    
    // <html amp=""> support
    trait HtmlHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var amp: js.UndefOr[String] = js.undefined
    }
    object HtmlHTMLAttributes {
      
      inline def apply[T](): HtmlHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlHTMLAttributes[T]]
      }
      
      extension [Self <: HtmlHTMLAttributes[?], T](x: Self & HtmlHTMLAttributes[T]) {
        
        inline def setAmp(value: String): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
        
        inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      }
    }
    
    // <link nonce=""> support
    trait LinkHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var nonce: js.UndefOr[String] = js.undefined
    }
    object LinkHTMLAttributes {
      
      inline def apply[T](): LinkHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkHTMLAttributes[T]]
      }
      
      extension [Self <: LinkHTMLAttributes[?], T](x: Self & LinkHTMLAttributes[T]) {
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      }
    }
  }
}
