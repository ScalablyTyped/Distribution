package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.pgDashPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreparedParsed extends js.Object {
  var binary: Boolean
  var name: String
  var rowMode: Unit | array
  var rows: Double
  var text: String
  var values: js.Array[_]
}

object IPreparedParsed {
  @scala.inline
  def apply(
    binary: Boolean,
    name: String,
    rowMode: Unit | array,
    rows: Double,
    text: String,
    values: js.Array[_]
  ): IPreparedParsed = {
    val __obj = js.Dynamic.literal(binary = binary, name = name, rowMode = rowMode.asInstanceOf[js.Any], rows = rows, text = text, values = values)
  
    __obj.asInstanceOf[IPreparedParsed]
  }
}

