package typings.meteor.DDPRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDPRateLimiter")
@js.native
object ^ extends js.Object {
  def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
  def removeRule(ruleId: String): Boolean = js.native
}

