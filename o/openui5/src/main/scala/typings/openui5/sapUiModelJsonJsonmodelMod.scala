package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelJsonJsonmodelMod {
  
  @JSImport("sap/ui/model/json/JSONModel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new JSONModel.
    *
    * The observation feature is experimental! When observation is activated, the application can directly
    * change the JS objects without the need to call setData, setProperty or refresh. Observation does only
    * work for existing properties in the JSON, it cannot detect new properties or new array entries.
    */
  open class default () extends JSONModel {
    def this(/**
      * Either the URL where to load the JSON from or a JS object
      */
    oData: String) = this()
    def this(/**
      * Either the URL where to load the JSON from or a JS object
      */
    oData: js.Object) = this()
    def this(
      /**
      * Either the URL where to load the JSON from or a JS object
      */
    oData: String,
      /**
      * Whether to observe the JSON data for property changes (experimental)
      */
    bObserve: Boolean
    ) = this()
    def this(
      /**
      * Either the URL where to load the JSON from or a JS object
      */
    oData: js.Object,
      /**
      * Whether to observe the JSON data for property changes (experimental)
      */
    bObserve: Boolean
    ) = this()
    def this(
      /**
      * Either the URL where to load the JSON from or a JS object
      */
    oData: Unit,
      /**
      * Whether to observe the JSON data for property changes (experimental)
      */
    bObserve: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/json/JSONModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.json.JSONModel with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ClientModel.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, JSONModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, JSONModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.json.JSONModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait JSONModel
    extends typings.openui5.sapUiModelClientModelMod.default {
    
    /**
      * Returns a Promise of the current data-loading state. Every currently running {@link sap.ui.model.json.JSONModel#loadData}
      * call is respected by the returned Promise. This also includes a potential loadData call from the JSONModel's
      * constructor in case a URL was given. The data-loaded Promise will resolve once all running requests have
      * finished. Only request, which have been queued up to the point of calling this function will be respected
      * by the returned Promise.
      *
      * @returns a Promise, which resolves if all pending data-loading requests have finished
      */
    def dataLoaded(): js.Promise[Any] = js.native
    
    /**
      * Serializes the current JSON data of the model into a string.
      *
      * @returns The JSON data serialized as string
      */
    def getJSON(): String = js.native
    
    /**
      * Load JSON-encoded data from the server using a GET HTTP request and store the resulting JSON data in
      * the model. Note: Due to browser security restrictions, most "Ajax" requests are subject to the same origin
      * policy, the request can not successfully retrieve data from a different domain, subdomain, or protocol.
      *
      * @returns in case bAsync is set to true a Promise is returned; this promise resolves/rejects based on
      * the request status
      */
    def loadData(
      /**
      * A string containing the URL to which the request is sent.
      */
    sURL: String,
      /**
      * A map or string that is sent to the server with the request. Data that is sent to the server is appended
      * to the URL as a query string. If the value of the data parameter is an object (map), it is converted
      * to a string and url-encoded before it is appended to the URL.
      */
    oParameters: js.UndefOr[js.Object | String],
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: js.UndefOr[Boolean],
      /**
      * The type of request to make ("POST" or "GET"), default is "GET". Note: Other HTTP request methods, such
      * as PUT and DELETE, can also be used here, but they are not supported by all browsers.
      */
    sType: js.UndefOr[String],
      /**
      * Whether the data should be merged instead of replaced
      */
    bMerge: js.UndefOr[Boolean],
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: js.UndefOr[Boolean],
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.UndefOr[js.Object]
    ): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the data, passed as a JS object tree, to the model.
      */
    def setData(/**
      * the data to set on the model
      */
    oData: js.Object): Unit = js.native
    def setData(
      /**
      * the data to set on the model
      */
    oData: js.Object,
      /**
      * whether to merge the data instead of replacing it
      */
    bMerge: Boolean
    ): Unit = js.native
    
    /**
      * Sets the data, passed as a string in JSON format, to the model.
      */
    def setJSON(/**
      * the JSON data to set on the model
      */
    sJSON: String): Unit = js.native
    def setJSON(
      /**
      * the JSON data to set on the model
      */
    sJSON: String,
      /**
      * whether to merge the data instead of replacing it
      */
    bMerge: Boolean
    ): Unit = js.native
    
    /**
      * Sets `oValue` as new value for the property defined by the given `sPath` and `oContext`. Once the new
      * model value has been set, all interested parties are informed.
      *
      * @returns `true` if the value was set correctly, and `false` if errors occurred, for example if the entry
      * was not found.
      */
    def setProperty(
      /**
      * The path of the property to set
      */
    sPath: String,
      /**
      * The new value to be set for this property
      */
    oValue: Any
    ): Boolean = js.native
    def setProperty(
      /**
      * The path of the property to set
      */
    sPath: String,
      /**
      * The new value to be set for this property
      */
    oValue: Any,
      /**
      * The context used to set the property
      */
    oContext: Unit,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    def setProperty(
      /**
      * The path of the property to set
      */
    sPath: String,
      /**
      * The new value to be set for this property
      */
    oValue: Any,
      /**
      * The context used to set the property
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Boolean = js.native
    def setProperty(
      /**
      * The path of the property to set
      */
    sPath: String,
      /**
      * The new value to be set for this property
      */
    oValue: Any,
      /**
      * The context used to set the property
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
  }
}
