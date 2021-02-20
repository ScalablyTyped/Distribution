package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPageFilesMod {
  
  @JSImport("next-server/dist/server/get-page-files", "getPageFiles")
  @js.native
  def getPageFiles(buildManifest: BuildManifest, page: String): js.Array[String] = js.native
  
  @js.native
  trait BuildManifest extends StObject {
    
    var devFiles: js.Array[String] = js.native
    
    var pages: StringDictionary[js.Array[String]] = js.native
  }
  object BuildManifest {
    
    @scala.inline
    def apply(devFiles: js.Array[String], pages: StringDictionary[js.Array[String]]): BuildManifest = {
      val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildManifest]
    }
    
    @scala.inline
    implicit class BuildManifestMutableBuilder[Self <: BuildManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevFiles(value: js.Array[String]): Self = StObject.set(x, "devFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFilesVarargs(value: String*): Self = StObject.set(x, "devFiles", js.Array(value :_*))
      
      @scala.inline
      def setPages(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    }
  }
}
