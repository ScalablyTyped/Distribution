package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileInfoOptions extends js.Object {
  
  var ignorePath: js.UndefOr[String] = js.native
  
  var plugins: js.UndefOr[js.Array[String]] = js.native
  
  var resolveConfig: js.UndefOr[Boolean] = js.native
  
  var withNodeModules: js.UndefOr[Boolean] = js.native
}
object FileInfoOptions {
  
  @scala.inline
  def apply(): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInfoOptions]
  }
  
  @scala.inline
  implicit class FileInfoOptionsOps[Self <: FileInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnorePath(value: String): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setResolveConfig(value: Boolean): Self = this.set("resolveConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveConfig: Self = this.set("resolveConfig", js.undefined)
    
    @scala.inline
    def setWithNodeModules(value: Boolean): Self = this.set("withNodeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithNodeModules: Self = this.set("withNodeModules", js.undefined)
  }
}
