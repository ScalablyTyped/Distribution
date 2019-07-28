package typings.mongodb.mongodbMod

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
  def apply(logger: log = null, loggerLevel: String = null): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel)
    __obj.asInstanceOf[LoggerOptions]
  }
}

