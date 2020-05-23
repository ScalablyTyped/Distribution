package typings.neatCsv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var header: String
  var index: Double
  var value: js.Any
}

object Index {
  @scala.inline
  def apply(header: String, index: Double, value: js.Any): Index = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

