package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for snap
  */
@js.native
trait SnapOptions extends js.Object {
  
  var edge: js.UndefOr[Boolean] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var vertex: js.UndefOr[Boolean] = js.native
}
object SnapOptions {
  
  @scala.inline
  def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  
  @scala.inline
  implicit class SnapOptionsOps[Self <: SnapOptions] (val x: Self) extends AnyVal {
    
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
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = this.set("pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelTolerance: Self = this.set("pixelTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setVertex(value: Boolean): Self = this.set("vertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertex: Self = this.set("vertex", js.undefined)
  }
}
