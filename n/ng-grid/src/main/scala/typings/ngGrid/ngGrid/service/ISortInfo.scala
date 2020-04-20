package typings.ngGrid.ngGrid.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortInfo extends js.Object {
  var fields: js.Array[String]
}

object ISortInfo {
  @scala.inline
  def apply(fields: js.Array[String]): ISortInfo = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortInfo]
  }
}

