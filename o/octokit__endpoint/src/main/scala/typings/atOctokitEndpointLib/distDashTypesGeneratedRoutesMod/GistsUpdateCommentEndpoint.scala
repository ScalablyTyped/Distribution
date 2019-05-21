package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateCommentEndpoint extends js.Object {
  var body: java.lang.String
  var comment_id: scala.Double
  var gist_id: java.lang.String
}

object GistsUpdateCommentEndpoint {
  @scala.inline
  def apply(body: java.lang.String, comment_id: scala.Double, gist_id: java.lang.String): GistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsUpdateCommentEndpoint]
  }
}

