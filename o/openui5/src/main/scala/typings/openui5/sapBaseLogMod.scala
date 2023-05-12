package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseLogMod extends Shortcut {
  
  @JSImport("sap/base/Log", JSImport.Default)
  @js.native
  val default: Log = js.native
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("sap/base/Log", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Level & String] = js.native
    
    /**
      * Trace level to log everything.
      */
    @js.native
    sealed trait ALL
      extends StObject
         with Level
    /* "undefined" */ val ALL: typings.openui5.sapBaseLogMod.Level.ALL & String = js.native
    
    /**
      * Debug level. Use this for logging information necessary for debugging
      */
    @js.native
    sealed trait DEBUG
      extends StObject
         with Level
    /* "undefined" */ val DEBUG: typings.openui5.sapBaseLogMod.Level.DEBUG & String = js.native
    
    /**
      * Error level. Use this for logging of erroneous but still recoverable situations
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with Level
    /* "undefined" */ val ERROR: typings.openui5.sapBaseLogMod.Level.ERROR & String = js.native
    
    /**
      * Fatal level. Use this for logging unrecoverable situations
      */
    @js.native
    sealed trait FATAL
      extends StObject
         with Level
    /* "undefined" */ val FATAL: typings.openui5.sapBaseLogMod.Level.FATAL & String = js.native
    
    /**
      * Info level. Use this for logging information of purely informative nature
      */
    @js.native
    sealed trait INFO
      extends StObject
         with Level
    /* "undefined" */ val INFO: typings.openui5.sapBaseLogMod.Level.INFO & String = js.native
    
    /**
      * Do not log anything
      */
    @js.native
    sealed trait NONE
      extends StObject
         with Level
    /* "undefined" */ val NONE: typings.openui5.sapBaseLogMod.Level.NONE & String = js.native
    
    /**
      * Trace level. Use this for tracing the program flow.
      */
    @js.native
    sealed trait TRACE
      extends StObject
         with Level
    /* "undefined" */ val TRACE: typings.openui5.sapBaseLogMod.Level.TRACE & String = js.native
    
    /**
      * Warning level. Use this for logging unwanted but foreseen situations
      */
    @js.native
    sealed trait WARNING
      extends StObject
         with Level
    /* "undefined" */ val WARNING: typings.openui5.sapBaseLogMod.Level.WARNING & String = js.native
  }
  
  /**
    * @SINCE 1.58
    *
    * A Logging API for JavaScript.
    *
    * Provides methods to manage a client-side log and to create entries in it. Each of the logging methods
    * {@link module:sap/base/Log.debug}, {@link module:sap/base/Log.info}, {@link module:sap/base/Log.warning},
    * {@link module:sap/base/Log.error} and {@link module:sap/base/Log.fatal} creates and records a log entry,
    * containing a timestamp, a log level, a message with details and a component info. The log level will
    * be one of {@link module:sap/base/Log.Level} and equals the name of the concrete logging method.
    *
    * By using the {@link module:sap/base/Log.setLevel} method, consumers can determine the least important
    * log level which should be recorded. Less important entries will be filtered out. (Note that higher numeric
    * values represent less important levels). The initially set level depends on the mode that UI5 is running
    * in. When the optimized sources are executed, the default level will be {@link module:sap/base/Log.Level.ERROR}.
    * For normal (debug sources), the default level is {@link module:sap/base/Log.Level.DEBUG}.
    *
    * All logging methods allow to specify a **component**. These components are simple strings and don't have
    * a special meaning to the UI5 framework. However they can be used to semantically group log entries that
    * belong to the same software component (or feature). There are two APIs that help to manage logging for
    * such a component. With {@link module:sap/base/Log.getLogger}, one can retrieve a logger that automatically
    * adds the given `sComponent` as component parameter to each log entry, if no other component is specified.
    * Typically, JavaScript code will retrieve such a logger once during startup and reuse it for the rest
    * of its lifecycle. Second, the {@link module:sap/base/Log.setLevel}(iLevel, sComponent) method allows
    * to set the log level for a specific component only. This allows a more fine grained control about the
    * created logging entries. {@link module:sap/base/Log.getLevel} allows to retrieve the currently effective
    * log level for a given component.
    *
    * {@link module:sap/base/Log.getLogEntries} returns an array of the currently collected log entries.
    *
    * Furthermore, a listener can be registered to the log. It will be notified whenever a new entry is added
    * to the log. The listener can be used for displaying log entries in a separate page area, or for sending
    * it to some external target (server).
    */
  @js.native
  trait Log extends StObject {
    
    /**
      * Allows to add a new LogListener that will be notified for new log entries.
      *
      * The given object must provide method `onLogEntry` and can also be informed about `onDetachFromLog`, `onAttachToLog`
      * and `onDiscardLogEntries`.
      */
    def addLogListener(/**
      * The new listener object that should be informed
      */
    oListener: js.Object): Unit = js.native
    
    /**
      * Creates a new debug-level entry in the log with the given message, details and calling component.
      */
    def debug(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def debug(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    
    /**
      * Creates a new error-level entry in the log with the given message, details and calling component.
      */
    def error(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def error(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    
    /**
      * Creates a new fatal-level entry in the log with the given message, details and calling component.
      */
    def fatal(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def fatal(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    
    /**
      * Returns the log level currently effective for the given component. If no component is given or when no
      * level has been configured for a given component, the log level for the default component of this logger
      * is returned.
      *
      * @returns The log level for the given component or the default log level
      */
    def getLevel(): Level = js.native
    def getLevel(/**
      * Name of the component to retrieve the log level for
      */
    sComponent: String): Level = js.native
    
    /**
      * Returns the logged entries recorded so far as an array.
      *
      * Log entries are plain JavaScript objects with the following properties
      * 	timestamp {number} point in time when the entry was created level {module:sap/base/Log.Level} LogLevel
      * level of the entry message {string} message text of the entry  The default amount of stored
      * log entries is limited to 3000 entries.
      *
      * @returns an array containing the recorded log entries
      */
    def getLogEntries(): js.Array[js.Object] = js.native
    
    /**
      * Returns a dedicated logger for a component
      *
      * The logger comes with the same API as the `sap/base/Log` module:
      * 	`#fatal` - see: {@link module:sap/base/Log.fatal} `#error` - see: {@link module:sap/base/Log.error}
      * `#warning` - see: {@link module:sap/base/Log.warning} `#info` - see: {@link module:sap/base/Log.info}
      * `#debug` - see: {@link module:sap/base/Log.debug} `#trace` - see: {@link module:sap/base/Log.trace}
      * `#setLevel` - see: {@link module:sap/base/Log.setLevel} `#getLevel` - see: {@link module:sap/base/Log.getLevel}
      * `#isLoggable` - see: {@link module:sap/base/Log.isLoggable}
      *
      * @returns A logger with a specified component
      */
    def getLogger(/**
      * Name of the component which should be logged
      */
    sComponent: String): js.Object = js.native
    def getLogger(
      /**
      * Name of the component which should be logged
      */
    sComponent: String,
      /**
      * The default log level
      */
    iDefaultLogLevel: Level
    ): js.Object = js.native
    
    /**
      * Creates a new info-level entry in the log with the given message, details and calling component.
      */
    def info(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def info(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    
    /**
      * Checks whether logging is enabled for the given log level, depending on the currently effective log level
      * for the given component.
      *
      * If no component is given, the default component of this logger will be taken into account.
      *
      * @returns Whether logging is enabled or not
      */
    def isLoggable(): Boolean = js.native
    def isLoggable(
      /**
      * The log level in question
      */
    iLevel: Unit,
      /**
      * Name of the component to check the log level for
      */
    sComponent: String
    ): Boolean = js.native
    def isLoggable(/**
      * The log level in question
      */
    iLevel: Level): Boolean = js.native
    def isLoggable(
      /**
      * The log level in question
      */
    iLevel: Level,
      /**
      * Name of the component to check the log level for
      */
    sComponent: String
    ): Boolean = js.native
    
    /**
      * Allows to remove a registered LogListener.
      */
    def removeLogListener(/**
      * The new listener object that should be removed
      */
    oListener: js.Object): Unit = js.native
    
    /**
      * Defines the maximum `sap/base/Log.Level` of log entries that will be recorded. Log entries with a higher
      * (less important) log level will be omitted from the log. When a component name is given, the log level
      * will be configured for that component only, otherwise the log level for the default component of this
      * logger is set. For the global logger, the global default level is set.
      *
      * **Note**: Setting a global default log level has no impact on already defined component log levels. They
      * always override the global default log level.
      */
    def setLevel(/**
      * The new log level
      */
    iLogLevel: Level): Unit = js.native
    def setLevel(
      /**
      * The new log level
      */
    iLogLevel: Level,
      /**
      * The log component to set the log level for
      */
    sComponent: String
    ): Unit = js.native
    
    /**
      * Creates a new trace-level entry in the log with the given message, details and calling component.
      */
    def trace(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def trace(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged with
      * the stack.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    
    /**
      * Creates a new warning-level entry in the log with the given message, details and calling component.
      */
    def warning(/**
      * Message text to display
      */
    sMessage: String): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: String,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: js.Error,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: String,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
    def warning(
      /**
      * Message text to display
      */
    sMessage: String,
      /**
      * Optional details about the message, might be omitted. Can be an Error object which will be logged together
      * with its stacktrace.
      */
    vDetails: Unit,
      /**
      * Name of the component that produced the log entry
      */
    sComponent: Unit,
      /**
      * Callback that returns an additional support object to be logged in support mode. This function is only
      * called if support info mode is turned on with `logSupportInfo(true)`. To avoid negative effects regarding
      * execution times and memory consumption, the returned object should be a simple immutable JSON object
      * with mostly static and stable content.
      */
    fnSupportInfo: js.Function
    ): Unit = js.native
  }
  
  type _To = Log
  
  /* This means you don't have to write `default`, but can instead just say `sapBaseLogMod.foo` */
  override def _to: Log = default
}
