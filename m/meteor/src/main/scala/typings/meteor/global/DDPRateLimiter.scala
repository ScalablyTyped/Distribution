package typings.meteor.global

import typings.meteor.DDPRateLimiter.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDPRateLimiter")
@js.native
object DDPRateLimiter extends js.Object {
  def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
  def removeRule(ruleId: String): Boolean = js.native
}

