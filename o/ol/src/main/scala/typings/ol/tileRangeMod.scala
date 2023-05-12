package typings.ol

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileRangeMod {
  
  @JSImport("ol/TileRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @module ol/TileRange
    */
  /**
    * A representation of a contiguous block of tiles.  A tile range is specified
    * by its min/max tile coordinates and is inclusive of coordinates.
    */
  @JSImport("ol/TileRange", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TileRange {
    /**
      * @param {number} minX Minimum X.
      * @param {number} maxX Maximum X.
      * @param {number} minY Minimum Y.
      * @param {number} maxY Maximum Y.
      */
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
    
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @return {boolean} Contains tile coordinate.
      */
    /* CompleteClass */
    override def contains(tileCoord: TileCoord): Boolean = js.native
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Contains.
      */
    /* CompleteClass */
    override def containsTileRange(tileRange: TileRange): Boolean = js.native
    
    /**
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @return {boolean} Contains coordinate.
      */
    /* CompleteClass */
    override def containsXY(x: Double, y: Double): Boolean = js.native
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Equals.
      */
    /* CompleteClass */
    override def equals(tileRange: TileRange): Boolean = js.native
    
    /**
      * @param {TileRange} tileRange Tile range.
      */
    /* CompleteClass */
    override def extend(tileRange: TileRange): Unit = js.native
    
    /**
      * @return {number} Height.
      */
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /**
      * @return {import("./size.js").Size} Size.
      */
    /* CompleteClass */
    override def getSize(): Size = js.native
    
    /**
      * @return {number} Width.
      */
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Intersects.
      */
    /* CompleteClass */
    override def intersects(tileRange: TileRange): Boolean = js.native
    
    /**
      * @type {number}
      */
    /* CompleteClass */
    var maxX: Double = js.native
    
    /**
      * @type {number}
      */
    /* CompleteClass */
    var maxY: Double = js.native
    
    /**
      * @type {number}
      */
    /* CompleteClass */
    var minX: Double = js.native
    
    /**
      * @type {number}
      */
    /* CompleteClass */
    var minY: Double = js.native
  }
  
  inline def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  inline def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double, tileRange: TileRange): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any], tileRange.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  
  /**
    * @module ol/TileRange
    */
  /**
    * A representation of a contiguous block of tiles.  A tile range is specified
    * by its min/max tile coordinates and is inclusive of coordinates.
    */
  trait TileRange extends StObject {
    
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @return {boolean} Contains tile coordinate.
      */
    def contains(tileCoord: TileCoord): Boolean
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Contains.
      */
    def containsTileRange(tileRange: TileRange): Boolean
    
    /**
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @return {boolean} Contains coordinate.
      */
    def containsXY(x: Double, y: Double): Boolean
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Equals.
      */
    def equals(tileRange: TileRange): Boolean
    
    /**
      * @param {TileRange} tileRange Tile range.
      */
    def extend(tileRange: TileRange): Unit
    
    /**
      * @return {number} Height.
      */
    def getHeight(): Double
    
    /**
      * @return {import("./size.js").Size} Size.
      */
    def getSize(): Size
    
    /**
      * @return {number} Width.
      */
    def getWidth(): Double
    
    /**
      * @param {TileRange} tileRange Tile range.
      * @return {boolean} Intersects.
      */
    def intersects(tileRange: TileRange): Boolean
    
    /**
      * @type {number}
      */
    var maxX: Double
    
    /**
      * @type {number}
      */
    var maxY: Double
    
    /**
      * @type {number}
      */
    var minX: Double
    
    /**
      * @type {number}
      */
    var minY: Double
  }
  object TileRange {
    
    inline def apply(
      contains: TileCoord => Boolean,
      containsTileRange: TileRange => Boolean,
      containsXY: (Double, Double) => Boolean,
      equals_ : TileRange => Boolean,
      extend: TileRange => Unit,
      getHeight: () => Double,
      getSize: () => Size,
      getWidth: () => Double,
      intersects: TileRange => Boolean,
      maxX: Double,
      maxY: Double,
      minX: Double,
      minY: Double
    ): TileRange = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), extend = js.Any.fromFunction1(extend), getHeight = js.Any.fromFunction0(getHeight), getSize = js.Any.fromFunction0(getSize), getWidth = js.Any.fromFunction0(getWidth), intersects = js.Any.fromFunction1(intersects), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TileRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileRange] (val x: Self) extends AnyVal {
      
      inline def setContains(value: TileCoord => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContainsTileRange(value: TileRange => Boolean): Self = StObject.set(x, "containsTileRange", js.Any.fromFunction1(value))
      
      inline def setContainsXY(value: (Double, Double) => Boolean): Self = StObject.set(x, "containsXY", js.Any.fromFunction2(value))
      
      inline def setEquals_(value: TileRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setExtend(value: TileRange => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setIntersects(value: TileRange => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
}
