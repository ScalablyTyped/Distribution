package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsParams extends js.Object {
  var issue_number: scala.Double
  /**
    * The name of the label to add to the issue. Must contain at least one label. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.Array[java.lang.String]
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesAddLabelsParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    labels: js.Array[java.lang.String],
    owner: java.lang.String,
    repo: java.lang.String
  ): IssuesAddLabelsParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, labels = labels, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesAddLabelsParams]
  }
}

