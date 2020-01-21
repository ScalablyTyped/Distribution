package typings.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceSecure extends js.Object {
  var forceSecure: Boolean
}

object AnonForceSecure {
  @scala.inline
  def apply(forceSecure: Boolean): AnonForceSecure = {
    val __obj = js.Dynamic.literal(forceSecure = forceSecure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForceSecure]
  }
}

