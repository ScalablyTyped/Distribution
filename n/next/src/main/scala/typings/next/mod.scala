package typings.next

import typings.next.distServerNextMod.NextServer
import typings.next.distServerNextMod.NextServerOptions
import typings.react.mod.Context
import typings.react.mod.HTMLAttributes
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
    
    inline def cache[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
    
    // TODO-APP: check if this is the right type.
    inline def use[T](promise: js.Promise[T] | Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(promise.asInstanceOf[js.Any]).asInstanceOf[T]
    
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
         with HTMLAttributes[T]
    object LinkHTMLAttributes {
      
      inline def apply[T](): LinkHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkHTMLAttributes[T]]
      }
    }
  }
}
