package typings.parse.anon

import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iso
  extends _Encode[js.Any] {
  var __type: Date
  var iso: String
}

object Iso {
  @scala.inline
  def apply(__type: Date, iso: String): Iso = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso]
  }
}

