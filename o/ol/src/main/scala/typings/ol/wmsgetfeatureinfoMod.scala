package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmsgetfeatureinfoMod {
  
  @JSImport("ol/format/WMSGetFeatureInfo", JSImport.Default)
  @js.native
  open class default () extends WMSGetFeatureInfo {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  @js.native
  trait WMSGetFeatureInfo
    extends typings.ol.xmlfeatureMod.default {
    
    def getLayers(): js.Array[String] = js.native
    
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
}
