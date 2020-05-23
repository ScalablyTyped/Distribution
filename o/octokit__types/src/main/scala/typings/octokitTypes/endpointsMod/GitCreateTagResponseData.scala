package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.DateEmail
import typings.octokitTypes.anon.Payload
import typings.octokitTypes.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagResponseData extends js.Object {
  var message: String
  var node_id: String
  var `object`: Type
  var sha: String
  var tag: String
  var tagger: DateEmail
  var url: String
  var verification: Payload
}

object GitCreateTagResponseData {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: Type,
    sha: String,
    tag: String,
    tagger: DateEmail,
    url: String,
    verification: Payload
  ): GitCreateTagResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagResponseData]
  }
}

