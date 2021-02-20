package typings.methodOverride

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(getter: js.UndefOr[scala.Nothing], options: MethodOverrideOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(getter: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  object Express {
    
    @js.native
    trait Request extends StObject {
      
      var originalMethod: js.UndefOr[String] = js.native
    }
    object Request {
      
      @scala.inline
      def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalMethod(value: String): Self = StObject.set(x, "originalMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalMethodUndefined: Self = StObject.set(x, "originalMethod", js.undefined)
      }
    }
  }
  
  @js.native
  trait MethodOverrideOptions extends StObject {
    
    var methods: js.Array[String] = js.native
  }
  object MethodOverrideOptions {
    
    @scala.inline
    def apply(methods: js.Array[String]): MethodOverrideOptions = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodOverrideOptions]
    }
    
    @scala.inline
    implicit class MethodOverrideOptionsMutableBuilder[Self <: MethodOverrideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
