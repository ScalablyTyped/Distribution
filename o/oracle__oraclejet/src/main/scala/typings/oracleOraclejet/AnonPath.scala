package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: String
  var previousValue: js.Any
  var value: js.Any
}

object AnonPath {
  @scala.inline
  def apply(path: String, previousValue: js.Any, value: js.Any): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
}

