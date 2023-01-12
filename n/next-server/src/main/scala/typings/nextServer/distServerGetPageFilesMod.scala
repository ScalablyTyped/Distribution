package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerGetPageFilesMod {
  
  @JSImport("next-server/dist/server/get-page-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPageFiles(buildManifest: BuildManifest, page: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageFiles")(buildManifest.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait BuildManifest extends StObject {
    
    var devFiles: js.Array[String]
    
    var pages: StringDictionary[js.Array[String]]
  }
  object BuildManifest {
    
    inline def apply(devFiles: js.Array[String], pages: StringDictionary[js.Array[String]]): BuildManifest = {
      val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildManifest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildManifest] (val x: Self) extends AnyVal {
      
      inline def setDevFiles(value: js.Array[String]): Self = StObject.set(x, "devFiles", value.asInstanceOf[js.Any])
      
      inline def setDevFilesVarargs(value: String*): Self = StObject.set(x, "devFiles", js.Array(value*))
      
      inline def setPages(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    }
  }
}
