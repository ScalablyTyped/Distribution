package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateCommentParams extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: java.lang.String
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesCreateCommentParams {
  @scala.inline
  def apply(body: java.lang.String, number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesCreateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCreateCommentParams]
  }
}

