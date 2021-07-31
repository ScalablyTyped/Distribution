package typings.naverWhale.whale

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Storage
////////////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  "storage"
  * @since Chrome 20.
  */
object storage {
  
  /* Inlined keyof std.Pick<{  local :chrome.chrome.storage.LocalStorageArea,   sync :chrome.chrome.storage.SyncStorageArea,   managed :chrome.chrome.storage.StorageArea,   onChanged :chrome.chrome.storage.StorageChangedEvent}, 'sync' | 'local' | 'managed'> */
  /* Rewritten from type alias, can be one of: 
    - typings.naverWhale.naverWhaleStrings.sync
    - typings.naverWhale.naverWhaleStrings.local
    - typings.naverWhale.naverWhaleStrings.managed
  */
  trait AreaName extends StObject
  object AreaName {
    
    @scala.inline
    def local: typings.naverWhale.naverWhaleStrings.local = "local".asInstanceOf[typings.naverWhale.naverWhaleStrings.local]
    
    @scala.inline
    def managed: typings.naverWhale.naverWhaleStrings.managed = "managed".asInstanceOf[typings.naverWhale.naverWhaleStrings.managed]
    
    @scala.inline
    def sync: typings.naverWhale.naverWhaleStrings.sync = "sync".asInstanceOf[typings.naverWhale.naverWhaleStrings.sync]
  }
  
  @js.native
  trait LocalStorageArea
    extends StObject
       with typings.chrome.chrome.storage.StorageArea {
    
    /** The maximum amount (in bytes) of data that can be stored in local storage, as measured by the JSON stringification of every value plus every key's length. This value will be ignored if the extension has the unlimitedStorage permission. Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError. */
    var QUOTA_BYTES: Double = js.native
  }
  
  @js.native
  trait StorageArea extends StObject {
    
    /**
      * Removes all items from storage.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def clear(): Unit = js.native
    def clear(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets one or more items from storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
    /**
      * Gets one or more items from storage.
      * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
      * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(keys: String, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
    def get(keys: js.Array[String], callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
    def get(keys: js.Object, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
    def get(keys: Null, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
    
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(keys: String, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    def getBytesInUse(keys: js.Array[String], callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    def getBytesInUse(keys: Null, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    
    /**
      * Removes one or more items from storage.
      * @param keys A single key or a list of keys for items to remove.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def remove(keys: String): Unit = js.native
    def remove(keys: String, callback: js.Function0[Unit]): Unit = js.native
    def remove(keys: js.Array[String]): Unit = js.native
    def remove(keys: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets multiple items.
      * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
      * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def set(items: js.Object): Unit = js.native
    def set(items: js.Object, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait StorageChange extends StObject {
    
    /** Optional. The new value of the item, if there is a new value. */
    var newValue: js.UndefOr[js.Any] = js.undefined
    
    /** Optional. The old value of the item, if there was an old value. */
    var oldValue: js.UndefOr[js.Any] = js.undefined
  }
  object StorageChange {
    
    @scala.inline
    def apply(): StorageChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageChange]
    }
    
    @scala.inline
    implicit class StorageChangeMutableBuilder[Self <: StorageChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  type StorageChangedEvent = Event[
    js.Function2[
      /* changes */ StringDictionary[typings.chrome.chrome.storage.StorageChange], 
      /* areaName */ typings.chrome.chrome.storage.AreaName, 
      Unit
    ]
  ]
  
  @js.native
  trait SyncStorageArea
    extends StObject
       with typings.chrome.chrome.storage.StorageArea {
    
    /** The maximum number of items that can be stored in sync storage. Updates that would cause this limit to be exceeded will fail immediately and set runtime.lastError. */
    var MAX_ITEMS: Double = js.native
    
    /** @deprecated since Chrome 40. The storage.sync API no longer has a sustained write operation quota. */
    var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each hour. This is 1 every 2 seconds, a lower ceiling than the short term higher writes-per-minute limit.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      */
    var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each minute. This is 2 per second, providing higher throughput than writes-per-hour over a shorter period of time.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      * @since Chrome 40.
      */
    var MAX_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
    
    /** The maximum total amount (in bytes) of data that can be stored in sync storage, as measured by the JSON stringification of every value plus every key's length. Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError. */
    var QUOTA_BYTES: Double = js.native
    
    /** The maximum size (in bytes) of each individual item in sync storage, as measured by the JSON stringification of its value plus its key length. Updates containing items larger than this limit will fail immediately and set runtime.lastError. */
    var QUOTA_BYTES_PER_ITEM: Double = js.native
  }
}
