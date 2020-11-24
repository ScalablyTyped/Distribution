package typings.pathParser.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathBuildOptions extends PathOptions {
  
  var ignoreConstraints: js.UndefOr[Boolean] = js.native
  
  var ignoreSearch: js.UndefOr[Boolean] = js.native
}
object PathBuildOptions {
  
  @scala.inline
  def apply(): PathBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathBuildOptions]
  }
  
  @scala.inline
  implicit class PathBuildOptionsOps[Self <: PathBuildOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreConstraints(value: Boolean): Self = this.set("ignoreConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreConstraints: Self = this.set("ignoreConstraints", js.undefined)
    
    @scala.inline
    def setIgnoreSearch(value: Boolean): Self = this.set("ignoreSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSearch: Self = this.set("ignoreSearch", js.undefined)
  }
}
