package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfigT extends StObject {
  
  def enhanceMiddleware(
    middleware: Middleware,
    server: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any
  ): Middleware
  
  var port: Double
  
  def rewriteRequestUrl(url: String): String
  
  var runInspectorProxy: Boolean
  
  var unstable_serverRoot: String | Null
  
  var useGlobalHotkey: Boolean
  
  var verifyConnections: Boolean
}
object ServerConfigT {
  
  inline def apply(
    enhanceMiddleware: (Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any) => Middleware,
    port: Double,
    rewriteRequestUrl: String => String,
    runInspectorProxy: Boolean,
    useGlobalHotkey: Boolean,
    verifyConnections: Boolean
  ): ServerConfigT = {
    val __obj = js.Dynamic.literal(enhanceMiddleware = js.Any.fromFunction2(enhanceMiddleware), port = port.asInstanceOf[js.Any], rewriteRequestUrl = js.Any.fromFunction1(rewriteRequestUrl), runInspectorProxy = runInspectorProxy.asInstanceOf[js.Any], useGlobalHotkey = useGlobalHotkey.asInstanceOf[js.Any], verifyConnections = verifyConnections.asInstanceOf[js.Any], unstable_serverRoot = null)
    __obj.asInstanceOf[ServerConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerConfigT] (val x: Self) extends AnyVal {
    
    inline def setEnhanceMiddleware(
      value: (Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any) => Middleware
    ): Self = StObject.set(x, "enhanceMiddleware", js.Any.fromFunction2(value))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setRewriteRequestUrl(value: String => String): Self = StObject.set(x, "rewriteRequestUrl", js.Any.fromFunction1(value))
    
    inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
    
    inline def setUnstable_serverRoot(value: String): Self = StObject.set(x, "unstable_serverRoot", value.asInstanceOf[js.Any])
    
    inline def setUnstable_serverRootNull: Self = StObject.set(x, "unstable_serverRoot", null)
    
    inline def setUseGlobalHotkey(value: Boolean): Self = StObject.set(x, "useGlobalHotkey", value.asInstanceOf[js.Any])
    
    inline def setVerifyConnections(value: Boolean): Self = StObject.set(x, "verifyConnections", value.asInstanceOf[js.Any])
  }
}
