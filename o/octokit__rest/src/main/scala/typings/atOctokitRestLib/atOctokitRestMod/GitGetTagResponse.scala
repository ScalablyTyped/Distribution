package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagResponse extends js.Object {
  var message: java.lang.String
  var node_id: java.lang.String
  var `object`: GitGetTagResponseObject
  var sha: java.lang.String
  var tag: java.lang.String
  var tagger: GitGetTagResponseTagger
  var url: java.lang.String
  var verification: GitGetTagResponseVerification
}

object GitGetTagResponse {
  @scala.inline
  def apply(
    message: java.lang.String,
    node_id: java.lang.String,
    `object`: GitGetTagResponseObject,
    sha: java.lang.String,
    tag: java.lang.String,
    tagger: GitGetTagResponseTagger,
    url: java.lang.String,
    verification: GitGetTagResponseVerification
  ): GitGetTagResponse = {
    val __obj = js.Dynamic.literal(message = message, node_id = node_id, sha = sha, tag = tag, tagger = tagger, url = url, verification = verification)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitGetTagResponse]
  }
}

