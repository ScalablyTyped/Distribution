package typings.namedRoutes

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Express
import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.namedRoutes.anon.PartialRouteOptions
import typings.namedRoutes.anon.PartialRouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("named-routes", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with NamedRouter {
    def this(options: PartialRouterOptions) = this()
  }
  
  @js.native
  trait NamedRouter extends StObject {
    
    def add(
      method: String,
      path: String,
      callbacks: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
    ): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]],
      options: PartialRouteOptions
    ): Unit = js.native
    def add(method: String, path: String, callbacks: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: RequestHandler[ParamsDictionary, js.Any, js.Any, Query],
      options: PartialRouteOptions
    ): Unit = js.native
    
    def build(name: String): String = js.native
    def build(name: String, params: Unit, method: String): String = js.native
    def build(name: String, params: RouteParams): String = js.native
    def build(name: String, params: RouteParams, method: String): String = js.native
    
    def dispatch(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Unit, next: NextFunction): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any]): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], next: NextFunction): Unit = js.native
    
    def extendExpress(app: Express): NamedRouter = js.native
    def extendExpress(app: Router): NamedRouter = js.native
    
    def `match`(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Boolean | js.Object = js.native
    
    def param(callback: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): NamedRouter = js.native
    def param(name: String, callback: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): NamedRouter = js.native
    
    def registerAppHelpers(app: Express): NamedRouter = js.native
  }
  
  trait RouteOptions extends StObject {
    
    var caseSensitive: Boolean
    
    var name: String
    
    var recursiveWildcard: Boolean
    
    var wildcardInPairs: Boolean
  }
  object RouteOptions {
    
    @scala.inline
    def apply(caseSensitive: Boolean, name: String, recursiveWildcard: Boolean, wildcardInPairs: Boolean): RouteOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursiveWildcard = recursiveWildcard.asInstanceOf[js.Any], wildcardInPairs = wildcardInPairs.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveWildcard(value: Boolean): Self = StObject.set(x, "recursiveWildcard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardInPairs(value: Boolean): Self = StObject.set(x, "wildcardInPairs", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParams = StringDictionary[String | (js.Array[Boolean | Double | String]) | Double | Boolean | Null]
  
  trait RouterOptions extends StObject {
    
    var caseSensitive: Boolean
  }
  object RouterOptions {
    
    @scala.inline
    def apply(caseSensitive: Boolean): RouterOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    trait Application extends StObject {
      
      var namedRoutes: NamedRouter
    }
    object Application {
      
      @scala.inline
      def apply(namedRoutes: NamedRouter): Application = {
        val __obj = js.Dynamic.literal(namedRoutes = namedRoutes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Application]
      }
      
      @scala.inline
      implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNamedRoutes(value: NamedRouter): Self = StObject.set(x, "namedRoutes", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-name
    type IRouterMatcher[T] = js.Function3[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathParams */ /* path */ js.Any, 
        /* name */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestHandler */ /* repeated */ js.Any, 
        T
      ]
  }
}
