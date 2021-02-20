package typings.next

import typings.next.anon.Dictpage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPageFilesMod {
  
  @JSImport("next/dist/next-server/server/get-page-files", "getPageFiles")
  @js.native
  def getPageFiles(buildManifest: BuildManifest, page: String): js.Array[String] = js.native
  
  @js.native
  trait BuildManifest extends StObject {
    
    var ampDevFiles: js.Array[String] = js.native
    
    var ampFirstPages: js.Array[String] = js.native
    
    var devFiles: js.Array[String] = js.native
    
    var lowPriorityFiles: js.Array[String] = js.native
    
    var pages: Dictpage = js.native
    
    var polyfillFiles: js.Array[String] = js.native
  }
  object BuildManifest {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BuildManifestMutableBuilder[Self <: BuildManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmpDevFiles(value: js.Array[String]): Self = StObject.set(x, "ampDevFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpDevFilesVarargs(value: String*): Self = StObject.set(x, "ampDevFiles", js.Array(value :_*))
      
      @scala.inline
      def setAmpFirstPages(value: js.Array[String]): Self = StObject.set(x, "ampFirstPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpFirstPagesVarargs(value: String*): Self = StObject.set(x, "ampFirstPages", js.Array(value :_*))
      
      @scala.inline
      def setDevFiles(value: js.Array[String]): Self = StObject.set(x, "devFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFilesVarargs(value: String*): Self = StObject.set(x, "devFiles", js.Array(value :_*))
      
      @scala.inline
      def setLowPriorityFiles(value: js.Array[String]): Self = StObject.set(x, "lowPriorityFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowPriorityFilesVarargs(value: String*): Self = StObject.set(x, "lowPriorityFiles", js.Array(value :_*))
      
      @scala.inline
      def setPages(value: Dictpage): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyfillFiles(value: js.Array[String]): Self = StObject.set(x, "polyfillFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyfillFilesVarargs(value: String*): Self = StObject.set(x, "polyfillFiles", js.Array(value :_*))
    }
  }
}
