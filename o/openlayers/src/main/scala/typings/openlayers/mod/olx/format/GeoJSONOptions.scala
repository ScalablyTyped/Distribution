package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONOptions extends StObject {
  
  var defaultDataProjection: ProjectionLike
  
  var featureProjection: ProjectionLike
  
  var geometryName: js.UndefOr[String] = js.undefined
}
object GeoJSONOptions {
  
  inline def apply(): GeoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONOptions]
  }
  
  extension [Self <: GeoJSONOptions](x: Self) {
    
    inline def setDefaultDataProjection(value: ProjectionLike): Self = StObject.set(x, "defaultDataProjection", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataProjectionUndefined: Self = StObject.set(x, "defaultDataProjection", js.undefined)
    
    inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
    
    inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    
    inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
  }
}
