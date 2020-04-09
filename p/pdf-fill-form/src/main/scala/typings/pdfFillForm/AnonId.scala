package typings.pdfFillForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: Double
  var name: String
  var page: Double
  var `type`: String
  var value: String
}

object AnonId {
  @scala.inline
  def apply(id: Double, name: String, page: Double, `type`: String, value: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

