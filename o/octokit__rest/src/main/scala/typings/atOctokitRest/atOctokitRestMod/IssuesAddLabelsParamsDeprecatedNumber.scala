package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsParamsDeprecatedNumber extends js.Object {
  /**
    * The name of the label to add to the issue. Must contain at least one label. **Note:** Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key.
    */
  var labels: js.Array[String]
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesAddLabelsParamsDeprecatedNumber {
  @scala.inline
  def apply(labels: js.Array[String], number: Double, owner: String, repo: String): IssuesAddLabelsParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesAddLabelsParamsDeprecatedNumber]
  }
}

