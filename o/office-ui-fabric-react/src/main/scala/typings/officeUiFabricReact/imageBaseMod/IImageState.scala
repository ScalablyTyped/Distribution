package typings.officeUiFabricReact.imageBaseMod

import typings.officeUiFabricReact.imageTypesMod.ImageLoadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageState extends js.Object {
  
  var loadState: js.UndefOr[ImageLoadState] = js.native
}
object IImageState {
  
  @scala.inline
  def apply(): IImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageState]
  }
  
  @scala.inline
  implicit class IImageStateOps[Self <: IImageState] (val x: Self) extends AnyVal {
    
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
    def setLoadState(value: ImageLoadState): Self = this.set("loadState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadState: Self = this.set("loadState", js.undefined)
  }
}
