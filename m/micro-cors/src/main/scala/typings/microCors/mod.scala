package typings.microCors

import typings.micro.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function1[/* handler */ RequestHandler, RequestHandler] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* handler */ RequestHandler, RequestHandler]]
  inline def apply(options: Options): js.Function1[/* handler */ RequestHandler, RequestHandler] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handler */ RequestHandler, RequestHandler]]
  
  @JSImport("micro-cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var allowCredentials: js.UndefOr[Boolean] = js.undefined
    
    var allowHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
      
      inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
      
      inline def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      inline def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value*))
      
      inline def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      inline def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value*))
      
      inline def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value*))
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
