package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateCommentParams extends js.Object {
  /**
    * The comment text.
    */
  var body: String
  var gist_id: String
}

object GistsCreateCommentParams {
  @scala.inline
  def apply(body: String, gist_id: String): GistsCreateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsCreateCommentParams]
  }
}

