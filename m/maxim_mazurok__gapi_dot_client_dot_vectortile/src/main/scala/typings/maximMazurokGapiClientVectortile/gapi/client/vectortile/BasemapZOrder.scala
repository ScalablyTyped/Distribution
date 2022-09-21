package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapZOrder extends StObject {
  
  /** The second most significant component of the ordering of a component to be rendered onto the basemap. */
  var zGrade: js.UndefOr[Double] = js.undefined
  
  /** The most significant component of the ordering of a component to be rendered onto the basemap. */
  var zPlane: js.UndefOr[Double] = js.undefined
  
  /** The least significant component of the ordering of a component to be rendered onto the basemap. */
  var zWithinGrade: js.UndefOr[Double] = js.undefined
}
object BasemapZOrder {
  
  inline def apply(): BasemapZOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapZOrder]
  }
  
  extension [Self <: BasemapZOrder](x: Self) {
    
    inline def setZGrade(value: Double): Self = StObject.set(x, "zGrade", value.asInstanceOf[js.Any])
    
    inline def setZGradeUndefined: Self = StObject.set(x, "zGrade", js.undefined)
    
    inline def setZPlane(value: Double): Self = StObject.set(x, "zPlane", value.asInstanceOf[js.Any])
    
    inline def setZPlaneUndefined: Self = StObject.set(x, "zPlane", js.undefined)
    
    inline def setZWithinGrade(value: Double): Self = StObject.set(x, "zWithinGrade", value.asInstanceOf[js.Any])
    
    inline def setZWithinGradeUndefined: Self = StObject.set(x, "zWithinGrade", js.undefined)
  }
}
