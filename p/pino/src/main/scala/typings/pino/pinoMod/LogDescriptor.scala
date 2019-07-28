package typings.pino.pinoMod

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
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogDescriptor = {
    val __obj = js.Dynamic.literal(hostname = hostname, level = level, msg = msg, pid = pid, time = time, v = v)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogDescriptor]
  }
}

