package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateCommentParams extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
  var issue_number: Double
  var owner: String
  var repo: String
}

object IssuesCreateCommentParams {
  @scala.inline
  def apply(body: String, issue_number: Double, owner: String, repo: String): IssuesCreateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, issue_number = issue_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCreateCommentParams]
  }
}

