package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitListMatchingRefsResponseItemObject extends js.Object {
  var sha: String
  var `type`: String
  var url: String
}

object GitListMatchingRefsResponseItemObject {
  @scala.inline
  def apply(sha: String, `type`: String, url: String): GitListMatchingRefsResponseItemObject = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitListMatchingRefsResponseItemObject]
  }
}

