package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagResponse extends js.Object {
  var message: java.lang.String
  var node_id: java.lang.String
  var `object`: GitCreateTagResponseObject
  var sha: java.lang.String
  var tag: java.lang.String
  var tagger: GitCreateTagResponseTagger
  var url: java.lang.String
  var verification: GitCreateTagResponseVerification
}

object GitCreateTagResponse {
  @scala.inline
  def apply(
    message: java.lang.String,
    node_id: java.lang.String,
    `object`: GitCreateTagResponseObject,
    sha: java.lang.String,
    tag: java.lang.String,
    tagger: GitCreateTagResponseTagger,
    url: java.lang.String,
    verification: GitCreateTagResponseVerification
  ): GitCreateTagResponse = {
    val __obj = js.Dynamic.literal(message = message, node_id = node_id, sha = sha, tag = tag, tagger = tagger, url = url, verification = verification)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitCreateTagResponse]
  }
}

