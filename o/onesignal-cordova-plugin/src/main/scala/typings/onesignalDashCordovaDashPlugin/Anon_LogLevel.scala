package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OSLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogLevel extends js.Object {
  var logLevel: OSLogLevel
  var visualLevel: OSLogLevel
}

object Anon_LogLevel {
  @scala.inline
  def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): Anon_LogLevel = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LogLevel]
  }
}

