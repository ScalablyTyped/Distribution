package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.undefined
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[String] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    logger: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit = null,
    loggerLevel: String = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction2(logger))
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

