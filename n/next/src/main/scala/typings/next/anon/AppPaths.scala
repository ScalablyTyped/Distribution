package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPaths extends StObject {
  
  var appDir: String
  
  var appPaths: js.Array[String] | Null
  
  var name: String
  
  var pageExtensions: js.Array[String]
  
  var pagePath: String
}
object AppPaths {
  
  inline def apply(appDir: String, name: String, pageExtensions: js.Array[String], pagePath: String): AppPaths = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], appPaths = null)
    __obj.asInstanceOf[AppPaths]
  }
  
  extension [Self <: AppPaths](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
    
    inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
  }
}
