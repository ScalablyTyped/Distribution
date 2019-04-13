package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetForRepoResponse extends js.Object {
  var body: java.lang.String
  var key: java.lang.String
  var name: java.lang.String
  var url: java.lang.String
}

object CodesOfConductGetForRepoResponse {
  @scala.inline
  def apply(body: java.lang.String, key: java.lang.String, name: java.lang.String, url: java.lang.String): CodesOfConductGetForRepoResponse = {
    val __obj = js.Dynamic.literal(body = body, key = key, name = name, url = url)
  
    __obj.asInstanceOf[CodesOfConductGetForRepoResponse]
  }
}

