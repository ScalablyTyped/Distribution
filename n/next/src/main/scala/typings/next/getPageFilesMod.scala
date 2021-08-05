package typings.next

import typings.next.anon.Dictpage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPageFilesMod {
  
  @JSImport("next/dist/next-server/server/get-page-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPageFiles(buildManifest: BuildManifest, page: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageFiles")(buildManifest.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait BuildManifest extends StObject {
    
    var ampDevFiles: js.Array[String]
    
    var ampFirstPages: js.Array[String]
    
    var devFiles: js.Array[String]
    
    var lowPriorityFiles: js.Array[String]
    
    var pages: Dictpage
    
    var polyfillFiles: js.Array[String]
  }
  object BuildManifest {
    
    inline def apply(
      ampDevFiles: js.Array[String],
      ampFirstPages: js.Array[String],
      devFiles: js.Array[String],
      lowPriorityFiles: js.Array[String],
      pages: Dictpage,
      polyfillFiles: js.Array[String]
    ): BuildManifest = {
      val __obj = js.Dynamic.literal(ampDevFiles = ampDevFiles.asInstanceOf[js.Any], ampFirstPages = ampFirstPages.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], lowPriorityFiles = lowPriorityFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], polyfillFiles = polyfillFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildManifest]
    }
    
    extension [Self <: BuildManifest](x: Self) {
      
      inline def setAmpDevFiles(value: js.Array[String]): Self = StObject.set(x, "ampDevFiles", value.asInstanceOf[js.Any])
      
      inline def setAmpDevFilesVarargs(value: String*): Self = StObject.set(x, "ampDevFiles", js.Array(value :_*))
      
      inline def setAmpFirstPages(value: js.Array[String]): Self = StObject.set(x, "ampFirstPages", value.asInstanceOf[js.Any])
      
      inline def setAmpFirstPagesVarargs(value: String*): Self = StObject.set(x, "ampFirstPages", js.Array(value :_*))
      
      inline def setDevFiles(value: js.Array[String]): Self = StObject.set(x, "devFiles", value.asInstanceOf[js.Any])
      
      inline def setDevFilesVarargs(value: String*): Self = StObject.set(x, "devFiles", js.Array(value :_*))
      
      inline def setLowPriorityFiles(value: js.Array[String]): Self = StObject.set(x, "lowPriorityFiles", value.asInstanceOf[js.Any])
      
      inline def setLowPriorityFilesVarargs(value: String*): Self = StObject.set(x, "lowPriorityFiles", js.Array(value :_*))
      
      inline def setPages(value: Dictpage): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPolyfillFiles(value: js.Array[String]): Self = StObject.set(x, "polyfillFiles", value.asInstanceOf[js.Any])
      
      inline def setPolyfillFilesVarargs(value: String*): Self = StObject.set(x, "polyfillFiles", js.Array(value :_*))
    }
  }
}
