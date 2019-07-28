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
    val __obj = js.Dynamic.literal(body = body, key = key, name = name, url = url)
  
    __obj.asInstanceOf[CodesOfConductGetConductCodeResponse]
  }
}

