package typings.ol

import typings.ol.olFeatureMod.FeatureClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvtMod {
  
  @JSImport("ol/format/MVT", JSImport.Default)
  @js.native
  class default () extends MVT {
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
  
  @js.native
  trait Options extends StObject {
    
    var featureClass: js.UndefOr[FeatureClass] = js.native
    
    var geometryName: js.UndefOr[String] = js.native
    
    var idProperty: js.UndefOr[String] = js.native
    
    var layerName: js.UndefOr[String] = js.native
    
    var layers: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureClass(value: FeatureClass): Self = StObject.set(x, "featureClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureClassUndefined: Self = StObject.set(x, "featureClass", js.undefined)
      
      @scala.inline
      def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      @scala.inline
      def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      @scala.inline
      def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
    }
  }
}
