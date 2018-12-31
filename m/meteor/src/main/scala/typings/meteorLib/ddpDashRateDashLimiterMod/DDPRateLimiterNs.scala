package typings
package meteorLib.ddpDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp-rate-limiter", "DDPRateLimiter")
@js.native
object DDPRateLimiterNs extends js.Object {
  trait Matcher extends js.Object {
    var clientAddress: js.UndefOr[
        java.lang.String | (js.Function1[/* clientAddress */ java.lang.String, scala.Boolean])
      ] = js.undefined
    var connectionId: js.UndefOr[
        java.lang.String | (js.Function1[/* connectionId */ java.lang.String, scala.Boolean])
      ] = js.undefined
    var name: js.UndefOr[java.lang.String | (js.Function1[/* name */ java.lang.String, scala.Boolean])] = js.undefined
    var `type`: js.UndefOr[java.lang.String | (js.Function1[/* type */ java.lang.String, scala.Boolean])] = js.undefined
    var userId: js.UndefOr[java.lang.String | (js.Function1[/* userId */ java.lang.String, scala.Boolean])] = js.undefined
  }
  
  def addRule(matcher: Matcher, numRequests: scala.Double, timeInterval: scala.Double): java.lang.String = js.native
  def removeRule(ruleId: java.lang.String): scala.Boolean = js.native
}

