package typings.openlayers.mod.olx.style

import typings.openlayers.mod.Feature
import typings.openlayers.mod.StyleGeometryFunction
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Image
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOptions extends js.Object {
  
  var fill: js.UndefOr[Fill] = js.native
  
  var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.native
  
  var image: js.UndefOr[Image] = js.native
  
  var stroke: js.UndefOr[Stroke] = js.native
  
  var text: js.UndefOr[Text] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object StyleOptions {
  
  @scala.inline
  def apply(): StyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOptions]
  }
  
  @scala.inline
  implicit class StyleOptionsOps[Self <: StyleOptions] (val x: Self) extends AnyVal {
    
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
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGeometryFunction1(
      value: /* feature */ Feature | typings.openlayers.mod.render.Feature => Geometry | typings.openlayers.mod.render.Feature
    ): Self = this.set("geometry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeometry(value: String | Geometry | StyleGeometryFunction): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setStroke(value: Stroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setText(value: Text): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
