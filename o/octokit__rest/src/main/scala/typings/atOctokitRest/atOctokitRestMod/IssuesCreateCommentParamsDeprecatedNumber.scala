package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateCommentParamsDeprecatedNumber extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesCreateCommentParamsDeprecatedNumber {
  @scala.inline
  def apply(body: String, number: Double, owner: String, repo: String): IssuesCreateCommentParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(body = body, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCreateCommentParamsDeprecatedNumber]
  }
}

