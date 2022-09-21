package typings.pino.mod.pino

import org.scalablytyped.runtime.StringDictionary
import typings.pino.anon.AsObject
import typings.pino.anon.LogMethod
import typings.pino.mod.MixinFn
import typings.pino.mod.MixinMergeStrategyFn
import typings.pino.mod.OnChildCallback
import typings.pino.mod.TimeFn
import typings.pino.mod.redactOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOptions extends StObject {
  
  /**
    * key-value object added as child logger to each log line. If set to null the base child logger is not added
    */
  var base: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Browser only, see http://getpino.io/#/docs/browser.
    */
  var browser: js.UndefOr[AsObject] = js.undefined
  
  /**
    * Use this option to define additional logging levels.
    * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
    */
  var customLevels: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  /**
    * Stringification limit at a specific nesting depth when logging circular object. Default: `5`.
    */
  var depthLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Stringification limit of properties/elements when logging a specific object/array with circular references. Default: `100`.
    */
  var edgeLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables logging. Default: `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The string key for the 'error' in the JSON object. Default: "err".
    */
  var errorKey: js.UndefOr[String] = js.undefined
  
  /**
    * An object containing functions for formatting the shape of the log lines.
    * These functions should return a JSONifiable object and should never throw.
    * These functions allow for full customization of the resulting log lines.
    * For example, they can be used to change the level key name or to enrich the default metadata.
    */
  var formatters: js.UndefOr[typings.pino.anon.Bindings] = js.undefined
  
  /**
    * An object mapping to hook functions. Hook functions allow for customizing internal logger operations.
    * Hook functions must be synchronous functions.
    */
  var hooks: js.UndefOr[LogMethod] = js.undefined
  
  /**
    * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
    * requires supplying a level value via `levelVal`. Default: 'info'.
    */
  var level: js.UndefOr[LevelWithSilent | String] = js.undefined
  
  /**
    * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
    */
  var levelVal: js.UndefOr[Double] = js.undefined
  
  /**
    * The string key for the 'message' in the JSON object. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.undefined
  
  /**
    * If provided, the `mixin` function is called each time one of the active logging methods
    * is called. The function must synchronously return an object. The properties of the
    * returned object will be added to the logged JSON.
    */
  var mixin: js.UndefOr[MixinFn] = js.undefined
  
  /**
    * If provided, the `mixinMergeStrategy` function is called each time one of the active
    * logging methods is called. The first parameter is the value `mergeObject` or an empty object,
    * the second parameter is the value resulting from `mixin()` or an empty object.
    * The function must synchronously return an object.
    */
  var mixinMergeStrategy: js.UndefOr[MixinMergeStrategyFn] = js.undefined
  
  /**
    * The name of the logger. Default: `undefined`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The string key to place any logged object under.
    */
  var nestedKey: js.UndefOr[String] = js.undefined
  
  /**
    * Optional child creation callback.
    */
  var onChild: js.UndefOr[OnChildCallback[typings.pino.mod.LoggerOptions]] = js.undefined
  
  /**
    * Allows to optionally define which prettifier module to use.
    */
  var prettifier: js.UndefOr[Any] = js.undefined
  
  /**
    * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
    * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
    */
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
  
  /**
    * As an array, the redact option specifies paths that should have their values redacted from any log output.
    *
    * Each path must be a string using a syntax which corresponds to JavaScript dot and bracket notation.
    *
    * If an object is supplied, three options can be specified:
    *
    *      paths (String[]): Required. An array of paths
    *      censor (String): Optional. A value to overwrite key which are to be redacted. Default: '[Redacted]'
    *      remove (Boolean): Optional. Instead of censoring the value, remove both the key and the value. Default: false
    */
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
  
  /**
    * Avoid error causes by circular references in the object tree. Default: `true`.
    */
  var safe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * an object containing functions for custom serialization of objects.
    * These functions should return an JSONifiable object and they should never throw. When logging an object,
    * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
    */
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
  
  /**
    * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
    * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
    * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
    * Caution: any sort of formatted time will significantly slow down Pino's performance.
    */
  var timestamp: js.UndefOr[TimeFn | Boolean] = js.undefined
  
  var transport: js.UndefOr[
    (TransportSingleOptions[Record[String, Any]]) | (TransportMultiOptions[Record[String, Any]]) | (TransportPipelineOptions[Record[String, Any]])
  ] = js.undefined
  
  /**
    * Use this option to only use defined `customLevels` and omit Pino's levels.
    * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
    * Warning: this option may not be supported by downstream transports.
    */
  var useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
}
object LoggerOptions {
  
  inline def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  extension [Self <: LoggerOptions](x: Self) {
    
    inline def setBase(value: StringDictionary[Any]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseNull: Self = StObject.set(x, "base", null)
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBrowser(value: AsObject): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setCustomLevels(value: StringDictionary[Double]): Self = StObject.set(x, "customLevels", value.asInstanceOf[js.Any])
    
    inline def setCustomLevelsUndefined: Self = StObject.set(x, "customLevels", js.undefined)
    
    inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
    
    inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
    
    inline def setEdgeLimit(value: Double): Self = StObject.set(x, "edgeLimit", value.asInstanceOf[js.Any])
    
    inline def setEdgeLimitUndefined: Self = StObject.set(x, "edgeLimit", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setErrorKey(value: String): Self = StObject.set(x, "errorKey", value.asInstanceOf[js.Any])
    
    inline def setErrorKeyUndefined: Self = StObject.set(x, "errorKey", js.undefined)
    
    inline def setFormatters(value: typings.pino.anon.Bindings): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    inline def setHooks(value: LogMethod): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setLevel(value: LevelWithSilent | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelVal(value: Double): Self = StObject.set(x, "levelVal", value.asInstanceOf[js.Any])
    
    inline def setLevelValUndefined: Self = StObject.set(x, "levelVal", js.undefined)
    
    inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    inline def setMixin(value: (/* mergeObject */ js.Object, /* level */ Double) => js.Object): Self = StObject.set(x, "mixin", js.Any.fromFunction2(value))
    
    inline def setMixinMergeStrategy(value: (/* mergeObject */ js.Object, /* mixinObject */ js.Object) => js.Object): Self = StObject.set(x, "mixinMergeStrategy", js.Any.fromFunction2(value))
    
    inline def setMixinMergeStrategyUndefined: Self = StObject.set(x, "mixinMergeStrategy", js.undefined)
    
    inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedKey(value: String): Self = StObject.set(x, "nestedKey", value.asInstanceOf[js.Any])
    
    inline def setNestedKeyUndefined: Self = StObject.set(x, "nestedKey", js.undefined)
    
    inline def setOnChild(value: /* child */ Logger[typings.pino.mod.LoggerOptions & ChildLoggerOptions] => Unit): Self = StObject.set(x, "onChild", js.Any.fromFunction1(value))
    
    inline def setOnChildUndefined: Self = StObject.set(x, "onChild", js.undefined)
    
    inline def setPrettifier(value: Any): Self = StObject.set(x, "prettifier", value.asInstanceOf[js.Any])
    
    inline def setPrettifierUndefined: Self = StObject.set(x, "prettifier", js.undefined)
    
    inline def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setRedact(value: js.Array[String] | redactOptions): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
    
    inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
    
    inline def setRedactVarargs(value: String*): Self = StObject.set(x, "redact", js.Array(value*))
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
    
    inline def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    
    inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    
    inline def setTimestamp(value: TimeFn | Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampFunction0(value: () => String): Self = StObject.set(x, "timestamp", js.Any.fromFunction0(value))
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTransport(
      value: (TransportSingleOptions[Record[String, Any]]) | (TransportMultiOptions[Record[String, Any]]) | (TransportPipelineOptions[Record[String, Any]])
    ): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setUseOnlyCustomLevels(value: Boolean): Self = StObject.set(x, "useOnlyCustomLevels", value.asInstanceOf[js.Any])
    
    inline def setUseOnlyCustomLevelsUndefined: Self = StObject.set(x, "useOnlyCustomLevels", js.undefined)
  }
}
