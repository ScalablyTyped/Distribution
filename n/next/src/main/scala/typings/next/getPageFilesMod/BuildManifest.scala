package typings.next.getPageFilesMod

import typings.next.anon.Dictpage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildManifest extends js.Object {
  
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
  implicit class BuildManifestOps[Self <: BuildManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmpDevFilesVarargs(value: String*): Self = this.set("ampDevFiles", js.Array(value :_*))
    
    @scala.inline
    def setAmpDevFiles(value: js.Array[String]): Self = this.set("ampDevFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpFirstPagesVarargs(value: String*): Self = this.set("ampFirstPages", js.Array(value :_*))
    
    @scala.inline
    def setAmpFirstPages(value: js.Array[String]): Self = this.set("ampFirstPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevFilesVarargs(value: String*): Self = this.set("devFiles", js.Array(value :_*))
    
    @scala.inline
    def setDevFiles(value: js.Array[String]): Self = this.set("devFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowPriorityFilesVarargs(value: String*): Self = this.set("lowPriorityFiles", js.Array(value :_*))
    
    @scala.inline
    def setLowPriorityFiles(value: js.Array[String]): Self = this.set("lowPriorityFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Dictpage): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyfillFilesVarargs(value: String*): Self = this.set("polyfillFiles", js.Array(value :_*))
    
    @scala.inline
    def setPolyfillFiles(value: js.Array[String]): Self = this.set("polyfillFiles", value.asInstanceOf[js.Any])
  }
}
