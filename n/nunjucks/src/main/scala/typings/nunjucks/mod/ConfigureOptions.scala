package typings.nunjucks.mod

import typings.nunjucks.anon.Async
import typings.nunjucks.anon.BlockEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureOptions extends js.Object {
  
  var autoescape: js.UndefOr[Boolean] = js.native
  
  var express: js.UndefOr[js.Object] = js.native
  
  var lstripBlocks: js.UndefOr[Boolean] = js.native
  
  var noCache: js.UndefOr[Boolean] = js.native
  
  var tags: js.UndefOr[BlockEnd] = js.native
  
  var throwOnUndefined: js.UndefOr[Boolean] = js.native
  
  var trimBlocks: js.UndefOr[Boolean] = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
  
  var web: js.UndefOr[Async] = js.native
}
object ConfigureOptions {
  
  @scala.inline
  def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoescape(value: Boolean): Self = this.set("autoescape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoescape: Self = this.set("autoescape", js.undefined)
    
    @scala.inline
    def setExpress(value: js.Object): Self = this.set("express", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpress: Self = this.set("express", js.undefined)
    
    @scala.inline
    def setLstripBlocks(value: Boolean): Self = this.set("lstripBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLstripBlocks: Self = this.set("lstripBlocks", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    
    @scala.inline
    def setTags(value: BlockEnd): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThrowOnUndefined(value: Boolean): Self = this.set("throwOnUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOnUndefined: Self = this.set("throwOnUndefined", js.undefined)
    
    @scala.inline
    def setTrimBlocks(value: Boolean): Self = this.set("trimBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimBlocks: Self = this.set("trimBlocks", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWeb(value: Async): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
}
