package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagResponse extends js.Object {
  var message: String
  var node_id: String
  var `object`: GitGetTagResponseObject
  var sha: String
  var tag: String
  var tagger: GitGetTagResponseTagger
  var url: String
  var verification: GitGetTagResponseVerification
}

object GitGetTagResponse {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: GitGetTagResponseObject,
    sha: String,
    tag: String,
    tagger: GitGetTagResponseTagger,
    url: String,
    verification: GitGetTagResponseVerification
  ): GitGetTagResponse = {
    val __obj = js.Dynamic.literal(message = message, node_id = node_id, sha = sha, tag = tag, tagger = tagger, url = url, verification = verification)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitGetTagResponse]
  }
}

