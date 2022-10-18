package typings.next

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextMiddlewareLoaderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-middleware-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  
  inline def decodeMatchers(encodedMatchers: String): js.Array[MiddlewareMatcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeMatchers")(encodedMatchers.asInstanceOf[js.Any]).asInstanceOf[js.Array[MiddlewareMatcher]]
  
  inline def encodeMatchers(matchers: js.Array[MiddlewareMatcher]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait MiddlewareLoaderOptions extends StObject {
    
    var absolutePagePath: String
    
    var matchers: js.UndefOr[String] = js.undefined
    
    var page: String
    
    var rootDir: String
  }
  object MiddlewareLoaderOptions {
    
    inline def apply(absolutePagePath: String, page: String, rootDir: String): MiddlewareLoaderOptions = {
      val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareLoaderOptions]
    }
    
    extension [Self <: MiddlewareLoaderOptions](x: Self) {
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setMatchers(value: String): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
}
