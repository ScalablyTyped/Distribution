package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsriJSONOptions extends StObject {
  
  var geometryName: js.UndefOr[String] = js.undefined
}
object EsriJSONOptions {
  
  inline def apply(): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsriJSONOptions]
  }
  
  extension [Self <: EsriJSONOptions](x: Self) {
    
    inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
  }
}
