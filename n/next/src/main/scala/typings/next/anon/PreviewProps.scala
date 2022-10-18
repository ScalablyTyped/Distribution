package typings.next.anon

import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewProps extends StObject {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  var buildId: String
  
  var config: NextConfigComplete
  
  var distDir: String
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var previewProps: ApiPreviewProps
  
  var rewrites: AfterFiles
}
object PreviewProps {
  
  inline def apply(
    buildId: String,
    config: NextConfigComplete,
    distDir: String,
    previewProps: ApiPreviewProps,
    rewrites: AfterFiles
  ): PreviewProps = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewProps]
  }
  
  extension [Self <: PreviewProps](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
    
    inline def setRewrites(value: AfterFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
  }
}
