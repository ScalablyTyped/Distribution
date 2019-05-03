package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Asynchronous, global, and persistent key-value storage.
  * @remarks
  * Storage limit is 10 MB per domain, which may be shared by multiple add-ins.
  */
trait Storage extends js.Object {
  /**
    * Retrieves an item from storage based on its key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    * @param key Key of item to be retrieved. Must be a string.
    */
  def getItem(key: java.lang.String): js.Promise[java.lang.String | scala.Null]
  /**
    * Retrieves multiple items from storage based on their key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def getItems(keys: js.Array[java.lang.String]): js.Promise[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]]
  /**
    * Retrieves an array of all keys from storage.
    *  Returns a Promise.
    */
  def getKeys(): js.Promise[js.Array[java.lang.String]]
  /**
    * Removes an item from storage based on its key.
    * Returns a Promise.
    * @param key Key of item to be removed. Must be a string.
    */
  def removeItem(key: java.lang.String): js.Promise[scala.Unit]
  /**
    * Removes multiple items from storage.
    * Returns a Promise.
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def removeItems(keys: js.Array[java.lang.String]): js.Promise[scala.Unit]
  /**
    * Sets a key-value pair into storage or updates an existing key-value pair.
    * Returns a Promise.
    * @param key Key of item to be set. Must be a string.
    * @param value Must be a string.
    */
  def setItem(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit]
  /**
    * Sets multiple items into storage or updates multiple items within storage.
    * Returns a Promise.
    * @param keyValues Key-value pairs to be set. Must be strings.
    */
  def setItems(keyValues: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[scala.Unit]
}

object Storage {
  @scala.inline
  def apply(
    getItem: java.lang.String => js.Promise[java.lang.String | scala.Null],
    getItems: js.Array[java.lang.String] => js.Promise[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]],
    getKeys: () => js.Promise[js.Array[java.lang.String]],
    removeItem: java.lang.String => js.Promise[scala.Unit],
    removeItems: js.Array[java.lang.String] => js.Promise[scala.Unit],
    setItem: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    setItems: org.scalablytyped.runtime.StringDictionary[java.lang.String] => js.Promise[scala.Unit]
  ): Storage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getItems = js.Any.fromFunction1(getItems), getKeys = js.Any.fromFunction0(getKeys), removeItem = js.Any.fromFunction1(removeItem), removeItems = js.Any.fromFunction1(removeItems), setItem = js.Any.fromFunction2(setItem), setItems = js.Any.fromFunction1(setItems))
  
    __obj.asInstanceOf[Storage]
  }
}

