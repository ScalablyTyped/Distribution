package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelXmlXmlmodelMod {
  
  @JSImport("sap/ui/model/xml/XMLModel", JSImport.Default)
  @js.native
  open class default protected () extends XMLModel {
    def this(/**
      * Either the URL where to load the XML from or an XML document
      */
    oData: String) = this()
    /**
      * Constructor for a new XMLModel.
      */
    def this(/**
      * Either the URL where to load the XML from or an XML document
      */
    oData: XMLDocument) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/xml/XMLModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.xml.XMLModel with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, XMLModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, XMLModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.xml.XMLModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait XMLModel
    extends typings.openui5.sapUiModelClientModelMod.default {
    
    def getObject(
      /**
      * The path to the object
      */
    sPath: String,
      /**
      * The context which will be used to retrieve the object
      */
    oContext: js.Object
    ): js.Object = js.native
    
    def getProperty(
      /**
      * The path to the property
      */
    sPath: String,
      /**
      * The context which will be used to retrieve the property
      */
    oContext: js.Object
    ): String = js.native
    
    /**
      * Serializes the current XML data of the model into a string.
      *
      * @returns The XML document serialized as string
      */
    def getXML(): String = js.native
    
    /**
      * Load XML-encoded data from the server using a GET HTTP request and store the resulting XML data in the
      * model. Note: Due to browser security restrictions, most "Ajax" requests are subject to the same origin
      * policy, the request can not successfully retrieve data from a different domain, subdomain, or protocol.
      */
    def loadData(/**
      * A string containing the URL to which the request is sent
      */
    sURL: String): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: String,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: js.Object,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Boolean,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: String,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: String,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    def loadData(
      /**
      * A string containing the URL to which the request is sent
      */
    sURL: String,
      /**
      * A map of parameters or a single parameter string that is sent to the server with the request
      */
    oParameters: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use asynchronous loading for performance reasons. By default,
      * all requests are sent asynchronously. Synchronous requests may temporarily lock the browser, disabling
      * any actions while the request is active. Cross-domain requests do not support synchronous operations.
      */
    bAsync: Unit,
      /**
      * HTTP method of request
      */
    sType: Unit,
      /**
      * **Deprecated as of Version 1.107**; always use the cache headers from the back-end system for performance
      * reasons. Disables caching if set to `false`.
      */
    bCache: Unit,
      /**
      * An object of additional header key/value pairs to send along with the request
      */
    mHeaders: js.Object
    ): Unit = js.native
    
    /**
      * Sets the provided XML encoded data object to the model
      */
    def setData(/**
      * the data to set to the model
      */
    oData: js.Object): Unit = js.native
    
    /**
      * Sets an XML namespace to use in the binding path
      */
    def setNameSpace(/**
      * The namespace URI
      */
    sNameSpace: String): Unit = js.native
    def setNameSpace(
      /**
      * The namespace URI
      */
    sNameSpace: String,
      /**
      * The prefix for the namespace
      */
    sPrefix: String
    ): Unit = js.native
    
    /**
      * Sets a new value for the given property `sPropertyName` in the model. If the model value changed all
      * interested parties are informed.
      *
      * @returns Whether the value was set correctly
      */
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: js.Object
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: js.Object,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: Unit,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    
    /**
      * Sets the specified XML formatted string text to the model
      */
    def setXML(/**
      * the XML data as string
      */
    sXMLText: String): Unit = js.native
  }
}
