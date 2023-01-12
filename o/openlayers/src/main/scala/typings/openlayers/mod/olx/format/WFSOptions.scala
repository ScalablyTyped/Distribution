package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.format.GMLBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOptions extends StObject {
  
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
  
  var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var gmlFormat: js.UndefOr[GMLBase] = js.undefined
  
  var schemaLocation: js.UndefOr[String] = js.undefined
}
object WFSOptions {
  
  inline def apply(): WFSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WFSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WFSOptions] (val x: Self) extends AnyVal {
    
    inline def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
    
    inline def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
    
    inline def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value*))
    
    inline def setGmlFormat(value: GMLBase): Self = StObject.set(x, "gmlFormat", value.asInstanceOf[js.Any])
    
    inline def setGmlFormatUndefined: Self = StObject.set(x, "gmlFormat", js.undefined)
    
    inline def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
    
    inline def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
  }
}
