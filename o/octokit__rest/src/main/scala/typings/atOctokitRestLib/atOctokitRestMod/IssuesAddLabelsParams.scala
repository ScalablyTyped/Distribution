package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsParams extends js.Object {
  /**
    * The name of the label to add to the issue. Must contain at least one label. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.Array[java.lang.String]
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesAddLabelsParams {
  @scala.inline
  def apply(
    labels: js.Array[java.lang.String],
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String
  ): IssuesAddLabelsParams = {
    val __obj = js.Dynamic.literal(labels = labels, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesAddLabelsParams]
  }
}

