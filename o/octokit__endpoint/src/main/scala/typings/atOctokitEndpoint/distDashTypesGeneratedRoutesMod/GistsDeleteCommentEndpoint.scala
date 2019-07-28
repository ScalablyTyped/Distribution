package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsDeleteCommentEndpoint extends js.Object {
  var comment_id: Double
  var gist_id: String
}

object GistsDeleteCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, gist_id: String): GistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsDeleteCommentEndpoint]
  }
}

