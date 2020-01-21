package typings.phonegapNfc.PhoneGapNfc

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
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

