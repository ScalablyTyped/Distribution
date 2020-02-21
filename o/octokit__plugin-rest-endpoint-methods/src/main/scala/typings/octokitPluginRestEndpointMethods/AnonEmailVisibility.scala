package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailVisibility extends js.Object {
  var email: AnonRequired
  var visibility: AnonRequired
}

object AnonEmailVisibility {
  @scala.inline
  def apply(email: AnonRequired, visibility: AnonRequired): AnonEmailVisibility = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmailVisibility]
  }
}

