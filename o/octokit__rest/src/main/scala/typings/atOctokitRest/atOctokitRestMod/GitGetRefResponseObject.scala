package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefResponseObject extends js.Object {
  var sha: String
  var `type`: String
  var url: String
}

object GitGetRefResponseObject {
  @scala.inline
  def apply(sha: String, `type`: String, url: String): GitGetRefResponseObject = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetRefResponseObject]
  }
}

