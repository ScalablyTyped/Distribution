package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevel extends js.Object {
  var logLevel: OSLogLevel
  var visualLevel: OSLogLevel
}

object LogLevel {
  @scala.inline
  def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): LogLevel = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel]
  }
}

