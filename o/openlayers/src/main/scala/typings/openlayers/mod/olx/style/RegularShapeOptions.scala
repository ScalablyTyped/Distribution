package typings.openlayers.mod.olx.style

import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify radius for regular polygons, or radius1 and radius2 for stars.
  */
@js.native
trait RegularShapeOptions extends js.Object {
  
  var angle: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[Fill] = js.native
  
  var points: Double = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radius1: js.UndefOr[Double] = js.native
  
  var radius2: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var snapToPixel: js.UndefOr[Boolean] = js.native
  
  var stroke: js.UndefOr[Stroke] = js.native
}
object RegularShapeOptions {
  
  @scala.inline
  def apply(points: Double): RegularShapeOptions = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularShapeOptions]
  }
  
  @scala.inline
  implicit class RegularShapeOptionsOps[Self <: RegularShapeOptions] (val x: Self) extends AnyVal {
    
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
    def setPoints(value: Double): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRadius1(value: Double): Self = this.set("radius1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius1: Self = this.set("radius1", js.undefined)
    
    @scala.inline
    def setRadius2(value: Double): Self = this.set("radius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius2: Self = this.set("radius2", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
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
