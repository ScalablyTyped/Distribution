package typings.ol

import typings.arcgisRestApi.mod.Feature
import typings.arcgisRestApi.mod.FeatureSet
import typings.arcgisRestApi.mod.Geometry
import typings.arcgisRestApi.mod.HasZM
import typings.arcgisRestApi.mod.Multipoint
import typings.arcgisRestApi.mod.Point
import typings.arcgisRestApi.mod.Polygon
import typings.arcgisRestApi.mod.Polyline
import typings.arcgisRestApi.mod.Position
import typings.arcgisRestApi.mod.SpatialReferenceWkid
import typings.ol.featureMod.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriJSONMod {
  
  @JSImport("ol/format/EsriJSON", JSImport.Default)
  @js.native
  class default () extends EsriJSON {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait EsriJSON
    extends typings.ol.jsonfeatureMod.default {
    
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: Unit, opt_idField: String): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions, opt_idField: String): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  }
  
  type EsriJSONFeature = Feature
  
  type EsriJSONFeatureSet = FeatureSet
  
  type EsriJSONGeometry = Geometry
  
  type EsriJSONHasZM = HasZM
  
  trait EsriJSONMultiPolygon extends StObject {
    
    var hasM: js.UndefOr[Boolean] = js.undefined
    
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    var rings: js.Array[js.Array[js.Array[js.Array[Double]]]]
    
    var spatialReference: js.UndefOr[EsriJSONSpatialReferenceWkid] = js.undefined
  }
  object EsriJSONMultiPolygon {
    
    @scala.inline
    def apply(rings: js.Array[js.Array[js.Array[js.Array[Double]]]]): EsriJSONMultiPolygon = {
      val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsriJSONMultiPolygon]
    }
    
    @scala.inline
    implicit class EsriJSONMultiPolygonMutableBuilder[Self <: EsriJSONMultiPolygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      @scala.inline
      def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      @scala.inline
      def setRings(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRingsVarargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "rings", js.Array(value :_*))
      
      @scala.inline
      def setSpatialReference(value: EsriJSONSpatialReferenceWkid): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    }
  }
  
  type EsriJSONMultipoint = Multipoint
  
  type EsriJSONPoint = Point
  
  type EsriJSONPolygon = Polygon
  
  type EsriJSONPolyline = Polyline
  
  type EsriJSONPosition = Position
  
  type EsriJSONSpatialReferenceWkid = SpatialReferenceWkid
  
  trait Options extends StObject {
    
    var geometryName: js.UndefOr[String] = js.undefined
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
      def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
