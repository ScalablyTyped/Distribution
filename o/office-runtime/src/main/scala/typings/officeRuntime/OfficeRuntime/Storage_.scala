package typings.officeRuntime.OfficeRuntime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Asynchronous, global, and persistent key-value storage.
  *
  * [Api set: SharedRuntime 1.1]
  *
  * @remarks
  * Storage limit is 10 MB per domain, which may be shared by multiple add-ins.
  */
trait Storage_ extends js.Object {
  /**
    * Retrieves an item from storage based on its key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be retrieved. Must be a string.
    */
  def getItem(key: String): js.Promise[String | Null]
  /**
    * Retrieves multiple items from storage based on their key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def getItems(keys: js.Array[String]): js.Promise[StringDictionary[String | Null]]
  /**
    * Retrieves an array of all keys from storage.
    *  Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  def getKeys(): js.Promise[js.Array[String]]
  /**
    * Removes an item from storage based on its key.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be removed. Must be a string.
    */
  def removeItem(key: String): js.Promise[Unit]
  /**
    * Removes multiple items from storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def removeItems(keys: js.Array[String]): js.Promise[Unit]
  /**
    * Sets a key-value pair into storage or updates an existing key-value pair.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be set. Must be a string.
    * @param value Must be a string.
    */
  def setItem(key: String, value: String): js.Promise[Unit]
  /**
    * Sets multiple items into storage or updates multiple items within storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keyValues Key-value pairs to be set. Must be strings.
    */
  def setItems(keyValues: StringDictionary[String]): js.Promise[Unit]
}

object Storage_ {
  @scala.inline
  def apply(
    getItem: String => js.Promise[String | Null],
    getItems: js.Array[String] => js.Promise[StringDictionary[String | Null]],
    getKeys: () => js.Promise[js.Array[String]],
    removeItem: String => js.Promise[Unit],
    removeItems: js.Array[String] => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit],
    setItems: StringDictionary[String] => js.Promise[Unit]
  ): Storage_ = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getItems = js.Any.fromFunction1(getItems), getKeys = js.Any.fromFunction0(getKeys), removeItem = js.Any.fromFunction1(removeItem), removeItems = js.Any.fromFunction1(removeItems), setItem = js.Any.fromFunction2(setItem), setItems = js.Any.fromFunction1(setItems))
    __obj.asInstanceOf[Storage_]
  }
}

