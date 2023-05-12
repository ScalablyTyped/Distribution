package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.geomGeometryMod.Type
import typings.ol.geomMod.LineString
import typings.ol.geomMod.MultiLineString
import typings.ol.geomMod.MultiPoint
import typings.ol.geomMod.MultiPolygon
import typings.ol.geomMod.Point
import typings.ol.geomMod.Polygon
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import typings.ol.styleStyleMod.StyleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderFeatureMod {
  
  @JSImport("ol/render/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Lightweight, read-only, {@link module:ol/Feature~Feature} and {@link module:ol/geom/Geometry~Geometry} like
    * structure, optimized for vector tile rendering and styling. Geometry access
    * through the API is limited to getting the type and extent of the geometry.
    */
  @JSImport("ol/render/Feature", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RenderFeature {
    /**
      * @param {import("../geom/Geometry.js").Type} type Geometry type.
      * @param {Array<number>} flatCoordinates Flat coordinates. These always need
      *     to be right-handed for polygons.
      * @param {Array<number>|Array<Array<number>>} ends Ends or Endss.
      * @param {Object<string, *>} properties Properties.
      * @param {number|string|undefined} id Feature id.
      */
    def this(
      `type`: Type,
      flatCoordinates: js.Array[Double],
      ends: js.Array[js.Array[Double] | Double],
      properties: StringDictionary[Any]
    ) = this()
    def this(
      `type`: Type,
      flatCoordinates: js.Array[Double],
      ends: js.Array[js.Array[Double] | Double],
      properties: StringDictionary[Any],
      id: String
    ) = this()
    def this(
      `type`: Type,
      flatCoordinates: js.Array[Double],
      ends: js.Array[js.Array[Double] | Double],
      properties: StringDictionary[Any],
      id: Double
    ) = this()
  }
  
  inline def toFeature(renderFeature: RenderFeature): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFeature")(renderFeature.asInstanceOf[js.Any]).asInstanceOf[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
  inline def toFeature(renderFeature: RenderFeature, geometryName: String): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFeature")(renderFeature.asInstanceOf[js.Any], geometryName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
  
  inline def toGeometry(renderFeature: RenderFeature): Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeometry")(renderFeature.asInstanceOf[js.Any]).asInstanceOf[Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon]
  
  /**
    * Lightweight, read-only, {@link module:ol/Feature~Feature} and {@link module:ol/geom/Geometry~Geometry} like
    * structure, optimized for vector tile rendering and styling. Geometry access
    * through the API is limited to getting the type and extent of the geometry.
    */
  @js.native
  trait RenderFeature extends StObject {
    
    /**
      * @private
      * @type {Array<number>|Array<Array<number>>}
      */
    /* private */ var ends_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent|undefined}
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var flatCoordinates_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var flatInteriorPoints_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var flatMidpoints_ : Any = js.native
    
    /**
      * Get a feature property by its key.
      * @param {string} key Key
      * @return {*} Value for the requested key.
      * @api
      */
    def get(key: String): Any = js.native
    
    /**
      * @return {Array<number>|Array<Array<number>>} Ends or endss.
      */
    def getEnds(): js.Array[js.Array[Double] | Double] = js.native
    
    def getEndss(): js.Array[js.Array[Double] | Double] = js.native
    
    /**
      * Get the extent of this feature's geometry.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getExtent(): Extent = js.native
    
    /**
      * @return {Array<number>} Flat coordinates.
      */
    def getFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Flat interior points.
      */
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Flat interior points.
      */
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Flat midpoint.
      */
    def getFlatMidpoint(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Flat midpoints.
      */
    def getFlatMidpoints(): js.Array[Double] = js.native
    
    /**
      * For API compatibility with {@link module:ol/Feature~Feature}, this method is useful when
      * determining the geometry type in style function (see {@link #getType}).
      * @return {RenderFeature} Feature.
      * @api
      */
    def getGeometry(): RenderFeature = js.native
    
    /**
      * Get the feature identifier.  This is a stable identifier for the feature and
      * is set when reading data from a remote source.
      * @return {number|string|undefined} Id.
      * @api
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * @return {Array<number>} Flat coordinates.
      */
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Get the feature properties.
      * @return {Object<string, *>} Feature properties.
      * @api
      */
    def getProperties(): StringDictionary[Any] = js.native
    
    /**
      * @param {number} squaredTolerance Squared tolerance.
      * @return {RenderFeature} Simplified geometry.
      */
    def getSimplifiedGeometry(squaredTolerance: Double): RenderFeature = js.native
    
    /**
      * @return {number} Stride.
      */
    def getStride(): Double = js.native
    
    /**
      * @return {import('../style/Style.js').StyleFunction|undefined} Style
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    
    /**
      * Get the type of this feature's geometry.
      * @return {import("../geom/Geometry.js").Type} Geometry type.
      * @api
      */
    def getType(): Type = js.native
    
    /**
      * @private
      * @type {number|string|undefined}
      */
    /* private */ var id_ : Any = js.native
    
    /**
      * @private
      * @type {Object<string, *>}
      */
    /* private */ var properties_ : Any = js.native
    
    /**
      * Get a transformed and simplified version of the geometry.
      * @abstract
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../proj.js").TransformFunction} [transform] Optional transform function.
      * @return {RenderFeature} Simplified geometry.
      */
    def simplifyTransformed(squaredTolerance: Double): RenderFeature = js.native
    def simplifyTransformed(squaredTolerance: Double, transform: TransformFunction): RenderFeature = js.native
    
    /**
      * @type {import("../style/Style.js").StyleFunction|undefined}
      */
    var styleFunction: js.UndefOr[StyleFunction] = js.native
    
    /**
      * Transform geometry coordinates from tile pixel space to projected.
      *
      * @param {import("../proj.js").ProjectionLike} projection The data projection
      */
    def transform(projection: ProjectionLike): Unit = js.native
    
    /**
      * @private
      * @type {import("../geom/Geometry.js").Type}
      */
    /* private */ var type_ : Any = js.native
  }
}
