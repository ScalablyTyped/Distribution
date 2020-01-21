package typings.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderIndex extends js.Object {
  var header: String
  var index: Double
  var value: js.Any
}

object AnonHeaderIndex {
  @scala.inline
  def apply(header: String, index: Double, value: js.Any): AnonHeaderIndex = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaderIndex]
  }
}

