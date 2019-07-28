package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(body = body, key = key, name = name, url = url)
  
    __obj.asInstanceOf[CodesOfConductGetForRepoResponse]
  }
}

