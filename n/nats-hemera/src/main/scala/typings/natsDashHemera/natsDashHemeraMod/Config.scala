package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var bloomrun: js.UndefOr[BloomrunConfig] = js.undefined
  var childLogger: js.UndefOr[Boolean] = js.undefined
  var circuitBreaker: js.UndefOr[CircuitBreakerConfig] = js.undefined
  var crashOnFatal: js.UndefOr[Boolean] = js.undefined
  var errio: js.UndefOr[ErrioConfig] = js.undefined
  var load: js.UndefOr[LoadConfig] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var maxRecursion: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pluginTimeout: js.UndefOr[Double] = js.undefined
  var prettyLog: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    bloomrun: BloomrunConfig = null,
    childLogger: js.UndefOr[Boolean] = js.undefined,
    circuitBreaker: CircuitBreakerConfig = null,
    crashOnFatal: js.UndefOr[Boolean] = js.undefined,
    errio: ErrioConfig = null,
    load: LoadConfig = null,
    logLevel: LogLevel = null,
    logger: js.Any = null,
    maxRecursion: Int | Double = null,
    name: String = null,
    pluginTimeout: Int | Double = null,
    prettyLog: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: Int | Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (bloomrun != null) __obj.updateDynamic("bloomrun")(bloomrun)
    if (!js.isUndefined(childLogger)) __obj.updateDynamic("childLogger")(childLogger)
    if (circuitBreaker != null) __obj.updateDynamic("circuitBreaker")(circuitBreaker)
    if (!js.isUndefined(crashOnFatal)) __obj.updateDynamic("crashOnFatal")(crashOnFatal)
    if (errio != null) __obj.updateDynamic("errio")(errio)
    if (load != null) __obj.updateDynamic("load")(load)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxRecursion != null) __obj.updateDynamic("maxRecursion")(maxRecursion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pluginTimeout != null) __obj.updateDynamic("pluginTimeout")(pluginTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyLog)) __obj.updateDynamic("prettyLog")(prettyLog)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

