package typings.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var header: String
  var index: Double
  var value: js.Any
}

object AnonIndex {
  @scala.inline
  def apply(header: String, index: Double, value: js.Any): AnonIndex = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}

