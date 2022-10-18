package typings.next.anon

import typings.next.distBuildWebpackPluginsMiddlewarePluginMod.MiddlewareManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBuildManifest extends StObject {
  
  var appBuildManifest: js.UndefOr[typings.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest] = js.undefined
  
  var buildId: String
  
  var buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest
  
  var distPath: String
  
  var gzipSize: js.UndefOr[Boolean] = js.undefined
  
  var middlewareManifest: MiddlewareManifest
  
  var pageExtensions: js.Array[String]
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var useStatic404: Boolean
}
object AppBuildManifest {
  
  inline def apply(
    buildId: String,
    buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest,
    distPath: String,
    middlewareManifest: MiddlewareManifest,
    pageExtensions: js.Array[String],
    useStatic404: Boolean
  ): AppBuildManifest = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], distPath = distPath.asInstanceOf[js.Any], middlewareManifest = middlewareManifest.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], useStatic404 = useStatic404.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBuildManifest]
  }
  
  extension [Self <: AppBuildManifest](x: Self) {
    
    inline def setAppBuildManifest(value: typings.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest): Self = StObject.set(x, "appBuildManifest", value.asInstanceOf[js.Any])
    
    inline def setAppBuildManifestUndefined: Self = StObject.set(x, "appBuildManifest", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildManifest(value: typings.next.distServerGetPageFilesMod.BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
    
    inline def setDistPath(value: String): Self = StObject.set(x, "distPath", value.asInstanceOf[js.Any])
    
    inline def setGzipSize(value: Boolean): Self = StObject.set(x, "gzipSize", value.asInstanceOf[js.Any])
    
    inline def setGzipSizeUndefined: Self = StObject.set(x, "gzipSize", js.undefined)
    
    inline def setMiddlewareManifest(value: MiddlewareManifest): Self = StObject.set(x, "middlewareManifest", value.asInstanceOf[js.Any])
    
    inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
    
    inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setUseStatic404(value: Boolean): Self = StObject.set(x, "useStatic404", value.asInstanceOf[js.Any])
  }
}
