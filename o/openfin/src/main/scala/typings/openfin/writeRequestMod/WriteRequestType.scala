package typings.openfin.writeRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequestType extends js.Object {
  var data: String
  var `type`: js.UndefOr[String] = js.undefined
}

object WriteRequestType {
  @scala.inline
  def apply(data: String, `type`: String = null): WriteRequestType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequestType]
  }
}

