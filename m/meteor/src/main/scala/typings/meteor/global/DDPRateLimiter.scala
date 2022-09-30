package typings.meteor.global

import typings.meteor.DDPRateLimiter.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDPRateLimiter {
  
  @JSGlobal("DDPRateLimiter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(matcher.asInstanceOf[js.Any], numRequests.asInstanceOf[js.Any], timeInterval.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeRule(ruleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRule")(ruleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
