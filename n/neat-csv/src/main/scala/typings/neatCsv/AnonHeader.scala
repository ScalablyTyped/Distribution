package typings.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var header: String
  var index: Double
}

object AnonHeader {
  @scala.inline
  def apply(header: String, index: Double): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

