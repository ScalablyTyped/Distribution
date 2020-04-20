package typings.parse

import typings.parse.mod._Global_.Parse.Object._Encode
import typings.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIso
  extends _Encode[js.Any] {
  var __type: Date
  var iso: String
}

object AnonIso {
  @scala.inline
  def apply(__type: Date, iso: String): AnonIso = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIso]
  }
}

