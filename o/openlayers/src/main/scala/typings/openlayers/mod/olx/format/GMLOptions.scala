package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GMLOptions extends StObject {
  
  var curve: js.UndefOr[Boolean] = js.undefined
  
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
  
  var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var multiCurve: js.UndefOr[Boolean] = js.undefined
  
  var multiSurface: js.UndefOr[Boolean] = js.undefined
  
  var schemaLocation: js.UndefOr[String] = js.undefined
  
  var srsName: String
  
  var surface: js.UndefOr[Boolean] = js.undefined
}
object GMLOptions {
  
  inline def apply(srsName: String): GMLOptions = {
    val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMLOptions]
  }
  
  extension [Self <: GMLOptions](x: Self) {
    
    inline def setCurve(value: Boolean): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
    
    inline def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
    
    inline def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value :_*))
    
    inline def setMultiCurve(value: Boolean): Self = StObject.set(x, "multiCurve", value.asInstanceOf[js.Any])
    
    inline def setMultiCurveUndefined: Self = StObject.set(x, "multiCurve", js.undefined)
    
    inline def setMultiSurface(value: Boolean): Self = StObject.set(x, "multiSurface", value.asInstanceOf[js.Any])
    
    inline def setMultiSurfaceUndefined: Self = StObject.set(x, "multiSurface", js.undefined)
    
    inline def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
    
    inline def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
    
    inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
    
    inline def setSurface(value: Boolean): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
  }
}
