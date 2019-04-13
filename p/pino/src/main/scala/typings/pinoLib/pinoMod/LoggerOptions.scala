package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * key-value object added as child logger to each log line. If set to null the base child logger is not added
    */
  var base: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  /**
    * Browser only, see http://getpino.io/#/?id=pino-in-the-browser.
    */
  var browser: js.UndefOr[pinoLib.Anon_AsObject] = js.undefined
  /**
    * Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var changeLevelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this option to define additional logging levels.
    * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
    */
  var customLevels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * Enables logging. Default: `true`.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
    * requires supplying a level value via `levelVal`. Default: 'info'.
    */
  var level: js.UndefOr[LevelWithSilent | java.lang.String] = js.undefined
  /**
    * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
    */
  var levelVal: js.UndefOr[scala.Double] = js.undefined
  /**
    * The string key for the 'message' in the JSON object. Default: "msg".
    */
  var messageKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the logger. Default: `undefined`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This function will be invoked during process shutdown when `extreme` is set to `true`. If you do not specify
    * a function, Pino will invoke `process.exit(0)` when no error has occurred, and `process.exit(1)` otherwise.
    * If you do specify a function, it is up to you to terminate the process; you must perform only synchronous
    * operations at this point. See http://getpino.io/#/docs/extreme for more detail.
    */
  var onTerminated: js.UndefOr[js.Function2[/* eventName */ java.lang.String, /* err */ js.Any, scala.Unit]] = js.undefined
  /**
    * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
    * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
    */
  var prettyPrint: js.UndefOr[scala.Boolean | PrettyOptions] = js.undefined
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
  var redact: js.UndefOr[js.Array[java.lang.String] | redactOptions] = js.undefined
  /**
    * Avoid error causes by circular references in the object tree. Default: `true`.
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * an object containing functions for custom serialization of objects.
    * These functions should return an JSONifiable object and they should never throw. When logging an object,
    * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
    */
  var serializers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[SerializerFn]] = js.undefined
  /**
    * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
    * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
    * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
    * Caution: any sort of formatted time will significantly slow down Pino's performance.
    */
  var timestamp: js.UndefOr[TimeFn | pinoLib.pinoLibNumbers.`false`] = js.undefined
  /**
    * Outputs the level as a string instead of integer. Default: `false`.
    */
  var useLevelLabels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use this option to only use defined `customLevels` and omit Pino's levels.
    * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
    * Warning: this option may not be supported by downstream transports.
    */
  var useOnlyCustomLevels: js.UndefOr[scala.Boolean] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    base: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    browser: pinoLib.Anon_AsObject = null,
    changeLevelName: java.lang.String = null,
    customLevels: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    level: LevelWithSilent | java.lang.String = null,
    levelVal: scala.Int | scala.Double = null,
    messageKey: java.lang.String = null,
    name: java.lang.String = null,
    onTerminated: (/* eventName */ java.lang.String, /* err */ js.Any) => scala.Unit = null,
    prettyPrint: scala.Boolean | PrettyOptions = null,
    redact: js.Array[java.lang.String] | redactOptions = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    serializers: org.scalablytyped.runtime.StringDictionary[SerializerFn] = null,
    timestamp: TimeFn | pinoLib.pinoLibNumbers.`false` = null,
    useLevelLabels: js.UndefOr[scala.Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[scala.Boolean] = js.undefined
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName)
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelVal != null) __obj.updateDynamic("levelVal")(levelVal.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2(onTerminated))
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels)
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels)
    __obj.asInstanceOf[LoggerOptions]
  }
}

