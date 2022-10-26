package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDir extends StObject {
  
  var appDir: String
  
  var appPaths: js.Array[String] | Null
  
  var isDev: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var pageExtensions: js.Array[String]
  
  var pagePath: String
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var tsconfigPath: js.UndefOr[String] = js.undefined
}
object AppDir {
  
  inline def apply(appDir: String, name: String, pageExtensions: js.Array[String], pagePath: String): AppDir = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], appPaths = null)
    __obj.asInstanceOf[AppDir]
  }
  
  extension [Self <: AppDir](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
    
    inline def setIsDevUndefined: Self = StObject.set(x, "isDev", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
    
    inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
    
    inline def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
  }
}
