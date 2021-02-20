package typings.nodeVault

import typings.nodeVault.mod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: js.Any = js.native
    
    var request: Option = js.native
    
    var statusCode: Double = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: js.Any, request: Option, statusCode: Double): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Option): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    var method: String = js.native
    
    var path: String = js.native
    
    var scheme: js.Any = js.native
  }
  object Method {
    
    @scala.inline
    def apply(method: String, path: String, scheme: js.Any): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    var query: js.UndefOr[Option] = js.native
    
    var req: js.UndefOr[Option] = js.native
    
    var res: js.UndefOr[Option] = js.native
  }
  object Query {
    
    @scala.inline
    def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: Option): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setReq(value: Option): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setRes(value: Option): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
}
