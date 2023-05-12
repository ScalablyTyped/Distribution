package typings.naverWhale.whale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browsing Data
////////////////////
/**
  * Use the chrome.browsingData API to remove browsing data from a user's local profile.
  * Availability: Since Chrome 19.
  * Permissions:  "browsingData"
  */
object browsingData {
  
  trait DataTypeSet extends StObject {
    
    /** Optional. Websites' appcaches.  */
    var appcache: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's cache. Note: when removing data, this clears the entire cache: it is not limited to the range you specify.  */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's cacheStorage.  */
    var cacheStorage: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's cookies.  */
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's download list.  */
    var downloads: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Websites' file systems.  */
    var fileSystems: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's stored form data.  */
    var formData: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The browser's history.  */
    var history: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Websites' IndexedDB data.  */
    var indexedDB: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Websites' local storage data.  */
    var localStorage: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Stored passwords.  */
    var passwords: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Deprecated since Chrome 88.
      * Support for Flash has been removed. This data type will be ignored.
      *
      * Optional. Plugins' data.
      */
    var pluginData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Deprecated since Chrome 76.
      * Support for server-bound certificates has been removed. This data type will be ignored.
      *
      * Optional. Server-bound certificates.
      */
    var serverBoundCertificates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 39.
      * Service Workers.
      */
    var serviceWorkers: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Websites' WebSQL data.  */
    var webSQL: js.UndefOr[Boolean] = js.undefined
  }
  object DataTypeSet {
    
    inline def apply(): DataTypeSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTypeSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTypeSet] (val x: Self) extends AnyVal {
      
      inline def setAppcache(value: Boolean): Self = StObject.set(x, "appcache", value.asInstanceOf[js.Any])
      
      inline def setAppcacheUndefined: Self = StObject.set(x, "appcache", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheStorage(value: Boolean): Self = StObject.set(x, "cacheStorage", value.asInstanceOf[js.Any])
      
      inline def setCacheStorageUndefined: Self = StObject.set(x, "cacheStorage", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setDownloads(value: Boolean): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setDownloadsUndefined: Self = StObject.set(x, "downloads", js.undefined)
      
      inline def setFileSystems(value: Boolean): Self = StObject.set(x, "fileSystems", value.asInstanceOf[js.Any])
      
      inline def setFileSystemsUndefined: Self = StObject.set(x, "fileSystems", js.undefined)
      
      inline def setFormData(value: Boolean): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setIndexedDB(value: Boolean): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
      
      inline def setIndexedDBUndefined: Self = StObject.set(x, "indexedDB", js.undefined)
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setPasswords(value: Boolean): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
      
      inline def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
      
      inline def setPluginData(value: Boolean): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
      
      inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
      
      inline def setServerBoundCertificates(value: Boolean): Self = StObject.set(x, "serverBoundCertificates", value.asInstanceOf[js.Any])
      
      inline def setServerBoundCertificatesUndefined: Self = StObject.set(x, "serverBoundCertificates", js.undefined)
      
      inline def setServiceWorkers(value: Boolean): Self = StObject.set(x, "serviceWorkers", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkersUndefined: Self = StObject.set(x, "serviceWorkers", js.undefined)
      
      inline def setWebSQL(value: Boolean): Self = StObject.set(x, "webSQL", value.asInstanceOf[js.Any])
      
      inline def setWebSQLUndefined: Self = StObject.set(x, "webSQL", js.undefined)
    }
  }
  
  trait OriginTypes extends StObject {
    
    /** Optional. Extensions and packaged applications a user has installed (be _really_ careful!).  */
    var `extension`: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Websites that have been installed as hosted applications (be careful!).  */
    var protectedWeb: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Normal websites.  */
    var unprotectedWeb: js.UndefOr[Boolean] = js.undefined
  }
  object OriginTypes {
    
    inline def apply(): OriginTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginTypes] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: Boolean): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setProtectedWeb(value: Boolean): Self = StObject.set(x, "protectedWeb", value.asInstanceOf[js.Any])
      
      inline def setProtectedWebUndefined: Self = StObject.set(x, "protectedWeb", js.undefined)
      
      inline def setUnprotectedWeb(value: Boolean): Self = StObject.set(x, "unprotectedWeb", value.asInstanceOf[js.Any])
      
      inline def setUnprotectedWebUndefined: Self = StObject.set(x, "unprotectedWeb", js.undefined)
    }
  }
  
  trait RemovalOptions extends StObject {
    
    /**
      * Optional.
      * Since Chrome 74.
      * When present, data for origins in this list is excluded from deletion. Can't be used together with origins. Only supported for cookies, storage and cache. Cookies are excluded for the whole registrable domain.
      */
    var excludeOrigins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove application data before adding 'protectedWeb' or 'extensions'.
      */
    var originTypes: js.UndefOr[typings.chrome.chrome.browsingData.OriginTypes] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 74.
      * When present, only data for origins in this list is deleted. Only supported for cookies, storage and cache. Cookies are cleared for the whole registrable domain.
      */
    var origins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the {@link Date.getTime} method). If absent, defaults to 0 (which would remove all browsing data).
      */
    var since: js.UndefOr[Double] = js.undefined
  }
  object RemovalOptions {
    
    inline def apply(): RemovalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemovalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemovalOptions] (val x: Self) extends AnyVal {
      
      inline def setExcludeOrigins(value: js.Array[String]): Self = StObject.set(x, "excludeOrigins", value.asInstanceOf[js.Any])
      
      inline def setExcludeOriginsUndefined: Self = StObject.set(x, "excludeOrigins", js.undefined)
      
      inline def setExcludeOriginsVarargs(value: String*): Self = StObject.set(x, "excludeOrigins", js.Array(value*))
      
      inline def setOriginTypes(value: typings.chrome.chrome.browsingData.OriginTypes): Self = StObject.set(x, "originTypes", value.asInstanceOf[js.Any])
      
      inline def setOriginTypesUndefined: Self = StObject.set(x, "originTypes", js.undefined)
      
      inline def setOrigins(value: js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
  
  trait SettingsResult extends StObject {
    
    /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
    var dataRemovalPermitted: typings.chrome.chrome.browsingData.DataTypeSet
    
    /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
    var dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet
    
    var options: typings.chrome.chrome.browsingData.RemovalOptions
  }
  object SettingsResult {
    
    inline def apply(
      dataRemovalPermitted: typings.chrome.chrome.browsingData.DataTypeSet,
      dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet,
      options: typings.chrome.chrome.browsingData.RemovalOptions
    ): SettingsResult = {
      val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SettingsResult] (val x: Self) extends AnyVal {
      
      inline def setDataRemovalPermitted(value: typings.chrome.chrome.browsingData.DataTypeSet): Self = StObject.set(x, "dataRemovalPermitted", value.asInstanceOf[js.Any])
      
      inline def setDataToRemove(value: typings.chrome.chrome.browsingData.DataTypeSet): Self = StObject.set(x, "dataToRemove", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.chrome.chrome.browsingData.RemovalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
