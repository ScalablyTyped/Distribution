package typings
package pinoLib.pinoMod.PNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDescriptor
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var hostname: java.lang.String
  var level: scala.Double
  var msg: java.lang.String
  var pid: scala.Double
  var time: java.lang.String
  var v: scala.Double
}

object LogDescriptor {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    level: scala.Double,
    msg: java.lang.String,
    pid: scala.Double,
    time: java.lang.String,
    v: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LogDescriptor = {
    val __obj = js.Dynamic.literal(hostname = hostname, level = level, msg = msg, pid = pid, time = time, v = v)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogDescriptor]
  }
}

