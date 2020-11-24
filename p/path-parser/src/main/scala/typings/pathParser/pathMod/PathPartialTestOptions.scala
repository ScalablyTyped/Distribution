package typings.pathParser.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPartialTestOptions extends PathOptions {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var delimited: js.UndefOr[Boolean] = js.native
}
object PathPartialTestOptions {
  
  @scala.inline
  def apply(): PathPartialTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathPartialTestOptions]
  }
  
  @scala.inline
  implicit class PathPartialTestOptionsOps[Self <: PathPartialTestOptions] (val x: Self) extends AnyVal {
    
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
    def setDelimited(value: Boolean): Self = this.set("delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimited: Self = this.set("delimited", js.undefined)
  }
}
