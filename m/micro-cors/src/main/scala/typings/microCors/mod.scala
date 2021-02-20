package typings.microCors

import typings.micro.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro-cors", JSImport.Namespace)
  @js.native
  def apply(): js.Function1[/* handler */ RequestHandler, RequestHandler] = js.native
  @JSImport("micro-cors", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Function1[/* handler */ RequestHandler, RequestHandler] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowCredentials: js.UndefOr[Boolean] = js.native
    
    var allowHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var allowMethods: js.UndefOr[js.Array[String]] = js.native
    
    var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var origin: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
      
      @scala.inline
      def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      @scala.inline
      def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      @scala.inline
      def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      @scala.inline
      def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
      
      @scala.inline
      def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      @scala.inline
      def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
