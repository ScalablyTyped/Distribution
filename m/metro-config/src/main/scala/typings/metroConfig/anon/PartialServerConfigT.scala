package typings.metroConfig.anon

import typings.metroConfig.srcConfigTypesMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<metro-config.metro-config/src/configTypes.ServerConfigT> */
trait PartialServerConfigT extends StObject {
  
  var enhanceMiddleware: js.UndefOr[
    js.Function2[
      /* middleware */ Middleware, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ /* server */ Any, 
      Middleware
    ]
  ] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var rewriteRequestUrl: js.UndefOr[js.Function1[/* url */ String, String]] = js.undefined
  
  var runInspectorProxy: js.UndefOr[Boolean] = js.undefined
  
  var unstable_serverRoot: js.UndefOr[String | Null] = js.undefined
  
  var useGlobalHotkey: js.UndefOr[Boolean] = js.undefined
  
  var verifyConnections: js.UndefOr[Boolean] = js.undefined
}
object PartialServerConfigT {
  
  inline def apply(): PartialServerConfigT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialServerConfigT] (val x: Self) extends AnyVal {
    
    inline def setEnhanceMiddleware(
      value: (/* middleware */ Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ /* server */ Any) => Middleware
    ): Self = StObject.set(x, "enhanceMiddleware", js.Any.fromFunction2(value))
    
    inline def setEnhanceMiddlewareUndefined: Self = StObject.set(x, "enhanceMiddleware", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRewriteRequestUrl(value: /* url */ String => String): Self = StObject.set(x, "rewriteRequestUrl", js.Any.fromFunction1(value))
    
    inline def setRewriteRequestUrlUndefined: Self = StObject.set(x, "rewriteRequestUrl", js.undefined)
    
    inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
    
    inline def setRunInspectorProxyUndefined: Self = StObject.set(x, "runInspectorProxy", js.undefined)
    
    inline def setUnstable_serverRoot(value: String): Self = StObject.set(x, "unstable_serverRoot", value.asInstanceOf[js.Any])
    
    inline def setUnstable_serverRootNull: Self = StObject.set(x, "unstable_serverRoot", null)
    
    inline def setUnstable_serverRootUndefined: Self = StObject.set(x, "unstable_serverRoot", js.undefined)
    
    inline def setUseGlobalHotkey(value: Boolean): Self = StObject.set(x, "useGlobalHotkey", value.asInstanceOf[js.Any])
    
    inline def setUseGlobalHotkeyUndefined: Self = StObject.set(x, "useGlobalHotkey", js.undefined)
    
    inline def setVerifyConnections(value: Boolean): Self = StObject.set(x, "verifyConnections", value.asInstanceOf[js.Any])
    
    inline def setVerifyConnectionsUndefined: Self = StObject.set(x, "verifyConnections", js.undefined)
  }
}
