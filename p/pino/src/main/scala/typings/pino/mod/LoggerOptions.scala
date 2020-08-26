package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pino.anon.AsObject
import typings.pino.anon.LogMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  /**
    * key-value object added as child logger to each log line. If set to null the base child logger is not added
    */
  var base: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * Browser only, see http://getpino.io/#/docs/browser.
    */
  var browser: js.UndefOr[AsObject] = js.native
  /**
    * (DEPRECATED, use `levelKey`) Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var changeLevelName: js.UndefOr[String] = js.native
  /**
    * Use this option to define additional logging levels.
    * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
    */
  var customLevels: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Enables logging. Default: `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * An object containing functions for formatting the shape of the log lines.
    * These functions should return a JSONifiable object and should never throw.
    * These functions allow for full customization of the resulting log lines.
    * For example, they can be used to change the level key name or to enrich the default metadata.
    */
  var formatters: js.UndefOr[typings.pino.anon.Bindings] = js.native
  /**
    * An object mapping to hook functions. Hook functions allow for customizing internal logger operations.
    * Hook functions must be synchronous functions.
    */
  var hooks: js.UndefOr[LogMethod] = js.native
  /**
    * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
    * requires supplying a level value via `levelVal`. Default: 'info'.
    */
  var level: js.UndefOr[LevelWithSilent | String] = js.native
  /**
    * Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var levelKey: js.UndefOr[String] = js.native
  /**
    * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
    */
  var levelVal: js.UndefOr[Double] = js.native
  /**
    * The string key for the 'message' in the JSON object. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.native
  /**
    * If provided, the `mixin` function is called each time one of the active logging methods
    * is called. The function must synchronously return an object. The properties of the
    * returned object will be added to the logged JSON.
    */
  var mixin: js.UndefOr[MixinFn] = js.native
  /**
    * The name of the logger. Default: `undefined`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The string key to place any logged object under.
    */
  var nestedKey: js.UndefOr[String] = js.native
  /**
    * This function will be invoked during process shutdown when `extreme` is set to `true`. If you do not specify
    * a function, Pino will invoke `process.exit(0)` when no error has occurred, and `process.exit(1)` otherwise.
    * If you do specify a function, it is up to you to terminate the process; you must perform only synchronous
    * operations at this point. See http://getpino.io/#/docs/extreme for more detail.
    */
  var onTerminated: js.UndefOr[js.Function2[/* eventName */ String, /* err */ js.Any, Unit]] = js.native
  /**
    * Allows to optionally define which prettifier module to use.
    */
  // TODO: use type definitions from 'pino-pretty' when available.
  var prettifier: js.UndefOr[js.Any] = js.native
  /**
    * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
    * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
    */
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
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
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.native
  /**
    * Avoid error causes by circular references in the object tree. Default: `true`.
    */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * an object containing functions for custom serialization of objects.
    * These functions should return an JSONifiable object and they should never throw. When logging an object,
    * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
    */
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.native
  /**
    * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
    * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
    * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
    * Caution: any sort of formatted time will significantly slow down Pino's performance.
    */
  var timestamp: js.UndefOr[TimeFn | Boolean] = js.native
  /**
    * Outputs the level as a string instead of integer. Default: `false`.
    */
  var useLevelLabels: js.UndefOr[Boolean] = js.native
  /**
    * Use this option to only use defined `customLevels` and omit Pino's levels.
    * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
    * Warning: this option may not be supported by downstream transports.
    */
  var useOnlyCustomLevels: js.UndefOr[Boolean] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: StringDictionary[js.Any]): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBaseNull: Self = this.set("base", null)
    @scala.inline
    def setBrowser(value: AsObject): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setChangeLevelName(value: String): Self = this.set("changeLevelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeLevelName: Self = this.set("changeLevelName", js.undefined)
    @scala.inline
    def setCustomLevels(value: StringDictionary[Double]): Self = this.set("customLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLevels: Self = this.set("customLevels", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormatters(value: typings.pino.anon.Bindings): Self = this.set("formatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    @scala.inline
    def setHooks(value: LogMethod): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setLevel(value: LevelWithSilent | String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLevelKey(value: String): Self = this.set("levelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelKey: Self = this.set("levelKey", js.undefined)
    @scala.inline
    def setLevelVal(value: Double): Self = this.set("levelVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelVal: Self = this.set("levelVal", js.undefined)
    @scala.inline
    def setMessageKey(value: String): Self = this.set("messageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageKey: Self = this.set("messageKey", js.undefined)
    @scala.inline
    def setMixin(value: () => js.Object): Self = this.set("mixin", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMixin: Self = this.set("mixin", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNestedKey(value: String): Self = this.set("nestedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedKey: Self = this.set("nestedKey", js.undefined)
    @scala.inline
    def setOnTerminated(value: (/* eventName */ String, /* err */ js.Any) => Unit): Self = this.set("onTerminated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTerminated: Self = this.set("onTerminated", js.undefined)
    @scala.inline
    def setPrettifier(value: js.Any): Self = this.set("prettifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettifier: Self = this.set("prettifier", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean | PrettyOptions): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setRedactVarargs(value: String*): Self = this.set("redact", js.Array(value :_*))
    @scala.inline
    def setRedact(value: js.Array[String] | redactOptions): Self = this.set("redact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedact: Self = this.set("redact", js.undefined)
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setSerializers(value: StringDictionary[SerializerFn]): Self = this.set("serializers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
    @scala.inline
    def setTimestampFunction0(value: () => String): Self = this.set("timestamp", js.Any.fromFunction0(value))
    @scala.inline
    def setTimestamp(value: TimeFn | Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setUseLevelLabels(value: Boolean): Self = this.set("useLevelLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLevelLabels: Self = this.set("useLevelLabels", js.undefined)
    @scala.inline
    def setUseOnlyCustomLevels(value: Boolean): Self = this.set("useOnlyCustomLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseOnlyCustomLevels: Self = this.set("useOnlyCustomLevels", js.undefined)
  }
  
}

