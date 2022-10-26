package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePath extends StObject {
  
  var appDir: String
  
  var dir: String
  
  var pageExtensions: js.Array[String]
  
  var pagePath: String
  
  var tsconfigPath: String
}
object PagePath {
  
  inline def apply(
    appDir: String,
    dir: String,
    pageExtensions: js.Array[String],
    pagePath: String,
    tsconfigPath: String
  ): PagePath = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], tsconfigPath = tsconfigPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePath]
  }
  
  extension [Self <: PagePath](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
    
    inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
  }
}
