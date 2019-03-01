package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationNumberOptions extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GlobalizationNumberOptions {
  @scala.inline
  def apply(`type`: java.lang.String = null): GlobalizationNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GlobalizationNumberOptions]
  }
}

