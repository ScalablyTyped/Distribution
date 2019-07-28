package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagResponse extends js.Object {
  var message: String
  var node_id: String
  var `object`: GitCreateTagResponseObject
  var sha: String
  var tag: String
  var tagger: GitCreateTagResponseTagger
  var url: String
  var verification: GitCreateTagResponseVerification
}

object GitCreateTagResponse {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: GitCreateTagResponseObject,
    sha: String,
    tag: String,
    tagger: GitCreateTagResponseTagger,
    url: String,
    verification: GitCreateTagResponseVerification
  ): GitCreateTagResponse = {
    val __obj = js.Dynamic.literal(message = message, node_id = node_id, sha = sha, tag = tag, tagger = tagger, url = url, verification = verification)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitCreateTagResponse]
  }
}

