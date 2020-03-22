package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetForRepoResponse extends js.Object {
  var body: String
  var key: String
  var name: String
  var url: String
}

object CodesOfConductGetForRepoResponse {
  @scala.inline
  def apply(body: String, key: String, name: String, url: String): CodesOfConductGetForRepoResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodesOfConductGetForRepoResponse]
  }
}

