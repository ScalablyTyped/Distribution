package typings.onesignalDashCordovaDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushToken extends js.Object {
  var pushToken: String
  var userId: String
}

object Anon_PushToken {
  @scala.inline
  def apply(pushToken: String, userId: String): Anon_PushToken = {
    val __obj = js.Dynamic.literal(pushToken = pushToken, userId = userId)
  
    __obj.asInstanceOf[Anon_PushToken]
  }
}

