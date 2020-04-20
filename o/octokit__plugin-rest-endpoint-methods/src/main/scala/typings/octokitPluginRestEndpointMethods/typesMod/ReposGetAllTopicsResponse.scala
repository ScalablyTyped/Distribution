package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetAllTopicsResponse extends js.Object {
  var names: js.Array[String]
}

object ReposGetAllTopicsResponse {
  @scala.inline
  def apply(names: js.Array[String]): ReposGetAllTopicsResponse = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsResponse]
  }
}

