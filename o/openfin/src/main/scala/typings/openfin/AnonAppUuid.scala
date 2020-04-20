package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppUuid extends js.Object {
  var appUuid: String
  var windowName: String
}

object AnonAppUuid {
  @scala.inline
  def apply(appUuid: String, windowName: String): AnonAppUuid = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppUuid]
  }
}

