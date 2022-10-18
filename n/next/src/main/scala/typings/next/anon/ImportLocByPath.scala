package typings.next.anon

import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.AssetBinding
import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.EdgeMiddlewareMeta
import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.EdgeSSRMeta
import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.RSCMeta
import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.RouteMeta
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportLocByPath extends StObject {
  
  var importLocByPath: js.UndefOr[typings.std.Map[String, Any]] = js.undefined
  
  var nextAssetMiddlewareBinding: js.UndefOr[AssetBinding] = js.undefined
  
  var nextEdgeApiFunction: js.UndefOr[EdgeMiddlewareMeta] = js.undefined
  
  var nextEdgeMiddleware: js.UndefOr[EdgeMiddlewareMeta] = js.undefined
  
  var nextEdgeSSR: js.UndefOr[EdgeSSRMeta] = js.undefined
  
  var nextUsedEnvVars: js.UndefOr[Set[String]] = js.undefined
  
  var nextWasmMiddlewareBinding: js.UndefOr[AssetBinding] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var route: js.UndefOr[RouteMeta] = js.undefined
  
  var rsc: js.UndefOr[RSCMeta] = js.undefined
  
  var usingIndirectEval: js.UndefOr[Boolean | Set[String]] = js.undefined
}
object ImportLocByPath {
  
  inline def apply(): ImportLocByPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportLocByPath]
  }
  
  extension [Self <: ImportLocByPath](x: Self) {
    
    inline def setImportLocByPath(value: typings.std.Map[String, Any]): Self = StObject.set(x, "importLocByPath", value.asInstanceOf[js.Any])
    
    inline def setImportLocByPathUndefined: Self = StObject.set(x, "importLocByPath", js.undefined)
    
    inline def setNextAssetMiddlewareBinding(value: AssetBinding): Self = StObject.set(x, "nextAssetMiddlewareBinding", value.asInstanceOf[js.Any])
    
    inline def setNextAssetMiddlewareBindingUndefined: Self = StObject.set(x, "nextAssetMiddlewareBinding", js.undefined)
    
    inline def setNextEdgeApiFunction(value: EdgeMiddlewareMeta): Self = StObject.set(x, "nextEdgeApiFunction", value.asInstanceOf[js.Any])
    
    inline def setNextEdgeApiFunctionUndefined: Self = StObject.set(x, "nextEdgeApiFunction", js.undefined)
    
    inline def setNextEdgeMiddleware(value: EdgeMiddlewareMeta): Self = StObject.set(x, "nextEdgeMiddleware", value.asInstanceOf[js.Any])
    
    inline def setNextEdgeMiddlewareUndefined: Self = StObject.set(x, "nextEdgeMiddleware", js.undefined)
    
    inline def setNextEdgeSSR(value: EdgeSSRMeta): Self = StObject.set(x, "nextEdgeSSR", value.asInstanceOf[js.Any])
    
    inline def setNextEdgeSSRUndefined: Self = StObject.set(x, "nextEdgeSSR", js.undefined)
    
    inline def setNextUsedEnvVars(value: Set[String]): Self = StObject.set(x, "nextUsedEnvVars", value.asInstanceOf[js.Any])
    
    inline def setNextUsedEnvVarsUndefined: Self = StObject.set(x, "nextUsedEnvVars", js.undefined)
    
    inline def setNextWasmMiddlewareBinding(value: AssetBinding): Self = StObject.set(x, "nextWasmMiddlewareBinding", value.asInstanceOf[js.Any])
    
    inline def setNextWasmMiddlewareBindingUndefined: Self = StObject.set(x, "nextWasmMiddlewareBinding", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setRoute(value: RouteMeta): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setRsc(value: RSCMeta): Self = StObject.set(x, "rsc", value.asInstanceOf[js.Any])
    
    inline def setRscUndefined: Self = StObject.set(x, "rsc", js.undefined)
    
    inline def setUsingIndirectEval(value: Boolean | Set[String]): Self = StObject.set(x, "usingIndirectEval", value.asInstanceOf[js.Any])
    
    inline def setUsingIndirectEvalUndefined: Self = StObject.set(x, "usingIndirectEval", js.undefined)
  }
}
