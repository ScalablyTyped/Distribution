package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateCommentEndpoint extends js.Object {
  var body: String
  var gist_id: String
}

object GistsCreateCommentEndpoint {
  @scala.inline
  def apply(body: String, gist_id: String): GistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsCreateCommentEndpoint]
  }
}

