package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.after
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryFileOptions extends js.Object {
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var minify: js.UndefOr[Boolean | after] = js.native
  
  var noWarnings: js.UndefOr[Boolean] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
}
object IQueryFileOptions {
  
  @scala.inline
  def apply(): IQueryFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryFileOptions]
  }
  
  @scala.inline
  implicit class IQueryFileOptionsOps[Self <: IQueryFileOptions] (val x: Self) extends AnyVal {
    
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setMinify(value: Boolean | after): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setNoWarnings(value: Boolean): Self = this.set("noWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWarnings: Self = this.set("noWarnings", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
