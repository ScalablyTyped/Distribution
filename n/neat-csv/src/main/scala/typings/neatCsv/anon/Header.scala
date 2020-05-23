package typings.neatCsv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: String
  var index: Double
}

object Header {
  @scala.inline
  def apply(header: String, index: Double): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

