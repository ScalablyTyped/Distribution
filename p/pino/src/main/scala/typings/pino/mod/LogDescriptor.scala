package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDescriptor
  extends /* key */ StringDictionary[js.Any] {
  var hostname: String
  var level: Double
  var msg: String
  var pid: Double
  var time: String
  var v: Double
}

object LogDescriptor {
  @scala.inline
  def apply(
    hostname: String,
    level: Double,
    msg: String,
    pid: Double,
    time: String,
    v: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): LogDescriptor = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogDescriptor]
  }
}

