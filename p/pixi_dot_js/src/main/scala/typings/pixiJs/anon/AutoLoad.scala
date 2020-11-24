package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLoad extends js.Object {
  
  var autoLoad: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var linkBaseTexture: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AutoLoad {
  
  @scala.inline
  def apply(): AutoLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLoad]
  }
  
  @scala.inline
  implicit class AutoLoadOps[Self <: AutoLoad] (val x: Self) extends AnyVal {
    
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
    def setAutoLoad(value: Double): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLinkBaseTexture(value: Double): Self = this.set("linkBaseTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkBaseTexture: Self = this.set("linkBaseTexture", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
