package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetForRepoResponseData extends js.Object {
  var body: String
  var key: String
  var name: String
  var url: String
}

object CodesOfConductGetForRepoResponseData {
  @scala.inline
  def apply(body: String, key: String, name: String, url: String): CodesOfConductGetForRepoResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetForRepoResponseData]
  }
}

