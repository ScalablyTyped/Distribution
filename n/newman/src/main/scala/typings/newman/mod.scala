package typings.newman

import typings.newman.anon.Assertions
import typings.newman.anon.Http
import typings.newman.anon.Key
import typings.newman.anon.Ref
import typings.newman.newmanStrings.auto
import typings.newman.newmanStrings.failure
import typings.newman.newmanStrings.folder
import typings.newman.newmanStrings.off
import typings.newman.newmanStrings.on
import typings.node.eventsMod.EventEmitter
import typings.postmanCollection.mod.Collection
import typings.postmanCollection.mod.CollectionDefinition
import typings.postmanCollection.mod.VariableScope
import typings.postmanCollection.mod.VariableScopeDefinition
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("newman", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  inline def run(options: NewmanRunOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  inline def run(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]
  ): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  trait ConsoleEvent extends StObject {
    
    var cursor: Cursor
    
    var level: String
    
    var messages: js.Array[Any]
  }
  object ConsoleEvent {
    
    inline def apply(cursor: Cursor, level: String, messages: js.Array[Any]): ConsoleEvent = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleEvent]
    }
    
    extension [Self <: ConsoleEvent](x: Self) {
      
      inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: Any*): Self = StObject.set(x, "messages", js.Array(value*))
    }
  }
  
  trait Cursor extends StObject {
    
    /** Indicates if this cursor position is at the beginning of the run. */
    var bof: Boolean
    
    /** Indicates if this cursor position is going to change to the next cycle. */
    var cr: Boolean
    
    /** Total number of iterations that will be repeated on the length. */
    var cycles: Double
    
    /** The run is empty and there is nothing to execute. */
    var empty: Boolean
    
    /** Indicates if this cursor position is at the end of the run. */
    var eof: Boolean
    
    /** A unique identifier added during the Item execution. */
    var httpRequestId: js.UndefOr[String] = js.undefined
    
    /** The current cycle in the total iteration count. */
    var iteration: Double
    
    /** Total number of items in the collection run. */
    var length: Double
    
    /** Current index of the item being processed from within the total number of items. */
    var position: Double
    
    /** A common item identifier in an execution cycle. */
    var ref: String
    
    /** A unique identifier added during the Script execution. */
    var scriptId: js.UndefOr[String] = js.undefined
  }
  object Cursor {
    
    inline def apply(
      bof: Boolean,
      cr: Boolean,
      cycles: Double,
      empty: Boolean,
      eof: Boolean,
      iteration: Double,
      length: Double,
      position: Double,
      ref: String
    ): Cursor = {
      val __obj = js.Dynamic.literal(bof = bof.asInstanceOf[js.Any], cr = cr.asInstanceOf[js.Any], cycles = cycles.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], eof = eof.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    extension [Self <: Cursor](x: Self) {
      
      inline def setBof(value: Boolean): Self = StObject.set(x, "bof", value.asInstanceOf[js.Any])
      
      inline def setCr(value: Boolean): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
      
      inline def setCycles(value: Double): Self = StObject.set(x, "cycles", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestId(value: String): Self = StObject.set(x, "httpRequestId", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestIdUndefined: Self = StObject.set(x, "httpRequestId", js.undefined)
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    }
  }
  
  trait NewmanRun extends StObject {
    
    var executions: js.Array[NewmanRunExecution]
    
    var failures: js.Array[NewmanRunFailure]
    
    var stats: Assertions
  }
  object NewmanRun {
    
    inline def apply(executions: js.Array[NewmanRunExecution], failures: js.Array[NewmanRunFailure], stats: Assertions): NewmanRun = {
      val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRun]
    }
    
    extension [Self <: NewmanRun](x: Self) {
      
      inline def setExecutions(value: js.Array[NewmanRunExecution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
      
      inline def setExecutionsVarargs(value: NewmanRunExecution*): Self = StObject.set(x, "executions", js.Array(value*))
      
      inline def setFailures(value: js.Array[NewmanRunFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresVarargs(value: NewmanRunFailure*): Self = StObject.set(x, "failures", js.Array(value*))
      
      inline def setStats(value: Assertions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewmanRunExecution extends StObject {
    
    var assertions: js.Array[NewmanRunExecutionAssertion]
    
    var item: NewmanRunExecutionItem
  }
  object NewmanRunExecution {
    
    inline def apply(assertions: js.Array[NewmanRunExecutionAssertion], item: NewmanRunExecutionItem): NewmanRunExecution = {
      val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecution]
    }
    
    extension [Self <: NewmanRunExecution](x: Self) {
      
      inline def setAssertions(value: js.Array[NewmanRunExecutionAssertion]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setAssertionsVarargs(value: NewmanRunExecutionAssertion*): Self = StObject.set(x, "assertions", js.Array(value*))
      
      inline def setItem(value: NewmanRunExecutionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewmanRunExecutionAssertion extends StObject {
    
    var assertion: String
    
    var error: NewmanRunExecutionAssertionError
  }
  object NewmanRunExecutionAssertion {
    
    inline def apply(assertion: String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
      val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionAssertion]
    }
    
    extension [Self <: NewmanRunExecutionAssertion](x: Self) {
      
      inline def setAssertion(value: String): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
      
      inline def setError(value: NewmanRunExecutionAssertionError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewmanRunExecutionAssertionError extends StObject {
    
    var index: Double
    
    var message: String
    
    var name: String
    
    var stack: String
    
    var test: String
  }
  object NewmanRunExecutionAssertionError {
    
    inline def apply(index: Double, message: String, name: String, stack: String, test: String): NewmanRunExecutionAssertionError = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionAssertionError]
    }
    
    extension [Self <: NewmanRunExecutionAssertionError](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewmanRunExecutionItem extends StObject {
    
    var name: String
  }
  object NewmanRunExecutionItem {
    
    inline def apply(name: String): NewmanRunExecutionItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionItem]
    }
    
    extension [Self <: NewmanRunExecutionItem](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewmanRunFailure extends StObject {
    
    /** The event where the failure occurred */
    var at: String
    
    var cursor: Ref | js.Object
    
    var error: NewmanRunExecutionAssertionError
    
    var parent: Any
    
    var source: js.UndefOr[NewmanRunExecutionItem] = js.undefined
  }
  object NewmanRunFailure {
    
    inline def apply(at: String, cursor: Ref | js.Object, error: NewmanRunExecutionAssertionError, parent: Any): NewmanRunFailure = {
      val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunFailure]
    }
    
    extension [Self <: NewmanRunFailure](x: Self) {
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Ref | js.Object): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setError(value: NewmanRunExecutionAssertionError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setSource(value: NewmanRunExecutionItem): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait NewmanRunOptions extends StObject {
    
    /**
      * Specify whether or not to stop a collection run on encountering the
      * first test script error.
      *
      * "folder" allows you to skip the entire collection run in case an invalid
      * folder was specified using the `folder` option or an error was
      * encountered in general.
      *
      * "failure" would gracefully stop a collection run after completing the
      * current test script.
      *
      * Default value: false
      */
    var bail: js.UndefOr[Boolean | (js.Array[folder | failure])] = js.undefined
    
    /** A JSON / Collection / String representing the collection. */
    var collection: Collection | CollectionDefinition | String
    
    /**
      * Enable or Disable colored CLI output.
      *
      * Default value: auto
      */
    var color: js.UndefOr[on | off | auto] = js.undefined
    
    /**
      * A tough-cookie cookieJar / file path for the current collection run.
      */
    var cookieJar: js.UndefOr[String | CookieJar] = js.undefined
    
    /**
      * Specify the time (in milliseconds) to wait for between subsequent
      * requests.
      *
      * Default value: 0
      */
    var delayRequest: js.UndefOr[Double] = js.undefined
    
    /** An override to environment variables.  See: https://github.com/postmanlabs/newman/blob/develop/lib/run/options.js */
    var envVar: js.UndefOr[Key | js.Array[Key]] = js.undefined
    
    /** An environment JSON / file path for the current collection run. */
    var environment: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.undefined
    
    /** The relative path to export the collection from the current run to */
    var exportCollection: js.UndefOr[String] = js.undefined
    
    /** The relative path to export the environment file from the current run to */
    var exportEnvironment: js.UndefOr[String] = js.undefined
    
    /** The relative path to export the globals file from the current run to  */
    var exportGlobals: js.UndefOr[String] = js.undefined
    
    /**
      * The name or ID of the folder (ItemGroup) in the collection which would
      * be run instead of the entire collection.
      */
    var folder: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** An override to global variables.  See: https://github.com/postmanlabs/newman/blob/develop/lib/run/options.js */
    var globalVar: js.UndefOr[Key | js.Array[Key]] = js.undefined
    
    /** A globals JSON / file path for the current collection run. */
    var globals: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.undefined
    
    /**
      * This specifies whether newman would automatically follow 3xx responses
      * from servers.
      *
      * Default value: false
      */
    var ignoreRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables SSL verification checks and allows self-signed SSL certificates.
      *
      * Default value: false
      */
    var insecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow reading files outside of working directory.
      */
    var insecureFileRead: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the number of iterations to run on the collection. This is
      * usually accompanied by providing a data file reference as
      * iterationData
      */
    var iterationCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Path to the JSON or CSV file or URL to be used as data source when
      * running multiple iterations on a collection.
      */
    var iterationData: js.UndefOr[Any] = js.undefined
    
    /**
      * Specify options for the reporter(s) declared in options.reporters.
      */
    var reporter: js.UndefOr[Any] = js.undefined
    
    /** Available reporters: cli, json, html and junit. */
    var reporters: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Custom HTTP(S) agents which will be used for making the requests. This allows for use of various proxies (e.g. socks)
      */
    var requestAgents: js.UndefOr[Http] = js.undefined
    
    /**
      * The path to the public client certificate file.
      */
    var sslClientCert: js.UndefOr[String] = js.undefined
    
    /**
      * The path to the client certificate configuration list file. This option
      * takes precedence over sslClientCert, sslClientKey and
      * sslClientPassphrase. When there is no match in this configuration list,
      * sslClientCert is used as fallback.
      */
    var sslClientCertList: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The path to the private client key file.
      */
    var sslClientKey: js.UndefOr[String] = js.undefined
    
    /**
      * The secret client key passphrase.
      */
    var sslClientPassphrase: js.UndefOr[String] = js.undefined
    
    /**
      * The path to the file, that holds one or more trusted CA certificates in
      * PEM format.
      */
    var sslExtraCaCerts: js.UndefOr[String] = js.undefined
    
    /**
      * If present, allows overriding the default exit code from the current
      * collection run, useful for bypassing collection result failures.
      *
      * Default value: false
      */
    var suppressExitCode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the time (in milliseconds) to wait for the entire collection run
      * to complete execution.
      *
      * Default value: Infinity
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the time (in milliseconds) to wait for requests to return a
      * response.
      *
      * Default value: Infinity
      */
    var timeoutRequest: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the time (in milliseconds) to wait for scripts to return a
      * response.
      *
      * Default value: Infinity
      */
    var timeoutScript: js.UndefOr[Double] = js.undefined
    
    /**
      * The path of the directory to be used as working directory.
      */
    var workingDir: js.UndefOr[String] = js.undefined
  }
  object NewmanRunOptions {
    
    inline def apply(collection: Collection | CollectionDefinition | String): NewmanRunOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunOptions]
    }
    
    extension [Self <: NewmanRunOptions](x: Self) {
      
      inline def setBail(value: Boolean | (js.Array[folder | failure])): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setBailVarargs(value: (folder | failure)*): Self = StObject.set(x, "bail", js.Array(value*))
      
      inline def setCollection(value: Collection | CollectionDefinition | String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setColor(value: on | off | auto): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCookieJar(value: String | CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      inline def setDelayRequest(value: Double): Self = StObject.set(x, "delayRequest", value.asInstanceOf[js.Any])
      
      inline def setDelayRequestUndefined: Self = StObject.set(x, "delayRequest", js.undefined)
      
      inline def setEnvVar(value: Key | js.Array[Key]): Self = StObject.set(x, "envVar", value.asInstanceOf[js.Any])
      
      inline def setEnvVarUndefined: Self = StObject.set(x, "envVar", js.undefined)
      
      inline def setEnvVarVarargs(value: Key*): Self = StObject.set(x, "envVar", js.Array(value*))
      
      inline def setEnvironment(value: VariableScope | VariableScopeDefinition | String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExportCollection(value: String): Self = StObject.set(x, "exportCollection", value.asInstanceOf[js.Any])
      
      inline def setExportCollectionUndefined: Self = StObject.set(x, "exportCollection", js.undefined)
      
      inline def setExportEnvironment(value: String): Self = StObject.set(x, "exportEnvironment", value.asInstanceOf[js.Any])
      
      inline def setExportEnvironmentUndefined: Self = StObject.set(x, "exportEnvironment", js.undefined)
      
      inline def setExportGlobals(value: String): Self = StObject.set(x, "exportGlobals", value.asInstanceOf[js.Any])
      
      inline def setExportGlobalsUndefined: Self = StObject.set(x, "exportGlobals", js.undefined)
      
      inline def setFolder(value: String | js.Array[String]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setFolderVarargs(value: String*): Self = StObject.set(x, "folder", js.Array(value*))
      
      inline def setGlobalVar(value: Key | js.Array[Key]): Self = StObject.set(x, "globalVar", value.asInstanceOf[js.Any])
      
      inline def setGlobalVarUndefined: Self = StObject.set(x, "globalVar", js.undefined)
      
      inline def setGlobalVarVarargs(value: Key*): Self = StObject.set(x, "globalVar", js.Array(value*))
      
      inline def setGlobals(value: VariableScope | VariableScopeDefinition | String): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setIgnoreRedirects(value: Boolean): Self = StObject.set(x, "ignoreRedirects", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRedirectsUndefined: Self = StObject.set(x, "ignoreRedirects", js.undefined)
      
      inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setInsecureFileRead(value: Boolean): Self = StObject.set(x, "insecureFileRead", value.asInstanceOf[js.Any])
      
      inline def setInsecureFileReadUndefined: Self = StObject.set(x, "insecureFileRead", js.undefined)
      
      inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      inline def setIterationData(value: Any): Self = StObject.set(x, "iterationData", value.asInstanceOf[js.Any])
      
      inline def setIterationDataUndefined: Self = StObject.set(x, "iterationData", js.undefined)
      
      inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setReporters(value: String | js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRequestAgents(value: Http): Self = StObject.set(x, "requestAgents", value.asInstanceOf[js.Any])
      
      inline def setRequestAgentsUndefined: Self = StObject.set(x, "requestAgents", js.undefined)
      
      inline def setSslClientCert(value: String): Self = StObject.set(x, "sslClientCert", value.asInstanceOf[js.Any])
      
      inline def setSslClientCertList(value: String | js.Array[String]): Self = StObject.set(x, "sslClientCertList", value.asInstanceOf[js.Any])
      
      inline def setSslClientCertListUndefined: Self = StObject.set(x, "sslClientCertList", js.undefined)
      
      inline def setSslClientCertListVarargs(value: String*): Self = StObject.set(x, "sslClientCertList", js.Array(value*))
      
      inline def setSslClientCertUndefined: Self = StObject.set(x, "sslClientCert", js.undefined)
      
      inline def setSslClientKey(value: String): Self = StObject.set(x, "sslClientKey", value.asInstanceOf[js.Any])
      
      inline def setSslClientKeyUndefined: Self = StObject.set(x, "sslClientKey", js.undefined)
      
      inline def setSslClientPassphrase(value: String): Self = StObject.set(x, "sslClientPassphrase", value.asInstanceOf[js.Any])
      
      inline def setSslClientPassphraseUndefined: Self = StObject.set(x, "sslClientPassphrase", js.undefined)
      
      inline def setSslExtraCaCerts(value: String): Self = StObject.set(x, "sslExtraCaCerts", value.asInstanceOf[js.Any])
      
      inline def setSslExtraCaCertsUndefined: Self = StObject.set(x, "sslExtraCaCerts", js.undefined)
      
      inline def setSuppressExitCode(value: Boolean): Self = StObject.set(x, "suppressExitCode", value.asInstanceOf[js.Any])
      
      inline def setSuppressExitCodeUndefined: Self = StObject.set(x, "suppressExitCode", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutRequest(value: Double): Self = StObject.set(x, "timeoutRequest", value.asInstanceOf[js.Any])
      
      inline def setTimeoutRequestUndefined: Self = StObject.set(x, "timeoutRequest", js.undefined)
      
      inline def setTimeoutScript(value: Double): Self = StObject.set(x, "timeoutScript", value.asInstanceOf[js.Any])
      
      inline def setTimeoutScriptUndefined: Self = StObject.set(x, "timeoutScript", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
      
      inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
    }
  }
  
  trait NewmanRunStat extends StObject {
    
    var failed: js.UndefOr[Double] = js.undefined
    
    var pending: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object NewmanRunStat {
    
    inline def apply(): NewmanRunStat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewmanRunStat]
    }
    
    extension [Self <: NewmanRunStat](x: Self) {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait NewmanRunSummary extends StObject {
    
    var collection: Any
    
    var environment: Any
    
    var error: js.UndefOr[Any] = js.undefined
    
    var globals: Any
    
    var run: NewmanRun
  }
  object NewmanRunSummary {
    
    inline def apply(collection: Any, environment: Any, globals: Any, run: NewmanRun): NewmanRunSummary = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunSummary]
    }
    
    extension [Self <: NewmanRunSummary](x: Self) {
      
      inline def setCollection(value: Any): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: Any): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGlobals(value: Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setRun(value: NewmanRun): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
}
