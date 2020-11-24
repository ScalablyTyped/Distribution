package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTexture extends js.Object {
  
  var baseTexture: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[Boolean] = js.native
  
  var texture: js.UndefOr[Boolean] = js.native
}
object BaseTexture {
  
  @scala.inline
  def apply(): BaseTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTexture]
  }
  
  @scala.inline
  implicit class BaseTextureOps[Self <: BaseTexture] (val x: Self) extends AnyVal {
    
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
    def setBaseTexture(value: Boolean): Self = this.set("baseTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTexture: Self = this.set("baseTexture", js.undefined)
    
    @scala.inline
    def setChildren(value: Boolean): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setTexture(value: Boolean): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexture: Self = this.set("texture", js.undefined)
  }
}
