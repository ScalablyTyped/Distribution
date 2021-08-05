package typings.msportalfxMock

import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  inline def apply(): typings.msportalfxMock.expressServeStaticCoreMod.Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.msportalfxMock.expressServeStaticCoreMod.Express]
  
  @JSImport("express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Router(): typings.msportalfxMock.expressServeStaticCoreMod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typings.msportalfxMock.expressServeStaticCoreMod.Router]
  inline def Router(options: js.Any): typings.msportalfxMock.expressServeStaticCoreMod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.msportalfxMock.expressServeStaticCoreMod.Router]
  type Router = typings.msportalfxMock.expressServeStaticCoreMod.Router
  
  /**
    * This is the only built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  inline def static[R /* <: ServerResponse */](root: String): typings.serveStatic.mod.RequestHandler[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any]).asInstanceOf[typings.serveStatic.mod.RequestHandler[R]]
  /**
    * This is the only built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  inline def static[R /* <: ServerResponse */](root: String, options: ServeStaticOptions[R]): typings.serveStatic.mod.RequestHandler[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.serveStatic.mod.RequestHandler[R]]
  
  type Application = typings.msportalfxMock.expressServeStaticCoreMod.Application
  
  type CookieOptions = typings.msportalfxMock.expressServeStaticCoreMod.CookieOptions
  
  type Errback = typings.msportalfxMock.expressServeStaticCoreMod.Errback
  
  type ErrorRequestHandler = typings.msportalfxMock.expressServeStaticCoreMod.ErrorRequestHandler
  
  type Express = typings.msportalfxMock.expressServeStaticCoreMod.Express
  
  type Handler = typings.msportalfxMock.expressServeStaticCoreMod.Handler
  
  type IRoute = typings.msportalfxMock.expressServeStaticCoreMod.IRoute
  
  type IRouter[T] = typings.msportalfxMock.expressServeStaticCoreMod.IRouter[T]
  
  type IRouterMatcher[T] = typings.msportalfxMock.expressServeStaticCoreMod.IRouterMatcher[T]
  
  type MediaType = typings.msportalfxMock.expressServeStaticCoreMod.MediaType
  
  type NextFunction = typings.msportalfxMock.expressServeStaticCoreMod.NextFunction
  
  type Request = typings.msportalfxMock.expressServeStaticCoreMod.Request
  
  type RequestHandler = typings.msportalfxMock.expressServeStaticCoreMod.RequestHandler
  
  type RequestParamHandler = typings.msportalfxMock.expressServeStaticCoreMod.RequestParamHandler
  
  type Response = typings.msportalfxMock.expressServeStaticCoreMod.Response
  
  type Send = typings.msportalfxMock.expressServeStaticCoreMod.Send
}
