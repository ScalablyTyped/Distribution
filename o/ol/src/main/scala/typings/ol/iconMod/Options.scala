package typings.ol.iconMod

import typings.ol.colorMod.Color
import typings.ol.iconAnchorUnitsMod.IconAnchorUnits
import typings.ol.iconOriginMod.IconOrigin
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var anchor: js.UndefOr[js.Array[Double]] = js.native
  
  var anchorOrigin: js.UndefOr[IconOrigin] = js.native
  
  var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.native
  
  var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.native
  
  var color: js.UndefOr[Color | String] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var displacement: js.UndefOr[js.Array[Double]] = js.native
  
  var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.native
  
  var imgSize: js.UndefOr[Size] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var offsetOrigin: js.UndefOr[IconOrigin] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var rotateWithView: js.UndefOr[Boolean] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double | Size] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var src: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnchorVarargs(value: Double*): Self = this.set("anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchor(value: js.Array[Double]): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorOrigin(value: IconOrigin): Self = this.set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorOrigin: Self = this.set("anchorOrigin", js.undefined)
    
    @scala.inline
    def setAnchorXUnits(value: IconAnchorUnits): Self = this.set("anchorXUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorXUnits: Self = this.set("anchorXUnits", js.undefined)
    
    @scala.inline
    def setAnchorYUnits(value: IconAnchorUnits): Self = this.set("anchorYUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorYUnits: Self = this.set("anchorYUnits", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color | String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setDisplacementVarargs(value: Double*): Self = this.set("displacement", js.Array(value :_*))
    
    @scala.inline
    def setDisplacement(value: js.Array[Double]): Self = this.set("displacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplacement: Self = this.set("displacement", js.undefined)
    
    @scala.inline
    def setImg(value: HTMLImageElement | HTMLCanvasElement): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setImgSize(value: Size): Self = this.set("imgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgSize: Self = this.set("imgSize", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOffsetOrigin(value: IconOrigin): Self = this.set("offsetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetOrigin: Self = this.set("offsetOrigin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRotateWithView(value: Boolean): Self = this.set("rotateWithView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateWithView: Self = this.set("rotateWithView", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double | Size): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
