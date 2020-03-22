package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagResponseObject extends js.Object {
  var sha: String
  var `type`: String
  var url: String
}

object GitCreateTagResponseObject {
  @scala.inline
  def apply(sha: String, `type`: String, url: String): GitCreateTagResponseObject = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagResponseObject]
  }
}

