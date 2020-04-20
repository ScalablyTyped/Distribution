package typings.octokitGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: RequiredGraphQlQueryRespo
}

object AnonData {
  @scala.inline
  def apply(data: RequiredGraphQlQueryRespo): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

