package typings.meteorDashTypings.meteorDdpDashRateDashLimiterMod

import typings.meteorDashTypings.meteorDdpDashRateDashLimiterMod.DDPRateLimiterNs.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp-rate-limiter", "DDPRateLimiter")
@js.native
object DDPRateLimiterNs extends js.Object {
  trait Matcher extends js.Object {
    var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.undefined
    var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.undefined
    var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
    var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.undefined
    var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.undefined
  }
  
  def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
  def removeRule(ruleId: String): Boolean = js.native
}

