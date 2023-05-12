package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projUnitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projProjectionMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} code The SRS identifier code, e.g. `EPSG:4326`.
    * @property {import("./Units.js").Units} [units] Units. Required unless a
    * proj4 projection is defined for `code`.
    * @property {import("../extent.js").Extent} [extent] The validity extent for the SRS.
    * @property {string} [axisOrientation='enu'] The axis orientation as specified in Proj4.
    * @property {boolean} [global=false] Whether the projection is valid for the whole globe.
    * @property {number} [metersPerUnit] The meters per unit for the SRS.
    * If not provided, the `units` are used to get the meters per unit from the {@link METERS_PER_UNIT}
    * lookup table.
    * @property {import("../extent.js").Extent} [worldExtent] The world extent for the SRS.
    * @property {function(number, import("../coordinate.js").Coordinate):number} [getPointResolution]
    * Function to determine resolution at a point. The function is called with a
    * `number` view resolution and a {@link module:ol/coordinate~Coordinate} as arguments, and returns
    * the `number` resolution in projection units at the passed coordinate. If this is `undefined`,
    * the default {@link module:ol/proj.getPointResolution} function will be used.
    */
  /**
    * @classdesc
    * Projection definition class. One of these is created for each projection
    * supported in the application and stored in the {@link module:ol/proj} namespace.
    * You can use these in applications, but this is not required, as API params
    * and options use {@link module:ol/proj~ProjectionLike} which means the simple string
    * code will suffice.
    *
    * You can use {@link module:ol/proj.get} to retrieve the object for a particular
    * projection.
    *
    * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
    * with the following aliases:
    * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
    *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
    *     http://www.opengis.net/gml/srs/epsg.xml#4326,
    *     urn:x-ogc:def:crs:EPSG:4326
    * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
    *     urn:ogc:def:crs:EPSG:6.18:3:3857,
    *     http://www.opengis.net/gml/srs/epsg.xml#3857
    *
    * If you use [proj4js](https://github.com/proj4js/proj4js), aliases can
    * be added using `proj4.defs()`. After all required projection definitions are
    * added, call the {@link module:ol/proj/proj4.register} function.
    *
    * @api
    */
  @JSImport("ol/proj/Projection", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Projection {
    /**
      * @param {Options} options Projection options.
      */
    def this(options: Options) = this()
    
    /**
      * @private
      * @type {string}
      */
    /* private */ /* CompleteClass */
    var axisOrientation_ : Any = js.native
    
    /**
      * @return {boolean} The projection is suitable for wrapping the x-axis
      */
    /* CompleteClass */
    override def canWrapX(): Boolean = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ /* CompleteClass */
    var canWrapX_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ /* CompleteClass */
    var code_ : Any = js.native
    
    /**
      * @private
      * @type {import("../tilegrid/TileGrid.js").default}
      */
    /* private */ /* CompleteClass */
    var defaultTileGrid_ : Any = js.native
    
    /**
      * Validity extent of the projection in projected coordinates. For projections
      * with `TILE_PIXELS` units, this is the extent of the tile in
      * tile pixel space.
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ /* CompleteClass */
    var extent_ : Any = js.native
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      * @return {string} Axis orientation.
      * @api
      */
    /* CompleteClass */
    override def getAxisOrientation(): String = js.native
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      * @return {string} Code.
      * @api
      */
    /* CompleteClass */
    override def getCode(): String = js.native
    
    /**
      * @return {import("../tilegrid/TileGrid.js").default} The default tile grid.
      */
    /* CompleteClass */
    override def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default = js.native
    
    /**
      * Get the validity extent for this projection.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    /* CompleteClass */
    override def getExtent(): Extent = js.native
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with `metersPerUnit` or a units identifier, the return is
      * `undefined`.
      * @return {number|undefined} Meters.
      * @api
      */
    /* CompleteClass */
    override def getMetersPerUnit(): js.UndefOr[Double] = js.native
    
    /**
      * Get the custom point resolution function for this projection (if set).
      * @return {function(number, import("../coordinate.js").Coordinate):number|undefined} The custom point
      * resolution function (if set).
      */
    /* CompleteClass */
    override def getPointResolutionFunc(): js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, js.UndefOr[Double]] = js.native
    
    /**
      * @private
      * @type {function(number, import("../coordinate.js").Coordinate):number|undefined}
      */
    /* private */ /* CompleteClass */
    var getPointResolutionFunc_ : Any = js.native
    
    /**
      * Get the units of this projection.
      * @return {import("./Units.js").Units} Units.
      * @api
      */
    /* CompleteClass */
    override def getUnits(): Units = js.native
    
    /**
      * Get the world extent for this projection.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    /* CompleteClass */
    override def getWorldExtent(): Extent = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ /* CompleteClass */
    var global_ : Any = js.native
    
    /**
      * Is this projection a global projection which spans the whole world?
      * @return {boolean} Whether the projection is global.
      * @api
      */
    /* CompleteClass */
    override def isGlobal(): Boolean = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ /* CompleteClass */
    var metersPerUnit_ : Any = js.native
    
    /**
      * @param {import("../tilegrid/TileGrid.js").default} tileGrid The default tile grid.
      */
    /* CompleteClass */
    override def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
    
    /**
      * Set the validity extent for this projection.
      * @param {import("../extent.js").Extent} extent Extent.
      * @api
      */
    /* CompleteClass */
    override def setExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj.getPointResolution}
      * for this projection.
      * @param {function(number, import("../coordinate.js").Coordinate):number} func Function
      * @api
      */
    /* CompleteClass */
    override def setGetPointResolution(func: js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, Double]): Unit = js.native
    
    /**
      * Set if the projection is a global projection which spans the whole world
      * @param {boolean} global Whether the projection is global.
      * @api
      */
    /* CompleteClass */
    override def setGlobal(global: Boolean): Unit = js.native
    
    /**
      * Set the world extent for this projection.
      * @param {import("../extent.js").Extent} worldExtent World extent
      *     [minlon, minlat, maxlon, maxlat].
      * @api
      */
    /* CompleteClass */
    override def setWorldExtent(worldExtent: Extent): Unit = js.native
    
    /**
      * Units of projected coordinates. When set to `TILE_PIXELS`, a
      * `this.extent_` and `this.worldExtent_` must be configured properly for each
      * tile.
      * @private
      * @type {import("./Units.js").Units}
      */
    /* private */ /* CompleteClass */
    var units_ : Any = js.native
    
    /**
      * Extent of the world in EPSG:4326. For projections with
      * `TILE_PIXELS` units, this is the extent of the tile in
      * projected coordinate space.
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ /* CompleteClass */
    var worldExtent_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The axis orientation as specified in Proj4.
      */
    var axisOrientation: js.UndefOr[String] = js.undefined
    
    /**
      * The SRS identifier code, e.g. `EPSG:4326`.
      */
    var code: String
    
    /**
      * The validity extent for the SRS.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Function to determine resolution at a point. The function is called with a
      * `number` view resolution and a {@link module :ol/coordinate~Coordinate} as arguments, and returns
      * the `number` resolution in projection units at the passed coordinate. If this is `undefined`,
      * the default {@link module :ol/proj.getPointResolution} function will be used.
      */
    var getPointResolution: js.UndefOr[js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, Double]] = js.undefined
    
    /**
      * Whether the projection is valid for the whole globe.
      */
    var global: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The meters per unit for the SRS.
      * If not provided, the `units` are used to get the meters per unit from the {@link METERS_PER_UNIT }lookup table.
      */
    var metersPerUnit: js.UndefOr[Double] = js.undefined
    
    /**
      * Units. Required unless a
      * proj4 projection is defined for `code`.
      */
    var units: js.UndefOr[Units] = js.undefined
    
    /**
      * The world extent for the SRS.
      */
    var worldExtent: js.UndefOr[Extent] = js.undefined
  }
  object Options {
    
    inline def apply(code: String): Options = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAxisOrientation(value: String): Self = StObject.set(x, "axisOrientation", value.asInstanceOf[js.Any])
      
      inline def setAxisOrientationUndefined: Self = StObject.set(x, "axisOrientation", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setGetPointResolution(value: (/* arg0 */ Double, /* arg1 */ Coordinate) => Double): Self = StObject.set(x, "getPointResolution", js.Any.fromFunction2(value))
      
      inline def setGetPointResolutionUndefined: Self = StObject.set(x, "getPointResolution", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
      
      inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
      
      inline def setUnits(value: Units): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setWorldExtent(value: Extent): Self = StObject.set(x, "worldExtent", value.asInstanceOf[js.Any])
      
      inline def setWorldExtentUndefined: Self = StObject.set(x, "worldExtent", js.undefined)
      
      inline def setWorldExtentVarargs(value: Double*): Self = StObject.set(x, "worldExtent", js.Array(value*))
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} code The SRS identifier code, e.g. `EPSG:4326`.
    * @property {import("./Units.js").Units} [units] Units. Required unless a
    * proj4 projection is defined for `code`.
    * @property {import("../extent.js").Extent} [extent] The validity extent for the SRS.
    * @property {string} [axisOrientation='enu'] The axis orientation as specified in Proj4.
    * @property {boolean} [global=false] Whether the projection is valid for the whole globe.
    * @property {number} [metersPerUnit] The meters per unit for the SRS.
    * If not provided, the `units` are used to get the meters per unit from the {@link METERS_PER_UNIT}
    * lookup table.
    * @property {import("../extent.js").Extent} [worldExtent] The world extent for the SRS.
    * @property {function(number, import("../coordinate.js").Coordinate):number} [getPointResolution]
    * Function to determine resolution at a point. The function is called with a
    * `number` view resolution and a {@link module:ol/coordinate~Coordinate} as arguments, and returns
    * the `number` resolution in projection units at the passed coordinate. If this is `undefined`,
    * the default {@link module:ol/proj.getPointResolution} function will be used.
    */
  /**
    * @classdesc
    * Projection definition class. One of these is created for each projection
    * supported in the application and stored in the {@link module:ol/proj} namespace.
    * You can use these in applications, but this is not required, as API params
    * and options use {@link module:ol/proj~ProjectionLike} which means the simple string
    * code will suffice.
    *
    * You can use {@link module:ol/proj.get} to retrieve the object for a particular
    * projection.
    *
    * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
    * with the following aliases:
    * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
    *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
    *     http://www.opengis.net/gml/srs/epsg.xml#4326,
    *     urn:x-ogc:def:crs:EPSG:4326
    * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
    *     urn:ogc:def:crs:EPSG:6.18:3:3857,
    *     http://www.opengis.net/gml/srs/epsg.xml#3857
    *
    * If you use [proj4js](https://github.com/proj4js/proj4js), aliases can
    * be added using `proj4.defs()`. After all required projection definitions are
    * added, call the {@link module:ol/proj/proj4.register} function.
    *
    * @api
    */
  trait Projection extends StObject {
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var axisOrientation_ : Any
    
    /**
      * @return {boolean} The projection is suitable for wrapping the x-axis
      */
    def canWrapX(): Boolean
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var canWrapX_ : Any
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var code_ : Any
    
    /**
      * @private
      * @type {import("../tilegrid/TileGrid.js").default}
      */
    /* private */ var defaultTileGrid_ : Any
    
    /**
      * Validity extent of the projection in projected coordinates. For projections
      * with `TILE_PIXELS` units, this is the extent of the tile in
      * tile pixel space.
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var extent_ : Any
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      * @return {string} Axis orientation.
      * @api
      */
    def getAxisOrientation(): String
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      * @return {string} Code.
      * @api
      */
    def getCode(): String
    
    /**
      * @return {import("../tilegrid/TileGrid.js").default} The default tile grid.
      */
    def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default
    
    /**
      * Get the validity extent for this projection.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getExtent(): Extent
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with `metersPerUnit` or a units identifier, the return is
      * `undefined`.
      * @return {number|undefined} Meters.
      * @api
      */
    def getMetersPerUnit(): js.UndefOr[Double]
    
    /**
      * Get the custom point resolution function for this projection (if set).
      * @return {function(number, import("../coordinate.js").Coordinate):number|undefined} The custom point
      * resolution function (if set).
      */
    def getPointResolutionFunc(): js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, js.UndefOr[Double]]
    
    /**
      * @private
      * @type {function(number, import("../coordinate.js").Coordinate):number|undefined}
      */
    /* private */ var getPointResolutionFunc_ : Any
    
    /**
      * Get the units of this projection.
      * @return {import("./Units.js").Units} Units.
      * @api
      */
    def getUnits(): Units
    
    /**
      * Get the world extent for this projection.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getWorldExtent(): Extent
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var global_ : Any
    
    /**
      * Is this projection a global projection which spans the whole world?
      * @return {boolean} Whether the projection is global.
      * @api
      */
    def isGlobal(): Boolean
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var metersPerUnit_ : Any
    
    /**
      * @param {import("../tilegrid/TileGrid.js").default} tileGrid The default tile grid.
      */
    def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit
    
    /**
      * Set the validity extent for this projection.
      * @param {import("../extent.js").Extent} extent Extent.
      * @api
      */
    def setExtent(extent: Extent): Unit
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj.getPointResolution}
      * for this projection.
      * @param {function(number, import("../coordinate.js").Coordinate):number} func Function
      * @api
      */
    def setGetPointResolution(func: js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, Double]): Unit
    
    /**
      * Set if the projection is a global projection which spans the whole world
      * @param {boolean} global Whether the projection is global.
      * @api
      */
    def setGlobal(global: Boolean): Unit
    
    /**
      * Set the world extent for this projection.
      * @param {import("../extent.js").Extent} worldExtent World extent
      *     [minlon, minlat, maxlon, maxlat].
      * @api
      */
    def setWorldExtent(worldExtent: Extent): Unit
    
    /**
      * Units of projected coordinates. When set to `TILE_PIXELS`, a
      * `this.extent_` and `this.worldExtent_` must be configured properly for each
      * tile.
      * @private
      * @type {import("./Units.js").Units}
      */
    /* private */ var units_ : Any
    
    /**
      * Extent of the world in EPSG:4326. For projections with
      * `TILE_PIXELS` units, this is the extent of the tile in
      * projected coordinate space.
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var worldExtent_ : Any
  }
  object Projection {
    
    inline def apply(
      axisOrientation_ : Any,
      canWrapX: () => Boolean,
      canWrapX_ : Any,
      code_ : Any,
      defaultTileGrid_ : Any,
      extent_ : Any,
      getAxisOrientation: () => String,
      getCode: () => String,
      getDefaultTileGrid: () => typings.ol.tilegridTileGridMod.default,
      getExtent: () => Extent,
      getMetersPerUnit: () => js.UndefOr[Double],
      getPointResolutionFunc: () => js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, js.UndefOr[Double]],
      getPointResolutionFunc_ : Any,
      getUnits: () => Units,
      getWorldExtent: () => Extent,
      global_ : Any,
      isGlobal: () => Boolean,
      metersPerUnit_ : Any,
      setDefaultTileGrid: typings.ol.tilegridTileGridMod.default => Unit,
      setExtent: Extent => Unit,
      setGetPointResolution: js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, Double] => Unit,
      setGlobal: Boolean => Unit,
      setWorldExtent: Extent => Unit,
      units_ : Any,
      worldExtent_ : Any
    ): Projection = {
      val __obj = js.Dynamic.literal(axisOrientation_ = axisOrientation_.asInstanceOf[js.Any], canWrapX = js.Any.fromFunction0(canWrapX), canWrapX_ = canWrapX_.asInstanceOf[js.Any], code_ = code_.asInstanceOf[js.Any], defaultTileGrid_ = defaultTileGrid_.asInstanceOf[js.Any], extent_ = extent_.asInstanceOf[js.Any], getAxisOrientation = js.Any.fromFunction0(getAxisOrientation), getCode = js.Any.fromFunction0(getCode), getDefaultTileGrid = js.Any.fromFunction0(getDefaultTileGrid), getExtent = js.Any.fromFunction0(getExtent), getMetersPerUnit = js.Any.fromFunction0(getMetersPerUnit), getPointResolutionFunc = js.Any.fromFunction0(getPointResolutionFunc), getPointResolutionFunc_ = getPointResolutionFunc_.asInstanceOf[js.Any], getUnits = js.Any.fromFunction0(getUnits), getWorldExtent = js.Any.fromFunction0(getWorldExtent), global_ = global_.asInstanceOf[js.Any], isGlobal = js.Any.fromFunction0(isGlobal), metersPerUnit_ = metersPerUnit_.asInstanceOf[js.Any], setDefaultTileGrid = js.Any.fromFunction1(setDefaultTileGrid), setExtent = js.Any.fromFunction1(setExtent), setGetPointResolution = js.Any.fromFunction1(setGetPointResolution), setGlobal = js.Any.fromFunction1(setGlobal), setWorldExtent = js.Any.fromFunction1(setWorldExtent), units_ = units_.asInstanceOf[js.Any], worldExtent_ = worldExtent_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      inline def setAxisOrientation_(value: Any): Self = StObject.set(x, "axisOrientation_", value.asInstanceOf[js.Any])
      
      inline def setCanWrapX(value: () => Boolean): Self = StObject.set(x, "canWrapX", js.Any.fromFunction0(value))
      
      inline def setCanWrapX_(value: Any): Self = StObject.set(x, "canWrapX_", value.asInstanceOf[js.Any])
      
      inline def setCode_(value: Any): Self = StObject.set(x, "code_", value.asInstanceOf[js.Any])
      
      inline def setDefaultTileGrid_(value: Any): Self = StObject.set(x, "defaultTileGrid_", value.asInstanceOf[js.Any])
      
      inline def setExtent_(value: Any): Self = StObject.set(x, "extent_", value.asInstanceOf[js.Any])
      
      inline def setGetAxisOrientation(value: () => String): Self = StObject.set(x, "getAxisOrientation", js.Any.fromFunction0(value))
      
      inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
      
      inline def setGetDefaultTileGrid(value: () => typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "getDefaultTileGrid", js.Any.fromFunction0(value))
      
      inline def setGetExtent(value: () => Extent): Self = StObject.set(x, "getExtent", js.Any.fromFunction0(value))
      
      inline def setGetMetersPerUnit(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getMetersPerUnit", js.Any.fromFunction0(value))
      
      inline def setGetPointResolutionFunc(value: () => js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, js.UndefOr[Double]]): Self = StObject.set(x, "getPointResolutionFunc", js.Any.fromFunction0(value))
      
      inline def setGetPointResolutionFunc_(value: Any): Self = StObject.set(x, "getPointResolutionFunc_", value.asInstanceOf[js.Any])
      
      inline def setGetUnits(value: () => Units): Self = StObject.set(x, "getUnits", js.Any.fromFunction0(value))
      
      inline def setGetWorldExtent(value: () => Extent): Self = StObject.set(x, "getWorldExtent", js.Any.fromFunction0(value))
      
      inline def setGlobal_(value: Any): Self = StObject.set(x, "global_", value.asInstanceOf[js.Any])
      
      inline def setIsGlobal(value: () => Boolean): Self = StObject.set(x, "isGlobal", js.Any.fromFunction0(value))
      
      inline def setMetersPerUnit_(value: Any): Self = StObject.set(x, "metersPerUnit_", value.asInstanceOf[js.Any])
      
      inline def setSetDefaultTileGrid(value: typings.ol.tilegridTileGridMod.default => Unit): Self = StObject.set(x, "setDefaultTileGrid", js.Any.fromFunction1(value))
      
      inline def setSetExtent(value: Extent => Unit): Self = StObject.set(x, "setExtent", js.Any.fromFunction1(value))
      
      inline def setSetGetPointResolution(value: js.Function2[/* arg0 */ Double, /* arg1 */ Coordinate, Double] => Unit): Self = StObject.set(x, "setGetPointResolution", js.Any.fromFunction1(value))
      
      inline def setSetGlobal(value: Boolean => Unit): Self = StObject.set(x, "setGlobal", js.Any.fromFunction1(value))
      
      inline def setSetWorldExtent(value: Extent => Unit): Self = StObject.set(x, "setWorldExtent", js.Any.fromFunction1(value))
      
      inline def setUnits_(value: Any): Self = StObject.set(x, "units_", value.asInstanceOf[js.Any])
      
      inline def setWorldExtent_(value: Any): Self = StObject.set(x, "worldExtent_", value.asInstanceOf[js.Any])
    }
  }
}
