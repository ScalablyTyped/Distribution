package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.geom.GeometryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MVTOptions extends StObject {
  
  var featureClass: js.UndefOr[
    (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], js.Any]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      js.Any
    ])
  ] = js.undefined
  
  var geometryName: js.UndefOr[String] = js.undefined
  
  var layerName: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}
object MVTOptions {
  
  inline def apply(): MVTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MVTOptions]
  }
  
  extension [Self <: MVTOptions](x: Self) {
    
    inline def setFeatureClass(
      value: (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], js.Any]) | (js.Function4[
          /* geom */ GeometryType, 
          /* arg2 */ js.Array[Double], 
          /* arg3 */ js.Array[js.Array[Double] | Double], 
          /* arg4 */ StringDictionary[js.Any], 
          js.Any
        ])
    ): Self = StObject.set(x, "featureClass", value.asInstanceOf[js.Any])
    
    inline def setFeatureClassFunction1(value: /* geom */ Geometry | StringDictionary[js.Any] => js.Any): Self = StObject.set(x, "featureClass", js.Any.fromFunction1(value))
    
    inline def setFeatureClassFunction4(
      value: (/* geom */ GeometryType, /* arg2 */ js.Array[Double], /* arg3 */ js.Array[js.Array[Double] | Double], /* arg4 */ StringDictionary[js.Any]) => js.Any
    ): Self = StObject.set(x, "featureClass", js.Any.fromFunction4(value))
    
    inline def setFeatureClassUndefined: Self = StObject.set(x, "featureClass", js.undefined)
    
    inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
