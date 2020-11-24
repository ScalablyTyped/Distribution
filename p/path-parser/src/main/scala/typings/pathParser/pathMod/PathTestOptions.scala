package typings.pathParser.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathTestOptions extends PathOptions {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var strictTrailingSlash: js.UndefOr[Boolean] = js.native
}
object PathTestOptions {
  
  @scala.inline
  def apply(): PathTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathTestOptions]
  }
  
  @scala.inline
  implicit class PathTestOptionsOps[Self <: PathTestOptions] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setStrictTrailingSlash(value: Boolean): Self = this.set("strictTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictTrailingSlash: Self = this.set("strictTrailingSlash", js.undefined)
  }
}
