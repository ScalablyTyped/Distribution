package typings.openui5

import typings.openui5.anon.AEntitySetsNames
import typings.openui5.anon.AutoRespond
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilMockServerMod {
  
  @JSImport("sap/ui/core/util/MockServer", JSImport.Default)
  @js.native
  /**
    * Creates a mocked server. This helps to mock some back-end calls, e.g. for OData V2/JSON Models or simple
    * XHR calls, without changing the application code. This class can also be used for qunit tests.
    *
    * **Note:** Not all features of mock and all properties are supported.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MockServer {
    def this(/**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings) = this()
    def this(/**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/MockServer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enum for the method.
      */
    @JSImport("sap/ui/core/util/MockServer", "default.HTTPMETHOD")
    @js.native
    def HTTPMETHOD: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTPMETHOD */ Any = js.native
    inline def HTTPMETHOD_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTPMETHOD */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPMETHOD")(x.asInstanceOf[js.Any])
    
    /**
      * Global configuration of all mock servers.
      */
    inline def config(/**
      * the configuration object.
      */
    mConfig: AutoRespond): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(mConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Stops and calls destroy on all registered servers. Use this method for cleaning up.
      */
    inline def destroyAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[Unit]
    
    /**
      * Creates a new subclass of class sap.ui.core.util.MockServer with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, MockServer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MockServer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.MockServer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
    
    /**
      * Respond to a request, when the servers are configured not to automatically respond.
      */
    inline def respond(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")().asInstanceOf[Unit]
    
    /**
      * Starts all registered servers.
      */
    inline def startAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startAll")().asInstanceOf[Unit]
    
    /**
      * Stops all registered servers.
      */
    inline def stopAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAll")().asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait HTTPMETHOD extends StObject
  /**
    * Enum for the method.
    */
  @JSImport("sap/ui/core/util/MockServer", "HTTPMETHOD")
  @js.native
  object HTTPMETHOD extends StObject {
    
    @js.native
    sealed trait DELETE
      extends StObject
         with HTTPMETHOD
    
    @js.native
    sealed trait GET
      extends StObject
         with HTTPMETHOD
    
    @js.native
    sealed trait MERGE
      extends StObject
         with HTTPMETHOD
    
    @js.native
    sealed trait PATCH
      extends StObject
         with HTTPMETHOD
    
    @js.native
    sealed trait POST
      extends StObject
         with HTTPMETHOD
    
    @js.native
    sealed trait PUT
      extends StObject
         with HTTPMETHOD
  }
  
  @js.native
  trait MockServer
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Attaches an event handler to be called after the built-in request processing of the mock server
      */
    def attachAfter(
      /**
      * event type according to HTTP Method
      */
    sHttpMethod: String,
      /**
      * the name of the function that will be called at this exit The callback function exposes an event with
      * parameters, depending on the type of the request. oEvent.getParameters() lists the parameters as per
      * the request. Examples are: oXhr : the request object; oFilteredData : the mock data entries that are
      * about to be returned in the response; oEntry : the mock data entry that is about to be returned in the
      * response;
      */
    fnCallback: js.Function,
      /**
      * (optional) the name of the entity set
      */
    sEntitySet: String
    ): Unit = js.native
    
    /**
      * Attaches an event handler to be called before the built-in request processing of the mock server
      */
    def attachBefore(
      /**
      * event type according to HTTP Method
      */
    sHttpMethod: String,
      /**
      * the name of the function that will be called at this exit. The callback function exposes an event with
      * parameters, depending on the type of the request. oEvent.getParameters() lists the parameters as per
      * the request. Examples are: oXhr : the request object; sUrlParams : the URL parameters of the request;
      * sKeys : key properties of the requested entry; sNavProp/sNavName : name of navigation
      */
    fnCallback: js.Function,
      /**
      * (optional) the name of the entity set
      */
    sEntitySet: String
    ): Unit = js.native
    
    /**
      * Removes a previously attached event handler
      */
    def detachAfter(
      /**
      * event type according to HTTP Method
      */
    sHttpMethod: String,
      /**
      * the name of the function that will be called at this exit
      */
    fnCallback: js.Function,
      /**
      * (optional) the name of the entity set
      */
    sEntitySet: String
    ): Unit = js.native
    
    /**
      * Removes a previously attached event handler
      */
    def detachBefore(
      /**
      * event type according to HTTP Method
      */
    sHttpMethod: String,
      /**
      * the name of the function that will be called at this exit
      */
    fnCallback: js.Function,
      /**
      * (optional) the name of the entity set
      */
    sEntitySet: String
    ): Unit = js.native
    
    /**
      * Returns the data model of the given EntitySet name.
      *
      * @returns data model of the given EntitySet
      */
    def getEntitySetData(/**
      * EntitySet name
      */
    sEntitySetName: String): js.Array[Any] = js.native
    
    /**
      * Getter for property `recordRequests`. Returns whether or not the requests performed should be recorded
      * (stored).
      *
      * Default value is `true`
      *
      * @returns the value of property `recordRequests`
      */
    def getRecordRequests(): Boolean = js.native
    
    /**
      * Getter for property `requests`.
      *
      * Default value is `[]`
      *
      * @returns the value of property `requests`
      */
    def getRequests(): js.Array[RequestHandler] = js.native
    
    /**
      * Getter for property `rootUri`. Has to be relative and requires a trailing '/'. It also needs to match
      * the URI set in OData/JSON models or simple XHR calls in order for the mock server to intercept them.
      *
      * Default value is empty/`undefined`. Must end with a a trailing slash ("/").
      *
      * @returns the value of property `rootUri`
      */
    def getRootUri(): String = js.native
    
    /**
      * Returns whether the server is started or not.
      *
      * @returns whether the server is started or not.
      */
    def isStarted(): Boolean = js.native
    
    /**
      * Sets the data of the given EntitySet name with the given array.
      */
    def setEntitySetData(/**
      * EntitySet name
      */
    sEntitySetName: String, aData: js.Array[Any]): Unit = js.native
    
    /**
      * Setter for property `recordRequests`. Defines whether or not the requests performed should be recorded
      * (stored).
      *
      * Default value is `true`
      */
    def setRecordRequests(/**
      * new value for property `recordRequests`
      */
    recordRequests: Boolean): Unit = js.native
    
    /**
      * Setter for property `requests`.
      *
      * Default value is `[]`
      *
      * @returns Returns `this` to allow method chaining
      */
    def setRequests(/**
      * new value for the `requests` property
      */
    requests: js.Array[RequestHandler]): this.type = js.native
    
    /**
      * Setter for property `rootUri`. All request path URI are prefixed with this root URI if set.
      *
      * Default value is empty/`undefined`
      */
    def setRootUri(/**
      * new value for property `rootUri`
      */
    rootUri: String): Unit = js.native
    
    /**
      * @since 1.13.2
      *
      * Simulates an existing OData service by sepcifying the metadata URL and the base URL for the mockdata.
      * The server configures the request handlers depending on the service metadata. The mockdata needs to be
      * stored individually for each entity type in a separate JSON file. The name of the JSON file needs to
      * match the name of the entity type. If no base url for the mockdata is specified then the mockdata are
      * generated from the metadata
      */
    def simulate(
      /**
      * Either the URL to the service metadata document or the metadata document as xml string itself (starting
      * with "xml")
      */
    sMetadataString: String
    ): Unit = js.native
    def simulate(
      /**
      * Either the URL to the service metadata document or the metadata document as xml string itself (starting
      * with "xml")
      */
    sMetadataString: String,
      /**
      * (optional) base url which contains the path to the mockdata, or an object which contains the following
      * properties: sMockdataBaseUrl, bGenerateMissingMockData, aEntitySetsNames. See below for descriptions
      * of these parameters. Ommit this parameter to produce random mock data based on the service metadata.
      */
    vMockdataSettings: String
    ): Unit = js.native
    def simulate(
      /**
      * Either the URL to the service metadata document or the metadata document as xml string itself (starting
      * with "xml")
      */
    sMetadataString: String,
      /**
      * (optional) base url which contains the path to the mockdata, or an object which contains the following
      * properties: sMockdataBaseUrl, bGenerateMissingMockData, aEntitySetsNames. See below for descriptions
      * of these parameters. Ommit this parameter to produce random mock data based on the service metadata.
      */
    vMockdataSettings: AEntitySetsNames
    ): Unit = js.native
    
    /**
      * Starts the server.
      */
    def start(): Unit = js.native
    
    /**
      * Stops the server.
      */
    def stop(): Unit = js.native
  }
  
  trait MockServerSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Whether or not the requests performed should be recorded (stored). This could be memory intense if each
      * request is recorded. For unit testing purposes it should be set to `true` to compare requests performed
      * otherwise this flag should be set to `false` e.g. for demonstration/app purposes.
      */
    var recordRequests: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Getter for property `requests`.
      *
      * Default value is `[]`
      */
    var requests: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Getter for property `rootUri`. Has to be relative and requires a trailing '/'. It also needs to match
      * the URI set in OData/JSON models or simple XHR calls in order for the mock server to intercept them.
      *
      * Default value is empty/`undefined`. Must end with a a trailing slash ("/").
      */
    var rootUri: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object MockServerSettings {
    
    inline def apply(): MockServerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockServerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockServerSettings] (val x: Self) extends AnyVal {
      
      inline def setRecordRequests(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "recordRequests", value.asInstanceOf[js.Any])
      
      inline def setRecordRequestsUndefined: Self = StObject.set(x, "recordRequests", js.undefined)
      
      inline def setRequests(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
      
      inline def setRequestsVarargs(value: js.Object*): Self = StObject.set(x, "requests", js.Array(value*))
      
      inline def setRootUri(value: String | PropertyBindingInfo): Self = StObject.set(x, "rootUri", value.asInstanceOf[js.Any])
      
      inline def setRootUriUndefined: Self = StObject.set(x, "rootUri", js.undefined)
    }
  }
  
  trait RequestHandler extends StObject {
    
    /**
      * Any HTTP verb
      */
    var method: HTTPMETHOD | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTPMETHOD * / any */ String)
    
    /**
      * A string path is converted to a regular expression, so it can contain normal regular expression syntax.
      *
      * All regular expression groups are forwarded as arguments to the `response` function. In addition to this,
      * parameters can be written in this notation: `:param`. These placeholders will be replaced by regular
      * expression groups.
      */
    var path: String | js.RegExp
    
    /**
      * A response handler function that will be called when an incoming request matches `method` and `path`.
      * The first parameter of the handler will be a `Response` object which can be used to respond on the request.
      */
    def response(p1: Response, p2: Any): Unit
  }
  object RequestHandler {
    
    inline def apply(
      method: HTTPMETHOD | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTPMETHOD * / any */ String),
      path: String | js.RegExp,
      response: (Response, Any) => Unit
    ): RequestHandler = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], response = js.Any.fromFunction2(response))
      __obj.asInstanceOf[RequestHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHandler] (val x: Self) extends AnyVal {
      
      inline def setMethod(
        value: HTTPMETHOD | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTPMETHOD * / any */ String)
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: (Response, Any) => Unit): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var __implements__sap_ui_core_util_MockServer_Response: Boolean = js.native
    
    /**
      * Responds to the incoming request with the given `iStatusCode`, `mHeaders` and `sBody`.
      */
    def respond(): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: Unit,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A string that will be sent as response body
      */
    sBody: String
    ): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: Unit,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: Unit,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A string that will be sent as response body
      */
    sBody: String
    ): Unit = js.native
    def respond(/**
      * HTTP status code to send with the response
      */
    StatusCode: int): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: int,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A string that will be sent as response body
      */
    sBody: String
    ): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: int,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respond(
      /**
      * HTTP status code to send with the response
      */
    StatusCode: int,
      /**
      * HTTP headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A string that will be sent as response body
      */
    sBody: String
    ): Unit = js.native
    
    /**
      * Convenience variant of {@link #respond} which allows to send the content of an external resource as response.
      *
      * This method first synchronously fetches the given `sFileUrl`. Depending on the extension and path of
      * the `sFileUrl`, it propagates the received response body to {@link #respondJSON}, {@link #respondXML }
      * or {@link #respond}, using the given `iStatus` and `mHeaders`.
      *
      * The status code and headers of the received response are ignored. In particular, the `Content-Type` header
      * is not used for the mock server's response.
      */
    def respondFile(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * URL to get the response body from
      */
    sFileUrl: String
    ): Unit = js.native
    /**
      * Convenience variant of {@link #respond} which allows to send the content of an external resource as response.
      *
      * This method first synchronously fetches the given `sFileUrl`. Depending on the extension and path of
      * the `sFileUrl`, it propagates the received response body to {@link #respondJSON}, {@link #respondXML }
      * or {@link #respond}, using the given `iStatus` and `mHeaders`.
      *
      * The status code and headers of the received response are ignored. In particular, the `Content-Type` header
      * is not used for the mock server's response.
      */
    def respondFile(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * URL to get the response body from
      */
    sFileUrl: String
    ): Unit = js.native
    /**
      * Convenience variant of {@link #respond} which allows to send the content of an external resource as response.
      *
      * This method first synchronously fetches the given `sFileUrl`. Depending on the extension and path of
      * the `sFileUrl`, it propagates the received response body to {@link #respondJSON}, {@link #respondXML }
      * or {@link #respond}, using the given `iStatus` and `mHeaders`.
      *
      * The status code and headers of the received response are ignored. In particular, the `Content-Type` header
      * is not used for the mock server's response.
      */
    def respondFile(
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * URL to get the response body from
      */
    sFileUrl: String
    ): Unit = js.native
    /**
      * Convenience variant of {@link #respond} which allows to send the content of an external resource as response.
      *
      * This method first synchronously fetches the given `sFileUrl`. Depending on the extension and path of
      * the `sFileUrl`, it propagates the received response body to {@link #respondJSON}, {@link #respondXML }
      * or {@link #respond}, using the given `iStatus` and `mHeaders`.
      *
      * The status code and headers of the received response are ignored. In particular, the `Content-Type` header
      * is not used for the mock server's response.
      */
    def respondFile(/**
      * URL to get the response body from
      */
    sFileUrl: String): Unit = js.native
    
    /**
      * Convenience variant of {@link #respond} which simplifies sending a JSON response.
      *
      * The response content `vBody` can either be given as a string, which is then assumed to be in JSON format.
      * Or it can be any JSON-stringifiable value which then will be converted to a string using `JSON.stringify`.
      * If no `vBody` is given, an empty response will be sent.
      *
      * If no `Content-Type` header is given, it will be set to `application/json`.
      */
    def respondJSON(): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: String
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Array[Any]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Object
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Boolean
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Double
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: String
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Array[Any]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Object
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Boolean
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Double
    ): Unit = js.native
    def respondJSON(/**
      * HTTP status code to send with the response
      */
    iStatusCode: int): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: String
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Array[Any]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Object
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Boolean
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Double
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: String
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Array[Any]
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: js.Object
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Boolean
    ): Unit = js.native
    def respondJSON(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * A valid JSON-string or a JSON-stringifiable object that should be sent as response body
      */
    vBody: Double
    ): Unit = js.native
    
    /**
      * Convenience variant of {@link #respond} which simplifies sending an XML response.
      *
      * If no `Content-Type` header is given, it will be set to `application/xml`.
      */
    def respondXML(): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * XML string to send as response body
      */
    sXmlString: String
    ): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: Unit,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * XML string to send as response body
      */
    sXmlString: String
    ): Unit = js.native
    def respondXML(/**
      * HTTP status code to send with the response
      */
    iStatusCode: int): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Unit,
      /**
      * XML string to send as response body
      */
    sXmlString: String
    ): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String]
    ): Unit = js.native
    def respondXML(
      /**
      * HTTP status code to send with the response
      */
    iStatusCode: int,
      /**
      * HTTP Headers to send with the response
      */
    mHeaders: Record[String, String],
      /**
      * XML string to send as response body
      */
    sXmlString: String
    ): Unit = js.native
  }
}
