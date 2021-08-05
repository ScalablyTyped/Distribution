package typings.methodOverride

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(getter: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(getter.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(getter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(
    getter: js.Function2[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      String
    ]
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(getter.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(
    getter: js.Function2[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      String
    ],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(getter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(getter: Unit, options: MethodOverrideOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(getter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("method-override", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Express {
    
    trait Request extends StObject {
      
      var originalMethod: js.UndefOr[String] = js.undefined
    }
    object Request {
      
      inline def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setOriginalMethod(value: String): Self = StObject.set(x, "originalMethod", value.asInstanceOf[js.Any])
        
        inline def setOriginalMethodUndefined: Self = StObject.set(x, "originalMethod", js.undefined)
      }
    }
  }
  
  trait MethodOverrideOptions extends StObject {
    
    var methods: js.Array[String]
  }
  object MethodOverrideOptions {
    
    inline def apply(methods: js.Array[String]): MethodOverrideOptions = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodOverrideOptions]
    }
    
    extension [Self <: MethodOverrideOptions](x: Self) {
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
