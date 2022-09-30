package typings.meteor

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveDict[O] extends StObject {
  
  /**
    * Get all key-value pairs as a plain object. If inside a reactive
    * computation, invalidate the computation the next time the
    * value associated with any key is changed by `ReactiveDict.set`.
    * This returns a clone of each value, so if it's an object or an array,
    * mutating the returned value has no effect on the value stored in the
    * ReactiveDict.
    */
  def all(): Partial[O] = js.native
  
  /**
    * remove all key-value pairs from the ReactiveDict. Notify any
    * listeners that the value has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `ReactiveDict.get` on this `key`.)
    */
  def clear(): Unit = js.native
  
  /**
    * remove a key-value pair from the ReactiveDict. Notify any listeners
    * that the value has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `ReactiveDict.get` on this `key`.)
    * @param key The key to delete, eg, `selectedItem`
    * @return did remove
    */
  def delete[P /* <: /* keyof O */ String */](key: P): Boolean = js.native
  
  /**
    * Clear all values from the reactiveDict and prevent it from being
    * migrated on a Hot Code Pushes. Notify any listeners
    * that the value has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `ReactiveDict.get` on this `key`.)
    */
  def destroy(): Unit = js.native
  
  def equals[P /* <: /* keyof O */ String */](key: P, value: String): Boolean = js.native
  def equals[P /* <: /* keyof O */ String */](key: P, value: Boolean): Boolean = js.native
  def equals[P /* <: /* keyof O */ String */](key: P, value: Double): Boolean = js.native
  
  /**
    * Get the value assiciated with a key. If inside a reactive
    * computation, invalidate the computation the next time the
    * value associated with this key is changed by `ReactiveDict.set`.
    * This returns a clone of the value, so if it's an object or an array,
    * mutating the returned value has no effect on the value stored in the
    * ReactiveDict.
    * @param key The key of the element to return
    */
  def get[P /* <: /* keyof O */ String */](key: P): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: O[P] */ js.Any
  ] = js.native
  
  /**
    * Set a value for a key in the ReactiveDict. Notify any listeners
    * that the value has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `ReactiveDict.get` on this `key`.)
    */
  def set(`object`: Partial[O]): Unit = js.native
  /**
    * Set a value for a key in the ReactiveDict. Notify any listeners
    * that the value has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `ReactiveDict.get` on this `key`.)
    * @param key The key to set, eg, `selectedItem`
    * @param value The new value for `key`
    */
  def set[P /* <: /* keyof O */ String */](key: P): Unit = js.native
  def set[P /* <: /* keyof O */ String */](key: P, value: /* import warning: importer.ImportType#apply Failed type conversion: O[P] */ js.Any): Unit = js.native
  
  /**
    * Set a value for a key if it hasn't been set before.
    * Otherwise works exactly the same as `ReactiveDict.set`.
    */
  def setDefault(`object`: Partial[O]): Unit = js.native
  /**
    * Set a value for a key if it hasn't been set before.
    * Otherwise works exactly the same as `ReactiveDict.set`.
    * @param key The key to set, eg, `selectedItem`
    * @param value The new value for `key`
    */
  def setDefault[P /* <: /* keyof O */ String */](key: P): Unit = js.native
  def setDefault[P /* <: /* keyof O */ String */](key: P, value: /* import warning: importer.ImportType#apply Failed type conversion: O[P] */ js.Any): Unit = js.native
}
