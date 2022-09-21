package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ordered list-type data structure that can provide item look up by key and can also return a list.
  *
  * @ignore
  */
@JSImport("playcanvas", "IndexedList")
@js.native
open class IndexedList () extends StObject {
  
  /**
    * @type {Object<string, number>}
    * @private
    */
  /* private */ var _index: Any = js.native
  
  /**
    * @type {object[]}
    * @private
    */
  /* private */ var _list: Any = js.native
  
  /**
    * Remove all items from the list.
    */
  def clear(): Unit = js.native
  
  /**
    * Return the item indexed by a key.
    *
    * @param {string} key - The key of the item to retrieve.
    * @returns {object|null} The item stored at key. Returns null if key is not in the index.
    */
  def get(key: String): js.Object | Null = js.native
  
  /**
    * Test whether a key has been added to the index.
    *
    * @param {string} key - The key to test.
    * @returns {boolean} Returns true if key is in the index, false if not.
    */
  def has(key: String): Boolean = js.native
  
  /**
    * Returns the list of items.
    *
    * @returns {object[]} The list of items.
    */
  def list(): js.Array[js.Object] = js.native
  
  /**
    * Add a new item into the list with a index key.
    *
    * @param {string} key -  Key used to look up item in index.
    * @param {object} item - Item to be stored.
    */
  def push(key: String, item: js.Object): Unit = js.native
  
  /**
    * Remove the item indexed by key from the list.
    *
    * @param {string} key - The key at which to remove the item.
    * @returns {boolean} Returns true if the key exists and an item was removed, returns false if
    * no item was removed.
    */
  def remove(key: String): Boolean = js.native
}
