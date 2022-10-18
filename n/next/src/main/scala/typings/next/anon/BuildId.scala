package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.nextEnv.anon.Contents
import typings.nextEnv.mod.LoadedEnvFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildId extends StObject {
  
  var absolutePagePath: String
  
  var buildId: String
  
  var config: NextConfigComplete
  
  var envFiles: LoadedEnvFiles
  
  var page: String
  
  var pages: StringDictionary[String]
  
  var previewMode: ApiPreviewProps
}
object BuildId {
  
  inline def apply(
    absolutePagePath: String,
    buildId: String,
    config: NextConfigComplete,
    envFiles: LoadedEnvFiles,
    page: String,
    pages: StringDictionary[String],
    previewMode: ApiPreviewProps
  ): BuildId = {
    val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], envFiles = envFiles.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previewMode = previewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  extension [Self <: BuildId](x: Self) {
    
    inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEnvFiles(value: LoadedEnvFiles): Self = StObject.set(x, "envFiles", value.asInstanceOf[js.Any])
    
    inline def setEnvFilesVarargs(value: Contents*): Self = StObject.set(x, "envFiles", js.Array(value*))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPages(value: StringDictionary[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPreviewMode(value: ApiPreviewProps): Self = StObject.set(x, "previewMode", value.asInstanceOf[js.Any])
  }
}
