package typings
package pinoDashMultiDashStreamLib.pinoDashMultiDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions
  extends pinoLib.pinoMod.LoggerOptions {
  var streams: js.UndefOr[Streams] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    base: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    browser: pinoLib.Anon_AsObject = null,
    changeLevelName: java.lang.String = null,
    customLevels: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    level: pinoLib.pinoMod.LevelWithSilent | java.lang.String = null,
    levelVal: scala.Int | scala.Double = null,
    messageKey: java.lang.String = null,
    name: java.lang.String = null,
    onTerminated: (/* eventName */ java.lang.String, /* err */ js.Any) => scala.Unit = null,
    prettyPrint: scala.Boolean | pinoLib.pinoMod.PrettyOptions = null,
    redact: js.Array[java.lang.String] | pinoLib.pinoMod.redactOptions = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    serializers: org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.SerializerFn] = null,
    streams: Streams = null,
    timestamp: pinoLib.pinoMod.TimeFn | pinoLib.pinoLibNumbers.`false` = null,
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
    if (streams != null) __obj.updateDynamic("streams")(streams)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels)
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels)
    __obj.asInstanceOf[LoggerOptions]
  }
}

