package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Double
  var detail: String
  var name: String
  var standardName: String
}

object AnonCode {
  @scala.inline
  def apply(code: Double, detail: String, name: String, standardName: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

