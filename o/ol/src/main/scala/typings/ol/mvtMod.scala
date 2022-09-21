package typings.ol

import typings.ol.olFeatureMod.FeatureClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvtMod {
  
  @JSImport("ol/format/MVT", JSImport.Default)
  @js.native
  open class default () extends MVT {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait MVT
    extends typings.ol.featureMod.default {
    
    /**
      * Sets the layers that features will be read from.
      */
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var featureClass: js.UndefOr[FeatureClass] = js.undefined
    
    var geometryName: js.UndefOr[String] = js.undefined
    
    var idProperty: js.UndefOr[String] = js.undefined
    
    var layerName: js.UndefOr[String] = js.undefined
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFeatureClass(value: FeatureClass): Self = StObject.set(x, "featureClass", value.asInstanceOf[js.Any])
      
      inline def setFeatureClassUndefined: Self = StObject.set(x, "featureClass", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
}
