package typings.playcanvas.anon

import typings.playcanvas.mod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aabb extends StObject {
  
  var aabb: js.UndefOr[BoundingBox] = js.undefined
  
  var defaultWeight: js.UndefOr[Double] = js.undefined
  
  var deltaNormals: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var deltaNormalsType: Double
  
  var deltaPositions: js.typedarray.ArrayBuffer
  
  var deltaPositionsType: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var preserveData: js.UndefOr[Boolean] = js.undefined
}
object Aabb {
  
  inline def apply(deltaNormalsType: Double, deltaPositions: js.typedarray.ArrayBuffer, deltaPositionsType: Double): Aabb = {
    val __obj = js.Dynamic.literal(deltaNormalsType = deltaNormalsType.asInstanceOf[js.Any], deltaPositions = deltaPositions.asInstanceOf[js.Any], deltaPositionsType = deltaPositionsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aabb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aabb] (val x: Self) extends AnyVal {
    
    inline def setAabb(value: BoundingBox): Self = StObject.set(x, "aabb", value.asInstanceOf[js.Any])
    
    inline def setAabbUndefined: Self = StObject.set(x, "aabb", js.undefined)
    
    inline def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
    
    inline def setDeltaNormals(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "deltaNormals", value.asInstanceOf[js.Any])
    
    inline def setDeltaNormalsType(value: Double): Self = StObject.set(x, "deltaNormalsType", value.asInstanceOf[js.Any])
    
    inline def setDeltaNormalsUndefined: Self = StObject.set(x, "deltaNormals", js.undefined)
    
    inline def setDeltaPositions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "deltaPositions", value.asInstanceOf[js.Any])
    
    inline def setDeltaPositionsType(value: Double): Self = StObject.set(x, "deltaPositionsType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreserveData(value: Boolean): Self = StObject.set(x, "preserveData", value.asInstanceOf[js.Any])
    
    inline def setPreserveDataUndefined: Self = StObject.set(x, "preserveData", js.undefined)
  }
}
