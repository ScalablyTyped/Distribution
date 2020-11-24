package typings.pixiJs.anon

import typings.pixiJs.PIXI.ALPHA_MODES
import typings.pixiJs.PIXI.FORMATS
import typings.pixiJs.PIXI.MIPMAP_MODES
import typings.pixiJs.PIXI.SCALE_MODES
import typings.pixiJs.PIXI.TARGETS
import typings.pixiJs.PIXI.TYPES
import typings.pixiJs.PIXI.WRAP_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaMode extends js.Object {
  
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.native
  
  var anisotropicLevel: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[FORMATS] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var resourceOptions: js.UndefOr[js.Any] = js.native
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.native
  
  var target: js.UndefOr[TARGETS] = js.native
  
  var `type`: js.UndefOr[TYPES] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wrapMode: js.UndefOr[WRAP_MODES] = js.native
}
object AlphaMode {
  
  @scala.inline
  def apply(): AlphaMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaMode]
  }
  
  @scala.inline
  implicit class AlphaModeOps[Self <: AlphaMode] (val x: Self) extends AnyVal {
    
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
    def setAlphaMode(value: ALPHA_MODES): Self = this.set("alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaMode: Self = this.set("alphaMode", js.undefined)
    
    @scala.inline
    def setAnisotropicLevel(value: Double): Self = this.set("anisotropicLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnisotropicLevel: Self = this.set("anisotropicLevel", js.undefined)
    
    @scala.inline
    def setFormat(value: FORMATS): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMipmap(value: MIPMAP_MODES): Self = this.set("mipmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMipmap: Self = this.set("mipmap", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setResourceOptions(value: js.Any): Self = this.set("resourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOptions: Self = this.set("resourceOptions", js.undefined)
    
    @scala.inline
    def setScaleMode(value: SCALE_MODES): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMode: Self = this.set("scaleMode", js.undefined)
    
    @scala.inline
    def setTarget(value: TARGETS): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: TYPES): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapMode(value: WRAP_MODES): Self = this.set("wrapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapMode: Self = this.set("wrapMode", js.undefined)
  }
}
