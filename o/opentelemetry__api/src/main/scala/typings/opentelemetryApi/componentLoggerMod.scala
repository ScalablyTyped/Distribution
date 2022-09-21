package typings.opentelemetryApi

import typings.opentelemetryApi.diagTypesMod.ComponentLoggerOptions
import typings.opentelemetryApi.diagTypesMod.DiagLogFunction
import typings.opentelemetryApi.diagTypesMod.DiagLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentLoggerMod {
  
  @JSImport("@opentelemetry/api/build/src/diag/ComponentLogger", "DiagComponentLogger")
  @js.native
  open class DiagComponentLogger protected ()
    extends StObject
       with DiagLogger {
    def this(props: ComponentLoggerOptions) = this()
    
    /* private */ var _namespace: Any = js.native
    
    def debug(args: Any*): Unit = js.native
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
    
    def error(args: Any*): Unit = js.native
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    /* CompleteClass */
    override def error(message: String, args: Any*): Unit = js.native
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    /* CompleteClass */
    @JSName("error")
    var error_Original: DiagLogFunction = js.native
    
    def info(args: Any*): Unit = js.native
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
    
    def verbose(args: Any*): Unit = js.native
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
    
    def warn(args: Any*): Unit = js.native
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
}
