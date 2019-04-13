package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesReplaceLabelsParams extends js.Object {
  /**
    * The names of the labels to add to the issue. You can pass an empty array to remove all labels. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesReplaceLabelsParams {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    labels: js.Array[java.lang.String] = null
  ): IssuesReplaceLabelsParams = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[IssuesReplaceLabelsParams]
  }
}

