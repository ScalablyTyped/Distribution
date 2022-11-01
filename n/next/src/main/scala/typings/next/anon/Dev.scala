package typings.next.anon

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dev extends StObject {
  
  var config: NextConfigComplete
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var distDir: String
  
  var hasRewrites: js.UndefOr[Boolean] = js.undefined
  
  var isClient: js.UndefOr[Boolean] = js.undefined
  
  var isEdgeServer: js.UndefOr[Boolean] = js.undefined
  
  var isNodeServer: js.UndefOr[Boolean] = js.undefined
  
  var middlewareMatchers: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
}
object Dev {
  
  inline def apply(config: NextConfigComplete, distDir: String): Dev = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dev]
  }
  
  extension [Self <: Dev](x: Self) {
    
    inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setHasRewrites(value: Boolean): Self = StObject.set(x, "hasRewrites", value.asInstanceOf[js.Any])
    
    inline def setHasRewritesUndefined: Self = StObject.set(x, "hasRewrites", js.undefined)
    
    inline def setIsClient(value: Boolean): Self = StObject.set(x, "isClient", value.asInstanceOf[js.Any])
    
    inline def setIsClientUndefined: Self = StObject.set(x, "isClient", js.undefined)
    
    inline def setIsEdgeServer(value: Boolean): Self = StObject.set(x, "isEdgeServer", value.asInstanceOf[js.Any])
    
    inline def setIsEdgeServerUndefined: Self = StObject.set(x, "isEdgeServer", js.undefined)
    
    inline def setIsNodeServer(value: Boolean): Self = StObject.set(x, "isNodeServer", value.asInstanceOf[js.Any])
    
    inline def setIsNodeServerUndefined: Self = StObject.set(x, "isNodeServer", js.undefined)
    
    inline def setMiddlewareMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "middlewareMatchers", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareMatchersUndefined: Self = StObject.set(x, "middlewareMatchers", js.undefined)
    
    inline def setMiddlewareMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "middlewareMatchers", js.Array(value*))
  }
}
