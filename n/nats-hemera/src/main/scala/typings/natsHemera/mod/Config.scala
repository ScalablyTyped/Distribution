package typings.natsHemera.mod

import typings.natsHemera.natsHemeraNumbers.`2000`
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var bloomrun: js.UndefOr[BloomrunConfig] = js.undefined
  var childLogger: js.UndefOr[Boolean] = js.undefined
  var errio: js.UndefOr[ErrioConfig] = js.undefined
  var load: js.UndefOr[LoadConfig] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[Logger | Stream] = js.undefined
  var maxRecursion: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pluginTimeout: js.UndefOr[Double] = js.undefined
  var prettyLog: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double | `2000`] = js.undefined
  var traceLog: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    bloomrun: BloomrunConfig = null,
    childLogger: js.UndefOr[Boolean] = js.undefined,
    errio: ErrioConfig = null,
    load: LoadConfig = null,
    logLevel: LogLevel = null,
    logger: Logger | Stream = null,
    maxRecursion: Int | Double = null,
    name: String = null,
    pluginTimeout: Int | Double = null,
    prettyLog: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: Double | `2000` = null,
    traceLog: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (bloomrun != null) __obj.updateDynamic("bloomrun")(bloomrun.asInstanceOf[js.Any])
    if (!js.isUndefined(childLogger)) __obj.updateDynamic("childLogger")(childLogger.asInstanceOf[js.Any])
    if (errio != null) __obj.updateDynamic("errio")(errio.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxRecursion != null) __obj.updateDynamic("maxRecursion")(maxRecursion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pluginTimeout != null) __obj.updateDynamic("pluginTimeout")(pluginTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyLog)) __obj.updateDynamic("prettyLog")(prettyLog.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traceLog)) __obj.updateDynamic("traceLog")(traceLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

