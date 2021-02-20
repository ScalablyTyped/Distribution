package typings.nodeLocalstorage

import typings.node.eventsMod.EventEmitter
import typings.nodeLocalstorage.nodeLocalstorageStrings.storage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-localstorage", "JSONStorage")
  @js.native
  class JSONStorage protected () extends LocalStorage {
    /**
      * Creates a new LocalStorage instance
      * @param location The location in which the local storage resides
      * @param quota The partitioned size of the local storage
      */
    def this(location: String) = this()
    def this(location: String, quota: Double) = this()
    
    /**
      * Stores a `key` and it's `value` in to the local store. The given `value` will have `JSON.stringify` performed on it prior to storing.
      * @param key Unique identifier for the new local storage item
      * @param value The value associated with the `key`. This `setItem` method performs a `JSON.stringify` on the value before storage. The `value` *must* be a valid `JSON` object.
      */
    def setItem(key: String, value: js.Any): Unit = js.native
  }
  
  @JSImport("node-localstorage", "LocalStorage")
  @js.native
  class LocalStorage protected () extends EventEmitter {
    /**
      * Creates a new LocalStorage instance
      * @param location The location in which the local storage resides
      * @param quota The partitioned size of the local storage
      */
    def this(location: String) = this()
    def this(location: String, quota: Double) = this()
    
    /**
      * Clears the local storage
      */
    def clear(): Unit = js.native
    
    /**
      * Gets the value of the given [key]
      * @param key The key whose value you want to retrieve.
      */
    def getItem(key: String): String | Null = js.native
    
    /**
      * Retrieves the value of the key at the [index].
      * @param index The index of the key in which you want to return the value of.
      */
    def key(index: Double): String = js.native
    
    /**
      * The number of keys in the local storage.
      */
    var length: Double = js.native
    
    /**
      * Internal event `storage` is fired on the `removeItem`, `setItem` and `clear` methods, if subscribed.
      * @param eventName The only `eventName` that is supported is `storage`.
      * @param callback The call back type is of `StorageEvent`.
      */
    @JSName("on")
    def on_storage(eventName: storage, callback: js.Function1[/* event */ StorageEvent, Unit]): this.type = js.native
    
    /**
      * Removes the specified [key] from local storage.
      * @param key The key you want to remove.
      */
    def removeItem(key: String): Unit = js.native
    
    /**
      * Stores a `key` and it's `value` in to the local store.
      * @param key Unique identifier for the new local storage item
      * @param value The value of the item
      */
    def setItem(key: String, value: String): Unit = js.native
  }
  
  @JSImport("node-localstorage", "QUOTA_EXCEEDED_ERR")
  @js.native
  class QUOTA_EXCEEDED_ERR protected () extends Error {
    /**
      * Creates a specific `Error` object for **Quota Exceeded Errors**.
      * @param message Message explaining the error.
      */
    def this(message: String) = this()
  }
  
  @JSImport("node-localstorage", "StorageEvent")
  @js.native
  class StorageEvent protected () extends StObject {
    /**
      * Creates an object containing information regarding a `storage` event.
      * @param key Affected `key`.
      * @param oldValue Previous `value` associated with the `key`.
      * @param newValue Current `value` associated with the `key`.
      * @param url The current `process.pid` for the calling process.
      * @param storageArea The location of the storage area. Defaults to `localStorage`.
      */
    def this(key: String, oldValue: String, newValue: String, url: String, storageArea: String) = this()
    
    /**
      * Affected `key`.
      */
    var key: String = js.native
    
    /**
      * Current `value` associated with the `key`.
      */
    var newValue: String = js.native
    
    /**
      * Previous `value` associated with the `key`.
      */
    var oldValue: String = js.native
    
    /**
      * The location of the storage area. Defaults to `localStorage`.
      */
    var storageArea: String = js.native
    
    /**
      * The current `process.pid` for the calling process.
      */
    var url: String = js.native
  }
}
