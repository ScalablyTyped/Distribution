package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcDiagTypesMod.ComponentLoggerOptions
import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogFunction
import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel
import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiDiagMod {
  
  @JSImport("@opentelemetry/api/build/src/api/diag", "DiagAPI")
  @js.native
  /**
    * Private internal constructor
    * @private
    */
  /* private */ open class DiagAPI ()
    extends StObject
       with DiagLogger {
    
    /**
      *
      */
    def createComponentLogger(options: ComponentLoggerOptions): DiagLogger = js.native
    
    /**
      * Log a general debug message that can be useful for identifying a failure.
      * Information logged at this level may include diagnostic details that would
      * help identify a failure scenario.
      * For example: Logging the order of execution of async operations.
      */
    /* CompleteClass */
    override def debug(message: String, args: Any*): Unit = js.native
    /**
      * Log a general debug message that can be useful for identifying a failure.
      * Information logged at this level may include diagnostic details that would
      * help identify a failure scenario.
      * For example: Logging the order of execution of async operations.
      */
    /* CompleteClass */
    @JSName("debug")
    var debug_Original: DiagLogFunction = js.native
    
    /**
      * Unregister the global logger and return to Noop
      */
    def disable(): Unit = js.native
    
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    /* CompleteClass */
    override def error(message: String, args: Any*): Unit = js.native
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    /* CompleteClass */
    @JSName("error")
    var error_Original: DiagLogFunction = js.native
    
    /**
      * Log a general informational message, this should not affect functionality.
      * This is also the default logging level so this should NOT be used for logging
      * debugging level information.
      */
    /* CompleteClass */
    override def info(message: String, args: Any*): Unit = js.native
    /**
      * Log a general informational message, this should not affect functionality.
      * This is also the default logging level so this should NOT be used for logging
      * debugging level information.
      */
    /* CompleteClass */
    @JSName("info")
    var info_Original: DiagLogFunction = js.native
    
    /**
      * Set the global DiagLogger and DiagLogLevel.
      * If a global diag logger is already set, this will override it.
      *
      * @param logger - [Optional] The DiagLogger instance to set as the default logger.
      * @param logLevel - [Optional] The DiagLogLevel used to filter logs sent to the logger. If not provided it will default to INFO.
      * @returns true if the logger was successfully registered, else false
      */
    def setLogger(logger: DiagLogger): Boolean = js.native
    def setLogger(logger: DiagLogger, logLevel: DiagLogLevel): Boolean = js.native
    
    /**
      * Log a detailed (verbose) trace level logging that can be used to identify failures
      * where debug level logging would be insufficient, this level of tracing can include
      * input and output parameters and as such may include PII information passing through
      * the API. As such it is recommended that this level of tracing should not be enabled
      * in a production environment.
      */
    /* CompleteClass */
    override def verbose(message: String, args: Any*): Unit = js.native
    /**
      * Log a detailed (verbose) trace level logging that can be used to identify failures
      * where debug level logging would be insufficient, this level of tracing can include
      * input and output parameters and as such may include PII information passing through
      * the API. As such it is recommended that this level of tracing should not be enabled
      * in a production environment.
      */
    /* CompleteClass */
    @JSName("verbose")
    var verbose_Original: DiagLogFunction = js.native
    
    /**
      * Log a warning scenario to inform the developer of an issues that should be investigated.
      * The requested operation may or may not have succeeded or completed.
      */
    /* CompleteClass */
    override def warn(message: String, args: Any*): Unit = js.native
    /**
      * Log a warning scenario to inform the developer of an issues that should be investigated.
      * The requested operation may or may not have succeeded or completed.
      */
    /* CompleteClass */
    @JSName("warn")
    var warn_Original: DiagLogFunction = js.native
  }
  /* static members */
  object DiagAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/diag", "DiagAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/diag", "DiagAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the DiagAPI API */
    inline def instance(): DiagAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[DiagAPI]
  }
}
