package typings.nextAuth

import typings.next.distServerWebTypesMod.NextMiddlewareResult
import typings.next.serverMod.NextFetchEvent
import typings.nextAuth.nextMiddlewareMod.NextRequestWithAuth
import typings.nextAuth.nextMiddlewareMod.WithAuthArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("next-auth/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithAuthArgs is not an array type */ args: WithAuthArgs
  ): js.Promise[NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[NextMiddlewareResult]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[NextMiddlewareResult]
  ])]
  
  inline def withAuth(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithAuthArgs is not an array type */ args: WithAuthArgs
  ): js.Promise[NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[NextMiddlewareResult]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuth")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[NextMiddlewareResult]
  ])]
}
