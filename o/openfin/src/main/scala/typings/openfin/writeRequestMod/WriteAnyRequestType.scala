package typings.openfin.writeRequestMod

import typings.openfin.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteAnyRequestType extends js.Object {
  var data: Html
  var `type`: js.UndefOr[String] = js.undefined
}

object WriteAnyRequestType {
  @scala.inline
  def apply(data: Html, `type`: String = null): WriteAnyRequestType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteAnyRequestType]
  }
}

