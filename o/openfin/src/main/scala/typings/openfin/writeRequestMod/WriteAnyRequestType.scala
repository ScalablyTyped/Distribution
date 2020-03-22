package typings.openfin.writeRequestMod

import typings.openfin.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteAnyRequestType extends js.Object {
  var data: AnonHtml
  var `type`: js.UndefOr[String] = js.undefined
}

object WriteAnyRequestType {
  @scala.inline
  def apply(data: AnonHtml, `type`: String = null): WriteAnyRequestType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteAnyRequestType]
  }
}

