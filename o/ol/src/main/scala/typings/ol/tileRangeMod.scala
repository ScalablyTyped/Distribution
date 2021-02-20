package typings.ol

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileRangeMod {
  
  @JSImport("ol/TileRange", JSImport.Default)
  @js.native
  class default protected () extends TileRange {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol/TileRange", "createOrUpdate")
  @js.native
  def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double): TileRange = js.native
  @JSImport("ol/TileRange", "createOrUpdate")
  @js.native
  def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double, tileRange: TileRange): TileRange = js.native
  
  @js.native
  trait TileRange extends StObject {
    
    def contains(tileCoord: TileCoord): Boolean = js.native
    
    def containsTileRange(tileRange: TileRange): Boolean = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    def equals(tileRange: TileRange): Boolean = js.native
    
    def extend(tileRange: TileRange): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getSize(): Size = js.native
    
    def getWidth(): Double = js.native
    
    def intersects(tileRange: TileRange): Boolean = js.native
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
