package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsParams extends js.Object {
  var issue_number: Double
  /**
    * The name of the label to add to the issue. Must contain at least one label. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.Array[String]
  var owner: String
  var repo: String
}

object IssuesAddLabelsParams {
  @scala.inline
  def apply(issue_number: Double, labels: js.Array[String], owner: String, repo: String): IssuesAddLabelsParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, labels = labels, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesAddLabelsParams]
  }
}

