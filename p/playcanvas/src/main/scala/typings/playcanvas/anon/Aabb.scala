package typings.playcanvas.anon

import typings.playcanvas.pc.BoundingBox
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aabb extends js.Object {
  
  var aabb: js.UndefOr[BoundingBox] = js.native
  
  var defaultWeight: js.UndefOr[Double] = js.native
  
  var deltaNormals: js.UndefOr[ArrayBuffer] = js.native
  
  var deltaNormalsType: Double = js.native
  
  var deltaPositions: ArrayBuffer = js.native
  
  var deltaPositionsType: Double = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Aabb {
  
  @scala.inline
  def apply(deltaNormalsType: Double, deltaPositions: ArrayBuffer, deltaPositionsType: Double): Aabb = {
    val __obj = js.Dynamic.literal(deltaNormalsType = deltaNormalsType.asInstanceOf[js.Any], deltaPositions = deltaPositions.asInstanceOf[js.Any], deltaPositionsType = deltaPositionsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aabb]
  }
  
  @scala.inline
  implicit class AabbOps[Self <: Aabb] (val x: Self) extends AnyVal {
    
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
    def setDeltaNormalsType(value: Double): Self = this.set("deltaNormalsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPositions(value: ArrayBuffer): Self = this.set("deltaPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPositionsType(value: Double): Self = this.set("deltaPositionsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAabb(value: BoundingBox): Self = this.set("aabb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAabb: Self = this.set("aabb", js.undefined)
    
    @scala.inline
    def setDefaultWeight(value: Double): Self = this.set("defaultWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultWeight: Self = this.set("defaultWeight", js.undefined)
    
    @scala.inline
    def setDeltaNormals(value: ArrayBuffer): Self = this.set("deltaNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaNormals: Self = this.set("deltaNormals", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
