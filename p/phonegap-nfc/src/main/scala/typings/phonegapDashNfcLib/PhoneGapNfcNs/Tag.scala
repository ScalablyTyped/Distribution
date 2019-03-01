package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var date: java.lang.String
  var id: js.Array[scala.Double]
  var techTypes: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object Tag {
  @scala.inline
  def apply(
    date: java.lang.String,
    id: js.Array[scala.Double],
    techTypes: js.Array[java.lang.String],
    `type`: java.lang.String
  ): Tag = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("techTypes")(techTypes)
    __obj.asInstanceOf[Tag]
  }
}

