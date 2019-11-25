package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.pgDashPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParameterizedParsed extends js.Object {
  var binary: Boolean
  var rowMode: Unit | array
  var text: String
  var values: js.Array[_]
}

object IParameterizedParsed {
  @scala.inline
  def apply(binary: Boolean, rowMode: Unit | array, text: String, values: js.Array[_]): IParameterizedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IParameterizedParsed]
  }
}

