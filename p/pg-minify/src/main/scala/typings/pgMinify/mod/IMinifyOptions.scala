package typings.pgMinify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMinifyOptions extends js.Object {
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var removeAll: js.UndefOr[Boolean] = js.native
}
object IMinifyOptions {
  
  @scala.inline
  def apply(): IMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMinifyOptions]
  }
  
  @scala.inline
  implicit class IMinifyOptionsOps[Self <: IMinifyOptions] (val x: Self) extends AnyVal {
    
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
    def setRemoveAll(value: Boolean): Self = this.set("removeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
  }
}
