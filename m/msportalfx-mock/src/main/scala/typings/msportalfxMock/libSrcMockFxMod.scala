package typings.msportalfxMock

import typings.express.mod.Request_
import typings.express.mod.Router
import typings.msportalfxMock.libSrcMockFxLoggerMod.LoggerType
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Context
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Finalization
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Mode
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Stage
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-original-host`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-run-id`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-source`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-target`
import typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-test-id`
import typings.msportalfxMock.msportalfxMockStrings.debug
import typings.msportalfxMock.msportalfxMockStrings.error
import typings.msportalfxMock.msportalfxMockStrings.finalizeStage
import typings.msportalfxMock.msportalfxMockStrings.finalizeTest
import typings.msportalfxMock.msportalfxMockStrings.info
import typings.msportalfxMock.msportalfxMockStrings.log
import typings.msportalfxMock.msportalfxMockStrings.record
import typings.msportalfxMock.msportalfxMockStrings.registerStage
import typings.msportalfxMock.msportalfxMockStrings.registerTest
import typings.msportalfxMock.msportalfxMockStrings.replay
import typings.msportalfxMock.msportalfxMockStrings.telemetry
import typings.msportalfxMock.msportalfxMockStrings.warn
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx")
  @js.native
  /* private */ open class MockFx () extends StObject {
    
    /* private */ var app: Any = js.native
    
    /* private */ var certificate: Any = js.native
    
    /**
      * Finalizes a stage within a test. During replay, removes any subsequent requests that were tagged with this stage
      *
      * Also accessible over HTTPS POST at `MockFx.getEndpoints(mockFxPort, runId, testId).finalizeStage` end-point
      * by sending the stage context object as the body
      *
      * @param {MockFx.Stage} stageContext
      * @returns {Promise<void>}
      * @memberof MockFx
      */
    def finalizeStage(stageContext: Stage): js.Promise[Unit] = js.native
    
    /**
      * Calls `storeRequests` on each target the test has registered, then removes the references to the instance
      * to free memory.
      *
      * Also accessible over HTTPS POST at `MockFx.getEndpoints(mockFxPort, runId, testId).finalizeTest` end-point
      * by sending the finalization object as the body
      *
      * @param {MockFx.Finalization} finalization
      * @returns {Promise<MockFx.Context>}
      * @memberof MockFx
      */
    def finalizeTest(finalization: Finalization): js.Promise[Context] = js.native
    
    /**
      * Returns the mock plug-in client code to run in the browser
      *
      * Also accessible over HTTPS GET at `MockFx.getEndpoints(mockFxPort, runId, testId).plugin` end-point
      *
      * @param {string} runId
      * @param {string} testId
      * @returns {string}
      * @memberof MockFx
      */
    def getPluginCode(runId: String, testId: String): String = js.native
    
    /* private */ var getTestInstance: Any = js.native
    
    /* private */ var handleProxyResponse: Any = js.native
    
    /* private */ var normalizeHost: Any = js.native
    
    /* private */ var port: Any = js.native
    
    /* private */ var proxies: Any = js.native
    
    /* private */ var registerBaseRoutes: Any = js.native
    
    /* private */ var registerErrorHandler: Any = js.native
    
    /* private */ var registerFinalizeRoute: Any = js.native
    
    /* private */ var registerFinalizeStageRoute: Any = js.native
    
    /* private */ var registerPluginRoute: Any = js.native
    
    /* private */ var registerRegisterRoute: Any = js.native
    
    /* private */ var registerRegisterStageRoute: Any = js.native
    
    /* private */ var registerRequestHandler: Any = js.native
    
    /**
      * Registers a stage within a test. All requests occurring for a test will be tagged with the current stage.
      * Used if parts of a test (a stage) are conditional or can be skipped.
      *
      * Also accessible over HTTPS POST at `MockFx.getEndpoints(mockFxPort, runId, testId).registerStage` end-point
      * by sending the stage context object as the body
      *
      * @param {MockFx.Stage} stageContext
      * @returns {Promise<void>}
      * @memberof MockFx
      */
    def registerStage(stageContext: Stage): js.Promise[Unit] = js.native
    
    /**
      * Registers a new test, creates instances for each target referenced, and loads their test data if in
      * replay mode.
      *
      * Also accessible over HTTPS POST at `MockFx.getEndpoints(mockFxPort, runId, testId).registerTest` end-point
      * by sending the context object as the body
      *
      * @param {MockFx.Context} context
      * @returns {Promise<MockFx.Context>}
      * @memberof MockFx
      */
    def registerTest(context: Context): js.Promise[Context] = js.native
    
    /* private */ var server: Any = js.native
    
    /**
      * Starts the mock server
      *
      * @returns {Promise<void>}
      * @memberof MockFx
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stops the mock server
      *
      * @returns {Promise<void>}
      * @memberof MockFx
      */
    def stop(): js.Promise[Unit] = js.native
    
    /* private */ var targetDefinitions: Any = js.native
    
    /* private */ var tests: Any = js.native
  }
  /* static members */
  object MockFx {
    
    @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the framework
      *
      * @static
      * @param {MockFx.Configuration} config
      * @returns {Promise<MockFx>}
      * @memberof MockFx
      */
    inline def create(config: Configuration): js.Promise[MockFx] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MockFx]]
    
    /**
      * Returns an object with endpoints for the mock server for registering, finalizing, and obtaining the plug-in
      * code for a test.
      *
      * If using the plug-in endpoint with Portal's `patch` parameter, run the endpoint value through `encodeURI`
      *
      * @param {string} runId
      * @param {string} testId
      * @returns {MockFx.Endpoints}
      * @memberof MockFx
      */
    inline def getEndpoints(port: Double, runId: String, testId: String): Endpoints = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoints")(port.asInstanceOf[js.Any], runId.asInstanceOf[js.Any], testId.asInstanceOf[js.Any])).asInstanceOf[Endpoints]
    
    @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx.logToConsole")
    @js.native
    def logToConsole: Any = js.native
    inline def logToConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(x.asInstanceOf[js.Any])
    
    /**
      * Log event emitter. May subscribe to "log", "telemetry" and "error" events.
      *
      * @static
      * @type {LoggerType}
      * @memberof MockFx
      */
    @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx.logger")
    @js.native
    def logger: LoggerType = js.native
    inline def logger_=(x: LoggerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx.loggingToConsole")
    @js.native
    def loggingToConsole: Any = js.native
    inline def loggingToConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loggingToConsole")(x.asInstanceOf[js.Any])
    
    /**
      * The current version of the framework. It's a good idea to use this to bin your stored mock data
      * to allow for upgrading the framework when breaking changes are introduced in order to not break
      * test runs using previous version.
      *
      * @static
      * @memberof MockFx
      */
    @JSImport("msportalfx-mock/lib/src/MockFx", "MockFx.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    trait Configuration extends StObject {
      
      /**
        * Send MockFx logs to the console in addition to the log event emitter.
        *
        * Setting this to true will affect the MockFx class and send logs to the console for all
        * created MockFx instances.
        *
        * @default false
        */
      var logToConsole: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The port for the server to listen on
        */
      var port: Double
      
      /**
        * A list of target services to be mocked. Any target which a test wants to mock must be defined here.
        */
      var targets: js.Array[TargetDefinition]
    }
    object Configuration {
      
      inline def apply(port: Double, targets: js.Array[TargetDefinition]): Configuration = {
        val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
        __obj.asInstanceOf[Configuration]
      }
      
      extension [Self <: Configuration](x: Self) {
        
        inline def setLogToConsole(value: Boolean): Self = StObject.set(x, "logToConsole", value.asInstanceOf[js.Any])
        
        inline def setLogToConsoleUndefined: Self = StObject.set(x, "logToConsole", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setTargets(value: js.Array[TargetDefinition]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        inline def setTargetsVarargs(value: TargetDefinition*): Self = StObject.set(x, "targets", js.Array(value*))
      }
    }
    
    /**
      * @swagger
      * definitions:
      *   Context:
      *     required:
      *       - mode
      *       - runId
      *       - testId
      *       - targets
      *     properties:
      *       mode:
      *         description: "The mock mode of operation"
      *         type: string
      *         enum:
      *         - "replay"
      *         - "record"
      *       runId:
      *         description: "The run ID for the test"
      *         type: string
      *       testId:
      *         description: "The test ID for the test"
      *         type: string
      *       targets:
      *         description: "A list of target names to mock"
      *         type: "array"
      *         items:
      *           type: "string"
      *       metadata:
      *         description: "Any additional metadata to associate with the test."
      *         type: object
      *       proxyUnmatched:
      *         description: "Whether to send unmatched requests to the target during replay mode."
      *         type: boolean
      *         default: false
      */
    trait Context extends StObject {
      
      /**
        * Provide any additional information about the test that you require.
        */
      var metadata: js.UndefOr[Any] = js.undefined
      
      /**
        * Whether to record or replay for this test
        */
      var mode: Mode
      
      /**
        * Set this to true to send unmatched requests to the target while in replay mode, otherwise
        * an error response will be returned if a request cannot be matched
        *
        * Default: false
        */
      var proxyUnmatched: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A unique ID to group a set of running tests together
        */
      var runId: String
      
      /**
        * A list of target names to mock during this test run (e.g. ["ARM"]).
        *
        * Target must have been previously defined in the MockFx instance.
        */
      var targets: js.Array[String]
      
      /**
        * A unique ID for a single test instance within a run
        */
      var testId: String
    }
    object Context {
      
      inline def apply(mode: Mode, runId: String, targets: js.Array[String], testId: String): Context = {
        val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], runId = runId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      extension [Self <: Context](x: Self) {
        
        inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setProxyUnmatched(value: Boolean): Self = StObject.set(x, "proxyUnmatched", value.asInstanceOf[js.Any])
        
        inline def setProxyUnmatchedUndefined: Self = StObject.set(x, "proxyUnmatched", js.undefined)
        
        inline def setRunId(value: String): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
        
        inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
        
        inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Returned from `MockFx.getEndpoints(...)`. Use these end-points to register, load client
      * plug-in code for, and finalize your test runs
      */
    trait Endpoints extends StObject {
      
      /**
        * The stage finalization end-point
        */
      var finalizeStage: String
      
      /**
        * The test finalization end-point
        */
      var finalizeTest: String
      
      /**
        * The end-point for obtaining the client-side mock plug-in
        */
      var plugin: String
      
      /**
        * The stage registration end-point
        */
      var registerStage: String
      
      /**
        * The test registration end-point
        */
      var registerTest: String
    }
    object Endpoints {
      
      inline def apply(
        finalizeStage: String,
        finalizeTest: String,
        plugin: String,
        registerStage: String,
        registerTest: String
      ): Endpoints = {
        val __obj = js.Dynamic.literal(finalizeStage = finalizeStage.asInstanceOf[js.Any], finalizeTest = finalizeTest.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], registerStage = registerStage.asInstanceOf[js.Any], registerTest = registerTest.asInstanceOf[js.Any])
        __obj.asInstanceOf[Endpoints]
      }
      
      extension [Self <: Endpoints](x: Self) {
        
        inline def setFinalizeStage(value: String): Self = StObject.set(x, "finalizeStage", value.asInstanceOf[js.Any])
        
        inline def setFinalizeTest(value: String): Self = StObject.set(x, "finalizeTest", value.asInstanceOf[js.Any])
        
        inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        inline def setRegisterStage(value: String): Self = StObject.set(x, "registerStage", value.asInstanceOf[js.Any])
        
        inline def setRegisterTest(value: String): Self = StObject.set(x, "registerTest", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.msportalfxMock.msportalfxMockStrings.error
      - typings.msportalfxMock.msportalfxMockStrings.finalizeStage
      - typings.msportalfxMock.msportalfxMockStrings.finalizeTest
      - typings.msportalfxMock.msportalfxMockStrings.log
      - typings.msportalfxMock.msportalfxMockStrings.registerStage
      - typings.msportalfxMock.msportalfxMockStrings.registerTest
      - typings.msportalfxMock.msportalfxMockStrings.telemetry
    */
    trait Events extends StObject
    object Events {
      
      inline def Error: error = "error".asInstanceOf[error]
      
      inline def FinalizeStage: finalizeStage = "finalizeStage".asInstanceOf[finalizeStage]
      
      inline def FinalizeTest: finalizeTest = "finalizeTest".asInstanceOf[finalizeTest]
      
      inline def Log: log = "log".asInstanceOf[log]
      
      inline def RegisterStage: registerStage = "registerStage".asInstanceOf[registerStage]
      
      inline def RegisterTest: registerTest = "registerTest".asInstanceOf[registerTest]
      
      inline def Telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
    }
    
    /**
      * @swagger
      * definitions:
      *   Finalization:
      *     required:
      *       - runId
      *       - testId
      *     properties:
      *       runId:
      *         description: "The run ID for the test"
      *         type: string
      *       testId:
      *         description: "The test ID for the test"
      *         type: string
      *       shouldStore:
      *         description: "Whether to call storeRequests for the test."
      *         type: boolean
      *         default: true
      */
    trait Finalization extends StObject {
      
      /**
        * The runId for a registered test
        */
      var runId: String
      
      /**
        * Whether or not the storeRequests target definition method should be called for this test run
        * (i.e. finalizing a failed test without storing its mock data)
        *
        * Default: true
        */
      var shouldStore: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The testId for a registered test
        */
      var testId: String
    }
    object Finalization {
      
      inline def apply(runId: String, testId: String): Finalization = {
        val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Finalization]
      }
      
      extension [Self <: Finalization](x: Self) {
        
        inline def setRunId(value: String): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
        
        inline def setShouldStore(value: Boolean): Self = StObject.set(x, "shouldStore", value.asInstanceOf[js.Any])
        
        inline def setShouldStoreUndefined: Self = StObject.set(x, "shouldStore", js.undefined)
        
        inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-source`
      - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-original-host`
      - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-run-id`
      - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-target`
      - typings.msportalfxMock.msportalfxMockStrings.`x-mockfx-test-id`
    */
    trait Headers extends StObject
    object Headers {
      
      inline def ORIGINAL_HOST: `x-mockfx-original-host` = "x-mockfx-original-host".asInstanceOf[`x-mockfx-original-host`]
      
      inline def RUN_ID: `x-mockfx-run-id` = "x-mockfx-run-id".asInstanceOf[`x-mockfx-run-id`]
      
      inline def SOURCE: `x-mockfx-source` = "x-mockfx-source".asInstanceOf[`x-mockfx-source`]
      
      inline def TARGET: `x-mockfx-target` = "x-mockfx-target".asInstanceOf[`x-mockfx-target`]
      
      inline def TEST_ID: `x-mockfx-test-id` = "x-mockfx-test-id".asInstanceOf[`x-mockfx-test-id`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.msportalfxMock.msportalfxMockStrings.debug
      - typings.msportalfxMock.msportalfxMockStrings.info
      - typings.msportalfxMock.msportalfxMockStrings.warn
    */
    trait LogLevel extends StObject
    object LogLevel {
      
      inline def Debug: debug = "debug".asInstanceOf[debug]
      
      inline def Info: info = "info".asInstanceOf[info]
      
      inline def Warn: warn = "warn".asInstanceOf[warn]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.msportalfxMock.msportalfxMockStrings.record
      - typings.msportalfxMock.msportalfxMockStrings.replay
    */
    trait Mode extends StObject
    object Mode {
      
      inline def Record: record = "record".asInstanceOf[record]
      
      inline def Replay: replay = "replay".asInstanceOf[replay]
    }
    
    trait Request extends StObject {
      
      /**
        * Index of this request in the requests array
        */
      var index: js.UndefOr[Double] = js.undefined
      
      /**
        * Used by targets to store any additonal data about the request from the target definition's
        * `getRequestMetadata` method
        */
      var metadata: Record[String, Any]
      
      /**
        * The request's HTTP method
        */
      var method: String
      
      /**
        * The request body (if present)
        */
      var request: Any
      
      /**
        * The response from the target. Value is returned from the target definition's `parseResponse`
        * method
        */
      var response: Any
      
      /**
        * The HTTP response code
        */
      var responseCode: Double
      
      /**
        * Any headers set on the response.
        */
      var responseHeaders: Record[String, String]
      
      /**
        * The size of the response in bytes.
        */
      var responseSize: Double
      
      /**
        * The current stage of the running test
        */
      var stage: js.UndefOr[String] = js.undefined
      
      /**
        * The URL for the request
        */
      var url: String
    }
    object Request {
      
      inline def apply(
        metadata: Record[String, Any],
        method: String,
        request: Any,
        response: Any,
        responseCode: Double,
        responseHeaders: Record[String, String],
        responseSize: Double,
        url: String
      ): Request = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseSize = responseSize.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
        
        inline def setResponseHeaders(value: Record[String, String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
        
        inline def setResponseSize(value: Double): Self = StObject.set(x, "responseSize", value.asInstanceOf[js.Any])
        
        inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
        
        inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @swagger
      * definitions:
      *   Stage:
      *     required:
      *       - runId
      *       - testId
      *       - stage
      *     properties:
      *       runId:
      *         description: "The run ID of the test"
      *         type: string
      *       testId:
      *         description: "The test ID of the test"
      *         type: string
      *       stage:
      *         description: "The stage name"
      *         type: string
      */
    trait Stage extends StObject {
      
      /**
        * The runId for a registered test
        */
      var runId: String
      
      /**
        * The name of the stage
        */
      var stage: String
      
      /**
        * The testId for a registered test
        */
      var testId: String
    }
    object Stage {
      
      inline def apply(runId: String, stage: String, testId: String): Stage = {
        val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Stage]
      }
      
      extension [Self <: Stage](x: Self) {
        
        inline def setRunId(value: String): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
        
        inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
        
        inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TargetDefinition extends StObject {
      
      /**
        * *Record mode*
        *
        * Called after an intercepted request has completed to provide any metadata to save as the MockRequest's
        * metadata property.
        *
        * @param {Express.Request} request - the request that was sent to the target
        * @param {IncomingMessage} response - the response from the target
        * @returns {object} the metadata object to set on the request
        */
      var getRequestMetadata: js.UndefOr[
            js.Function2[
              /* request */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              /* response */ IncomingMessage, 
              js.Promise[Record[String, Any]]
            ]
          ] = js.native
      
      /**
        * Used to provide a custom Express router to handle special target routing (e.g. ARM batch calls)
        */
      var getRouter: js.UndefOr[js.Function0[Router]] = js.native
      
      /**
        * An array of additional hostnames used to correlate requests to a target. If an incoming request's
        * host includes any of the strings in this array, it will be redirected to the framework.
        *
        * May include partial hostnames
        *
        * @example ["management.azure.com"] or [".blob.core.windows.net", ".file.core.windows.net"]
        */
      var hosts: js.Array[String] = js.native
      
      /**
        * *Replay mode*
        *
        * Called during test initialization in replay mode to obtain the array of mocked requests to replay
        *
        * @param {Context} context - the registered mock context object for the currently running test
        * @returns Promise<MockRequest[]>
        */
      def loadRequests(context: Context): js.Promise[js.Array[Request]] = js.native
      
      /**
        * *Replay mode*
        *
        * Called on incoming request to match it against the stored requests
        *
        * @param {Express.Request} request - the incoming request
        * @param {MockFx.Request[]} unmatchedRequests - the unmatched stored mock requests
        * @param {MockFx.Request[]} storedRequests - the stored mock requests
        * @returns {MockFx.Request | undefined} the matched request or nothing if no match was found
        */
      def matchRequest(
        request: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ],
        unmatchedRequests: js.Array[Request],
        storedRequests: js.Array[Request]
      ): js.Promise[js.UndefOr[Request]] = js.native
      def matchRequest(
        request: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ],
        unmatchedRequests: js.Array[Request],
        storedRequests: js.Array[Request],
        testContext: Context
      ): js.Promise[js.UndefOr[Request]] = js.native
      
      /**
        * A unique name to identity the targeted service
        *
        * @example ARM
        */
      var name: String = js.native
      
      /**
        * *Replay mode*
        *
        * Called before an incoming request has been matched to allow for modifying the stored requests during
        * test execution.
        *
        * Useful when needing to normalize requests which contain dynamic data that changes between runs.
        *
        * @param {Express.Request} request - the incoming request
        * @param {MockFx.Context} context - the registered mock context object for the currently running test
        * @param {MockFx.Request[]} storedRequests - the stored mock requests
        * @returns {MockFx.Request[]} a new array of mock requests which will replace the current stored requests
        */
      var onBeforeRequestMatch: js.UndefOr[
            js.Function3[
              /* request */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              /* context */ Context, 
              /* storedRequests */ js.Array[Request], 
              js.Promise[js.Array[Request]]
            ]
          ] = js.native
      
      /**
        * *Record mode*
        *
        * Called before an incoming request has been sent to allow for returning a predefined response during test execution.
        *
        * Useful when using static mocks.
        *
        * @param {Express.Request} request - the incoming request
        * @param {MockFx.Context} context - the registered mock context object for the currently running test
        * @returns {MockFx.Request} a new mock request which contains the response data for the associated request, or null to send the request to the server
        */
      var onBeforeRequestSent: js.UndefOr[
            js.Function2[
              /* request */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              /* context */ Context, 
              js.Promise[js.UndefOr[Request]]
            ]
          ] = js.native
      
      /**
        * Called during test initialization to allow the target to preload any data necessary using the test context.
        *
        * @param {Context} context - the registered mock context object for the currently running test
        */
      var onRegister: js.UndefOr[js.Function1[/* context */ Context, js.Promise[Unit]]] = js.native
      
      /**
        * *Record mode or with `Context.proxyUnmatched`*
        *
        * Called when processing target response. The value returned will be set as the response property
        * on the stored request.
        *
        * If not implemented, the response body will be converted to a UTF-8 encoded string.
        *
        * @param {IncomingMessage} response - the target response
        * @param {Buffer} responseBody - the body of the response
        * @returns {any}
        */
      var parseResponse: js.UndefOr[
            js.Function2[/* response */ IncomingMessage, /* responseBody */ Buffer, js.Promise[Any]]
          ] = js.native
      
      /**
        * *Record mode*
        *
        * Called once the running test is finalized
        *
        * @param {MockFx.Context} context - the registered mock context object for the currently running test
        * @param {MockFx.Request[]} requests - the recorded requests
        */
      def storeRequests(context: Context, requests: js.Array[Request]): js.Promise[Unit] = js.native
    }
    
    trait Telemetry extends StObject {
      
      /**
        * The test context for this request
        */
      var context: Context
      
      /**
        * The reason for the failure to match
        */
      var error: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the target matched the incoming request
        */
      var isMatch: Boolean
      
      /**
        * Index of the matched request in the requests array
        */
      var matchIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * Any additional metadata a target wishes to add to the telemetry
        */
      var metadata: js.UndefOr[Record[String, String]] = js.undefined
      
      /**
        * HTTP method for the request
        */
      var method: String
      
      /**
        * The request's original host
        */
      var originalHost: String
      
      /**
        * The size of the response received from the target
        */
      var responseSizeInBytes: Double
      
      /**
        * The source of the request (ARM client, Portal, etc.)
        */
      var source: String
      
      /**
        * The name of the matched target
        */
      var target: String
      
      /**
        * When the request was processed
        */
      var time: String
      
      /**
        * The URL of the request
        */
      var url: String
    }
    object Telemetry {
      
      inline def apply(
        context: Context,
        isMatch: Boolean,
        method: String,
        originalHost: String,
        responseSizeInBytes: Double,
        source: String,
        target: String,
        time: String,
        url: String
      ): Telemetry = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], originalHost = originalHost.asInstanceOf[js.Any], responseSizeInBytes = responseSizeInBytes.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Telemetry]
      }
      
      extension [Self <: Telemetry](x: Self) {
        
        inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
        
        inline def setMatchIndex(value: Double): Self = StObject.set(x, "matchIndex", value.asInstanceOf[js.Any])
        
        inline def setMatchIndexUndefined: Self = StObject.set(x, "matchIndex", js.undefined)
        
        inline def setMetadata(value: Record[String, String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOriginalHost(value: String): Self = StObject.set(x, "originalHost", value.asInstanceOf[js.Any])
        
        inline def setResponseSizeInBytes(value: Double): Self = StObject.set(x, "responseSizeInBytes", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Inlined parent std.Required<msportalfx-mock.msportalfx-mock/lib/src/MockFx.MockFx.Context> */
  trait FullContext extends StObject {
    
    var currentStage: String
    
    var metadata: Any
    
    var mode: Mode
    
    var proxyUnmatched: Boolean
    
    var runId: String
    
    var targets: js.Array[String]
    
    var testId: String
  }
  object FullContext {
    
    inline def apply(
      currentStage: String,
      metadata: Any,
      mode: Mode,
      proxyUnmatched: Boolean,
      runId: String,
      targets: js.Array[String],
      testId: String
    ): FullContext = {
      val __obj = js.Dynamic.literal(currentStage = currentStage.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], proxyUnmatched = proxyUnmatched.asInstanceOf[js.Any], runId = runId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullContext]
    }
    
    extension [Self <: FullContext](x: Self) {
      
      inline def setCurrentStage(value: String): Self = StObject.set(x, "currentStage", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setProxyUnmatched(value: Boolean): Self = StObject.set(x, "proxyUnmatched", value.asInstanceOf[js.Any])
      
      inline def setRunId(value: String): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    }
  }
}
