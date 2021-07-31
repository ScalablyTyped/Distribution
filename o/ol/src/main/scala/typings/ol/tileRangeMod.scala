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
  
  @JSImport("ol/TileRange", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TileRange {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
    
    /* CompleteClass */
    override def contains(tileCoord: TileCoord): Boolean = js.native
    
    /* CompleteClass */
    override def containsTileRange(tileRange: TileRange): Boolean = js.native
    
    /* CompleteClass */
    override def containsXY(x: Double, y: Double): Boolean = js.native
    
    /* CompleteClass */
    override def equals(tileRange: TileRange): Boolean = js.native
    
    /* CompleteClass */
    override def extend(tileRange: TileRange): Unit = js.native
    
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /* CompleteClass */
    override def getSize(): Size = js.native
    
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /* CompleteClass */
    override def intersects(tileRange: TileRange): Boolean = js.native
  }
  
  @scala.inline
  def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  @scala.inline
  def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double, tileRange: TileRange): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any], tileRange.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  
  trait TileRange extends StObject {
    
    def contains(tileCoord: TileCoord): Boolean
    
    def containsTileRange(tileRange: TileRange): Boolean
    
    def containsXY(x: Double, y: Double): Boolean
    
    def equals(tileRange: TileRange): Boolean
    
    def extend(tileRange: TileRange): Unit
    
    def getHeight(): Double
    
    def getSize(): Size
    
    def getWidth(): Double
    
    def intersects(tileRange: TileRange): Boolean
  }
  object TileRange {
    
    @scala.inline
    def apply(
      contains: TileCoord => Boolean,
      containsTileRange: TileRange => Boolean,
      containsXY: (Double, Double) => Boolean,
      equals_ : TileRange => Boolean,
      extend: TileRange => Unit,
      getHeight: () => Double,
      getSize: () => Size,
      getWidth: () => Double,
      intersects: TileRange => Boolean
    ): TileRange = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), extend = js.Any.fromFunction1(extend), getHeight = js.Any.fromFunction0(getHeight), getSize = js.Any.fromFunction0(getSize), getWidth = js.Any.fromFunction0(getWidth), intersects = js.Any.fromFunction1(intersects))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TileRange]
    }
    
    @scala.inline
    implicit class TileRangeMutableBuilder[Self <: TileRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: TileCoord => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainsTileRange(value: TileRange => Boolean): Self = StObject.set(x, "containsTileRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainsXY(value: (Double, Double) => Boolean): Self = StObject.set(x, "containsXY", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_(value: TileRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtend(value: TileRange => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIntersects(value: TileRange => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    }
  }
}
