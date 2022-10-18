package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextEdgeFunctionLoaderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-edge-function-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  
  trait EdgeFunctionLoaderOptions extends StObject {
    
    var absolutePagePath: String
    
    var page: String
    
    var rootDir: String
  }
  object EdgeFunctionLoaderOptions {
    
    inline def apply(absolutePagePath: String, page: String, rootDir: String): EdgeFunctionLoaderOptions = {
      val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeFunctionLoaderOptions]
    }
    
    extension [Self <: EdgeFunctionLoaderOptions](x: Self) {
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
}
