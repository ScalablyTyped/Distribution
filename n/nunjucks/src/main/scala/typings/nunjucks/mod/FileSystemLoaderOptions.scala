package typings.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemLoaderOptions extends js.Object {
  
  /**  if true, the system will avoid using a cache and templates will be recompiled every single time */
  var noCache: js.UndefOr[Boolean] = js.native
  
  /** if true, the system will automatically update templates when they are changed on the filesystem */
  var watch: js.UndefOr[Boolean] = js.native
}
object FileSystemLoaderOptions {
  
  @scala.inline
  def apply(): FileSystemLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemLoaderOptions]
  }
  
  @scala.inline
  implicit class FileSystemLoaderOptionsOps[Self <: FileSystemLoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
