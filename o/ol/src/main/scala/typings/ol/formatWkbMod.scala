package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWkbMod {
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [splitCollection=false] Whether to split GeometryCollections into multiple features on reading.
    * @property {boolean} [hex=true] Returns hex string instead of ArrayBuffer for output. This also is used as a hint internally whether it should load contents as text or ArrayBuffer on reading.
    * @property {boolean} [littleEndian=true] Use littleEndian for output.
    * @property {boolean} [ewkb=true] Use EWKB format for output.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout=null] Use specific coordinate layout for output features (null: auto detect)
    * @property {number} [nodataZ=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of Z.
    * @property {number} [nodataM=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of M.
    * @property {number|boolean} [srid=true] SRID for output. Specify integer value to enforce the value as a SRID. Specify `true` to extract from `dataProjection`. `false` to suppress the output. This option only takes effect when `ewkb` is `true`.
    */
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `Well-Known Binary` (WKB) format.
    * Also supports `Extended Well-Known Binary` (EWKB) format, used in PostGIS for example.
    *
    * @api
    */
  @JSImport("ol/format/WKB", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class default () extends WKB {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Use EWKB format for output.
      */
    var ewkb: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use specific coordinate layout for output features (null: auto detect)
      */
    var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
    
    /**
      * Returns hex string instead of ArrayBuffer for output. This also is used as a hint internally whether it should load contents as text or ArrayBuffer on reading.
      */
    var hex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use littleEndian for output.
      */
    var littleEndian: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of M.
      */
    var nodataM: js.UndefOr[Double] = js.undefined
    
    /**
      * If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of Z.
      */
    var nodataZ: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to split GeometryCollections into multiple features on reading.
      */
    var splitCollection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * SRID for output. Specify integer value to enforce the value as a SRID. Specify `true` to extract from `dataProjection`. `false` to suppress the output. This option only takes effect when `ewkb` is `true`.
      */
    var srid: js.UndefOr[Double | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEwkb(value: Boolean): Self = StObject.set(x, "ewkb", value.asInstanceOf[js.Any])
      
      inline def setEwkbUndefined: Self = StObject.set(x, "ewkb", js.undefined)
      
      inline def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
      
      inline def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setLittleEndian(value: Boolean): Self = StObject.set(x, "littleEndian", value.asInstanceOf[js.Any])
      
      inline def setLittleEndianUndefined: Self = StObject.set(x, "littleEndian", js.undefined)
      
      inline def setNodataM(value: Double): Self = StObject.set(x, "nodataM", value.asInstanceOf[js.Any])
      
      inline def setNodataMUndefined: Self = StObject.set(x, "nodataM", js.undefined)
      
      inline def setNodataZ(value: Double): Self = StObject.set(x, "nodataZ", value.asInstanceOf[js.Any])
      
      inline def setNodataZUndefined: Self = StObject.set(x, "nodataZ", js.undefined)
      
      inline def setSplitCollection(value: Boolean): Self = StObject.set(x, "splitCollection", value.asInstanceOf[js.Any])
      
      inline def setSplitCollectionUndefined: Self = StObject.set(x, "splitCollection", js.undefined)
      
      inline def setSrid(value: Double | Boolean): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      inline def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [splitCollection=false] Whether to split GeometryCollections into multiple features on reading.
    * @property {boolean} [hex=true] Returns hex string instead of ArrayBuffer for output. This also is used as a hint internally whether it should load contents as text or ArrayBuffer on reading.
    * @property {boolean} [littleEndian=true] Use littleEndian for output.
    * @property {boolean} [ewkb=true] Use EWKB format for output.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout=null] Use specific coordinate layout for output features (null: auto detect)
    * @property {number} [nodataZ=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of Z.
    * @property {number} [nodataM=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of M.
    * @property {number|boolean} [srid=true] SRID for output. Specify integer value to enforce the value as a SRID. Specify `true` to extract from `dataProjection`. `false` to suppress the output. This option only takes effect when `ewkb` is `true`.
    */
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `Well-Known Binary` (WKB) format.
    * Also supports `Extended Well-Known Binary` (EWKB) format, used in PostGIS for example.
    *
    * @api
    */
  @js.native
  trait WKB
    extends typings.ol.formatFeatureMod.default {
    
    var ewkb_ : Boolean = js.native
    
    var hex_ : Boolean = js.native
    
    var layout_ : js.UndefOr[GeometryLayout] = js.native
    
    var littleEndian_ : Boolean = js.native
    
    var nodataM_ : Double = js.native
    
    var nodataZ_ : Double = js.native
    
    def readFeature(source: js.typedarray.ArrayBuffer): typings.ol.renderFeatureMod.default = js.native
    def readFeature(source: js.typedarray.ArrayBufferView): typings.ol.renderFeatureMod.default = js.native
    def readFeature(source: js.typedarray.ArrayBufferView, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    def readFeature(source: js.typedarray.ArrayBuffer, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    def readFeatures(source: js.typedarray.ArrayBufferView): js.Array[typings.ol.renderFeatureMod.default] = js.native
    def readFeatures(source: js.typedarray.ArrayBufferView, options: ReadOptions): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    def readGeometry(source: js.typedarray.ArrayBuffer): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBufferView): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBufferView, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBuffer, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    def readProjection(source: js.typedarray.ArrayBuffer): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    def readProjection(source: js.typedarray.ArrayBufferView): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    var splitCollection: Boolean = js.native
    
    var srid_ : js.UndefOr[Double | Boolean] = js.native
    
    var viewCache_ : js.typedarray.DataView | Null = js.native
  }
}
