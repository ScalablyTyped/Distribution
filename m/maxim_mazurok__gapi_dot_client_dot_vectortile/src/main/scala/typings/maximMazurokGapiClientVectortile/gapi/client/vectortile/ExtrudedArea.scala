package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtrudedArea extends js.Object {
  
  /** The area representing the footprint of the extruded area. */
  var area: js.UndefOr[Area] = js.native
  
  /** The z-value in local tile coordinates where the extruded area ends. */
  var maxZ: js.UndefOr[Double] = js.native
  
  /**
    * The z-value in local tile coordinates where the extruded area begins. This is non-zero for extruded areas that begin off the ground. For example, a building with a skybridge may
    * have an extruded area component with a non-zero min_z.
    */
  var minZ: js.UndefOr[Double] = js.native
}
object ExtrudedArea {
  
  @scala.inline
  def apply(): ExtrudedArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudedArea]
  }
  
  @scala.inline
  implicit class ExtrudedAreaOps[Self <: ExtrudedArea] (val x: Self) extends AnyVal {
    
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
    def setArea(value: Area): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setMaxZ(value: Double): Self = this.set("maxZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZ: Self = this.set("maxZ", js.undefined)
    
    @scala.inline
    def setMinZ(value: Double): Self = this.set("minZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZ: Self = this.set("minZ", js.undefined)
  }
}
