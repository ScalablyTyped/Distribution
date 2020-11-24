package typings.openlayers.mod.olx.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtlasManagerOptions extends js.Object {
  
  var initialSize: js.UndefOr[Double] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[Double] = js.native
}
object AtlasManagerOptions {
  
  @scala.inline
  def apply(): AtlasManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtlasManagerOptions]
  }
  
  @scala.inline
  implicit class AtlasManagerOptionsOps[Self <: AtlasManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setInitialSize(value: Double): Self = this.set("initialSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSize: Self = this.set("initialSize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
