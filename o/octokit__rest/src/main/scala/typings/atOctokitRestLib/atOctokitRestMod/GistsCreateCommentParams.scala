package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateCommentParams extends js.Object {
  /**
    * The comment text.
    */
  var body: java.lang.String
  var gist_id: java.lang.String
}

object GistsCreateCommentParams {
  @scala.inline
  def apply(body: java.lang.String, gist_id: java.lang.String): GistsCreateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, gist_id = gist_id)
  
    __obj.asInstanceOf[GistsCreateCommentParams]
  }
}

