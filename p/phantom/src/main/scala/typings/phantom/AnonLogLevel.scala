package typings.phantom

import typings.phantom.phantomStrings.debug
import typings.phantom.phantomStrings.error
import typings.phantom.phantomStrings.info
import typings.phantom.phantomStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogLevel extends js.Object {
  var logLevel: js.UndefOr[debug | info | warn | error] = js.undefined
  var logger: js.UndefOr[AnonDebug] = js.undefined
  var phantomPath: js.UndefOr[String] = js.undefined
  var shimPath: js.UndefOr[String] = js.undefined
}

object AnonLogLevel {
  @scala.inline
  def apply(
    logLevel: debug | info | warn | error = null,
    logger: AnonDebug = null,
    phantomPath: String = null,
    shimPath: String = null
  ): AnonLogLevel = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath.asInstanceOf[js.Any])
    if (shimPath != null) __obj.updateDynamic("shimPath")(shimPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogLevel]
  }
}

