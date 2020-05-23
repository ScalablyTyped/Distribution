package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsEndpoint extends js.Object {
  var issue_number: Double
  /**
    * The name of the label to add to the issue. Must contain at least one label. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.Array[String]
  var owner: String
  var repo: String
}

object IssuesAddLabelsEndpoint {
  @scala.inline
  def apply(issue_number: Double, labels: js.Array[String], owner: String, repo: String): IssuesAddLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesAddLabelsEndpoint]
  }
}

