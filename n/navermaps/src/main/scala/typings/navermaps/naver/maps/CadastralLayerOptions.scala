package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CadastralLayerOptions extends js.Object {
  
  var overlayMap: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object CadastralLayerOptions {
  
  @scala.inline
  def apply(): CadastralLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CadastralLayerOptions]
  }
  
  @scala.inline
  implicit class CadastralLayerOptionsOps[Self <: CadastralLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setOverlayMap(value: Boolean): Self = this.set("overlayMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayMap: Self = this.set("overlayMap", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
