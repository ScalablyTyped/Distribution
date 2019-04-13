package typings
package pinoDashHttpLib.pinoDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends pinoLib.pinoMod.LoggerOptions {
  var customLogLevel: js.UndefOr[
    js.Function2[
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* error */ stdLib.Error, 
      pinoLib.pinoMod.Level
    ]
  ] = js.undefined
  var genReqId: js.UndefOr[GenReqId] = js.undefined
  var logger: js.UndefOr[pinoLib.pinoMod.Logger] = js.undefined
  var stream: js.UndefOr[pinoLib.pinoMod.DestinationStream] = js.undefined
  var useLevel: js.UndefOr[pinoLib.pinoMod.Level] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    browser: pinoLib.Anon_AsObject = null,
    changeLevelName: java.lang.String = null,
    customLevels: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    customLogLevel: (/* res */ nodeLib.httpMod.ServerResponse, /* error */ stdLib.Error) => pinoLib.pinoMod.Level = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    genReqId: GenReqId = null,
    level: pinoLib.pinoMod.LevelWithSilent | java.lang.String = null,
    levelVal: scala.Int | scala.Double = null,
    logger: pinoLib.pinoMod.Logger = null,
    messageKey: java.lang.String = null,
    name: java.lang.String = null,
    onTerminated: (/* eventName */ java.lang.String, /* err */ js.Any) => scala.Unit = null,
    prettyPrint: scala.Boolean | pinoLib.pinoMod.PrettyOptions = null,
    redact: js.Array[java.lang.String] | pinoLib.pinoMod.redactOptions = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    serializers: org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.SerializerFn] = null,
    stream: pinoLib.pinoMod.DestinationStream = null,
    timestamp: pinoLib.pinoMod.TimeFn | pinoLib.pinoLibNumbers.`false` = null,
    useLevel: pinoLib.pinoMod.Level = null,
    useLevelLabels: js.UndefOr[scala.Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName)
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels)
    if (customLogLevel != null) __obj.updateDynamic("customLogLevel")(js.Any.fromFunction2(customLogLevel))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (genReqId != null) __obj.updateDynamic("genReqId")(genReqId)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelVal != null) __obj.updateDynamic("levelVal")(levelVal.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2(onTerminated))
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (useLevel != null) __obj.updateDynamic("useLevel")(useLevel)
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels)
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels)
    __obj.asInstanceOf[Options]
  }
}

