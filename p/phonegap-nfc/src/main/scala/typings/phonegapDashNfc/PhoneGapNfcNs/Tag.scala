package typings.phonegapDashNfc.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var date: String
  var id: js.Array[Double]
  var techTypes: js.Array[String]
  var `type`: String
}

object Tag {
  @scala.inline
  def apply(date: String, id: js.Array[Double], techTypes: js.Array[String], `type`: String): Tag = {
    val __obj = js.Dynamic.literal(date = date, id = id, techTypes = techTypes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tag]
  }
}

