package typings.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Os extends js.Object {
  def arch(): String
  def hostname(): String
  def ip(): String
  def oos(): js.Function0[js.Promise[String]]
  def platform(): Platform
  def `type`(): String
  def uptime(): Double
}

object Os {
  @scala.inline
  def apply(
    arch: () => String,
    hostname: () => String,
    ip: () => String,
    oos: () => js.Function0[js.Promise[String]],
    platform: () => Platform,
    `type`: () => String,
    uptime: () => Double
  ): Os = {
    val __obj = js.Dynamic.literal(arch = js.Any.fromFunction0(arch), hostname = js.Any.fromFunction0(hostname), ip = js.Any.fromFunction0(ip), oos = js.Any.fromFunction0(oos), platform = js.Any.fromFunction0(platform), uptime = js.Any.fromFunction0(uptime))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Os]
  }
}

