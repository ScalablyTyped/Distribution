package typings.openlayers.mod.olx.style

import typings.openlayers.mod.style.AtlasManager
import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleOptions extends js.Object {
  
  var atlasManager: js.UndefOr[AtlasManager] = js.native
  
  var fill: js.UndefOr[Fill] = js.native
  
  var radius: Double = js.native
  
  var snapToPixel: js.UndefOr[Boolean] = js.native
  
  var stroke: js.UndefOr[Stroke] = js.native
}
object CircleOptions {
  
  @scala.inline
  def apply(radius: Double): CircleOptions = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasManager(value: AtlasManager): Self = this.set("atlasManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtlasManager: Self = this.set("atlasManager", js.undefined)
    
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setSnapToPixel(value: Boolean): Self = this.set("snapToPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToPixel: Self = this.set("snapToPixel", js.undefined)
    
    @scala.inline
    def setStroke(value: Stroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
