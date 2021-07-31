package typings.nock

import org.scalablytyped.runtime.StringDictionary
import typings.nock.anon.ClientRequestheadersRecor
import typings.nock.anon.Context
import typings.nock.anon.Pass
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.fsMod.ReadStream
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.URLSearchParams
import typings.node.urlMod.Url
import typings.std.Array
import typings.std.Date
import typings.std.Map
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(basePath: String): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  @scala.inline
  def apply(basePath: String, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  @scala.inline
  def apply(basePath: Url): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  @scala.inline
  def apply(basePath: Url, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  @scala.inline
  def apply(basePath: RegExp): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  @scala.inline
  def apply(basePath: RegExp, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  @JSImport("nock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def abortPendingRequests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abortPendingRequests")().asInstanceOf[Unit]
  
  @scala.inline
  def activate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")().asInstanceOf[Unit]
  
  @scala.inline
  def activeMocks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("activeMocks")().asInstanceOf[js.Array[String]]
  
  @JSImport("nock", "back")
  @js.native
  def back: Back_ = js.native
  @scala.inline
  def back_=(x: Back_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def cleanAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAll")().asInstanceOf[Unit]
  
  @scala.inline
  def define(defs: js.Array[Definition]): js.Array[Scope] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(defs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Scope]]
  
  @scala.inline
  def disableNetConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetConnect")().asInstanceOf[Unit]
  
  @JSImport("nock", "emitter")
  @js.native
  def emitter: EventEmitter = js.native
  @scala.inline
  def emitter_=(x: EventEmitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emitter")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def enableNetConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")().asInstanceOf[Unit]
  @scala.inline
  def enableNetConnect(matcher: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableNetConnect(matcher: js.Function1[/* host */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableNetConnect(matcher: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")().asInstanceOf[Boolean]
  
  @scala.inline
  def isDone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDone")().asInstanceOf[Boolean]
  
  @scala.inline
  def load(path: String): js.Array[Scope] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Scope]]
  
  @scala.inline
  def loadDefs(path: String): js.Array[Definition] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Definition]]
  
  @scala.inline
  def pendingMocks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pendingMocks")().asInstanceOf[js.Array[String]]
  
  @JSImport("nock", "recorder")
  @js.native
  def recorder: Recorder_ = js.native
  @scala.inline
  def recorder_=(x: Recorder_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recorder")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def removeInterceptor(interceptor: Interceptor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def removeInterceptor(interceptor: ReqOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  
  trait BackContext extends StObject {
    
    def assertScopesFinished(): Unit
    
    var isLoaded: Boolean
    
    var scopes: js.Array[Scope]
  }
  object BackContext {
    
    @scala.inline
    def apply(assertScopesFinished: () => Unit, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
      val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackContext]
    }
    
    @scala.inline
    implicit class BackContextMutableBuilder[Self <: BackContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertScopesFinished(value: () => Unit): Self = StObject.set(x, "assertScopesFinished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nock.nockStrings.wild
    - typings.nock.nockStrings.dryrun
    - typings.nock.nockStrings.record
    - typings.nock.nockStrings.lockdown
  */
  trait BackMode extends StObject
  object BackMode {
    
    @scala.inline
    def dryrun: typings.nock.nockStrings.dryrun = "dryrun".asInstanceOf[typings.nock.nockStrings.dryrun]
    
    @scala.inline
    def lockdown: typings.nock.nockStrings.lockdown = "lockdown".asInstanceOf[typings.nock.nockStrings.lockdown]
    
    @scala.inline
    def record: typings.nock.nockStrings.record = "record".asInstanceOf[typings.nock.nockStrings.record]
    
    @scala.inline
    def wild: typings.nock.nockStrings.wild = "wild".asInstanceOf[typings.nock.nockStrings.wild]
  }
  
  trait BackOptions extends StObject {
    
    var after: js.UndefOr[js.Function1[/* scope */ Scope, Unit]] = js.undefined
    
    var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[Definition], js.Array[Definition]]] = js.undefined
    
    var before: js.UndefOr[js.Function1[/* def */ Definition, Unit]] = js.undefined
    
    var recorder: js.UndefOr[RecorderOptions] = js.undefined
  }
  object BackOptions {
    
    @scala.inline
    def apply(): BackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackOptions]
    }
    
    @scala.inline
    implicit class BackOptionsMutableBuilder[Self <: BackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: /* scope */ Scope => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterRecord(value: /* defs */ js.Array[Definition] => js.Array[Definition]): Self = StObject.set(x, "afterRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterRecordUndefined: Self = StObject.set(x, "afterRecord", js.undefined)
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: /* def */ Definition => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setRecorder(value: RecorderOptions): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    }
  }
  
  @js.native
  trait Back_ extends StObject {
    
    def apply(fixtureName: String): js.Promise[Context] = js.native
    def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
    def apply(fixtureName: String, options: BackOptions): js.Promise[Context] = js.native
    def apply(
      fixtureName: String,
      options: BackOptions,
      nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
    ): Unit = js.native
    
    var currentMode: BackMode = js.native
    
    var fixtures: String = js.native
    
    def setMode(mode: BackMode): Unit = js.native
  }
  
  type Body = String | (Record[String, js.Any])
  
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - scala.Unit
    - typings.std.RegExp
    - typings.nock.mod.DataMatcherArray
    - typings.nock.mod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[_DataMatcher | Boolean | Double | String | Null | RegExp]
  
  @js.native
  trait DataMatcherArray
    extends StObject
       with Array[DataMatcher]
       with _DataMatcher
       with _RequestBodyMatcher
  
  trait DataMatcherMap
    extends StObject
       with /* key */ StringDictionary[DataMatcher]
       with _DataMatcher
       with _RequestBodyMatcher
  object DataMatcherMap {
    
    @scala.inline
    def apply(): DataMatcherMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataMatcherMap]
    }
  }
  
  trait Definition extends StObject {
    
    var body: js.UndefOr[RequestBodyMatcher] = js.undefined
    
    var headers: js.UndefOr[ReplyHeaders] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var path: String
    
    var port: js.UndefOr[Double | String] = js.undefined
    
    var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
    
    var response: js.UndefOr[ReplyBody] = js.undefined
    
    var scope: String
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object Definition {
    
    @scala.inline
    def apply(path: String, scope: String): Definition = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: RequestBodyMatcher): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFunction1(value: /* body */ js.Any => Boolean): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: ReplyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = StObject.set(x, "reqheaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqheadersUndefined: Self = StObject.set(x, "reqheaders", js.undefined)
      
      @scala.inline
      def setResponse(value: ReplyBody): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type InterceptFunction = js.Function3[
    /* uri */ String | RegExp | (js.Function1[/* uri */ String, Boolean]), 
    /* requestBody */ js.UndefOr[RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  
  @js.native
  trait Interceptor extends StObject {
    
    def basicAuth(options: Pass): this.type = js.native
    
    def delay(opts: Double): this.type = js.native
    def delay(opts: typings.nock.anon.Body): this.type = js.native
    
    def delayBody(timeMs: Double): this.type = js.native
    
    def delayConnection(timeMs: Double): this.type = js.native
    
    def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
    
    def once(): this.type = js.native
    
    def optionally(): this.type = js.native
    
    def query(matcher: String): this.type = js.native
    def query(matcher: js.Function1[/* parsedObj */ ParsedUrlQuery, Boolean]): this.type = js.native
    def query(matcher: Boolean): this.type = js.native
    def query(matcher: DataMatcherMap): this.type = js.native
    def query(matcher: URLSearchParams): this.type = js.native
    
    def reply(): Scope = js.native
    // tslint (as of 5.16) is under the impression that the callback types can be unified,
    // however, doing so causes the params to lose their inherited types during use.
    // the order of the overrides is important for determining the param types in the replay fns.
    /* tslint:disable:unified-signatures */
    def reply(
      replyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyFnResult, Unit], 
          Unit
        ]
    ): Scope = js.native
    def reply(
      replyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyFnResult | js.Promise[ReplyFnResult]
        ]
    ): Scope = js.native
    def reply(responseCode: Unit, body: Unit, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: Unit, body: Body): Scope = js.native
    def reply(responseCode: Unit, body: Body, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: StatusCode): Scope = js.native
    def reply(responseCode: StatusCode, body: Unit, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: StatusCode, body: Body): Scope = js.native
    def reply(responseCode: StatusCode, body: Body, headers: ReplyHeaders): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
          Unit
        ]
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
          Unit
        ],
      headers: ReplyHeaders
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyBody | js.Promise[ReplyBody]
        ]
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyBody | js.Promise[ReplyBody]
        ],
      headers: ReplyHeaders
    ): Scope = js.native
    
    /* tslint:enable:unified-signatures */
    def replyWithError(errorMessage: String): Scope = js.native
    def replyWithError(errorMessage: js.Object): Scope = js.native
    
    def replyWithFile(statusCode: StatusCode, fileName: String): Scope = js.native
    def replyWithFile(statusCode: StatusCode, fileName: String, headers: ReplyHeaders): Scope = js.native
    
    def thrice(): this.type = js.native
    
    def times(newCounter: Double): this.type = js.native
    
    def twice(): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var allowUnmocked: js.UndefOr[Boolean] = js.undefined
    
    var badheaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var encodedQueryParams: js.UndefOr[Boolean] = js.undefined
    
    var filteringScope: js.UndefOr[js.Function1[/* scope */ String, Boolean]] = js.undefined
    
    var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnmocked(value: Boolean): Self = StObject.set(x, "allowUnmocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnmockedUndefined: Self = StObject.set(x, "allowUnmocked", js.undefined)
      
      @scala.inline
      def setBadheaders(value: js.Array[String]): Self = StObject.set(x, "badheaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadheadersUndefined: Self = StObject.set(x, "badheaders", js.undefined)
      
      @scala.inline
      def setBadheadersVarargs(value: String*): Self = StObject.set(x, "badheaders", js.Array(value :_*))
      
      @scala.inline
      def setEncodedQueryParams(value: Boolean): Self = StObject.set(x, "encodedQueryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodedQueryParamsUndefined: Self = StObject.set(x, "encodedQueryParams", js.undefined)
      
      @scala.inline
      def setFilteringScope(value: /* scope */ String => Boolean): Self = StObject.set(x, "filteringScope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilteringScopeUndefined: Self = StObject.set(x, "filteringScope", js.undefined)
      
      @scala.inline
      def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = StObject.set(x, "reqheaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqheadersUndefined: Self = StObject.set(x, "reqheaders", js.undefined)
    }
  }
  
  trait RecorderOptions extends StObject {
    
    var dont_print: js.UndefOr[Boolean] = js.undefined
    
    var enable_reqheaders_recording: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
    
    var output_objects: js.UndefOr[Boolean] = js.undefined
    
    var use_separator: js.UndefOr[Boolean] = js.undefined
  }
  object RecorderOptions {
    
    @scala.inline
    def apply(): RecorderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderOptions]
    }
    
    @scala.inline
    implicit class RecorderOptionsMutableBuilder[Self <: RecorderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDont_print(value: Boolean): Self = StObject.set(x, "dont_print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDont_printUndefined: Self = StObject.set(x, "dont_print", js.undefined)
      
      @scala.inline
      def setEnable_reqheaders_recording(value: Boolean): Self = StObject.set(x, "enable_reqheaders_recording", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable_reqheaders_recordingUndefined: Self = StObject.set(x, "enable_reqheaders_recording", js.undefined)
      
      @scala.inline
      def setLogging(value: /* content */ String => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setOutput_objects(value: Boolean): Self = StObject.set(x, "output_objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput_objectsUndefined: Self = StObject.set(x, "output_objects", js.undefined)
      
      @scala.inline
      def setUse_separator(value: Boolean): Self = StObject.set(x, "use_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_separatorUndefined: Self = StObject.set(x, "use_separator", js.undefined)
    }
  }
  
  @js.native
  trait Recorder_ extends StObject {
    
    def clear(): Unit = js.native
    
    def play(): js.Array[Definition | String] = js.native
    
    def rec(): Unit = js.native
    def rec(options: Boolean): Unit = js.native
    def rec(options: RecorderOptions): Unit = js.native
  }
  
  // a string or decoded JSON
  type ReplyBody = Body | Buffer | ReadStream
  
  @js.native
  trait ReplyFnContext
    extends StObject
       with Interceptor {
    
    var req: ClientRequestheadersRecor = js.native
  }
  
  type ReplyFnResult = js.Array[StatusCode] | (js.Tuple2[StatusCode, ReplyBody]) | (js.Tuple3[StatusCode, ReplyBody, ReplyHeaders])
  
  type ReplyHeaderFunction = js.Function3[
    /* req */ ClientRequest, 
    /* res */ IncomingMessage, 
    /* body */ String | Buffer, 
    String | js.Array[String]
  ]
  
  type ReplyHeaderValue = String | js.Array[String] | ReplyHeaderFunction
  
  type ReplyHeaders = (Record[String, ReplyHeaderValue]) | (Map[String, ReplyHeaderValue]) | js.Array[ReplyHeaderValue]
  
  trait ReqOptions
    extends StObject
       with ClientRequestArgs {
    
    var proto: js.UndefOr[String] = js.undefined
  }
  object ReqOptions {
    
    @scala.inline
    def apply(): ReqOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqOptions]
    }
    
    @scala.inline
    implicit class ReqOptionsMutableBuilder[Self <: ReqOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.std.RegExp
    - typings.nock.mod.DataMatcherArray
    - typings.nock.mod.DataMatcherMap
    - js.Function1[/ * body * / js.Any, scala.Boolean]
  */
  type RequestBodyMatcher = _RequestBodyMatcher | (js.Function1[/* body */ js.Any, Boolean]) | String | Buffer | RegExp
  
  type RequestHeaderMatcher = String | RegExp | (js.Function1[/* fieldValue */ String, Boolean])
  
  @js.native
  trait Scope
    extends StObject
       with EventEmitter {
    
    def activeMocks(): js.Array[String] = js.native
    
    def defaultReplyHeaders(headers: ReplyHeaders): this.type = js.native
    
    def delete(uri: String): Interceptor = js.native
    def delete(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def delete(uri: RegExp): Interceptor = js.native
    def delete(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("delete")
    var delete_Original: InterceptFunction = js.native
    
    def done(): Unit = js.native
    
    def filteringPath(fn: js.Function1[/* path */ String, String]): this.type = js.native
    def filteringPath(regex: RegExp, replace: String): this.type = js.native
    
    def filteringRequestBody(fn: js.Function1[/* body */ String, String]): this.type = js.native
    def filteringRequestBody(regex: RegExp, replace: String): this.type = js.native
    
    def get(uri: String): Interceptor = js.native
    def get(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def get(uri: RegExp): Interceptor = js.native
    def get(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("get")
    var get_Original: InterceptFunction = js.native
    
    def head(uri: String): Interceptor = js.native
    def head(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def head(uri: RegExp): Interceptor = js.native
    def head(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("head")
    var head_Original: InterceptFunction = js.native
    
    def intercept(uri: String, method: String): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(
      uri: js.Function1[/* uri */ String, Boolean],
      method: String,
      requestBody: RequestBodyMatcher,
      options: Options
    ): Interceptor = js.native
    def intercept(uri: RegExp, method: String): Interceptor = js.native
    def intercept(uri: RegExp, method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: RegExp, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(uri: RegExp, method: String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
    
    def isDone(): Boolean = js.native
    
    def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
    
    def merge(uri: String): Interceptor = js.native
    def merge(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def merge(uri: RegExp): Interceptor = js.native
    def merge(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("merge")
    var merge_Original: InterceptFunction = js.native
    
    def options(uri: String): Interceptor = js.native
    def options(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def options(uri: RegExp): Interceptor = js.native
    def options(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("options")
    var options_Original: InterceptFunction = js.native
    
    def patch(uri: String): Interceptor = js.native
    def patch(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def patch(uri: RegExp): Interceptor = js.native
    def patch(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("patch")
    var patch_Original: InterceptFunction = js.native
    
    def pendingMocks(): js.Array[String] = js.native
    
    def persist(): this.type = js.native
    def persist(flag: Boolean): this.type = js.native
    
    def post(uri: String): Interceptor = js.native
    def post(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def post(uri: RegExp): Interceptor = js.native
    def post(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("post")
    var post_Original: InterceptFunction = js.native
    
    def put(uri: String): Interceptor = js.native
    def put(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def put(uri: RegExp): Interceptor = js.native
    def put(uri: RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(uri: RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("put")
    var put_Original: InterceptFunction = js.native
    
    def replyContentLength(): this.type = js.native
    
    def replyDate(): this.type = js.native
    def replyDate(d: Date): this.type = js.native
  }
  
  type StatusCode = Double
  
  trait _DataMatcher extends StObject
  
  trait _RequestBodyMatcher extends StObject
}
