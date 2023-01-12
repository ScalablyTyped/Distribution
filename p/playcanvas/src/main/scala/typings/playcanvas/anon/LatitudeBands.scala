package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatitudeBands extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var latitudeBands: js.UndefOr[Double] = js.undefined
  
  var longitudeBands: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object LatitudeBands {
  
  inline def apply(): LatitudeBands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatitudeBands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatitudeBands] (val x: Self) extends AnyVal {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setLatitudeBands(value: Double): Self = StObject.set(x, "latitudeBands", value.asInstanceOf[js.Any])
    
    inline def setLatitudeBandsUndefined: Self = StObject.set(x, "latitudeBands", js.undefined)
    
    inline def setLongitudeBands(value: Double): Self = StObject.set(x, "longitudeBands", value.asInstanceOf[js.Any])
    
    inline def setLongitudeBandsUndefined: Self = StObject.set(x, "longitudeBands", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
