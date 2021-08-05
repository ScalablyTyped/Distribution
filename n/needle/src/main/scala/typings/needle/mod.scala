package typings.needle

import org.scalablytyped.runtime.StringDictionary
import typings.needle.mod.core.NeedleReadonlyHttpVerbs
import typings.needle.needleStrings.auto
import typings.needle.needleStrings.basic
import typings.needle.needleStrings.digest
import typings.needle.needleStrings.json
import typings.needle.needleStrings.xml
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.node.tlsMod.SecureContextOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
    */
  inline def apply(
    method: typings.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typings.needle.mod.core.BodyData
  ): js.Promise[typings.needle.mod.core.NeedleResponse] = (^.asInstanceOf[js.Dynamic].apply(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.needle.mod.core.NeedleResponse]]
  inline def apply(
    method: typings.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typings.needle.mod.core.BodyData,
    options: typings.needle.mod.core.NeedleOptions
  ): js.Promise[typings.needle.mod.core.NeedleResponse] = (^.asInstanceOf[js.Dynamic].apply(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.needle.mod.core.NeedleResponse]]
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  inline def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typings.needle.mod.core.NeedleResponse] = (^.asInstanceOf[js.Dynamic].apply(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.needle.mod.core.NeedleResponse]]
  inline def apply(method: NeedleReadonlyHttpVerbs, url: String, options: typings.needle.mod.core.NeedleOptions): js.Promise[typings.needle.mod.core.NeedleResponse] = (^.asInstanceOf[js.Dynamic].apply(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.needle.mod.core.NeedleResponse]]
  
  @JSImport("needle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(options: NeedleOptions): NeedleOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[NeedleOptions]
  
  /**
    * Issues an HTTP DELETE request.
    */
  inline def delete(url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def delete(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def delete(url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def delete(url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def delete(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  /**
    * Issues an HTTP DELETE request.
    */
  inline def deleteFunc(url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFunc")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def deleteFunc(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFunc")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def deleteFunc(url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFunc")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def deleteFunc(url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFunc")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def deleteFunc(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFunc")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def get(url: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def get(url: String, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def get(url: String, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def get(url: String, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def get(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def head(url: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def head(url: String, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def head(url: String, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def head(url: String, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def head(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def patch(url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def patch(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def patch(url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def patch(url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def patch(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def post(url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def post(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def post(url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def post(url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def post(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def put(url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def put(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def put(url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def put(url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def put(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def request(method: NeedleHttpVerbs, url: String, data: BodyData): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def request(method: NeedleHttpVerbs, url: String, data: BodyData, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def request(method: NeedleHttpVerbs, url: String, data: BodyData, options: Unit, callback: NeedleCallback): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def request(method: NeedleHttpVerbs, url: String, data: BodyData, options: NeedleOptions): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def request(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: NeedleOptions,
    callback: NeedleCallback
  ): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  type BodyData = typings.needle.mod.core.BodyData
  
  type NeedleCallback = typings.needle.mod.core.NeedleCallback
  
  type NeedleHttpVerbs = typings.needle.mod.core.NeedleHttpVerbs
  
  type NeedleOptions = typings.needle.mod.core.NeedleOptions
  
  type NeedleResponse = typings.needle.mod.core.NeedleResponse
  
  type ReadableStream = typings.needle.mod.core.ReadableStream
  
  object core {
    
    type BodyData = Buffer | KeyValue | typings.node.NodeJS.ReadableStream | String | Null
    
    type Cookies = StringDictionary[js.Any]
    
    type KeyValue = StringDictionary[js.Any]
    
    type NeedleCallback = js.Function3[
        /* error */ Error | Null, 
        /* response */ typings.needle.mod.core.NeedleResponse, 
        /* body */ js.Any, 
        Unit
      ]
    
    /* Rewritten from type alias, can be one of: 
      - typings.needle.needleStrings.get
      - typings.needle.needleStrings.head
      - typings.needle.needleStrings.delete
      - typings.needle.needleStrings.patch
      - typings.needle.needleStrings.post
      - typings.needle.needleStrings.put
    */
    trait NeedleHttpVerbs extends StObject
    object NeedleHttpVerbs {
      
      inline def delete: typings.needle.needleStrings.delete = "delete".asInstanceOf[typings.needle.needleStrings.delete]
      
      inline def get: typings.needle.needleStrings.get = "get".asInstanceOf[typings.needle.needleStrings.get]
      
      inline def head: typings.needle.needleStrings.head = "head".asInstanceOf[typings.needle.needleStrings.head]
      
      inline def patch: typings.needle.needleStrings.patch = "patch".asInstanceOf[typings.needle.needleStrings.patch]
      
      inline def post: typings.needle.needleStrings.post = "post".asInstanceOf[typings.needle.needleStrings.post]
      
      inline def put: typings.needle.needleStrings.put = "put".asInstanceOf[typings.needle.needleStrings.put]
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.node.httpMod.ClientRequestArgs because var conflicts: agent, auth, headers, localAddress, timeout. Inlined port, protocol, method, defaultPort, setHost, _defaultAgent, hostname, maxHeaderSize, host, socketPath, createConnection, path, family
    - typings.node.httpsMod.RequestOptions because var conflicts: agent, auth, headers, localAddress, timeout. Inlined servername, rejectUnauthorized */ trait NeedleOptions
      extends StObject
         with RequestOptions
         with ResponseOptions
         with RedirectOptions
         with SecureContextOptions {
      
      var _defaultAgent: js.UndefOr[Agent] = js.undefined
      
      // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
      var createConnection: js.UndefOr[
            js.Function2[
              /* options */ this.type, 
              /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
              Socket
            ]
          ] = js.undefined
      
      var defaultPort: js.UndefOr[Double | String] = js.undefined
      
      var family: js.UndefOr[Double] = js.undefined
      
      var host: js.UndefOr[String | Null] = js.undefined
      
      var hostname: js.UndefOr[String | Null] = js.undefined
      
      /**
        * @default 8192
        */
      var maxHeaderSize: js.UndefOr[Double] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String | Null] = js.undefined
      
      var port: js.UndefOr[Double | String | Null] = js.undefined
      
      var protocol: js.UndefOr[String | Null] = js.undefined
      
      var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
      
      // Defaults to true
      var servername: js.UndefOr[String] = js.undefined
      
      var setHost: js.UndefOr[Boolean] = js.undefined
      
      var socketPath: js.UndefOr[String] = js.undefined
    }
    object NeedleOptions {
      
      inline def apply(): typings.needle.mod.core.NeedleOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.needle.mod.core.NeedleOptions]
      }
      
      extension [Self <: typings.needle.mod.core.NeedleOptions](x: Self) {
        
        inline def setCreateConnection(
          value: (typings.needle.mod.core.NeedleOptions, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
        ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
        
        inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
        
        inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
        
        inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
        
        inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostNull: Self = StObject.set(x, "host", null)
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
        
        inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
        
        inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathNull: Self = StObject.set(x, "path", null)
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortNull: Self = StObject.set(x, "port", null)
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
        
        inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
        
        inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
        
        inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
        
        inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
        
        inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
        
        inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
        
        inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
        
        inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
        
        inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
        
        inline def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
        
        inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.needle.needleStrings.delete
      - typings.needle.needleStrings.patch
      - typings.needle.needleStrings.post
      - typings.needle.needleStrings.put
    */
    trait NeedleReadWriteHttpVerbs extends StObject
    object NeedleReadWriteHttpVerbs {
      
      inline def delete: typings.needle.needleStrings.delete = "delete".asInstanceOf[typings.needle.needleStrings.delete]
      
      inline def patch: typings.needle.needleStrings.patch = "patch".asInstanceOf[typings.needle.needleStrings.patch]
      
      inline def post: typings.needle.needleStrings.post = "post".asInstanceOf[typings.needle.needleStrings.post]
      
      inline def put: typings.needle.needleStrings.put = "put".asInstanceOf[typings.needle.needleStrings.put]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.needle.needleStrings.get
      - typings.needle.needleStrings.head
    */
    trait NeedleReadonlyHttpVerbs extends StObject
    object NeedleReadonlyHttpVerbs {
      
      inline def get: typings.needle.needleStrings.get = "get".asInstanceOf[typings.needle.needleStrings.get]
      
      inline def head: typings.needle.needleStrings.head = "head".asInstanceOf[typings.needle.needleStrings.head]
    }
    
    @js.native
    trait NeedleResponse extends IncomingMessage {
      
      var body: js.Any = js.native
      
      var bytes: Double = js.native
      
      var cookies: js.UndefOr[Cookies] = js.native
      
      var raw: Buffer = js.native
    }
    
    type ReadableStream = typings.node.NodeJS.ReadableStream
    
    trait RedirectOptions extends StObject {
      
      /**
        * When true, Needle will only follow redirects that point to the same host
        * as the original request.
        * false by default.
        */
      var follow_if_same_host: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Unless true, Needle will not follow redirects that point to same location (as set in the response header) as the original request URL. false by default.
        */
      var follow_if_same_location: js.UndefOr[Boolean] = js.undefined
      
      /**
        * When true, Needle will only follow redirects that point to the same protocol
        * as the original request.
        * false by default.
        */
      var follow_if_same_protocol: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If enabled, resends the request using the original verb
        * instead of being rewritten to get with no data.
        * false by default.
        */
      var follow_keep_method: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Sends the cookies received in the set-cookie header
        * as part of the following request.
        * false by default.
        */
      var follow_set_cookie: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Sets the 'Referer' header to the requested URI
        * when following a redirect.
        * false by default.
        */
      var follow_set_referer: js.UndefOr[Boolean] = js.undefined
    }
    object RedirectOptions {
      
      inline def apply(): RedirectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RedirectOptions]
      }
      
      extension [Self <: RedirectOptions](x: Self) {
        
        inline def setFollow_if_same_host(value: Boolean): Self = StObject.set(x, "follow_if_same_host", value.asInstanceOf[js.Any])
        
        inline def setFollow_if_same_hostUndefined: Self = StObject.set(x, "follow_if_same_host", js.undefined)
        
        inline def setFollow_if_same_location(value: Boolean): Self = StObject.set(x, "follow_if_same_location", value.asInstanceOf[js.Any])
        
        inline def setFollow_if_same_locationUndefined: Self = StObject.set(x, "follow_if_same_location", js.undefined)
        
        inline def setFollow_if_same_protocol(value: Boolean): Self = StObject.set(x, "follow_if_same_protocol", value.asInstanceOf[js.Any])
        
        inline def setFollow_if_same_protocolUndefined: Self = StObject.set(x, "follow_if_same_protocol", js.undefined)
        
        inline def setFollow_keep_method(value: Boolean): Self = StObject.set(x, "follow_keep_method", value.asInstanceOf[js.Any])
        
        inline def setFollow_keep_methodUndefined: Self = StObject.set(x, "follow_keep_method", js.undefined)
        
        inline def setFollow_set_cookie(value: Boolean): Self = StObject.set(x, "follow_set_cookie", value.asInstanceOf[js.Any])
        
        inline def setFollow_set_cookieUndefined: Self = StObject.set(x, "follow_set_cookie", js.undefined)
        
        inline def setFollow_set_referer(value: Boolean): Self = StObject.set(x, "follow_set_referer", value.asInstanceOf[js.Any])
        
        inline def setFollow_set_refererUndefined: Self = StObject.set(x, "follow_set_referer", js.undefined)
      }
    }
    
    trait RequestOptions extends StObject {
      
      /**
        * Sets 'Accept' HTTP header. Defaults to &#x2a;&#x2f;&#x2a;.
        */
      var accept: js.UndefOr[String] = js.undefined
      
      /**
        * Uses an http.Agent of your choice, instead of the global, default one.
        * Useful for tweaking the behaviour at the connection level, such as when doing tunneling.
        */
      var agent: js.UndefOr[Agent | Boolean] = js.undefined
      
      /**
        * Determines what to do with provided username/password.
        * Options are auto, digest or basic (default).
        * auto will detect the type of authentication depending on the response headers.
        */
      var auth: js.UndefOr[auto | digest | basic] = js.undefined
      
      /**
        * If true, sets 'Accept-Encoding' header to 'gzip,deflate',
        * and inflates content if zipped.
        * Defaults to false.
        */
      var compressed: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Sets 'Connection' HTTP header.
        * Not set by default, unless running Node < 0.11.4
        * in which case it defaults to close.
        */
      var connection: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the 'Content-Type' header.
        * Unset by default, unless you're sending data
        * in which case it's set accordingly to whatever is being sent
        * (application/x-www-form-urlencoded, application/json or multipart/form-data).
        * That is, of course, unless the option is passed,
        * either here or through options.headers.
        */
      var content_type: js.UndefOr[String] = js.undefined
      
      // These properties are overwritten by those in the 'headers' field
      /**
        * Builds and sets a Cookie header from a { key: 'value' } object.
        */
      var cookies: js.UndefOr[Cookies] = js.undefined
      
      /**
        * Alias for follow_max
        */
      var follow: js.UndefOr[Double] = js.undefined
      
      /**
        * Number of redirects to follow. Defaults to 0.
        */
      var follow_max: js.UndefOr[Double] = js.undefined
      
      /**
        * Object containing custom HTTP headers for request.
        */
      var headers: js.UndefOr[js.Object] = js.undefined
      
      /**
        * When true, sets content type to application/json and sends request body as JSON string,
        * instead of a query string.
        */
      var json: js.UndefOr[Boolean] = js.undefined
      
      /**
        * IP address. Passed to http/https request. Local interface from which the request should be emitted.
        */
      var localAddress: js.UndefOr[String] = js.undefined
      
      /**
        * Enables multipart/form-data encoding. Defaults to false.
        * Use it when uploading files.
        */
      var multipart: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Returns error if connection takes longer than X milisecs to establish.
        * Defaults to 10000 (10 secs). 0 means no timeout.
        */
      var open_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * For HTTP basic auth. Requires username to be passed, but is optional.
        */
      var password: js.UndefOr[String] = js.undefined
      
      /**
        * Forwards request through HTTP(s) proxy.
        * Eg. proxy: 'http://user:pass@proxy.server.com:3128'.
        * For more advanced proxying/tunneling use a custom agent.
        */
      var proxy: js.UndefOr[String] = js.undefined
      
      /**
        * Returns error if data transfer takes longer than X milisecs,
        * after connection is established. Defaults to 0 (no timeout).
        */
      var read_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Returns error if no response headers are received in X milisecs,
        * counting from when the connection is opened. Defaults to `0` (no response timeout).
        */
      var response_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * When sending streams, this lets manually set the Content-Length header
        * --if the stream's bytecount is known beforehand--,
        * preventing ECONNRESET (socket hang up) errors on some servers that misbehave
        * when receiving payloads of unknown size.
        * Set it to 0 and Needle will get and set the stream's length,
        * or leave unset for the default behavior,
        * which is no Content-Length header for stream payloads.
        */
      var stream_length: js.UndefOr[Double] = js.undefined
      
      /**
        * Alias for open_timeout
        */
      var timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Anonymous function taking request (or redirect location if following redirects) URI as an argument and modifying it given logic.
        * It has to return a valid URI string for successful request.
        */
      var uri_modifier: js.UndefOr[js.Function1[/* uri */ String, String]] = js.undefined
      
      /**
        * Sets the 'User-Agent' HTTP header.
        * Defaults to Needle/{version} (Node.js {node_version}).
        */
      var user_agent: js.UndefOr[String] = js.undefined
      
      // Overwritten if present in the URI
      /**
        * For HTTP basic auth.
        */
      var username: js.UndefOr[String] = js.undefined
    }
    object RequestOptions {
      
      inline def apply(): RequestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestOptions]
      }
      
      extension [Self <: RequestOptions](x: Self) {
        
        inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
        
        inline def setAuth(value: auto | digest | basic): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
        
        inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
        
        inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
        
        inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        inline def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
        
        inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
        
        inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
        
        inline def setFollow_max(value: Double): Self = StObject.set(x, "follow_max", value.asInstanceOf[js.Any])
        
        inline def setFollow_maxUndefined: Self = StObject.set(x, "follow_max", js.undefined)
        
        inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
        
        inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
        
        inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
        
        inline def setOpen_timeout(value: Double): Self = StObject.set(x, "open_timeout", value.asInstanceOf[js.Any])
        
        inline def setOpen_timeoutUndefined: Self = StObject.set(x, "open_timeout", js.undefined)
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
        
        inline def setRead_timeout(value: Double): Self = StObject.set(x, "read_timeout", value.asInstanceOf[js.Any])
        
        inline def setRead_timeoutUndefined: Self = StObject.set(x, "read_timeout", js.undefined)
        
        inline def setResponse_timeout(value: Double): Self = StObject.set(x, "response_timeout", value.asInstanceOf[js.Any])
        
        inline def setResponse_timeoutUndefined: Self = StObject.set(x, "response_timeout", js.undefined)
        
        inline def setStream_length(value: Double): Self = StObject.set(x, "stream_length", value.asInstanceOf[js.Any])
        
        inline def setStream_lengthUndefined: Self = StObject.set(x, "stream_length", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setUri_modifier(value: /* uri */ String => String): Self = StObject.set(x, "uri_modifier", js.Any.fromFunction1(value))
        
        inline def setUri_modifierUndefined: Self = StObject.set(x, "uri_modifier", js.undefined)
        
        inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
        
        inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    trait ResponseOptions extends StObject {
      
      /**
        * Alias for decode_response
        */
      var decode: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to decode the text responses to UTF-8,
        * if Content-Type header shows a different charset. Defaults to true.
        */
      var decode_response: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Dump response output to file.
        * This occurs after parsing and charset decoding is done.
        */
      var output: js.UndefOr[String] = js.undefined
      
      /**
        * Alias for parse_response
        */
      var parse: js.UndefOr[Boolean | json | xml] = js.undefined
      
      /**
        * Whether to parse response’s Set-Cookie header.
        * Defaults to true.
        * If parsed, response cookies will be available at resp.cookies.
        */
      var parse_cookies: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to parse XML or JSON response bodies automagically.
        * Defaults to true.
        * You can also set this to 'xml' or 'json' in which case Needle
        * will only parse the response if the content type matches.
        */
      var parse_response: js.UndefOr[Boolean | json | xml] = js.undefined
    }
    object ResponseOptions {
      
      inline def apply(): ResponseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResponseOptions]
      }
      
      extension [Self <: ResponseOptions](x: Self) {
        
        inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
        
        inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
        
        inline def setDecode_response(value: Boolean): Self = StObject.set(x, "decode_response", value.asInstanceOf[js.Any])
        
        inline def setDecode_responseUndefined: Self = StObject.set(x, "decode_response", js.undefined)
        
        inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        inline def setParse(value: Boolean | json | xml): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
        
        inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
        
        inline def setParse_cookies(value: Boolean): Self = StObject.set(x, "parse_cookies", value.asInstanceOf[js.Any])
        
        inline def setParse_cookiesUndefined: Self = StObject.set(x, "parse_cookies", js.undefined)
        
        inline def setParse_response(value: Boolean | json | xml): Self = StObject.set(x, "parse_response", value.asInstanceOf[js.Any])
        
        inline def setParse_responseUndefined: Self = StObject.set(x, "parse_response", js.undefined)
      }
    }
  }
}
