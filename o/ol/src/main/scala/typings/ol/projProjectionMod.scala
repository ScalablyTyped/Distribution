package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projUnitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projProjectionMod {
  
  @JSImport("ol/proj/Projection", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Projection {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def canWrapX(): Boolean = js.native
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      */
    /* CompleteClass */
    override def getAxisOrientation(): String = js.native
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      */
    /* CompleteClass */
    override def getCode(): String = js.native
    
    /* CompleteClass */
    override def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default = js.native
    
    /**
      * Get the validity extent for this projection.
      */
    /* CompleteClass */
    override def getExtent(): Extent = js.native
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with metersPerUnit or a units identifier, the return is
      * undefined.
      */
    /* CompleteClass */
    override def getMetersPerUnit(): js.UndefOr[Double] = js.native
    
    /**
      * Get the custom point resolution function for this projection (if set).
      */
    /* CompleteClass */
    override def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]] = js.native
    
    /**
      * Get the units of this projection.
      */
    /* CompleteClass */
    override def getUnits(): Units = js.native
    
    /**
      * Get the world extent for this projection.
      */
    /* CompleteClass */
    override def getWorldExtent(): Extent = js.native
    
    /**
      * Is this projection a global projection which spans the whole world?
      */
    /* CompleteClass */
    override def isGlobal(): Boolean = js.native
    
    /* CompleteClass */
    override def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
    
    /**
      * Set the validity extent for this projection.
      */
    /* CompleteClass */
    override def setExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj~getPointResolution}
      * for this projection.
      */
    /* CompleteClass */
    override def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
    
    /**
      * Set if the projection is a global projection which spans the whole world
      */
    /* CompleteClass */
    override def setGlobal(global: Boolean): Unit = js.native
    
    /**
      * Set the world extent for this projection.
      */
    /* CompleteClass */
    override def setWorldExtent(worldExtent: Extent): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var axisOrientation: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var getPointResolution: js.UndefOr[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var metersPerUnit: js.UndefOr[Double] = js.undefined
    
    var units: js.UndefOr[Units | String] = js.undefined
    
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
      
      inline def setGetPointResolution(value: (/* p0 */ Double, /* p1 */ Coordinate) => Double): Self = StObject.set(x, "getPointResolution", js.Any.fromFunction2(value))
      
      inline def setGetPointResolutionUndefined: Self = StObject.set(x, "getPointResolution", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
      
      inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
      
      inline def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setWorldExtent(value: Extent): Self = StObject.set(x, "worldExtent", value.asInstanceOf[js.Any])
      
      inline def setWorldExtentUndefined: Self = StObject.set(x, "worldExtent", js.undefined)
    }
  }
  
  trait Projection extends StObject {
    
    def canWrapX(): Boolean
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      */
    def getAxisOrientation(): String
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      */
    def getCode(): String
    
    def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default
    
    /**
      * Get the validity extent for this projection.
      */
    def getExtent(): Extent
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with metersPerUnit or a units identifier, the return is
      * undefined.
      */
    def getMetersPerUnit(): js.UndefOr[Double]
    
    /**
      * Get the custom point resolution function for this projection (if set).
      */
    def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]
    
    /**
      * Get the units of this projection.
      */
    def getUnits(): Units
    
    /**
      * Get the world extent for this projection.
      */
    def getWorldExtent(): Extent
    
    /**
      * Is this projection a global projection which spans the whole world?
      */
    def isGlobal(): Boolean
    
    def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit
    
    /**
      * Set the validity extent for this projection.
      */
    def setExtent(extent: Extent): Unit
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj~getPointResolution}
      * for this projection.
      */
    def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit
    
    /**
      * Set if the projection is a global projection which spans the whole world
      */
    def setGlobal(global: Boolean): Unit
    
    /**
      * Set the world extent for this projection.
      */
    def setWorldExtent(worldExtent: Extent): Unit
  }
  object Projection {
    
    inline def apply(
      canWrapX: () => Boolean,
      getAxisOrientation: () => String,
      getCode: () => String,
      getDefaultTileGrid: () => typings.ol.tilegridTileGridMod.default,
      getExtent: () => Extent,
      getMetersPerUnit: () => js.UndefOr[Double],
      getPointResolutionFunc: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]],
      getUnits: () => Units,
      getWorldExtent: () => Extent,
      isGlobal: () => Boolean,
      setDefaultTileGrid: typings.ol.tilegridTileGridMod.default => Unit,
      setExtent: Extent => Unit,
      setGetPointResolution: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit,
      setGlobal: Boolean => Unit,
      setWorldExtent: Extent => Unit
    ): Projection = {
      val __obj = js.Dynamic.literal(canWrapX = js.Any.fromFunction0(canWrapX), getAxisOrientation = js.Any.fromFunction0(getAxisOrientation), getCode = js.Any.fromFunction0(getCode), getDefaultTileGrid = js.Any.fromFunction0(getDefaultTileGrid), getExtent = js.Any.fromFunction0(getExtent), getMetersPerUnit = js.Any.fromFunction0(getMetersPerUnit), getPointResolutionFunc = js.Any.fromFunction0(getPointResolutionFunc), getUnits = js.Any.fromFunction0(getUnits), getWorldExtent = js.Any.fromFunction0(getWorldExtent), isGlobal = js.Any.fromFunction0(isGlobal), setDefaultTileGrid = js.Any.fromFunction1(setDefaultTileGrid), setExtent = js.Any.fromFunction1(setExtent), setGetPointResolution = js.Any.fromFunction1(setGetPointResolution), setGlobal = js.Any.fromFunction1(setGlobal), setWorldExtent = js.Any.fromFunction1(setWorldExtent))
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      inline def setCanWrapX(value: () => Boolean): Self = StObject.set(x, "canWrapX", js.Any.fromFunction0(value))
      
      inline def setGetAxisOrientation(value: () => String): Self = StObject.set(x, "getAxisOrientation", js.Any.fromFunction0(value))
      
      inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
      
      inline def setGetDefaultTileGrid(value: () => typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "getDefaultTileGrid", js.Any.fromFunction0(value))
      
      inline def setGetExtent(value: () => Extent): Self = StObject.set(x, "getExtent", js.Any.fromFunction0(value))
      
      inline def setGetMetersPerUnit(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getMetersPerUnit", js.Any.fromFunction0(value))
      
      inline def setGetPointResolutionFunc(value: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]): Self = StObject.set(x, "getPointResolutionFunc", js.Any.fromFunction0(value))
      
      inline def setGetUnits(value: () => Units): Self = StObject.set(x, "getUnits", js.Any.fromFunction0(value))
      
      inline def setGetWorldExtent(value: () => Extent): Self = StObject.set(x, "getWorldExtent", js.Any.fromFunction0(value))
      
      inline def setIsGlobal(value: () => Boolean): Self = StObject.set(x, "isGlobal", js.Any.fromFunction0(value))
      
      inline def setSetDefaultTileGrid(value: typings.ol.tilegridTileGridMod.default => Unit): Self = StObject.set(x, "setDefaultTileGrid", js.Any.fromFunction1(value))
      
      inline def setSetExtent(value: Extent => Unit): Self = StObject.set(x, "setExtent", js.Any.fromFunction1(value))
      
      inline def setSetGetPointResolution(value: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit): Self = StObject.set(x, "setGetPointResolution", js.Any.fromFunction1(value))
      
      inline def setSetGlobal(value: Boolean => Unit): Self = StObject.set(x, "setGlobal", js.Any.fromFunction1(value))
      
      inline def setSetWorldExtent(value: Extent => Unit): Self = StObject.set(x, "setWorldExtent", js.Any.fromFunction1(value))
    }
  }
}
