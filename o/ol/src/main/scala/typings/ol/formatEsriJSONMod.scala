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
import typings.ol.formatFeatureMod.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatEsriJSONMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [geometryName] Geometry name to use when creating features.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the EsriJSON format.
    *
    * @api
    */
  @JSImport("ol/format/EsriJSON", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends EsriJSON {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [geometryName] Geometry name to use when creating features.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the EsriJSON format.
    *
    * @api
    */
  @js.native
  trait EsriJSON
    extends typings.ol.formatJsonfeatureMod.default {
    
    /**
      * Name of the geometry attribute for features.
      * @type {string|undefined}
      * @private
      */
    /* private */ var geometryName_ : Any = js.native
    
    /* protected */ def readFeatureFromObject(`object`: Any, options: Unit, idField: String): typings.ol.renderFeatureMod.default = js.native
    /* protected */ def readFeatureFromObject(`object`: Any, options: ReadOptions, idField: String): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @param {EsriJSONGeometry} object Object.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  }
  
  type EsriJSONFeature = Feature
  
  type EsriJSONFeatureSet = FeatureSet
  
  type EsriJSONGeometry = Geometry
  
  type EsriJSONHasZM = HasZM
  
  trait EsriJSONMultiPolygon extends StObject {
    
    /**
      * If the polygon coordinates have an M value.
      */
    var hasM: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the polygon coordinates have a Z value.
      */
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rings for the MultiPolygon.
      */
    var rings: js.Array[js.Array[js.Array[js.Array[Double]]]]
    
    /**
      * The coordinate reference system.
      */
    var spatialReference: js.UndefOr[SpatialReferenceWkid] = js.undefined
  }
  object EsriJSONMultiPolygon {
    
    inline def apply(rings: js.Array[js.Array[js.Array[js.Array[Double]]]]): EsriJSONMultiPolygon = {
      val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsriJSONMultiPolygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EsriJSONMultiPolygon] (val x: Self) extends AnyVal {
      
      inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      inline def setRings(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
      
      inline def setRingsVarargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "rings", js.Array(value*))
      
      inline def setSpatialReference(value: SpatialReferenceWkid): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
      
      inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    }
  }
  
  type EsriJSONMultipoint = Multipoint
  
  type EsriJSONPoint = Point
  
  type EsriJSONPolygon = Polygon
  
  type EsriJSONPolyline = Polyline
  
  type EsriJSONPosition = Position
  
  type EsriJSONSpatialReferenceWkid = SpatialReferenceWkid
  
  trait Options extends StObject {
    
    /**
      * Geometry name to use when creating features.
      */
    var geometryName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
