package typings.playcanvas.anon

import typings.playcanvas.pc.BoundingBox
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aabb extends StObject {
  
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
  implicit class AabbMutableBuilder[Self <: Aabb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAabb(value: BoundingBox): Self = StObject.set(x, "aabb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAabbUndefined: Self = StObject.set(x, "aabb", js.undefined)
    
    @scala.inline
    def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
    
    @scala.inline
    def setDeltaNormals(value: ArrayBuffer): Self = StObject.set(x, "deltaNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaNormalsType(value: Double): Self = StObject.set(x, "deltaNormalsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaNormalsUndefined: Self = StObject.set(x, "deltaNormals", js.undefined)
    
    @scala.inline
    def setDeltaPositions(value: ArrayBuffer): Self = StObject.set(x, "deltaPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPositionsType(value: Double): Self = StObject.set(x, "deltaPositionsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
