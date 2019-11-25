package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetConductCodeResponse extends js.Object {
  var body: String
  var key: String
  var name: String
  var url: String
}

object CodesOfConductGetConductCodeResponse {
  @scala.inline
  def apply(body: String, key: String, name: String, url: String): CodesOfConductGetConductCodeResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodesOfConductGetConductCodeResponse]
  }
}

