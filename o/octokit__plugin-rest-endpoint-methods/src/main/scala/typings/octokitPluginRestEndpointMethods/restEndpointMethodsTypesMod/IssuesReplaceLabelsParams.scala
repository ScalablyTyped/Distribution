package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesReplaceLabelsParams extends js.Object {
  var issue_number: Double
  /**
    * The names of the labels to add to the issue. You can pass an empty array to remove all labels. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var owner: String
  var repo: String
}

object IssuesReplaceLabelsParams {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String, labels: js.Array[String] = null): IssuesReplaceLabelsParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesReplaceLabelsParams]
  }
}

