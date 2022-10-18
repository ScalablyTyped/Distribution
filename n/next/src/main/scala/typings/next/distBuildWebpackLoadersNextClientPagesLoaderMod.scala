package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextClientPagesLoaderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-client-pages-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  
  trait ClientPagesLoaderOptions extends StObject {
    
    var absolutePagePath: String
    
    var page: String
  }
  object ClientPagesLoaderOptions {
    
    inline def apply(absolutePagePath: String, page: String): ClientPagesLoaderOptions = {
      val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientPagesLoaderOptions]
    }
    
    extension [Self <: ClientPagesLoaderOptions](x: Self) {
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
