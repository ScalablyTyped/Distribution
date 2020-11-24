package typings.officeRuntime.OfficeRuntime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous, global, and persistent key-value storage.
  *
  * [Api set: SharedRuntime 1.1]
  *
  * @remarks
  * Storage limit is 10 MB per domain, which may be shared by multiple add-ins.
  */
@js.native
trait Storage extends js.Object {
  
  /**
    * Retrieves an item from storage based on its key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be retrieved. Must be a string.
    */
  def getItem(key: String): js.Promise[String | Null] = js.native
  
  /**
    * Retrieves multiple items from storage based on their key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def getItems(keys: js.Array[String]): js.Promise[StringDictionary[String | Null]] = js.native
  
  /**
    * Retrieves an array of all keys from storage.
    *  Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  def getKeys(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Removes an item from storage based on its key.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be removed. Must be a string.
    */
  def removeItem(key: String): js.Promise[Unit] = js.native
  
  /**
    * Removes multiple items from storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def removeItems(keys: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * Sets a key-value pair into storage or updates an existing key-value pair.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be set. Must be a string.
    * @param value Must be a string.
    */
  def setItem(key: String, value: String): js.Promise[Unit] = js.native
  
  /**
    * Sets multiple items into storage or updates multiple items within storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keyValues Key-value pairs to be set. Must be strings.
    */
  def setItems(keyValues: StringDictionary[String]): js.Promise[Unit] = js.native
}
object Storage {
  
  @scala.inline
  def apply(
    getItem: String => js.Promise[String | Null],
    getItems: js.Array[String] => js.Promise[StringDictionary[String | Null]],
    getKeys: () => js.Promise[js.Array[String]],
    removeItem: String => js.Promise[Unit],
    removeItems: js.Array[String] => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit],
    setItems: StringDictionary[String] => js.Promise[Unit]
  ): Storage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getItems = js.Any.fromFunction1(getItems), getKeys = js.Any.fromFunction0(getKeys), removeItem = js.Any.fromFunction1(removeItem), removeItems = js.Any.fromFunction1(removeItems), setItem = js.Any.fromFunction2(setItem), setItems = js.Any.fromFunction1(setItems))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetItem(value: String => js.Promise[String | Null]): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItems(value: js.Array[String] => js.Promise[StringDictionary[String | Null]]): Self = this.set("getItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeys(value: () => js.Promise[js.Array[String]]): Self = this.set("getKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveItem(value: String => js.Promise[Unit]): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItems(value: js.Array[String] => js.Promise[Unit]): Self = this.set("removeItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => js.Promise[Unit]): Self = this.set("setItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetItems(value: StringDictionary[String] => js.Promise[Unit]): Self = this.set("setItems", js.Any.fromFunction1(value))
  }
}
