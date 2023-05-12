package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.olStrings.text_
import typings.ol.projMod.ProjectionLike
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFeatureMod {
  
  @JSImport("ol/format/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} ReadOptions
    * @property {import("../proj.js").ProjectionLike} [dataProjection] Projection of the data we are reading.
    * If not provided, the projection will be derived from the data (where possible) or
    * the `dataProjection` of the format is assigned (where set). If the projection
    * can not be derived from the data and if no `dataProjection` is set for a format,
    * the features will not be reprojected.
    * @property {import("../extent.js").Extent} [extent] Tile extent in map units of the tile being read.
    * This is only required when reading data with tile pixels as geometry units. When configured,
    * a `dataProjection` with `TILE_PIXELS` as `units` and the tile's pixel extent as `extent` needs to be
    * provided.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection of the feature geometries
    * created by the format reader. If not provided, features will be returned in the
    * `dataProjection`.
    */
  /**
    * @typedef {Object} WriteOptions
    * @property {import("../proj.js").ProjectionLike} [dataProjection] Projection of the data we are writing.
    * If not provided, the `dataProjection` of the format is assigned (where set).
    * If no `dataProjection` is set for a format, the features will be returned
    * in the `featureProjection`.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection of the feature geometries
    * that will be serialized by the format writer. If not provided, geometries are assumed
    * to be in the `dataProjection` if that is set; in other words, they are not transformed.
    * @property {boolean} [rightHanded] When writing geometries, follow the right-hand
    * rule for linear ring orientation.  This means that polygons will have counter-clockwise
    * exterior rings and clockwise interior rings.  By default, coordinates are serialized
    * as they are provided at construction.  If `true`, the right-hand rule will
    * be applied.  If `false`, the left-hand rule will be applied (clockwise for
    * exterior and counter-clockwise for interior rings).  Note that not all
    * formats support this.  The GeoJSON format does use this property when writing
    * geometries.
    * @property {number} [decimals] Maximum number of decimal places for coordinates.
    * Coordinates are stored internally as floats, but floating-point arithmetic can create
    * coordinates with a large number of decimal places, not generally wanted on output.
    * Set a number here to round coordinates. Can also be used to ensure that
    * coordinates read in can be written back out with the same number of decimals.
    * Default is no rounding.
    */
  /**
    * @typedef {'arraybuffer' | 'json' | 'text' | 'xml'} Type
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for feature formats.
    * {@link module:ol/format/Feature~FeatureFormat} subclasses provide the ability to decode and encode
    * {@link module:ol/Feature~Feature} objects from a variety of commonly used geospatial
    * file formats.  See the documentation for each format for more details.
    *
    * @abstract
    * @api
    */
  @JSImport("ol/format/Feature", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FeatureFormat
  
  inline def transformExtentWithOptions(extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def transformExtentWithOptions(extent: Extent, options: ReadOptions): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transformGeometryWithOptions(geometry: typings.ol.geomGeometryMod.default, write: Boolean): typings.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geomGeometryMod.default]
  inline def transformGeometryWithOptions(geometry: typings.ol.geomGeometryMod.default, write: Boolean, options: ReadOptions): typings.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geomGeometryMod.default]
  inline def transformGeometryWithOptions(geometry: typings.ol.geomGeometryMod.default, write: Boolean, options: WriteOptions): typings.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geomGeometryMod.default]
  
  /**
    * @typedef {Object} ReadOptions
    * @property {import("../proj.js").ProjectionLike} [dataProjection] Projection of the data we are reading.
    * If not provided, the projection will be derived from the data (where possible) or
    * the `dataProjection` of the format is assigned (where set). If the projection
    * can not be derived from the data and if no `dataProjection` is set for a format,
    * the features will not be reprojected.
    * @property {import("../extent.js").Extent} [extent] Tile extent in map units of the tile being read.
    * This is only required when reading data with tile pixels as geometry units. When configured,
    * a `dataProjection` with `TILE_PIXELS` as `units` and the tile's pixel extent as `extent` needs to be
    * provided.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection of the feature geometries
    * created by the format reader. If not provided, features will be returned in the
    * `dataProjection`.
    */
  /**
    * @typedef {Object} WriteOptions
    * @property {import("../proj.js").ProjectionLike} [dataProjection] Projection of the data we are writing.
    * If not provided, the `dataProjection` of the format is assigned (where set).
    * If no `dataProjection` is set for a format, the features will be returned
    * in the `featureProjection`.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection of the feature geometries
    * that will be serialized by the format writer. If not provided, geometries are assumed
    * to be in the `dataProjection` if that is set; in other words, they are not transformed.
    * @property {boolean} [rightHanded] When writing geometries, follow the right-hand
    * rule for linear ring orientation.  This means that polygons will have counter-clockwise
    * exterior rings and clockwise interior rings.  By default, coordinates are serialized
    * as they are provided at construction.  If `true`, the right-hand rule will
    * be applied.  If `false`, the left-hand rule will be applied (clockwise for
    * exterior and counter-clockwise for interior rings).  Note that not all
    * formats support this.  The GeoJSON format does use this property when writing
    * geometries.
    * @property {number} [decimals] Maximum number of decimal places for coordinates.
    * Coordinates are stored internally as floats, but floating-point arithmetic can create
    * coordinates with a large number of decimal places, not generally wanted on output.
    * Set a number here to round coordinates. Can also be used to ensure that
    * coordinates read in can be written back out with the same number of decimals.
    * Default is no rounding.
    */
  /**
    * @typedef {'arraybuffer' | 'json' | 'text' | 'xml'} Type
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for feature formats.
    * {@link module:ol/format/Feature~FeatureFormat} subclasses provide the ability to decode and encode
    * {@link module:ol/Feature~Feature} objects from a variety of commonly used geospatial
    * file formats.  See the documentation for each format for more details.
    *
    * @abstract
    * @api
    */
  @js.native
  trait FeatureFormat extends StObject {
    
    /**
      * Sets the `dataProjection` on the options, if no `dataProjection`
      * is set.
      * @param {WriteOptions|ReadOptions|undefined} options
      *     Options.
      * @protected
      * @return {WriteOptions|ReadOptions|undefined}
      *     Updated options.
      */
    /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    
    /**
      * @protected
      * @type {import("../proj/Projection.js").default|undefined}
      */
    /* protected */ var dataProjection: js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /**
      * @protected
      * @type {import("../proj/Projection.js").default|undefined}
      */
    /* protected */ var defaultFeatureProjection: js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: String, options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Any): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Any, options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /**
      * Adds the data projection to the read options.
      * @param {Document|Element|Object|string} source Source.
      * @param {ReadOptions} [options] Options.
      * @return {ReadOptions|undefined} Options.
      * @protected
      */
    /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Document, options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element, options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    
    /**
      * @abstract
      * @return {Type} The format type.
      */
    def getType(): Type = js.native
    
    def readFeature(source: String): FeatureLike = js.native
    def readFeature(source: String, options: ReadOptions): FeatureLike = js.native
    def readFeature(source: Any): FeatureLike = js.native
    def readFeature(source: Any, options: ReadOptions): FeatureLike = js.native
    /**
      * Read a single feature from a source.
      *
      * @abstract
      * @param {Document|Element|Object|string} source Source.
      * @param {ReadOptions} [options] Read options.
      * @return {import("../Feature.js").FeatureLike} Feature.
      */
    def readFeature(source: Document): FeatureLike = js.native
    def readFeature(source: Document, options: ReadOptions): FeatureLike = js.native
    def readFeature(source: Element): FeatureLike = js.native
    def readFeature(source: Element, options: ReadOptions): FeatureLike = js.native
    
    def readFeatures(source: String): js.Array[FeatureLike] = js.native
    def readFeatures(source: String, options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer, options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: Any): js.Array[FeatureLike] = js.native
    def readFeatures(source: Any, options: ReadOptions): js.Array[FeatureLike] = js.native
    /**
      * Read all features from a source.
      *
      * @abstract
      * @param {Document|Element|ArrayBuffer|Object|string} source Source.
      * @param {ReadOptions} [options] Read options.
      * @return {Array<import("../Feature.js").FeatureLike>} Features.
      */
    def readFeatures(source: Document): js.Array[FeatureLike] = js.native
    def readFeatures(source: Document, options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element, options: ReadOptions): js.Array[FeatureLike] = js.native
    
    def readGeometry(source: String): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: String, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Any): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Any, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    /**
      * Read a single geometry from a source.
      *
      * @abstract
      * @param {Document|Element|Object|string} source Source.
      * @param {ReadOptions} [options] Read options.
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    def readGeometry(source: Document): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Document, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Element): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Element, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    def readProjection(source: String): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    def readProjection(source: Any): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    /**
      * Read the projection from a source.
      *
      * @abstract
      * @param {Document|Element|Object|string} source Source.
      * @return {import("../proj/Projection.js").default|undefined} Projection.
      */
    def readProjection(source: Document): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    def readProjection(source: Element): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /**
      * A list media types supported by the format in descending order of preference.
      * @type {Array<string>}
      */
    var supportedMediaTypes: js.Array[String] = js.native
    
    /**
      * Encode a feature in this format.
      *
      * @abstract
      * @param {import("../Feature.js").default} feature Feature.
      * @param {WriteOptions} [options] Write options.
      * @return {string|ArrayBuffer} Result.
      */
    def writeFeature(feature: typings.ol.renderFeatureMod.default): String | js.typedarray.ArrayBuffer = js.native
    def writeFeature(feature: typings.ol.renderFeatureMod.default, options: WriteOptions): String | js.typedarray.ArrayBuffer = js.native
    
    /**
      * Encode an array of features in this format.
      *
      * @abstract
      * @param {Array<import("../Feature.js").default>} features Features.
      * @param {WriteOptions} [options] Write options.
      * @return {string|ArrayBuffer} Result.
      */
    def writeFeatures(features: js.Array[typings.ol.renderFeatureMod.default]): String | js.typedarray.ArrayBuffer = js.native
    def writeFeatures(features: js.Array[typings.ol.renderFeatureMod.default], options: WriteOptions): String | js.typedarray.ArrayBuffer = js.native
    
    /**
      * Write a single geometry in this format.
      *
      * @abstract
      * @param {import("../geom/Geometry.js").default} geometry Geometry.
      * @param {WriteOptions} [options] Write options.
      * @return {string|ArrayBuffer} Result.
      */
    def writeGeometry(geometry: typings.ol.geomGeometryMod.default): String | js.typedarray.ArrayBuffer = js.native
    def writeGeometry(geometry: typings.ol.geomGeometryMod.default, options: WriteOptions): String | js.typedarray.ArrayBuffer = js.native
  }
  
  trait ReadOptions extends StObject {
    
    /**
      * Projection of the data we are reading.
      * If not provided, the projection will be derived from the data (where possible) or
      * the `dataProjection` of the format is assigned (where set). If the projection
      * can not be derived from the data and if no `dataProjection` is set for a format,
      * the features will not be reprojected.
      */
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Tile extent in map units of the tile being read.
      * This is only required when reading data with tile pixels as geometry units. When configured,
      * a `dataProjection` with `TILE_PIXELS` as `units` and the tile's pixel extent as `extent` needs to be
      * provided.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Projection of the feature geometries
      * created by the format reader. If not provided, features will be returned in the
      * `dataProjection`.
      */
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.arraybuffer
    - typings.ol.olStrings.json
    - typings.ol.olStrings.text_
    - typings.ol.olStrings.xml
  */
  trait Type extends StObject
  object Type {
    
    inline def arraybuffer: typings.ol.olStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.ol.olStrings.arraybuffer]
    
    inline def json: typings.ol.olStrings.json = "json".asInstanceOf[typings.ol.olStrings.json]
    
    inline def text: text_ = "text".asInstanceOf[text_]
    
    inline def xml: typings.ol.olStrings.xml = "xml".asInstanceOf[typings.ol.olStrings.xml]
  }
  
  trait WriteOptions extends StObject {
    
    /**
      * Projection of the data we are writing.
      * If not provided, the `dataProjection` of the format is assigned (where set).
      * If no `dataProjection` is set for a format, the features will be returned
      * in the `featureProjection`.
      */
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Maximum number of decimal places for coordinates.
      * Coordinates are stored internally as floats, but floating-point arithmetic can create
      * coordinates with a large number of decimal places, not generally wanted on output.
      * Set a number here to round coordinates. Can also be used to ensure that
      * coordinates read in can be written back out with the same number of decimals.
      * Default is no rounding.
      */
    var decimals: js.UndefOr[Double] = js.undefined
    
    /**
      * Projection of the feature geometries
      * that will be serialized by the format writer. If not provided, geometries are assumed
      * to be in the `dataProjection` if that is set; in other words, they are not transformed.
      */
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * When writing geometries, follow the right-hand
      * rule for linear ring orientation.  This means that polygons will have counter-clockwise
      * exterior rings and clockwise interior rings.  By default, coordinates are serialized
      * as they are provided at construction.  If `true`, the right-hand rule will
      * be applied.  If `false`, the left-hand rule will be applied (clockwise for
      * exterior and counter-clockwise for interior rings).  Note that not all
      * formats support this.  The GeoJSON format does use this property when writing
      * geometries.
      */
    var rightHanded: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      inline def setRightHanded(value: Boolean): Self = StObject.set(x, "rightHanded", value.asInstanceOf[js.Any])
      
      inline def setRightHandedUndefined: Self = StObject.set(x, "rightHanded", js.undefined)
    }
  }
}
