package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrudedArea extends StObject {
  
  /** The area representing the footprint of the extruded area. */
  var area: js.UndefOr[Area] = js.undefined
  
  /** The z-value in local tile coordinates where the extruded area ends. */
  var maxZ: js.UndefOr[Double] = js.undefined
  
  /**
    * The z-value in local tile coordinates where the extruded area begins. This is non-zero for extruded areas that begin off the ground. For example, a building with a skybridge may
    * have an extruded area component with a non-zero min_z.
    */
  var minZ: js.UndefOr[Double] = js.undefined
}
object ExtrudedArea {
  
  inline def apply(): ExtrudedArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudedArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtrudedArea] (val x: Self) extends AnyVal {
    
    inline def setArea(value: Area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setMaxZ(value: Double): Self = StObject.set(x, "maxZ", value.asInstanceOf[js.Any])
    
    inline def setMaxZUndefined: Self = StObject.set(x, "maxZ", js.undefined)
    
    inline def setMinZ(value: Double): Self = StObject.set(x, "minZ", value.asInstanceOf[js.Any])
    
    inline def setMinZUndefined: Self = StObject.set(x, "minZ", js.undefined)
  }
}
