package typings.playable.loaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoaderViewStyles extends js.Object {
  
  var active: String = js.native
  
  var hidden: String = js.native
  
  var loader: String = js.native
}
object ILoaderViewStyles {
  
  @scala.inline
  def apply(active: String, hidden: String, loader: String): ILoaderViewStyles = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoaderViewStyles]
  }
  
  @scala.inline
  implicit class ILoaderViewStylesOps[Self <: ILoaderViewStyles] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: String): Self = this.set("loader", value.asInstanceOf[js.Any])
  }
}
