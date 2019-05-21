package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsDeleteCommentEndpoint extends js.Object {
  var comment_id: scala.Double
  var gist_id: java.lang.String
}

object GistsDeleteCommentEndpoint {
  @scala.inline
  def apply(comment_id: scala.Double, gist_id: java.lang.String): GistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsDeleteCommentEndpoint]
  }
}

