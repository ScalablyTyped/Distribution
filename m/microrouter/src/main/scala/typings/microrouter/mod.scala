package typings.microrouter

import org.scalablytyped.runtime.StringDictionary
import typings.micro.mod.RequestHandler
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microrouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("microrouter", "del")
  @js.native
  val del: RouteHandler = js.native
  
  @JSImport("microrouter", "get")
  @js.native
  val get: RouteHandler = js.native
  
  @JSImport("microrouter", "head")
  @js.native
  val head: RouteHandler = js.native
  
  @JSImport("microrouter", "options")
  @js.native
  val options: RouteHandler = js.native
  
  @JSImport("microrouter", "patch")
  @js.native
  val patch: RouteHandler = js.native
  
  @JSImport("microrouter", "post")
  @js.native
  val post: RouteHandler = js.native
  
  @JSImport("microrouter", "put")
  @js.native
  val put: RouteHandler = js.native
  
  inline def router(routes: RequestHandler*): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("router")(routes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RequestHandler]
  
  inline def withNamespace(namespace: String): js.Function1[/* repeated */ RequestHandler, RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespace")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ RequestHandler, RequestHandler]]
  
  type AugmentedRequestHandler = js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Any]
  
  type RouteHandler = js.Function2[
    /* path */ String | typings.urlPattern.mod.^, 
    /* handler */ AugmentedRequestHandler, 
    RequestHandler
  ]
  
  @js.native
  trait ServerRequest extends IncomingMessage {
    
    var params: StringDictionary[String] = js.native
    
    var query: StringDictionary[String] = js.native
  }
  
  type ServerResponse = typings.node.httpMod.ServerResponse[IncomingMessage]
}
