package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsRbushMod {
  
  /**
    * @typedef {Object} Entry
    * @property {number} minX MinX.
    * @property {number} minY MinY.
    * @property {number} maxX MaxX.
    * @property {number} maxY MaxY.
    * @property {Object} [value] Value.
    */
  /**
    * @classdesc
    * Wrapper around the RBush by Vladimir Agafonkin.
    * See https://github.com/mourner/rbush.
    *
    * @template T
    */
  @JSImport("ol/structs/RBush", JSImport.Default)
  @js.native
  /**
    * @param {number} [maxEntries] Max entries.
    */
  open class default[T] ()
    extends StObject
       with RBush[T] {
    def this(maxEntries: Double) = this()
  }
  
  trait Entry extends StObject {
    
    /**
      * MaxX.
      */
    var maxX: Double
    
    /**
      * MaxY.
      */
    var maxY: Double
    
    /**
      * MinX.
      */
    var minX: Double
    
    /**
      * MinY.
      */
    var minY: Double
    
    /**
      * Value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object Entry {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): Entry = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Entry
    * @property {number} minX MinX.
    * @property {number} minY MinY.
    * @property {number} maxX MaxX.
    * @property {number} maxY MaxY.
    * @property {Object} [value] Value.
    */
  /**
    * @classdesc
    * Wrapper around the RBush by Vladimir Agafonkin.
    * See https://github.com/mourner/rbush.
    *
    * @template T
    */
  @js.native
  trait RBush[T] extends StObject {
    
    /**
      * Remove all values from the RBush.
      */
    def clear(): Unit = js.native
    
    /**
      * @param {RBush} rbush R-Tree.
      */
    def concat(rbush: RBush[Any]): Unit = js.native
    
    /**
      * Calls a callback function with each value in the tree.
      * If the callback returns a truthy value, this value is returned without
      * checking the rest of the tree.
      * @param {function(T): *} callback Callback.
      * @return {*} Callback return value.
      */
    def forEach(callback: js.Function1[/* arg0 */ T, Any]): Any = js.native
    
    /**
      * Calls a callback function with each value in the provided extent.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {function(T): *} callback Callback.
      * @return {*} Callback return value.
      */
    def forEachInExtent(extent: Extent, callback: js.Function1[/* arg0 */ T, Any]): Any = js.native
    
    /**
      * @param {Array<T>} values Values.
      * @param {function(T): *} callback Callback.
      * @private
      * @return {*} Callback return value.
      */
    /* private */ var forEach_ : Any = js.native
    
    /**
      * Return all values in the RBush.
      * @return {Array<T>} All.
      */
    def getAll(): js.Array[T] = js.native
    
    /**
      * @param {import("../extent.js").Extent} [extent] Extent.
      * @return {import("../extent.js").Extent} Extent.
      */
    def getExtent(): Extent = js.native
    def getExtent(extent: Extent): Extent = js.native
    
    /**
      * Return all values in the given extent.
      * @param {import("../extent.js").Extent} extent Extent.
      * @return {Array<T>} All in extent.
      */
    def getInExtent(extent: Extent): js.Array[T] = js.native
    
    /**
      * Insert a value into the RBush.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {T} value Value.
      */
    def insert(extent: Extent, value: T): Unit = js.native
    
    /**
      * @return {boolean} Is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * A mapping between the objects added to this rbush wrapper
      * and the objects that are actually added to the internal rbush.
      * @private
      * @type {Object<string, Entry>}
      */
    /* private */ var items_ : Any = js.native
    
    /**
      * Bulk-insert values into the RBush.
      * @param {Array<import("../extent.js").Extent>} extents Extents.
      * @param {Array<T>} values Values.
      */
    def load(extents: js.Array[Extent], values: js.Array[T]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var rbush_ : Any = js.native
    
    /**
      * Remove a value from the RBush.
      * @param {T} value Value.
      * @return {boolean} Removed.
      */
    def remove(value: T): Boolean = js.native
    
    /**
      * Update the extent of a value in the RBush.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {T} value Value.
      */
    def update(extent: Extent, value: T): Unit = js.native
  }
}
