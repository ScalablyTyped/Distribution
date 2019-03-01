package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineCheck extends js.Object {
  var url: java.lang.String
}

object OfflineCheck {
  @scala.inline
  def apply(url: java.lang.String): OfflineCheck = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[OfflineCheck]
  }
}

