package typings.ol.controlMod

import typings.ol.attributionMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsOptions extends js.Object {
  
  var attribution: js.UndefOr[Boolean] = js.native
  
  var attributionOptions: js.UndefOr[Options] = js.native
  
  var rotate: js.UndefOr[Boolean] = js.native
  
  var rotateOptions: js.UndefOr[typings.ol.rotateMod.Options] = js.native
  
  var zoom: js.UndefOr[Boolean] = js.native
  
  var zoomOptions: js.UndefOr[typings.ol.zoomMod.Options] = js.native
}
object DefaultsOptions {
  
  @scala.inline
  def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  
  @scala.inline
  implicit class DefaultsOptionsOps[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: Boolean): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setAttributionOptions(value: Options): Self = this.set("attributionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionOptions: Self = this.set("attributionOptions", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRotateOptions(value: typings.ol.rotateMod.Options): Self = this.set("rotateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateOptions: Self = this.set("rotateOptions", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomOptions(value: typings.ol.zoomMod.Options): Self = this.set("zoomOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOptions: Self = this.set("zoomOptions", js.undefined)
  }
}
