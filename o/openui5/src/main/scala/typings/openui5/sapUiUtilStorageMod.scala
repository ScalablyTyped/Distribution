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
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String) = this()
    def this(/**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: Storage) = this()
    def this(/**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: Type) = this()
    def this(
      /**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String,
      /**
      * The scope prefix to be used by this storage instance
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: Unit,
      /**
      * The scope prefix to be used by this storage instance
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: Storage,
      /**
      * The scope prefix to be used by this storage instance
      */
    sStorageKeyPrefix: String
    ) = this()
    def this(
      /**
      * The type of native storage implementation that this `Storage` instance should use internally. Alternatively,
      * this can be a custom implementation of the {@link https://developer.mozilla.org/en-US/docs/Web/API/Storage Storage Web API).
      */
    vStorage: Type,
      /**
      * The scope prefix to be used by this storage instance
      */
    sStorageKeyPrefix: String
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/util/Storage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enumeration of the storage types supported by {@link module:sap/ui/util/Storage}.
      */
    @JSImport("sap/ui/util/Storage", "default.Type")
    @js.native
    def Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ Any = js.native
    inline def Type_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Type")(x.asInstanceOf[js.Any])
    
    /**
      * Clears the whole storage (Independent of the current Storage instance!).
      *
      * **CAUTION** This method should be called only in very particular situations, when a global erasing of
      * data is required. Given that the method deletes the data saved under any key, it should not be called
      * when managing data for specific controls.
      *
      * @returns Whether clearing the storage was successful
      */
    inline def clear(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Boolean]
    
    /**
      * Retrieves the value for the given key or `null` if the key does not exist in this storage.
      *
      * The returned value will be of a type that `JSON.parse` could return, too.
      *
      * @returns The key's value or `null` if the key does not exist in the storage.
      */
    inline def get(
      /**
      * Key to retrieve the value for; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(sKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Returns the type of this storage.
      *
      * @returns Type of this storage or "unknown" when the Storage was created with an unknown type or implementation
      */
    inline def getType(): Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String) = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")().asInstanceOf[Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String)]
    
    /**
      * Returns whether the given storage is supported.
      *
      * @returns true if storage is supported, false otherwise (e.g. due to browser security settings)
      */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
    
    /**
      * Stores the given value under the given key in the storage or updates the value if the key already exists.
      *
      * This method supports the same types of values as `JSON.stringify`.
      *
      * @returns Whether the data was successfully stored
      */
    inline def put(
      /**
      * Key to store the given value under; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String,
      /**
      * Value to store/update under the given key
      */
    vValue: Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(sKey.asInstanceOf[js.Any], vValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Removes the key and its value from storage, if the key exists.
      *
      * @returns Whether the deletion succeeded; if the key didn't exists, the method also reports a success
      */
    inline def remove(
      /**
      * Key to remove; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(sKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Removes all key/value pairs form the storage where the key starts with the given `sKeyPrefix`.
      *
      * @returns Whether the deletion was successful; if no key matches the prefix, this is also a success
      */
    inline def removeAll(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Boolean]
    inline def removeAll(
      /**
      * Key prefix for the keys/values to delete; will be additionally prefixed with the prefix given when constructing
      * this `Storage`
      */
    sKeyPrefix: String
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(sKeyPrefix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait Type extends StObject
  /**
    * Enumeration of the storage types supported by {@link module:sap/ui/util/Storage}.
    */
  @JSImport("sap/ui/util/Storage", "Type")
  @js.native
  object Type extends StObject {
    
    /**
      * Indicates usage of the browser's localStorage feature
      */
    @js.native
    sealed trait local
      extends StObject
         with Type
    
    /**
      * Indicates usage of the browser's sessionStorage feature
      */
    @js.native
    sealed trait session
      extends StObject
         with Type
  }
  
  @js.native
  trait Storage extends StObject {
    
    /**
      * Clears the whole storage (Independent of the current Storage instance!).
      *
      * **CAUTION** This method should be called only in very particular situations, when a global erasing of
      * data is required. Given that the method deletes the data saved under any key, it should not be called
      * when managing data for specific controls.
      *
      * @returns Whether clearing the storage was successful
      */
    def clear(): Boolean = js.native
    
    /**
      * Retrieves the value for the given key or `null` if the key does not exist in this storage.
      *
      * The returned value will be of a type that `JSON.parse` could return, too.
      *
      * @returns The key's value or `null` if the key does not exist in the storage.
      */
    def get(
      /**
      * Key to retrieve the value for; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String
    ): Any = js.native
    
    /**
      * Returns the type of this storage.
      *
      * @returns Type of this storage or "unknown" when the Storage was created with an unknown type or implementation
      */
    def getType(): Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String) = js.native
    
    /**
      * Returns whether the given storage is supported.
      *
      * @returns true if storage is supported, false otherwise (e.g. due to browser security settings)
      */
    def isSupported(): Boolean = js.native
    
    /**
      * Stores the given value under the given key in the storage or updates the value if the key already exists.
      *
      * This method supports the same types of values as `JSON.stringify`.
      *
      * @returns Whether the data was successfully stored
      */
    def put(
      /**
      * Key to store the given value under; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String,
      /**
      * Value to store/update under the given key
      */
    vValue: Any
    ): Boolean = js.native
    
    /**
      * Removes the key and its value from storage, if the key exists.
      *
      * @returns Whether the deletion succeeded; if the key didn't exists, the method also reports a success
      */
    def remove(
      /**
      * Key to remove; will be prefixed with the prefix given when constructing this `Storage`
      */
    sKey: String
    ): Boolean = js.native
    
    /**
      * Removes all key/value pairs form the storage where the key starts with the given `sKeyPrefix`.
      *
      * @returns Whether the deletion was successful; if no key matches the prefix, this is also a success
      */
    def removeAll(): Boolean = js.native
    def removeAll(
      /**
      * Key prefix for the keys/values to delete; will be additionally prefixed with the prefix given when constructing
      * this `Storage`
      */
    sKeyPrefix: String
    ): Boolean = js.native
  }
}
