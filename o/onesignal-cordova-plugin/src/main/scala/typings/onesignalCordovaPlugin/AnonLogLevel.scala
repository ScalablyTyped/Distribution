package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogLevel extends js.Object {
  var logLevel: OSLogLevel
  var visualLevel: OSLogLevel
}

object AnonLogLevel {
  @scala.inline
  def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): AnonLogLevel = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLogLevel]
  }
}

