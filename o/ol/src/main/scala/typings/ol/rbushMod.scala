package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbushMod {
  
  @JSImport("ol/structs/RBush", JSImport.Default)
  @js.native
  class default[T] ()
    extends StObject
       with RBush[T] {
    def this(opt_maxEntries: Double) = this()
  }
  
  trait Entry extends StObject {
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Entry {
    
    @scala.inline
    def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): Entry = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RBush[T] extends StObject {
    
    /**
      * Remove all values from the RBush.
      */
    def clear(): Unit = js.native
    
    def concat(rbush: RBush[T]): Unit = js.native
    
    /**
      * Calls a callback function with each value in the tree.
      * If the callback returns a truthy value, this value is returned without
      * checking the rest of the tree.
      */
    def forEach(callback: js.Function1[/* p0 */ T, js.Any]): js.Any = js.native
    
    /**
      * Calls a callback function with each value in the provided extent.
      */
    def forEachInExtent(extent: Extent, callback: js.Function1[/* p0 */ T, js.Any]): js.Any = js.native
    
    /**
      * Return all values in the RBush.
      */
    def getAll(): js.Array[T] = js.native
    
    def getExtent(): Extent = js.native
    def getExtent(opt_extent: Extent): Extent = js.native
    
    /**
      * Return all values in the given extent.
      */
    def getInExtent(extent: Extent): js.Array[T] = js.native
    
    /**
      * Insert a value into the RBush.
      */
    def insert(extent: Extent, value: T): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    /**
      * Bulk-insert values into the RBush.
      */
    def load(extents: js.Array[Extent], values: js.Array[T]): Unit = js.native
    
    /**
      * Remove a value from the RBush.
      */
    def remove(value: T): Boolean = js.native
    
    /**
      * Update the extent of a value in the RBush.
      */
    def update(extent: Extent, value: T): Unit = js.native
  }
}
