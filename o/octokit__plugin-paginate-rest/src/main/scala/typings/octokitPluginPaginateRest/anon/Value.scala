package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: OctokitResponse[_]
}

object Value {
  @scala.inline
  def apply(value: OctokitResponse[_]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

