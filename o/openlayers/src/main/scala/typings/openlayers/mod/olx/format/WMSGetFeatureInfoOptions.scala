package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMSGetFeatureInfoOptions extends StObject {
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}
object WMSGetFeatureInfoOptions {
  
  inline def apply(): WMSGetFeatureInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSGetFeatureInfoOptions]
  }
  
  extension [Self <: WMSGetFeatureInfoOptions](x: Self) {
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
