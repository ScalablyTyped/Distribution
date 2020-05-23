package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetAllTopicsResponseData extends js.Object {
  var names: js.Array[String]
}

object ReposGetAllTopicsResponseData {
  @scala.inline
  def apply(names: js.Array[String]): ReposGetAllTopicsResponseData = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsResponseData]
  }
}

