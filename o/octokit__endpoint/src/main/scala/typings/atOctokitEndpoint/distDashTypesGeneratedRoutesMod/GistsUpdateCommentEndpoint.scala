package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateCommentEndpoint extends js.Object {
  var body: String
  var comment_id: Double
  var gist_id: String
}

object GistsUpdateCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_id: Double, gist_id: String): GistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsUpdateCommentEndpoint]
  }
}

