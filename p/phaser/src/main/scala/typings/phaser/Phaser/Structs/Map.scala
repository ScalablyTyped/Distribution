package typings.phaser.Phaser.Structs

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.EachMapCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The keys of a Map can be arbitrary values.
  * 
  * ```javascript
  * var map = new Map([
  *    [ 1, 'one' ],
  *    [ 2, 'two' ],
  *    [ 3, 'three' ]
  * ]);
  * ```
  */
@js.native
trait Map[K, V] extends js.Object {
  /**
    * The entries in this Map.
    */
  var entries: StringDictionary[V] = js.native
  /**
    * The number of key / value pairs in this Map.
    */
  var size: Double = js.native
  /**
    * Delete all entries from this Map.
    */
  def clear(): Map[K, V] = js.native
  /**
    * Returns `true` if the value exists within this Map. Otherwise, returns `false`.
    * @param value The value to search for.
    */
  def contains(value: V): Boolean = js.native
  /**
    * Delete the specified element from this Map.
    * @param key The key of the element to delete from this Map.
    */
  def delete(key: K): Map[K, V] = js.native
  /**
    * Dumps the contents of this Map to the console via `console.group`.
    */
  def dump(): Unit = js.native
  /**
    * Passes all entries in this Map to the given callback.
    * @param callback The callback which will receive the keys and entries held in this Map.
    */
  def each(callback: EachMapCallback[V]): Map[K, V] = js.native
  /**
    * Returns the value associated to the `key`, or `undefined` if there is none.
    * @param key The key of the element to return from the `Map` object.
    */
  def get(key: K): V = js.native
  /**
    * Returns an `Array` of all the values stored in this Map.
    */
  def getArray(): js.Array[V] = js.native
  /**
    * Returns a boolean indicating whether an element with the specified key exists or not.
    * @param key The key of the element to test for presence of in this Map.
    */
  def has(key: K): Boolean = js.native
  /**
    * Returns all entries keys in this Map.
    */
  def keys(): js.Array[K] = js.native
  /**
    * Merges all new keys from the given Map into this one.
    * If it encounters a key that already exists it will be skipped unless override is set to `true`.
    * @param map The Map to merge in to this Map.
    * @param override Set to `true` to replace values in this Map with those from the source map, or `false` to skip them. Default false.
    */
  def merge(map: Map[K, V]): Map[K, V] = js.native
  def merge(map: Map[K, V], `override`: Boolean): Map[K, V] = js.native
  /**
    * Adds an element with a specified `key` and `value` to this Map.
    * If the `key` already exists, the value will be replaced.
    * @param key The key of the element to be added to this Map.
    * @param value The value of the element to be added to this Map.
    */
  def set(key: K, value: V): Map[K, V] = js.native
  /**
    * Returns an `Array` of all entries.
    */
  def values(): js.Array[V] = js.native
}

