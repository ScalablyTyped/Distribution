package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUuid extends js.Object {
  var appUuid: String
  var windowName: String
}

object AppUuid {
  @scala.inline
  def apply(appUuid: String, windowName: String): AppUuid = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUuid]
  }
}

