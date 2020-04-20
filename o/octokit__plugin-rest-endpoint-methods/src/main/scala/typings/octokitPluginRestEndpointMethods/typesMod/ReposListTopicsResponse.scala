package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTopicsResponse extends js.Object {
  var names: js.Array[String]
}

object ReposListTopicsResponse {
  @scala.inline
  def apply(names: js.Array[String]): ReposListTopicsResponse = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListTopicsResponse]
  }
}

