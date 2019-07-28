package typings.pinoDashMultiDashStream.pinoDashMultiDashStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pino.Anon_AsObject
import typings.pino.pinoMod.LevelWithSilent
import typings.pino.pinoMod.PrettyOptions
import typings.pino.pinoMod.SerializerFn
import typings.pino.pinoMod.TimeFn
import typings.pino.pinoMod.redactOptions
import typings.pino.pinoNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions
  extends typings.pino.pinoMod.LoggerOptions {
  var streams: js.UndefOr[Streams] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    base: StringDictionary[js.Any] = null,
    browser: Anon_AsObject = null,
    changeLevelName: String = null,
    customLevels: StringDictionary[Double] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    level: LevelWithSilent | String = null,
    levelVal: Int | Double = null,
    messageKey: String = null,
    name: String = null,
    onTerminated: (/* eventName */ String, /* err */ js.Any) => Unit = null,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    serializers: StringDictionary[SerializerFn] = null,
    streams: Streams = null,
    timestamp: TimeFn | `false` = null,
    useLevelLabels: js.UndefOr[Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
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

