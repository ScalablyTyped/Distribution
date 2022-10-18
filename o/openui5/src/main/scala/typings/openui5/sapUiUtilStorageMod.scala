package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUtilStorageMod {
  
  @JSImport("sap/ui/util/Storage", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Storage {
    def this(/**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String) = this()
    def this(/**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: Storage) = this()
    def this(/**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: Type) = this()
    def this(
      /**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String,
      /**
      * The prefix to use in this storage.
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: Unit,
      /**
      * The prefix to use in this storage.
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: Storage,
      /**
      * The prefix to use in this storage.
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type this storage should be of or an Object implementing the typical Storage API for direct usage.
      */
    pStorage: Type,
      /**
      * The prefix to use in this storage.
      */
    sStorageKeyPrefix: String
    ) = this()
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("sap/ui/util/Storage", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type & String] = js.native
    
    /**
      * Indicates usage of the browser's localStorage feature
      */
    @js.native
    sealed trait local
      extends StObject
         with Type
    /* "local" */ val local: typings.openui5.sapUiUtilStorageMod.Type.local & String = js.native
    
    /**
      * Indicates usage of the browser's sessionStorage feature
      */
    @js.native
    sealed trait session
      extends StObject
         with Type
    /* "session" */ val session: typings.openui5.sapUiUtilStorageMod.Type.session & String = js.native
  }
  
  @js.native
  trait Storage extends StObject {
    
    /**
      * Clears the whole storage (Independent of the current Storage instance!).
      *
      * **CAUTION** This method should be called only in very particular situations, when a global erasing of
      * data is required. Given that the method deletes the data saved under any ID, it should not be called
      * when managing data for specific controls.
      *
      * @returns true if execution of removal was successful or the data to remove doesn't exist, and false if
      * the feature is unavailable or a problem occurred
      */
    def clear(): Boolean = js.native
    
    /**
      * Retrieves data item for a specific key.
      *
      * @returns key's value or `null`
      */
    def get(/**
      * key to retrieve
      */
    sKey: String): js.Object | Null = js.native
    
    /**
      * Returns the storage type.
      *
      * @returns storage type or "unknown"
      */
    def getType(): Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String) = js.native
    
    /**
      * Returns whether the given storage is supported.
      *
      * @returns true if storage is supported, false otherwise (e.g. due to browser security settings)
      */
    def isSupported(): Boolean = js.native
    
    /**
      * Add key to the storage or updates value if the key already exists.
      *
      * @returns true if the data was successfully stored, otherwise false
      */
    def put(/**
      * key to create
      */
    sKey: String, /**
      * value to create/update
      */
    sValue: String): Boolean = js.native
    
    /**
      * Removes key from storage if it exists.
      *
      * @returns true if the deletion was successful or the data doesn't exist under the specified key, and false
      * if the feature is unavailable or a problem occurred
      */
    def remove(/**
      * key to remove
      */
    sKey: String): Boolean = js.native
    
    /**
      * Removes all stored keys.
      *
      * @returns true if the deletion was successful or the data doesn't exist under the specified key, and false
      * if the feature is unavailable or a problem occurred
      */
    def removeAll(): Boolean = js.native
    def removeAll(/**
      * prefix id for the states to delete
      */
    sIdPrefix: String): Boolean = js.native
  }
}
